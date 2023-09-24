# Python 기본 학습

## 목차




## 키보드 입력

input을 활용하여 키를 입력한다.


#### 이름 입력

```py
person = input("이름을 일력하세요:")

print(person)
print("안녕하세요 " + person + "님" )
```
#### 숫자를 정수와 문자열로 받는 법

```py
print( 1 + 2 )
print(" 숫자 " + str(1))
```

#### 숫자 입력

```py
number = input("숫자를 입력하세요:")

print(number)
print("숫자 " + number)
number = int( number ) + 1
print(number)
```

## 화면 출력

print를 활용하여 특정 내용을 출력한다.


#### 수와 변수

```py
a = 10
b = 20
print(a, b, a – b, 100)
```

#### 원과 시퀀스

```py
price = 100
print(price, "원", sep="")
```

#### 문자열 규칙

```py
print('문자열에는 \n\t문자 앞 뒤에 쌍 따옴표(\')를 붙인다')
```

#### Sep

```py
year = 2023
month = 11
day = 15
print(year, month, day, sep="-")
```

#### 포맷과 스트링

```py
x = 25
y = 1234.12345
animal = "호랑이"
print("%10.1f %10s" % (y, animal))
```

#### 포맷 %s

```py
animal = "호랑이"
print("%s" % animal)
```

#### 포맷팅 (Format)

변수를 출력하는 방법
```py
print(“%s , %d”, % 변수, 변수)
# %s : 문자 / %d : 숫자

print(“{},{}”.format(변수, 변수))
print(f“내용{변수} {변수}내용”)
```

### 포맷팅 예시

#### 문자열 포맷팅

```py
name = "Alice"
age = 30
print("안녕, 나는 %s이고, %d살이야!" % (name, age))
```

#### 포맷 문자열 리터럴

```py
name = "David"
age = 28
print(f"안녕, 나는 {name}이고, {age}살이야!")
```

#### 숫자 포맷팅
```py
name = "Bob"
age = 25
print("안녕, 나는 {}이고, {}살이야!".format(name, age))
```

#### 포맷 문자열 변수
```py
name = "Eve"
age = 22
print("안녕, 나는 {name}이고, {age}살이야!".format(name=name, age=age))
```

## 조건문

if 키워를 사용하여 조건을 지정하고, 조건이 참일 경우 해당 코드 블록 (들여쓰기로 블록 지정) 이 실행된다.   
elif는 또다른 조건을 지정해줄 수 있다.   
else 는 즉정 조건이 다른 경우 코드 불록이 실행된다.   

※ 조건문과 반복문은 들여쓰기에 따라 오류가 날 수 있으니 유의하여야 한다.


#### if문 예시

```py
age = 18
if age >= 18:
    print("성인입니다.")
else:
    print("성인이 아닙니다.")
```

#### else문
```py
a = int(input("A에 대한 숫자를 입력하세요"))
b = int(input("B에 대한 숫자를 입력하세요"))
if (a > b):
    print("A값 : ", a)
else:
    print("B값 : ", b)
```
#### 논리 연산자 사용

```py
age = 25
if age >= 18 and age <= 60:
    print("18세 이상이고 60세 이하입니다.")
# elif문 
score = 85
if score >= 90:
    print("A 학점")
elif score >= 80:
    print("B 학점")
elif score >= 70:
    print("C 학점")
else:
    print("D 학점")
```

#### 중첩 조거문
```py
grade = "B"
if grade == "A":
    print("우수한 성적")
else:
    if grade == "B":
        print("보통 성적")
    else:
        print("미흡한 성적")
```

## 반복문

- for 반복문은 시퀀스의 요소를 순회하거나, 특정 횟수만큼 반복한다.
- while 반복뭉는 조건이 참인 동안 코드 블록을 반복한다.
- for문에서 range는 연속된 정수를 생성하는데 사용한다


#### for 반복문
```py
fruits = ["사과", "바나나", "체리"]
for fruit in fruits:
    print(fruit)

# 위 내용과 같다.
print(fruits[0])
print(fruits[1])
print(fruits[2])
```

#### while반복문
```py
count = 1
while count <= 5:
    print(count)
    count += 1
```
break : 반복문에서 나가기   
continue : 다음으로 너어가기   
else : 조건에서 벗어난 뒤 작업   

#### range 함수

for 변수 in range() 에서 range(start, stop, step) 구성을 가지고 있다.   
= 변수값을 start에서 stop까지 step값 만큼 증감시키며 반복한다.   

예시) i 값을 1부터 11까지 1씩 증감시킨다.

```py
for i in range(1, 11, 1):
    print(i)
```

예시)구구단 
```py
for i in range(1, 10):  
    for j in range(1, 10):  
        result = i * j  
        print(f"{i} x {j} = {result}")
```
