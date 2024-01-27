import math
h, v = map(int, input().split())
ans = int(math.ceil(h/math.sin(math.radians(v))))
print(ans)