#https://open.kattis.com/problems/chanukah
t = int(input())
for _ in range(t):
    k, n = map(int,input().split())
    print(k, n*(n+3)//2)