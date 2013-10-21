(defproject moon-castle "0.1.0-SNAPSHOT"
  :description "(Unfinished) Clojure wrapper for the Bouncy Castle library"
  :url "https://github.com/hyPiRion/moon-castle"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:plugins [[codox "0.6.4"]]
                   :codox {:output-dir "codox"}}}
  :deploy-branches ["stable"])
