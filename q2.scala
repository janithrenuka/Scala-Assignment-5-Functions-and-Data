
object q2{
   def main(args:Array[String])
  {
    class Rational(p:Int,q:Int)
    {
      def numer=p
      def denom=q
      
      def sub(r:Rational)= new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
      
    }
    val x=new Rational(3,4)
    val y=new Rational(5,8)
    val z=new Rational(2,7)
    
    println("x=3/4");
    println("y=5/8");
    println("z=2/7");
    println("")
    println("x-y =")
    println(x.sub(y).numer)
    println(x.sub(y).denom)
    
    println("")
    val s=new Rational(x.sub(y).numer,x.sub(y).denom)
    
    println("x-y-z =")
    println(s.sub(z).numer)
    println(s.sub(z).denom)
    
  }
}