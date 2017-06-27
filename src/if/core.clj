(ns if.core)

(defmacro then
  [& body]
  (cons 'do body))

(defmacro else
  [& body]
  (cons 'do body))