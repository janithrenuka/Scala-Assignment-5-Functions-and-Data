
object q1{
  def main(args:Array[String])
  {
    class Rational(p:Int,q:Int)
    {
      def numer=p
      def denom=q
      
      def negative = new Rational(-this.numer,this.denom)
    }
     
    println("X Numer:");
    var num = scala.io.StdIn.readInt();
    println("X Denom:");
    var den = scala.io.StdIn.readInt(); 
    
    val x=new Rational(num,den)
      
    
    println("")
    println(x.negative.numer+"/"+x.negative.denom)
    //println(x.negative.denom)
   
  }

}