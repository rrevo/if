(ns if.core-test)
(use 'clojure.test
     'clojure.walk
     'if.core)

(deftest then-else-forms
  (is (= 3 (if true (then (+ 1 2)))))
  (is (= 4 (if true (then (+ 2 2))
                    (else (throw (Exception. "my exception message"))))))
  (is (= 5 (if false (then (* 2 2))
                     (else (+ 2 3))))))

(deftest use-comment-forms
  (is (= 4 (thenc (str "a long comment") (+ 2 2))))
  (is (= 5 (elsec "smaller comment"
                  (+ 2 3)))))
