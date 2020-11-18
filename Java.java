import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
int b;
char c;
int d=0,e=0,f=0,i,t;
int a=input.nextInt();

for(i=0;i<a;i++){
    b=input.nextInt();
    c=input.next().charAt(0);
    if(c=='C'){
        d=d+b;
    }
    else if(c=='R'){
        e=e+b;
    }else if(c=='S'){
        f=f+b;
    }
}

t=d+e+f;
    System.out.printf("Total: %d cobaias\n",t);
System.out.printf("Total de coelhos: %d\n",d);
System.out.printf("Total de ratos: %d\n",e);
System.out.printf("Total de sapos: %d\n",f);
System.out.printf("Percentual de coelhos: %.2f %%\n",(d*100.00)/t);
System.out.printf("Percentual de ratos: %.2f %%\n",(e*100.00)/t);
System.out.printf("Percentual de sapos: %.2f %%\n",(f*100.00)/t);
    }
}
