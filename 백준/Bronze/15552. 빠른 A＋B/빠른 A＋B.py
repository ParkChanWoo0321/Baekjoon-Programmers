import sys
a = int(sys.stdin.readline())
testcase_list = [sys.stdin.readline().rstrip() for _ in range(a)]

for k in testcase_list:
    i = k.split()
    a = int(i[0])
    b = int(i[1])
    print(a+b)