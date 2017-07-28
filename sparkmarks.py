from pyspark import SparkConf,SparkContext

def add(a,b):
	return (int(a)+int(b))

def subtract(a,b):
	return a-b

def avg(a,b):
	return ((float(a)+float(b))/float(2))

def max(a,b):
	if(a>b):
		return a
	else:
		return b

def min(a,b):
        if(a<b):
                return a
        else:
                return b

def breakrecord(rec):
	record = rec.split("|")
	return (record)

def output(noe,mrk,avg):
	for key,value in noe.items():
		print(value)
		if(value == 3):
			print ("Mark: " + mrk.items[key])
	

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
		percentage = float((float(totalMarks)/float(possibleMarks))*100)
		print("Percentage: " + str(percentage))
		if(percentage>=90):
			grade = "A+"
                if((percentage>=80) & (percentage<90)):
                        grade = "A"
                if((percentage>=70) & (percentage<80)):
                        grade = "B"
                if((percentage>=60) & (percentage<70)):
                        grade = "C"
                if(percentage<60):
                        grade = "Fail"
		print("Grade: "+grade)

		print("___TOP3___")
		print("Best Student: " + str(bestStudent))
		print("Highest Marks: " + str(highestMark))



con = SparkConf()
sc = SparkContext()

rdd1 = sc.textFile("file:///home/cloudera/Desktop/Movies/Movies.item.txt")

movieData = rdd1.collect()

for movie in movieData
	print(movie)


#rdd2 = rdd1.map(breakrecord)

#rddTotalMarks = rdd2.reduceByKey(add)
#rddAvgMarks = rdd2.reduceByKey(avg)

#marks = rddTotalMarks.collect()
#averages = rddAvgMarks.collect()

#numberOfExams = rdd2.countByKey()

#print("____EXAM COUNT____")
#print(numberOfExams)

#print("_____MARKS____")

#for mrecord in marks:
#	print (mrecord)

#print("_____AVG_____")

#for avgRecord in averages:
#	print (avgRecord)

#print("_____OUTPUT_____")

#output(numberOfExams,marks,averages)
