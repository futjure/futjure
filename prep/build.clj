(ns build
  (:refer-clojure :exclude [compile])
  (:require [clojure.tools.build.api :as b]
            [clojure.tools.build.util.file :as file]
            [clojure.java.shell :as sh]))

(def class-dir "target/classes")

(defn compile [_]
  (sh/sh "mvn" "clean" "compile")
  (b/copy-dir {:src-dirs [class-dir]
               :target-dir class-dir}))
