a = "Goodbye";
b = "InnerGoodbye";
myInnerList<-list("InnerHello",20,b)

mylist<-list("HELLO",19,a, myInnerList)

for( i in mylist)
{
  print(i);
}
 