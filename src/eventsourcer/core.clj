(ns eventsourcer.core)

(use '[clojure.java.io :only (reader)])

(use '[clojure.string :only (join split)])
(use '[clojure.pprint])

(defn taillog [file numlines]
	(with-open [rdr (reader file)]
		(println (->> (line-seq rdr) (map #(clojure.string/split % #" "))))))

;(println (taillog "/var/log/kernel.log" 50))
(pprint (taillog "/etc/passwd" 50))
