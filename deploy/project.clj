(defproject squall "0.2.0"
  :java-source-path "../src"
  :javac-options {:debug "false" :fork "true"}
  :aot :all
  :jvm-opts ["-Xmx128m" "-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"
            ]

  :dev-dependencies [
		     [jsqlparser "0.7.0"]
		     [trove "3.0.2"]
		     [bheaven "0.0.3"]
		     [bdb-je "5.0.84"]

		     [org.clojure/clojure "1.4.0"]
                     [storm "0.8.2"]
                    ])
