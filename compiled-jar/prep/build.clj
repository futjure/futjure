(ns build
  (:require [clojure.java.shell :as sh]))

(defn package-all [_]
  (let [{:keys [exit]} (sh/sh "cd .." "&&" "mvn" "package" "-Dmaven.test.skip=true")
        _ (assert (zero? exit))]))

(def package-compiled-jar package-all)
(def package-slim-jar package-all)
