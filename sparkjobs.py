from pyspark import SparkConf,SparkContext

def BreakRecord(rec):
	record = rec.split("|")
	return record[3]


con = SparkConf()
sc = SparkContext()


rdd1 = sc.textFile("file:///home/cloudera/Downloads/Users.txt")

header = rdd1.first()
filtered = rdd1.filter(lambda a: a<>header)
rdd2 = filtered.map(BreakRecord)

data = rdd2.collect()
for A in data:
	print (A)

jobs = rdd2.countByValue()
print(jobs)
