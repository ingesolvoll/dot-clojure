(ns dev
  (:require
   [clojure.spec.alpha :as s]
   [expound.alpha :as expound]
   ;[flow-storm.api :as fs-api]
   ;[portal.api :as p]
   ))

#_(defn start-portal []
    (p/open)
    (add-tap #'p/submit))

(defn start! [_]
  ;(start-portal)
  (s/check-asserts true)
  ;(fs-api/connect)
  (alter-var-root #'s/*explain-out* (constantly expound/printer)))
