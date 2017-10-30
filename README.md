# Facebook Messenger Bot in Clojure ready for Heroku

A barebones Facebook Messenger Bot in Clojure, which can easily be deployed to Heroku. (fb-bot-clj-heroku)

## Example Features

[facebook.clj](https://github.com/allanberger/fb-bot-clj-heroku/blob/master/src/fb_bot_clj_heroku/facebook.clj):
- Echoes the user's text input.
- Returns a phrase when the user sends the word "help".
- Returns an image when the user sends the word "image".
- Returns quick replies when the user sends "quick reply".

## Running Locally

Make sure you have Clojure installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/allanberger/fb-bot-clj-heroku.git
$ cd fb-bot-clj-heroku
$ lein ring server-headless
```

Your app should now be running on [localhost:3000](http://localhost:3000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

or

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Documentation

This application is based on support of the [Getting Started with Clojure](https://devcenter.heroku.com/articles/getting-started-with-clojure) article.

For more information about using Clojure on Heroku, see these Dev Center articles:

- [Clojure on Heroku](https://devcenter.heroku.com/categories/clojure)
