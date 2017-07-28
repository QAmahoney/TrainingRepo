table = as.numeric(readline("Table? "))
range = as.numeric(readline("Range? "))
i = 1

tt = as.numeric(readline("Option?(1 = 1TT, other = list of TT's) "))

if(tt == 1)
{
  repeat
  {
    if(i>range)
    {
      break
    }
    print(paste(table,"x",i,"=",i*table))
    i = i+1
  }
}else{
  for( i in seq(1,table,by=1))
  {
    for( j in seq(1,range,by=1))
    {
      print(paste(i,"x",j,"=",i*j))
    }
    i = i+1
  }
}