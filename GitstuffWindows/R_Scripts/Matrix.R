ResultFunction<-function(x)
{
  r<-sum(x);
  p<-(r*100)/450;
  
  print(x);
  print(r);
  print(p);
  
  if(p>60){
    print("Pass");
  }else{
    print("Fail");
  }
}

physics<-c(110,120,130);
chemestry<-c(140,150,60);
maths<-c(70,80,90);

Results <- cbind(physics,chemestry);  # Create matrix with 2 columns

Results <- cbind(Results,maths);      #bind aditional column to matrix

rownames(Results)<-c("Tom","James","Mike")#Add names to Rows (can be referenced by name)


print(Results["Tom",])                  #Print only "Tom's" results
print(Results[,"physics"])                  #Print only "Physics" results
#Results <- Results[,-2];               #Delete column 2

#Results <- Results[-1,-1];             #Delete Row and column

print(Results);
ResultFunction(Results[1,]);

apply(Results,2,sum);