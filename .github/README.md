# Futjure

An unoffical Clojure distribution that tracks offical development,
but also applies patches with various enhancements and fixes that
have been or could be proposed in [Jira](https://clojure.atlassian.net/jira/software/c/projects/CLJ/issues).

[![Clojars Project](https://img.shields.io/clojars/v/io.github.futjure/futjure.svg?include_prereleases)](https://clojars.org/io.github.futjure/futjure)

## Quickstart

Paste the following into a terminal to start a Futjure REPL.

```bash
clj -Sdeps '{:classpath-overrides {org.clojure/clojure nil} :deps {io.github.futjure/futjure {:mvn/version "1.12.0-master-SNAPSHOT"}}}'
```

eg.,

```bash
$ clj -Sdeps '{:classpath-overrides {org.clojure/clojure nil} :deps {io.github.futjure/futjure {:mvn/version "1.12.0-master-SNAPSHOT"}}}'
Clojure 1.12.0-master-SNAPSHOT
user=> 
```

## How to use

Futjure is intended to be used only in experiments and to test code bases against potential future
patches to Clojure. Only snapshot jars are released---if you are already testing against
Clojure's latest `X.Y.Z-master-SNAPSHOT` builds, you can use the same version for Futjure.

Check [here](https://clojars.org/io.github.futjure/futjure) for the latest version.

Clojure CLI:
```clojure
;deps.edn
{:aliases {:futjure {:classpath-overrides {org.clojure/clojure nil}
                     :deps {io.github.futjure/futjure {:mvn/version "1.12.0-master-SNAPSHOT"}}}}}
```

```bash
# activate like this:
clojure -A:futjure ...
```

Leiningen:
```clojure
;project.clj
(defproject my-project "1.0.0-SNAPSHOT"
  :profiles {:futjure {:exclusions [org.clojure/clojure]
                       :dependencies [[io.github.futjure/futjure "1.12.0-master-SNAPSHOT"]]}})
```

```bash
# activate like this:
lein with-profiles +futjure ...
```

## Included patches

Futjure includes the following patches.

### [CLJ-2619](https://clojure.atlassian.net/browse/CLJ-2619): clear future thread bindings after execution

Fixes a memory leak in `clojure.core/future` where the thread pools used by futures
retain a hard reference to any thread bindings conveyed to a futures thread.

- [Patch](https://github.com/futjure/futjure/compare/futjure-master...clj-2619-futures-memory-leak-2)
- [Blog](https://blog.ambrosebs.com/2022/09/11/futures-memory-leak.html)

### [CLJ-2426](https://clojure.atlassian.net/browse/CLJ-2426): support metadata extension in satisfies?

Extends `clojure.core/satisfies?` to support values that implement protocols via the `:extend-via-metadata` feature.

- [Patch](https://github.com/futjure/futjure/compare/futjure-master...clj-2426-satisfies-via-metadata)

### [CLJ-2413](https://clojure.atlassian.net/browse/CLJ-2413): make Method enumeration deterministic

Enhances Clojure's reflector to always choose methods deterministically when there's ambiguity.
Before this patch, it was common for ties between java.lang.Runnable and java.util.concurrent.Callable to be resolved
randomly, since Clojure functions implement both.

- [Patch](https://github.com/futjure/futjure/compare/futjure-master...clj-2413-deterministic-reflection)

## License

Same as Clojure---see [readme.txt](readme.txt).
