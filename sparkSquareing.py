from pyspark import SparkConf,SparkContext

def square1(x):
	return x*x

con = SparkConf()
sc = SparkContext()
list1 = [1,2,3,4,5]
rdd1 = sc.parallelize(list1)
rdd2 = rdd1.map(square1)
data = rdd2.collect()
print(data)
