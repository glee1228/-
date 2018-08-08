import re

f = open("data/Paulamazing.txt", 'r',encoding='UTF8')
r = re.compile(r'\b[가-힣]{1,5}')
r2 = re.compile(r'\b\d{6}')
while True:
    str1 = f.readline()
    if r.findall(str1)==None:
        print("잘못입력")
        continue
    else :
        print(r.findall(str1))
        print(r2.findall(str1))


    if not str1: break
f.close()