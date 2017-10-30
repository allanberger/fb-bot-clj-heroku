(defproject fb-bot-clj-heroku "0.1.0-SNAPSHOT"
  :description "Facebook Messenger Bot in Clojure via Leiningen’s Compojure Template"
  :url "http://fb-bot-clj-heroku.herokuapp.com"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.1"]
                 [compojure "1.5.1"]
                 [http-kit "2.2.0"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [environ "1.0.0"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-ring "0.9.7"]
            [environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :ring {:handler fb-bot-clj-heroku.handler/app}
  :uberjar-name "fb-bot-clj-heroku-standalone.jar"
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
