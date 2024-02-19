n = int(input())
a = list(map(int, input().split()))

start = -1
end = -1

for i in range(n - 1):
    if a[i] > a[i + 1]:
        start = i
        break

for i in range(n - 1, 0, -1):
    if a[i] < a[i - 1]:
        end = i
        break

if start == -1 and end == -1:
    print("yes")
    print("1 1")
else:
    a[start:end + 1] = reversed(a[start:end + 1])
    if a == sorted(a):
        print("yes")
        print(start + 1, end + 1)
    else:
        print("no")
