(ns if.core)

(defmacro then
  [& body]
  (cons 'do body))

(defmacro else
  [& body]
  (cons 'do body))

(defmacro thenc
  [^String comment & body]
  (cons 'do body))

(defmacro elsec
  [^String comment & body]
  (cons 'do body))
