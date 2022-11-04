(ns build
  (:require [clojure.java.shell :as sh])
  (:import [java.io File]))

(defn sh! [& args]
  (let [{:keys [exit]} (apply sh/sh args)]
    (assert (zero? exit))))

(defn package-compiled-jar [_]
  (sh! "mvn" "clean" "package" "-Dmaven.test.skip=true" "-Djar.finalName=clojure"
       :dir "..")
  (sh! "cp" "../target/clojure.jar" "extracted-jar")
  (sh! "jar" "xf" "clojure.jar"
       :dir "extracted-jar")
  (sh! "rm" "extracted-jar/clojure.jar")
  (sh! "touch" "prep-done"))
