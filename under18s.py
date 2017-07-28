from pyspark import SparkConf,SparkContext

def breakrecordpipe(rec):
        record = rec.split("|")
	return record

def breakrecordtab(rec):
	record = rec.split("\t")
	return record

def Under18(rec):
	if(int(rec[1])<19):
		return True
	else:
		return False


		
con = SparkConf()
sc = SparkContext()

def RemoveHeader(rec):
	if(rec == header):
		return False
	else:
		return True

def MoviesUnder18s(rec):
	for user in under18users:
		if user[0] == rec[0]:
			return True
	return False

mrdd1 = sc.textFile("file:///home/cloudera/Desktop/Movies/Movies.item")

ratingRDD = sc.textFile("file:///home/cloudera/Desktop/Movies/Moving-Ratings-Done.data")

usersRDD = sc.textFile("file:///home/cloudera/Desktop/Movies/Users.txt")
header = usersRDD.first()
usersNoHeader = usersRDD.filter(RemoveHeader)
usersBroken = usersNoHeader.map(breakrecordpipe)
usersUnder18 = usersBroken.filter(Under18)
under18users = usersUnder18.collect() #users that are under 18


ratingBroken = ratingRDD.map(breakrecordtab)
mUnder18 = ratingBroken.filter(MoviesUnder18s) #ratings for under 18s

def GetMovieIDs(rec):
	return rec[1]

def GetFives(rec):
	if(int(rec[2]) == 5):
		return True
	else:
		return False

def CountOfHighest(rec):
	counter = 0
	for record in rec:
		if(record[1] == 993):
			counter = counter + 1
	print("COUNT HIGHEST: ", counter)
		
def GetMostRated(filmRatings):
	maxID=''
	maxRatings=0
	for a in filmRatings:
		if(filmRatings[a]>maxRatings):
			maxRatings=filmRatings[a]
			maxID=a[0]
	return maxID

#	mostRated = 0
#	for i in collection:
#		if(collection[i] > collection[mostRated]):
#			mostRated = i
#	return mostRated
		

fiveIDs = mUnder18.filter(GetFives) # ratings for under 18 that are 5
movieIDs = fiveIDs.map(GetMovieIDs)
col1 = fiveIDs.collect()
col2 = movieIDs.collect()
col3 = movieIDs.countByValue()
mostRated = GetMostRated(col3)
print ("H:" ,mostRated)





