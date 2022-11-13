(ns build
  (:refer-clojure :exclude [compile])
  (:require [clojure.tools.build.api :as b]
            [clojure.tools.build.util.file :as file]
            [clojure.java.shell :as sh]))

(def class-dir "target/classes")

(defn compile [_]
  (let [{:keys [exit]} (sh/sh "mvn" "clean" "compile")
        _ (assert (zero? exit))]
    (b/copy-dir {:src-dirs [class-dir]
                 :target-dir class-dir})))

(defn compile-slim [_]
  (let [{:keys [exit]} (sh/sh "ant" "compile-java")
        _ (assert (zero? exit))]
    (b/copy-dir {:src-dirs [class-dir]
                 :target-dir class-dir})))

(defn install [_]
  (let [{sha :out :keys [exit]} (sh/sh "git" "rev-parse" "--verify" "HEAD")
        _ (assert (zero? exit) exit)
        {:keys [exit]} (sh/sh "mvn" "versions:set" (str "-DnewVersion=" sha))
        _ (assert (zero? exit) exit)]
    (println (sh/sh "mvn" "install"))))
