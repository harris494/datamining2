# -*- coding: utf-8 -*-
"""
Created on Thu Oct 13 00:13:49 2016

@author: Administrator
"""

access_token = ""
access_token_secret = ""
consumer_key = ""
consumer_secret = ""
'''
download package (tweepy) to manage Twitter api
make streamdata input local file 'music_json'

'''
from tweepy import Stream
from tweepy.streaming import StreamListener
from tweepy import OAuthHandler
import json
class MyListener(StreamListener):
 
    def on_data(self, data):
        try:
            with open('music_1.json', 'r') as f:
                line = f.readline() # read only the first tweet/line
                tweet = json.loads(line) # load it as Python dict
                
                print(json.dumps(tweet, indent=4))
           
        except BaseException as e:
            print(str(e))
        return True
 
    def on_error(self, status):
        print(status)
        return True
 
auth = OAuthHandler(consumer_key, consumer_secret)
auth.set_access_token(access_token, access_token_secret)
twitter_stream = Stream(auth, MyListener())
twitter_stream.filter(track=['#music'])#Hashtag
