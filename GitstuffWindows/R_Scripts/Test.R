phy = as.numeric(readline("Physics: "))
chem = as.numeric(readline("Chemestry: "))
maths = as.numeric(readline("Mathematics: "))

total = phy + chem + maths

per = total/450*100

print(paste("Total: ",total))
print(paste("Percentage: ",per))
failcount = 0

if(phy/150*100 < 70)
  {
    failcount = failcount+1
  }
if((chem/150*100) < 70)
  {
    failcount = failcount+1
  }
if(maths/150*100 < 70)
  {
    failcount = failcount+1
}

for(A in seq(1,5,by=1))
{
  if(failcount == 3){
    print("GO HOME")
  }else if(failcount ==2){
    print("Re-take course")
  }else if(failcount ==1){
    print("Re-take exam")
  }else if(failcount ==0){
    print("Well done")
  }
}