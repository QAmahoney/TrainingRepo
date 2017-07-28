df <- read.csv("train-titanic.csv", header=TRUE)


df$Name

manCount = 0;
femaleCount = 0;
msurvived = 0;
fsurvived = 0;

print(df[1,"Name"])




for (i in df$PassengerId)
{
  if(df[i,"Sex"]=="male")
  {
    manCount = manCount +1;
    if(df[i,"Survived"]==1)
    {
      name = df[i, "Name"];
      print(paste(name))
      msurvived = msurvived+1;
    }
    
  }
  else
  {
    femaleCount = femaleCount +1;
    if(df[i,"Survived"]==1)
    {
      fsurvived = fsurvived+1;
    }
  }
    
}

print(paste("Male: ",msurvived, "/" , manCount));
print(paste("Female: ",fsurvived, "/" , femaleCount))
