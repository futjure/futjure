(ns build
  (:require [clojure.tools.build.api :as api]
            [clojure.tools.build.util.file :as file]
            [clojure.java.shell :as sh]))

(def ^java.io.File jar-dir "target/local-jars")
(def jar-file "target/clojure.jar")

(defn jar [_]
  (sh/sh "mvn package -Dmaven.skip.test=true")
  (println (:out (sh/sh (format "set +x; cp '%s' '%s'" jar-file (api/resolve-path jar-dir))))))
