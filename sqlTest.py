from pyspark.sql import SQLContext
from pyspark import SparkConf, SparkContext
from pyspark.sql import *

con = SparkConf()
sc = SparkContext(conf = con)
sql = SQLContext(sc)

RDD1=sc.textField("users.txt")
records = RDD1.map(lambda X: X.split("|"))

DF1 = sql.createDataFrame(records)

print("--- DF1.printSchema() ---")
DF1.printSchema()

print("--- DF1.show() ---")
DF1.show()

print("Specific fields - Only show specific columns (col 1 and col 2)")

DF1.select("_1").show()
DF1.select(DF1._1,DF1._2).show()


print("Specific fields - Ouput with pseudo name (alias)")
DF1.select(DF1._1.alias("First"),DF1._2.alias("Second")).show()

print("Specific fields - Multiply values when showing output (does not effect stored value)")
DF1.select(DF1._1*100,DF1._1).show()

print("Specific fields")
DF1.select((DF1._1*100).alias("Per"),DF1._1).show()

print("Specific fields - Returns collected values into a list object (x)")
x = DF1.select("_1","_2" *100).collect()










