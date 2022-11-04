(ns build
  (:require [clojure.java.shell :as sh])
  (:import [java.io File]))

(defn sh! [& args]
  (let [{:keys [exit]} (apply sh/sh args)]
    (assert (zero? exit))))

(defn package-compiled-jar [_]
  (sh! "mvn" "clean" "package" "-Dmaven.test.skip=true"
       :dir "..")
  (sh! "cp" "../target/futjure-1.12.0-master-SNAPSHOT.jar" "extracted-jar")
  (sh! "jar" "xf" "futjure-1.12.0-master-SNAPSHOT.jar"
       :dir "extracted-jar")
  (sh! "rm" "extracted-jar/futjure-1.12.0-master-SNAPSHOT.jar")
  (sh! "touch" "prep-done"))
