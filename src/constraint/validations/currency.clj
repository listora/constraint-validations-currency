(ns constraint.validations.currency
  (:import [org.apache.commons.validator.routines CurrencyValidator])
  (:require [clojure.string :as str]
            [constraint.validations.currency.codes :as codes]
            [constraint.core :refer [Transform]]))


(defn error-message [value]
  (str value " is not a valid ISO 4217 currency code"))

(defn- invalid-currency-code [value]
  {:error :invalid-currency-code
   :message (error-message value)
   :found value})

(deftype CurrencyCode []
  Transform
  (transform* [_ value]
    (if-not (codes/iso-4217-currency-codes value)
      {:errors #{(invalid-currency-code value)}})))

(defn currency-code
  "Create a currency code validation. Expects an ISO 4217 currency code,
  ignoring case."
  []
  (CurrencyCode.))
