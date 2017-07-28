from pyspark import SparkConf,SparkContext

def double1(x):
	return x*2

con = SparkConf()
sc = SparkContext()
list1 = [1,2,3,4,5]
rdd1 = sc.parallelize(list1)
rdd2 = rdd1.map(double1)
data = rdd2.collect()
print(data)
