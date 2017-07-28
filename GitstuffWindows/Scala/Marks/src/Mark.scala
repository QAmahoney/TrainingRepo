object Mark {
  def main(args: Array[String])
  {
    var physics = 100
    var chemistry = 80
    var maths = 150
    var total:Float = physics + chemistry + maths 
    var percentage = total/450*100
    
    var remark = ""
    if(percentage >60)
    {
      remark = "YOU PASSED!"
    }else {
      remark = "YOU FAILED!"
    }
    
    
    println("TOTAL: " + total)
    println("Percentage: " + percentage)
    print("Remark: " + remark)
    
  }
}

