from pyspark import SparkConf,SparkContext

def printdetails(rna,rsm):
	for student in rna:
		print("_____USER_____")
		print("Regno: " + student[0])
		print("Name: " + student[1])
                print("Address: " + student[2])
		totalMarks = int(0)
		highestMark = int(0)
		numberOfExams = int(0)
		for marks in rsm: 
                	if(marks[0]==student[0]):
				numberOfExams = numberOfExams+1
				totalMarks = totalMarks + int(marks[2])
			if(totalMarks > highestMark):
				highestMark = totalMarks
				bestStudent = student[0]  
		print("Marks: "+ str(totalMarks))
		possibleMarks = numberOfExams*150
		print("Exams: "+ str(numberOfExams))

def breakrecordpipe(rec):
        record = rec.split("|")
        return (record)

def breakrecordtab(rec):
	record = rec.split("\t")
	return (record)

def getAction(col):
	return(col[6])

#def getMovieData(movNum,collection)
#	for item in collection
#		if (item

def getMovieID(name, collection):
	for item in collection:
		if name in item[1]:
			return item[0]

def findRatings(mId, collection):
	ratings = [0]*5
	print("ID", mId)
	print("RATINGS:" , ratings)
	for item in collection:
		if (mId == item[1]):
			ratings[int(item[2])-1] = ratings[int(item[2])-1]+1	
	return ratings



				
con = SparkConf()
sc = SparkContext()

name = "GoldenEye"

mrdd1 = sc.textFile("file:///home/cloudera/Desktop/Movies/Movies.item")
mrdd2 = mrdd1.map(breakrecordpipe)
movies = mrdd2.collect()

rrdd1 = sc.textFile("file:///home/cloudera/Desktop/Movies/Moving-Ratings-Done.data")
rrdd2 = rrdd1.map(breakrecordtab)
ratings = rrdd2.collect()

mId = getMovieID(name, movies)
print("Searched for 'GoldenEye'")
print("ID: ", mId)
print("Ratings: ")
movieRatings = findRatings(mId,ratings)
for rat in range(0,5):
	print(str(rat+1) + ": " + str(movieRatings[rat]))



##TASK 2##
print("__________TASK 2__________")

def idAndRating(collection):	
	return (collection[1],collection[2])
		
def isFive(rec):
	if(rec[1] == str("5")):
		return True
	else:
		return False

def Max(collection):
	
	largest = 0;
	index = 0
	for i in range(0,len(collection)):
		if(collection[i] > largest): 
			index = i
	print("MOST:",index)
	print(collection[index])	
	return largest

def printMovieData(mId,movies):
	for m in movies:
		if(m[0] == mId):
			print(m)
	
def getNumberOfFives(mId, collection):
	highest = 0
	for r in collection:
		if(collection[r] >highest):
			highest = collection[r]
	return highest
rrdd3 = rrdd2.map(idAndRating)
rrdd4 = rrdd3.filter(isFive)
idRat = rrdd4.countByKey()
print("ID RAT" , idRat)	
best = max(idRat.iterkeys(), key=(lambda key: idRat[key]))
most = getNumberOfFives(best,idRat)
print("REAL BEST:", best)
print("REAL MOST:", most)
printMovieData(best,movies)
