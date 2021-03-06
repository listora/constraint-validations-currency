(defproject listora/constraint-validations-currency "0.0.1-SNAPSHOT"
  :description "Adds support for validating currencies to constraint"
  :url "https://github.com/listora/constraint-validations-currency"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [listora/constraint "0.0.4"]
                 [commons-validator "1.4.0"]]

  :profiles {:dev {:plugins [[lein-difftest "2.0.0"]
                             [jonase/eastwood "0.1.1"]
                             [lein-bikeshed "0.1.6"]]

                   :aliases {"ci" ["do" ["difftest"] ["lint"]]
                             "lint" ["do" ["bikeshed"] ["eastwood"]]}}})
