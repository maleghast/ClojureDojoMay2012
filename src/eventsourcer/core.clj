(ns eventsourcer.core)

(use '[clojure.java.io] :only (reader))

(defn taillog [file numlines]
	(with-open [rdr (reader file)]
		(take numlines (line-seq rdr))))

(println (taillog "/var/log/kernel.log" 50))
