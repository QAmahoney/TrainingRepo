df <- read.csv("C:/Users/Administrator/Documents/PirateBay/piratebay.csv", header=TRUE)


print("______MOST SEEDERS_____")

maxSeeders = max(df$seeders)
for(i in 1:length(df$idtorrent))
  if(df[i,"seeders"] == maxSeeders)
  {
    print(df[i,]);
    break;
  }
print(maxSeeders);


print("______MOST LEECHERS_____");

maxLeechers = max(df$leechers)
for(i in 1:length(df$idtorrent))
  if(df[i,"leechers"] == maxLeechers)
  {
    print(df[i,]);
    break;
  }
print(maxLeechers);


print("______Highest Seeder:Leecher Ratio_____");

deadCount = 0;

highestRatio = 0;
ratio = 0;
for(i in 1:length(df$idtorrent))
{
  if((df[i,"seeders"] == 0)||(df[i,"leechers"] == 0))
  {
    ratio = 0;
    deadCount =  deadCount+1;
  }
  else
  {
    ratio = (df[i,"seeders"] / df[i,"leechers"]);
  }
  if(ratio > highestRatio)
  {
    highestRatio = ratio;
  }
}
print(highestRatio);


print("______Dead Count_____");
print(deadCount)


print(nrow(df))

noDead = subset(df,(df$seeders>0)&(df$leechers>0))
print(nrow(noDead))

noDead$popularity = noDead$seeders+noDead$leechers

print(noDead)
newDat = subset(noDead,(noDead$size < 400000))
#barplot(newDat$popularity,newDat$category)
print(noDead$category)
catsOnly = noDead$category
print((catsOnly))
catsOnly = unique(catsOnly)
print(catsOnly)
length(catsOnly)

catCount = 0
for(j in 1:length(catsOnly))
{
  print(catsOnly[j])
  catCount = catCount+1;
}
print(catCount)
cat1 = subset(df, df$category == catsOnly[0])
cat2 = subset(df, df$category == catsOnly[1])
cat3 = subset(df, df$category == catsOnly[2])
cat4 = subset(df, df$category == catsOnly[3])
cat5 = subset(df, (df$category < 200))

plot(cat5$size,cat5$leechers, pch=c(1,2,3,4,5)[cat5$category], col=c("red","blue","yellow","green","black")[cat5$category])
library(ggplot2)
qplot(noDead$size, noDead$leechers, data=noDead)
ggplot(noDead,aes(noDead$size,noDead$leechers))+
  geom_point(aes(colour = noDead$category))

