library(RevoScaleR)
snacks <- rxImport("snacks.sas7bdat")


snacksSample <- subset(snacks,(snacks$Product == "Baked potato chips")|
                         (snacks$Product == "Buttery popcorn")|
                         (snacks$Product == "Cheese puffs")|
                         (snacks$Product == "Barbeque pork rinds")|
                         (snacks$Product == "Jalepeno sticks"));

snacksOverMonth <- subset(snacksSample,(snacksSample$Date > "2002-05-01"))

ggplot2::ggplot(snacksOverMonth, aes(snacksOverMonth$Date,cumsum(snacksOverMonth$QtySold))) +
  geom_line(aes(col = snacksOverMonth$Product))

potatoChips <- subset(snacks,(snacks$Product == "Baked potato chips"));
potatoChips <- subset(potatoChips,(potatoChips$Date > "2004-01-01"));
potatoChipsOnSale <- subset(potatoChips,(potatoChips$Holiday>0));
potatoChipsNotOnSale <- subset(potatoChips,(potatoChips$Holiday==0));


ggplot2::ggplot(potatoChips, aes(potatoChips$Date,potatoChips$QtySold))+
  geom_line(aes(col= potatoChips$Holiday))

ggplot2::ggplot(snacks, aes(snacks$Product,snacks$QtySold,snacks$Date))+
  geom_line(aes(col=snacks$Product))
