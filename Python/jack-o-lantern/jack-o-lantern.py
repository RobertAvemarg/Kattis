import sys
 
for line in sys.stdin:
    input_data = line.split()
    print(int(input_data[0]) * int(input_data[1]) * int(input_data[2]))