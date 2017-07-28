from pyspark import SparkConf, SparkContext, SQLContext, sql
from pyspark.sql import *
from pyspark.sql.types import *

con = SparkConf()
sc = SparkContext(conf = con)
sql = SQLContext(sc)

RDD1=sc.textFile("file:////home/cloudera/workspace/SQLText/users.txt")
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
x = DF1.select("_1","_1").collect()

print("Filter")
DF1.filter(DF1._1>3).show()

print("Sorting -")
DF1.sort(DF1._1).show()

DF1.sort(DF1._1.asc()).show()

DF1.sort(DF1._1.desc()).show()




print("_____________Specify Schema_____________")

schema=StructType(
        [
            StructField("regno",StringType(),True),
            StructField("name",StringType(),True),
            StructField("gender",StringType(),True),
            StructField("address",StringType(),True)
        ]
    )
DF2=sql.createDataFrame(records,schema)
print("----------DF2.show() - With Schema ----------")
DF2.show()

print("----------DF2.dtypes - With Schema ----------")
print(DF2.dtypes)

print("----------DF2.printSchema() - With Schema ----------")
DF2.printSchema()

print("------Show specific columns------")
DF2.select(["name","address"]).show()

DF2.select(DF2.name,DF2.address).show()

DF2.select(DF2.name.alias("BOOM1"),DF2.address.alias("BOOM2")).show()

DF2.filter(DF2.regno =="1").show()

DF2.drop("address").show()





