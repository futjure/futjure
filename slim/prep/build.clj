(ns build
  (:require [clojure.tools.build.api :as b]
            [clojure.tools.build.util.file :as file]
            [clojure.java.shell :as sh]))

(def class-dir "target/classes")

(defn compile-slim [_]
  (let [{:keys [exit]} (sh/sh "cd .." "&&" "ant" "compile-java")
        _ (assert (zero? exit))]
    (b/copy-dir {:src-dirs [(str "../" class-dir)]
                 :target-dir class-dir})))
