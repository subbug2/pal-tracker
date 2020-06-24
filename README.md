# pal-tracker
pal-tracker


commands used in this project

cf login -a https://api.run.pivotal.io

cf push pal-tracker -p ./build/libs/pal-tracker.jar --random-route --no-start

cf start pal-tracker

./gradlew cloudNativeDeveloperSimpleApp -PserverUrl=https://pal-tracker-bright-crocodile-jv.cfapps.io


cf set-env pal-tracker WELCOME_MESSAGE 'Hello from Cloud Foundry'

cf restage pal-tracker

api endpoint:   https://api.run.pivotal.io
api version:    2.147.0
user:           Nagasubrahmanyeswara@dell.com
org:            DellEMC_PAL
space:          nagasubrahmanyeswara@dell.com