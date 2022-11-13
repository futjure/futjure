(ns build
  (:require [clojure.java.shell :as sh])
  (:import [java.io File]))

(defn sh! [& args]
  (let [{:keys [exit err] :as res} (apply sh/sh args)]
    (assert (zero? exit) (assoc res :cmd (vec args)))))

(defn package-compiled-jar [_]
  (println "Compiling Clojure with direct linking...")
  (sh! "mvn" "clean" "package" "-Dmaven.test.skip=true" "-Djar.finalName=clojure"
       :dir "..")
  (println "Extracting Clojure...")
  (sh! "rm" "-rf" "extracted-jar")
  (sh! "mkdir" "-p" "extracted-jar")
  (sh! "cp" "../target/clojure.jar" "extracted-jar")
  (sh! "jar" "xf" "clojure.jar"
       :dir "extracted-jar")
  (sh! "rm" "extracted-jar/clojure.jar")
  (sh! "touch" "prep-done"))
