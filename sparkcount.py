from pyspark import SparkConf,SparkContext

con = SparkConf()
sc = SparkContext()
list1 = [1,2,3,4,5]
rdd1 = sc.parallelize(list1)
data = rdd1.countByValue()
print(data)
