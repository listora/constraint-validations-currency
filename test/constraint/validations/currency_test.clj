(ns constraint.validations.currency-test
  (:require [clojure.test :refer :all]
            [constraint.core :refer :all]
            [constraint.validations.currency :refer :all]))

(def ^:private valid-currency-code
  "GBP")

(def ^:private invalid-currency-code
  "FOO")

(deftest test-currency-code
  (testing "with a valid currency code"
    (is (valid? (currency-code) valid-currency-code)))

  (testing "with invalid currency code"
    (is (not (valid? (currency-code) invalid-currency-code))))

  (testing "validate with invalid currency code"
    (is (= (validate (currency-code) invalid-currency-code)
           [{:error :invalid-currency-code
             :message "FOO is not a valid ISO 4217 currency code"
             :found invalid-currency-code}]))))
