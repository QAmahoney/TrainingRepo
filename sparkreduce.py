from pyspark import SparkConf,SparkContext

def add(a,b):
	return a+b

def subtract(a,b):
	return a-b

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


con = SparkConf()
sc = SparkContext()
list1 = [1,2,13,4,5,16,7,8,9,10,11]
rdd1 = sc.parallelize(list1)
addresult = rdd1.reduce(add)
subtractresult = rdd1.reduce(subtract)
maxresult = rdd1.reduce(max)
minresult = rdd1.reduce(min)

print (addresult)
print (subtractresult)
print (maxresult)
print (minresult)
