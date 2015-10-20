# Limitations
I chose to save only the English translation of every course's name. I know
courses have Finnish, English and Swedish translation but I chose to use
English only since http://www.cs.helsinki.fi/en/exams has the names only in
English (and to save some work ;))

# What has been done
* UI with Twitter Bootstrap

# Online
* https://github.com/tovrleaf/wadup-s15-kertaus-nkivela
* https://wadup-s15-kertaus-nkivela.herokuapp.com/

# Initial steps
```
$ git init ; git add . ; git commit -m "Initial commit"
$ heroku create ; $ heroku apps:rename wadup-s15-kertaus-nkivela
$ git push heroku master
$ git remote add github https://github.com/tovrleaf/wadup-s15-kertaus-nkivela.git
$ git push github master
```
