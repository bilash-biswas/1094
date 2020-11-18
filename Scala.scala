import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
var d=0
var e=0
var f=0
var a=input.nextInt()

for(i <- 1 to a){
    var b=input.nextInt();
    var c=input.next().charAt(0)
    if(c=='C'){
        d=d+b
    }
    else if(c=='R'){
        e=e+b
    }else if(c=='S'){
        f=f+b
    }
}

var t=d+e+f
println("Total: %d cobaias".format(t))
println("Total de coelhos: %d".format(d))
println("Total de ratos: %d".format(e))
println("Total de sapos: %d".format(f))
println("Percentual de coelhos: %.2f %%".format((d*100.00)/t))
println("Percentual de ratos: %.2f %%".format((e*100.00)/t))
println("Percentual de sapos: %.2f %%".format((f*100.00)/t))
}
}
 
