(ns eventsourcer.core)

(use '[clojure.java.io :only (reader)])

(use '[clojure.string :only (join split)])
(use '[clojure.pprint])

(defn taillog [file numlines]
	(with-open [rdr (reader file)]
		(pprint (->> (line-seq rdr) (take numlines) (map #(clojure.string/split % #"[ ][ ]*"))))))

(taillog "/var/log/kernel.log" 50)
;(pprint (taillog "/etc/passwd" 2))
