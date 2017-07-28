library(RevoScaleR)
library(fmsb)
myFile <- rxImport("cars.sas7bdat")
#View(myFile)
asianCars <- subset(myFile,myFile$Origin == "Asia")
asianRearDrive <- subset(myFile,((myFile$DriveTrain == "Rear")&(myFile$Origin == "Asia")))
#View(asianRearDrive)
europeanCars <- subset(myFile,myFile$Origin == "Europe")
avgEuroHP = mean(europeanCars$Horsepower)

usaCars <- subset(myFile,myFile$Origin == "USA")
avgUsaPrice <- mean(usaCars$MSRP)

usaPtoHP <- mean(usaCars$MSRP/usaCars$Horsepower)
asiaPtoHP <- mean(asianCars$MSRP/asianCars$Horsepower)
europePtoHP <- mean(europeanCars$MSRP/europeanCars$Horsepower)


euroBMW <- subset(europeanCars, europeanCars$Make == "BMW")

ggplot2::ggplot(euroBMW,aes(euroBMW$Type))+
  geom_bar()

sedans <- subset(myFile,myFile$Type == "Sedan")

ggplot2::ggplot(sedans, aes(sedans$Make,sedans$MSRP)) +
  geom_point(aes(col = sedans$Make)) +
  theme(axis.text.x = element_text(angle = 90,hjust = 1, vjust = 0.5))


keep <- c("MSRP","EngineSize","Cylinders","Horsepower","Invoice")
europeanCars = europeanCars[ , (names(europeanCars) %in% keep)]


fmsb::radarchart(europeanCars)
