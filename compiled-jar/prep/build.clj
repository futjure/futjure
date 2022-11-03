(ns build
  (:require [clojure.java.shell :as sh]))

(defn package-compiled-jar [_]
  (let [{:keys [exit]} (sh/sh "cd" ".." "&&" "mvn" "package" "-Dmaven.test.skip=true")
        _ (assert (zero? exit))
        {:keys [exit]} (sh/sh "mkdir" "-p" "extracted-jar" "&&"
                              "cp" "../target/futjure-1.12.0-master-SNAPSHOT.jar" "extracted-jar" "&&"
                              "cd" "extracted-jar" "&&"
                              "jar" "xf" "futjure-1.12.0-master-SNAPSHOT.jar" "&&"
                              "rm" "futjure-1.12.0-master-SNAPSHOT.jar")
        _ (assert (zero? exit))]))
