These whole files implement three methods:Extract and manage data from Twitter api and Youtube api.Webspider method to extract data from Grammy and easily manage.

Twitter api:

1: Download package (tweepy).

2: twitter_api.py: Use tweepy to manage Twitter api.Extract streamdata input local file 'music_json'

3: Twitter_util.java:read data from 'music_json'

4: Twitter_test.java:Implementation class,take out “Time” and “Text” from outputstream in Twitter_util.java.

Grammy:

1: WebSpiderTest.java:Webspider method to extract data from Grammy.Then save as txt format in Local.

2: Grammy_GetTxt.java:Separate txt file into four part.

YEAR CATAGORY TITLE WINNERS

3: GrammyWinners.java:Make attribute Winners subdivide 

Comments:g.txt and t.txt is the target file.We use two files to implements methods in class Grammy_GetTxt.java and GrammyWinners.java.

Youtube api:

YOUTUBE API give a maven object. Methords named search.java is being used here, others is avaliable in the furture.

