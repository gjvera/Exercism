(defproject armstrong-numbers "0.1.0-SNAPSHOT"
  :description "armstrong-numbers exercise"
  :url "https://github.com/exercism/clojure/tree/master/exercises/armstrong-numbers"
  :dependencies [[org.clojure/clojure "1.9.0"]])

(ns armstrong-numbers)

(defn calc-sum [power num]
  (let [num-str (str num)]
    (reduce +(map (comp int #(Math/pow % power) read-string str)  num-str)))) 

(defn armstrong?
  [num]
        (let [exponent (count (str num))]
     (= (calc-sum exponent num) num)))
