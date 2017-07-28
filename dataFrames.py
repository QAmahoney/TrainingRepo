from pyspark import SparkConf,SparkContext, SQLContext

con = SparkConf()
sc = SparkContext()

rdd1 = sc.textFile("file:///home/cloudera/Desktop/Spark/data.txt")
rdd2 = rdd1.map(lambda x: x.split(","))

sql = SQLContext(sc)

df = sql.createDataFrame(rdd2)

df.show()

print("_______________________________")

df.printSchema()
