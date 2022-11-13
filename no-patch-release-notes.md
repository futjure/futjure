# Git dependency for official Clojure releases

Futjure includes minor variants of offical Clojure releases
that just add the ability to use Clojure CLI's
Git dependency support (instead of downloading `clojure.jar` from Maven Central).

For each supported Clojure tag (eg., [`clojure-1.11.1`](https://github.com/clojure/clojure/tree/clojure-1.11.1)) a
corresponding branch is made in [futjure](https://github.com/futjure/futjure)
(eg., [`futjure__clojure-tag__clojure-1.11.1__no-patch`](https://github.com/futjure/futjure/tree/futjure__clojure-tag__clojure-1.11.1__no-patch)).
New commits will be pushed to these branches periodically in support of git-related features.
Note that these commits will preserve history, to ensure that git dependencies on previous
commits will continue to work (since older commits will not be deleted via git garbage collection).

Each version below corresponds to a batch of commits that adds Git support for
various Clojure versions. Releases are an incrementally increasing integer.

## Latest releases
- [clojure-1.11.1](#clojure-1111-version-0)
- [clojure-1.11.0](#clojure-1110-version-0)
- [clojure-1.10.3](#clojure-1103-version-0)
## clojure-1.11.1 Version 0

> Created: Sun Nov 13 00:38:30 EST 2022

This describes a variant of the Clojure release `clojure-1.11.1` that can be depended on via Clojure CLI's git dependency feature.
Before installing, you should inspect exactly what this Futjure release changed from the offical Clojure release by comparing their Git sha's.

deps.edn dependency info:
```clojure
;; Instructions:
;; 0. add the following to your deps.edn file
;; 1. install maven, ant, and set Java 8 as default Java
;; 2. use `clj -T:deps prep` to compile this release
;; 3. use `clj` as normal (with any Java version)
{:deps
 {org.clojure/clojure
  {:git/url "https://github.com/futjure/futjure.git",
   :git/sha "0ac116f5abf0be4aa7a1fd84cd275336f77146e7",
   :deps/manifest :deps,
   :deps/root "compiled-jar"}}}
```

- [Original tag: clojure-1.11.1](https://github.com/clojure/clojure/tree/clojure-1.11.1)
- [Original commit: ce55092f2b2f5481d25cff6205470c1335760ef6](https://github.com/clojure/clojure/commit/ce55092f2b2f5481d25cff6205470c1335760ef6)
- [This Futjure release: 0ac116f5abf0be4aa7a1fd84cd275336f77146e7](https://github.com/futjure/futjure/commit/0ac116f5abf0be4aa7a1fd84cd275336f77146e7)
- [Compare this release to original commit](https://github.com/futjure/futjure/compare/ce55092f2b2f5481d25cff6205470c1335760ef6...0ac116f5abf0be4aa7a1fd84cd275336f77146e7)
- [Futjure branch: futjure__clojure-tag__clojure-1.11.1__no-patch](https://github.com/futjure/futjure/tree/futjure__clojure-tag__clojure-1.11.1__no-patch)
- Futjure long version id: futjure__clojure-tag__clojure-1.11.1__no-patch::v0
## clojure-1.11.0 Version 0

> Created: Sun Nov 13 00:38:30 EST 2022

This describes a variant of the Clojure release `clojure-1.11.0` that can be depended on via Clojure CLI's git dependency feature.
Before installing, you should inspect exactly what this Futjure release changed from the offical Clojure release by comparing their Git sha's.

deps.edn dependency info:
```clojure
;; Instructions:
;; 0. add the following to your deps.edn file
;; 1. install maven, ant, and set Java 8 as default Java
;; 2. use `clj -T:deps prep` to compile this release
;; 3. use `clj` as normal (with any Java version)
{:deps
 {org.clojure/clojure
  {:git/url "https://github.com/futjure/futjure.git",
   :git/sha "36286cfb3ae66903a83b4818423171b7d595638d",
   :deps/manifest :deps,
   :deps/root "compiled-jar"}}}
```

- [Original tag: clojure-1.11.0](https://github.com/clojure/clojure/tree/clojure-1.11.0)
- [Original commit: f376cf62bb0c30f72b0df4ee94c38fa503fa4be7](https://github.com/clojure/clojure/commit/f376cf62bb0c30f72b0df4ee94c38fa503fa4be7)
- [This Futjure release: 36286cfb3ae66903a83b4818423171b7d595638d](https://github.com/futjure/futjure/commit/36286cfb3ae66903a83b4818423171b7d595638d)
- [Compare this release to original commit](https://github.com/futjure/futjure/compare/f376cf62bb0c30f72b0df4ee94c38fa503fa4be7...36286cfb3ae66903a83b4818423171b7d595638d)
- [Futjure branch: futjure__clojure-tag__clojure-1.11.0__no-patch](https://github.com/futjure/futjure/tree/futjure__clojure-tag__clojure-1.11.0__no-patch)
- Futjure long version id: futjure__clojure-tag__clojure-1.11.0__no-patch::v0
## clojure-1.10.3 Version 0

> Created: Sun Nov 13 00:38:30 EST 2022

This describes a variant of the Clojure release `clojure-1.10.3` that can be depended on via Clojure CLI's git dependency feature.
Before installing, you should inspect exactly what this Futjure release changed from the offical Clojure release by comparing their Git sha's.

deps.edn dependency info:
```clojure
;; Instructions:
;; 0. add the following to your deps.edn file
;; 1. install maven, ant, and set Java 8 as default Java
;; 2. use `clj -T:deps prep` to compile this release
;; 3. use `clj` as normal (with any Java version)
{:deps
 {org.clojure/clojure
  {:git/url "https://github.com/futjure/futjure.git",
   :git/sha "52da17ff111894e8c3d8642092da85eb2c596082",
   :deps/manifest :deps,
   :deps/root "compiled-jar"}}}
```

- [Original tag: clojure-1.10.3](https://github.com/clojure/clojure/tree/clojure-1.10.3)
- [Original commit: aaf73b12467df80f5db3e086550a33fee0e1b39e](https://github.com/clojure/clojure/commit/aaf73b12467df80f5db3e086550a33fee0e1b39e)
- [This Futjure release: 52da17ff111894e8c3d8642092da85eb2c596082](https://github.com/futjure/futjure/commit/52da17ff111894e8c3d8642092da85eb2c596082)
- [Compare this release to original commit](https://github.com/futjure/futjure/compare/aaf73b12467df80f5db3e086550a33fee0e1b39e...52da17ff111894e8c3d8642092da85eb2c596082)
- [Futjure branch: futjure__clojure-tag__clojure-1.10.3__no-patch](https://github.com/futjure/futjure/tree/futjure__clojure-tag__clojure-1.10.3__no-patch)
- Futjure long version id: futjure__clojure-tag__clojure-1.10.3__no-patch::v0