numToWord <- function(num){
  word = "";
  digits = c(0,0,0,0);
  notTens <- c('Zero','One','Two','Three','Four','Five','Six','Seven','Eight','Nine','Ten','Eleven','Twelve',
               'Thirteen','Fourteen','Fifteen','Sixteen','Seventeen','Eighteen','Nineteen');
  isTens <- c(' ','Twenty','Thirty','Forty','Fifty','Sixty','Seventy','Eighty','Ninety');
  for (i in seq(1,4)) 
  {
    digits[i] = num%%10;
    digits[i+1] = (num-digits[i])/10;
    num = digits[i+1];
  }
  if(digits[4]!=0)
  {
    if((digits[3] == 0) & ((digits[2]!=0) | (digits[1]!=0))){
      #word = word + notTens[digits[3]]+" thousand and ";
    }else{
      word = paste(word , notTens[digits[4]+1]," thousand ");
    }
  }
  if(digits[3]!=0)
  {
    if(digits[2]!=0 | digits[1]!=0){
      word = paste(word , notTens[digits[3]+1]," hundred and ");
    }else{
      word = paste(word , notTens[digits[3]+1]," hundred ");
    }
  }   
  if((digits[2]!=0) & (digits[2]>1))
  {
    word = paste(word , isTens[digits[2]]," ");
  }   
  if(digits[1]!=0)
  {
    if (digits[2]<2 & digits[2]>0){
      word = paste(word , notTens[(digits[2]*10)+digits[1]+1]);
    }else{
      word = paste(word , notTens[digits[1]+1]);
    }
  }
  print(word)
}

CalculateBreakDown <- function(bill, paid){
  moneyValues = c(5000, 2000, 1000);
  change = paid - bill;
  noMoreMoney = FALSE;
  if(as.integer((change/100))>0)
    print(paste(numToWord(as.integer(change/100)), " pound"));
  if((change%%100)>0)
    print(paste(numToWord(change%%100), " pence"));
  print(paste("Bill : �",bill / 100));
  print(paste("Paid : �",paid / 100));
  print(paste("Change : �",change / 100));
  i = 1;
  #While loop for when values are still available (over 1 pence - managed in loop)
  while (!noMoreMoney) 
  {
    #If at the end of the money loop go back to the front (values changed throughout loop)
    if (i > length(moneyValues))
      i = 1;
    #exit the loop if there'ss no more money values to check
    if (moneyValues[i] < 1){
      noMoreMoney = TRUE;
    }else{
      #if the change can be divided by the current money value print the value and number
      if (as.integer((as.integer(change) / as.integer(moneyValues[i]))) > 0)
      {
        print(paste("�",moneyValues[i] / 100," : ", as.integer((as.integer(change) / as.integer(moneyValues[i])))));
      }
      
      #set the change equal to what is left after the money has been deducted from the change
      change = change %% moneyValues[i];
      #modify the money value for when loop goes back around
      moneyValues[i] = moneyValues[i]/ 10;
      i= i+1;
    }
  }
}
CalculateBreakDown(880,1000)