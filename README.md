# constraint-validations-currency

Adds support for validating currencies to [constraint][]

## Installation

To install via Leiningen add the following dependency to your `project.clj`:

``` clj
[listora/constraint-validations-currency "0.0.1"]
```

## Usage

``` clj
(require '[constraint.core :refer [valid?]]
         '[constraint.validations.currency :refer [currency-code]])

(valid? (currency-code) "GBP") ; => true
(valid? (currency-code) "WAT") ; => false
```

## TODO

- Provide validation using commons-validator's `CurrencyValidator`.

## License

Copyright © 2014 Listora

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

[constraint]: https://github.com/listora/constraint
[commons-validator]: http://commons.apache.org/proper/commons-validator/apidocs/overview-summary.html
[update commons-logging]: http://stackoverflow.com/questions/5706914/noclassdeffounderror-problems-with-help-of-apache-commons-validator
