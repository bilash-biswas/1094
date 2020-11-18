a=int(input())
b=[]
c=[]
d=0
e=0
f=0
for i in range(0,a):
    x,y=input().split()
    x=int(x)
    b.append(x)
    c.append(y)
for i in range(0,a):
    if c[i]=='C' :
        d=d+b[i]
    elif c[i]=='R' :
        e=e+b[i]
    elif c[i]=='S' :
        f=f+b[i]
t=d+e+f
print("Total: {} cobaias".format(t))
print("Total de coelhos: {}".format(d))
print("Total de ratos: {}".format(e))
print("Total de sapos: {}".format(f))
print("Percentual de coelhos: {0:.2f} %".format((d*100.00)/t))
print("Percentual de ratos: {0:0.2f} %".format((e*100.00)/t))
print("Percentual de sapos: {0:0.2f} %".format((f*100.00)/t))
