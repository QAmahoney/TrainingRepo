from pyspark import SparkConf,SparkContext

def BreakRecord(rec):
	record = rec.split("|")
	if(record[2]=="M"):
		return True
	else:
		return False;

con = SparkConf()
sc = SparkContext()

rdd1 = sc.textFile("file:///home/cloudera/Downloads/Users.txt")

#data = rdd1.collect()
#print(data)
rdd2 = rdd1.filter(BreakRecord)
data = rdd2.collect()
for A in data:
	print (A)
