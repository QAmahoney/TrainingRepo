#install.packages("ROBDC")
os<-OrchardSprays
require(RODBC)
#odbcConnect(*Driver*,*UserName*,*Password*)
#dx<-odbcConnect("TomDrv",uid = "Tom",pwd = "root")

#df<-sqlQuery(dx,"Select * from test_table")

#print(df)
#close(dx)



max(os$decrease)

for(i in seq(1, dim(os)[1]))
{
  if(os[i,"decrease"] == max(os$decrease))
  {
    print(os[i,])
  }
}


osdt <- cbind(os$decrease,os$treatment);
osdtH <- c(0,0)
print(dim(osdt)[1])
for(i in seq(1,dim(osdt)[1]))
{
  if(osdt[i,2]==8)
  {
    osdtH <- rbind(osdtH,osdt[i,])
    print(paste(i,": ", osdtH[i]))
  }
}

print(osdtH)

ggplot(OrchardSprays[1],aes(OrchardSprays$treatment, OrchardSprays$decrease)) + geom_jitter();
#for(i in nrow(osdtH))
#{
#  print(osdtH)
#}

#library(ggplot2)

ggplot(OrchardSprays[1],aes(OrchardSprays$treatment, OrchardSprays$decrease))+geom_boxplot(colour='red',fill='green')+ggtitle(paste('Max decrease is treatment:',OrchardSprays[OrchardSprays$decrease==max(OrchardSprays$decrease),'treatment']))+geom_point(aes(colour=factor(OrchardSprays$decrease),pch='MIKE'))+labs(x = "Treatments", y = "Max Decrease")+ guides(colour=FALSE)

#ggplot()