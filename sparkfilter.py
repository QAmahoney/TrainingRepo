from pyspark import SparkConf,SparkContext

def check(x):
	if(x>10):
		return True;
	else:
		return False;

con = SparkConf()
sc = SparkContext()
list1 = [1,2,13,4,5,16,7,8,9,10,11]
rdd1 = sc.parallelize(list1)
rdd2 = rdd1.filter(check)
data = rdd2.collect()
print (data)
