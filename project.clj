(defproject functional-koans "0.4.5"
  :description "The functional koans."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [koan-engine "0.1.2-SNAPSHOT"]]
  :dev-dependencies [[swank-clojure "1.3.0" :exclusions [org.clojure/clojure]]
                     [lein-koan "0.1.0"]

                     ;; Vim
                     ;; https://bitbucket.org/kotarak/vimclojure
                     [vimclojure/server "2.3.1"]
                     [org.clojars.autre/lein-vimclojure "1.0.0"]]

  :project-init (require 'clojure.pprint))
