(ns dev
  (:require
   [clojure.spec.alpha :as s]
   ;[expound.alpha :as expound]
   [flow-storm.api :as fs-api]
   ))

(s/check-asserts true)
;(fs-api/connect)

(enable-console-print!)

(set! s/*explain-out* expound/printer)
