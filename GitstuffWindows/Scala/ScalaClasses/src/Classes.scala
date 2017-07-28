

class Classes (){
  
  var num:Int = 10;
  println("Primary")
  
  def this(m:String)
  {
    this()
    println("1 Paramater")
    Message(m)
  }
  
  def Message(mes:String)
  {
    println(s"Message: $mes, num defined in primary is: $num")
  }
}



class Classes2 extends Classes
{
  
  def this(m:String)
  {
    this()
    println("1 Paramater")
    Message(m)
  }
  
  override def Message(mes:String)
  {
    println(s"Overrided Message: $mes, num defined in primary is: $num")
  }
}




object Main
{
  def main(args:Array[String])
  {
  var newClass = new Classes("Child");
    
  
  println ("_____________")
  var secondClass = new Classes2("Child")
  }
}










