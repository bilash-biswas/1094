a=gets().chomp().to_i
b=Array.new()
c=Array.new()
d=0
e=0
f=0
for i in 1..a
  b[i],c[i]=gets().chomp().split(' ');
  b[i]=b[i].to_i
end
for i in 1..a
    if c[i]=='C'
        d=d+b[i]
    elsif c[i]=='R'
        e=e+b[i]
    elsif c[i]=='S'
        f=f+b[i]
    end
end
t=d+e+f
printf("Total: %d cobaias\n",t);
printf("Total de coelhos: %d\n",d);
printf("Total de ratos: %d\n",e);
printf("Total de sapos: %d\n",f);
printf("Percentual de coelhos: %.2f %%\n",(d*100.00)/t);
printf("Percentual de ratos: %.2f %%\n",(e*100.00)/t);
printf("Percentual de sapos: %.2f %%\n",(f*100.00)/t);
