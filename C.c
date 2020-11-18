#include<stdio.h>
int main()
{
    int a,b[10000],i,d=0,e=0,f=0,t;
    char c[10000];
    scanf("%d",&a);
    for(i=0;i<a;i++)
    {
        scanf("%d %c",&b[i],&c[i]);
    }
    for(i=0;i<a;i++)
    {
        if(c[i]=='C')
        {
            d=d+b[i];
        }
        else if(c[i]=='R')
        {
            e=e+b[i];
        }
        else if(c[i]=='S')
        {
            f=f+b[i];
        }
    }
    t=d+e+f;
    printf("Total: %d cobaias\n",t);
    printf("Total de coelhos: %d\n",d);
    printf("Total de ratos: %d\n",e);
    printf("Total de sapos: %d\n",f);
    printf("Percentual de coelhos: %.2lf %%\n",(d*100.00)/t);
    printf("Percentual de ratos: %.2lf %%\n",(e*100.00)/t);
    printf("Percentual de sapos: %.2lf %%\n",(f*100.00)/t);

}
