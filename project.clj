(defproject leiningen.org "0.1.0-SNAPSHOT"
  :description "Generate static HTML for http://leiningen.org"
  :dependencies [[enlive "1.0.0"]
                 [cheshire "2.2.0"]
                 [org.markdownj/markdownj "0.3.0-1.0.2b4"]]
  :main leiningen.web)
