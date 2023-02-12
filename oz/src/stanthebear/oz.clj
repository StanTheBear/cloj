(ns stanthebear.oz
  #_(:gen-class)
  (:require [oz.core :as oz]
            [clojure.core.reducers :as r]
            [criterium.core :refer [bench]]))

"Hello from Oz"

(defn play-data [& names]
  (for [n names
        i (range 50)]
    {:time i :item n :quantity (+ (Math/pow (* i (count n)) 0.8) (rand-int (count n)))}))

(def line-plot
  {:data     {:values (play-data "monkey" "slipper" "broom")}
   :encoding {:x     {:field "time" :type "quantitative"}
              :y     {:field "quantity" :type "quantitative"}
              :color {:field "item" :type "nominal"}}
   :mark     "line"})


(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (oz/start-server!)
  (greet {:name (first args)}))

(oz/view! line-plot)

(def contour-plot (oz/load "/home/kali/.clojure/oz/examples/contourlines.vega.json"))
(oz/view! contour-plot :mode :vega)

(def stacked-bar
  {:data {:values
          (play-data "munchkin" "witch" "dog" "lion" "tiger" "bear")}
   :mark "bar"
   :encoding {:x {:field "time"
                  :type "ordinal"}
              :y {:aggregate "sum"
                  :field "quantity"
                  :type "quantitative"}
              :color {:field "item"
                      :type "nominal"}}})


(def viz
  [:div
   [:h1 "Look ye and behold"]
   [:p "A couple of small charts"]
   [:div {:style {:display "flex" :flex-direction "row"}}
    [:vega-lite line-plot]
    [:vega-lite stacked-bar]]
   [:p "A wider, more expansive chart"]
   [:vega contour-plot]
   [:h2 "If ever, oh ever a viz there was, the vizard of oz is one because, because, because..."]
   [:p "Because of the wonderful things it does"]])

(oz/view! viz)

(reduce +  [0 3 5])

(def inc4 #(+ % 4))
(def inc-transducer (map inc4))

(def bigvec  (into [] (take 200000 (iterate inc 5))))

(type bigvec)

(bench  (reduce (inc-transducer +) 0  bigvec))
;; Execution time mean : 2.323954 ms

(bench (transduce inc-transducer + 0 bigvec))
;; Execution time mean : 2.007487 ms
(println (int (* 100 (/ (- 2.324 2.07) 2.324))) "% quicker" )

(r/fold + (r/map (fn [x] (+ x 4)) bigvec))

(bench (r/fold + (r/map inc4 bigvec)))
;; Execution time mean : 1.125059 ms
(println (int (* 100 (/ (- 2.324 1.125) 2.324))) "% quicker")


(oz/view! stacked-bar)

(prn {:items [{:foo :bar} {:foo2 :bar2}]})


(defn comb2 [coll]
  (for [x (range 1 (count coll))
        y (range 0 x)]
    [(nth coll y) (nth coll x)]))

(comb2 [10 20 11 30])

(comb2 '(10 20 11 30))

(comment
  ;; (require '[clojure.tools.deps.alpha.repl :refer [add-libs]])
  ;; (add-libs '{http-kit/http-kit {:mvn/version "2.5.1"}})
  ;; (oz/publish! stacked-bar) ;; needs cheshire & needs Github credentials in /home/kali/.oz/github-creds.edn
  :rcf)
