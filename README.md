# if

Better clojure if then else syntax. This project adds a then and else macro which can be used inside an if block for better readability.

The implementations for then and else are simple wrappers over a do block.

## Problem

[if](https://clojure.org/reference/special_forms#if) is a special form in clojure with the signature

```clojure
(if test then else?)
```

where then and else are forms.

When either forms are complex, it is difficult to read code by trying to match the first and second forms.

Also if multiple lines are needed, then code needs to be wrapped in a do block.

## Usage

Inside an if block, use then and else for better readability.

```clojure
(if test
  (then body1
        body2 ...))
```

```clojure
(if test
  (then body1
        body2 ...)
  (else body ...))
```

then and else are wrappers over do, and the result of the last form will be returned.

## License

Copyright © 2017

Distributed under the Eclipse Public License version 1.0.
