n = int(input())

out = 0

for i in range(n):
    number = input()
    out += (int(number[:-1])) ** (int(number[-1]))

print(out)