## JAVA 개요
### JAVA 주석
### Camel 스타일

# 변수
### 변수의 종류
### 자동 타입 변환
### 강제 타입 변환
### 연산식에서 자동 타입 변환
### 문자열을 기본타입으로 변환
### 변수 출력 방법
### 입력 데이터 변수에 저장

# 연산자
### 증감 연산자
### 산술 연산자
### 오버플로우와 언더플로우
### 비교 연산자
### 논리 연산자
### 비트 논리 연산자
### 비트 이동 연산자
### 대입 연산자
### 삼항연산자

# 조건문과 반복문
### 조건문 - IF문
### 중첩조건문
### 조건문 switch문
### for문 - 구구단
### for문 - float
### While문
### do-while문
### break
### continue

# 참조타입

### null과 NullPointerException
### 참조 타입 변수의 ==, != 연산
### JVM의 메모리 영역
### 데이터 타입 분류   

### 문자열 타입

#### 문자열 선언
#### 문자열 비교
#### 문자열 추출
#### 문자열 길이
#### 문자열 대체
#### 문자열 잘라내기
#### 문자열 찾기
#### 문자열 분리

### 배열 타입

#### 배열 변수 선언
#### 배열 항목을 관리하는 예시
#### 배열 길이

### 다차원 배열

#### 값 목록으로 다차원 배열 생성
#### new 연산자로 다차원 배열 생성
#### 객체를 참조하는 배열
#### 배열 복사
#### 배열 항목 반복을 위한 향상된 for 문

### main 메소드의 String[]

### 열거타입

---


## JAVA 개요

하드웨어 운영체제 < JDK 구동 [JVM(JAVA 가상머신)] - 운영체제를 따로 구분하지 않는다.

### JAVA 주석

//		: 한줄 주석
/* 내용 */	: 블록 주석
/** 내용 */ 	: API 설명 주석

### Camel 스타일
1. 소스파일(클래스)명은 대문자로 시작하는 것이 관례
2. 변수명은 소문자로 시작하는 것이 관례

# 변수

### 변수의 종류

```java
// 변수 - 정수
byte var1 = -128;		// 8bit
short var2 = -32765;	// 16bit
char var3 = 0; 		// 16bit
int var4 = 0;		// 32bit
long var5 = 0;		// 64bit
		
// 변수 - 문자
char var6 = 'a';		// 16bit
String var7 = "ABCD";	// 참조타입
		
// 변수 - 실수
float var8 = 0.0f;		// 32bit - 소수 7자리
double var9 = 0.0f;		// 64bit - 소수 15자리
		
// 변수 - 논리
boolean var10 = true;	// 2bit
```

### 자동 타입 변환

작은 허용 범위 타입 → 큰 허용 범위 타입   
byte < short   
char < int < long < float < double   

```java
// byte -> int
byte byteValue = 10;
int intValue = byteValue;
		
// long -> float
// long -> double
long longValue = 50000000L;
float floatValue = longValue;
double doubleValue = longValue;
```

### 강제 타입 변환

```java
// int -> byte
int intValue1 = 10;
byte byteValue1 = (byte)intValue1;
		
// long -> int
long longValue1 = 10;
int intValue2 = (int) longValue1;
		
// int -> char
int intValue3 = 65;
char charValue1 = (char)intValue3;
			
// 실수-> 정수
double doubleValue1 = 3.14;
int intValue4 = (int)doubleValue1;
```

### 연산식에서 자동 타입 변환

```java
// result1 : double Type
int value1 = 10;
double value2 = 5.5;
double result1 = value1 + value2; 
		
// result2 : int Type
int value3 = 10;
double value4 = 5.5;
double result2 = value3 + (int)value4; 
		
// result3,4,5 : int , int -> double 출력방법
int value5 = 1;
int value6 = 2;
double result3 = (double) value5 / value6;
double result4 = value5 / (double)value6;
double result5 = (double) value5 /(double) value6;

// 컴파일 단계에서 연산
byte result1 = 10 + 20;
		
// int 타입으로 변환 후 연산
byte v1 = 10;
byte v2 = 20;
int result2 = v1 + v2;
		
// long 타입으로 변환 후 연산
byte v3 = 10;
int v4 = 100;
long v5 = 1000L;
long result = v3 + v4 + v5;
		
// int 타입으로 변환 후 연산
char v6 = 'A';
char v7 = 1;
int result4 = v6 + v7;

// 정수 연산의 결과는 정수
int v8 = 10;
int result5 = v8/4;
		
// double 타입으로 변환 후 연산
int v9 = 10;
double result6 = v9 /4.0f;
		
// double 타입으로 변환 후 연산
int v10 = 1;
int v11 = 2;
double result7 = (double) v10 / v11;

int result1 = 10 + 2 + 8;		//20
String result2 = 10 + 2 + "8";	// 128
String result3 = 10 + "2" + 8;	//1028
String result4 = "10" + 2 + 8;	//1028
String result5 = "10" + (2 + 8);     // 1010
```

### 문자열을 기본타입으로 변환
```java
byte value1 = Byte.parseByte("10");
short value2 = Short.parseShort("200");
int value3 = Integer.parseInt("10");
long value4 = Long.parseLong("40000");
float value5 = Float.parseFloat("12.345");
double value6 = Double.parseDouble("3.14");
boolean value7 = Boolean.parseBoolean("true");
		
String str1 = String.valueOf(10);
String str2 = String.valueOf(3.14);
String str3 = String.valueOf(true);

System.out.println(str1);  // 출력이후 행을 바꾼다.
System.out.print(str2);    // 출력만 한다.
System.out.printf(str3);   // 문자열에 맞추어 값을 출력
```

### 변수 출력 방법

```java
System.out.printf("상품의 가격 %d", value3);
System.out.printf("상품의 가격 %6d", value3);
System.out.printf("상품의 가격 %-6d", value3);
System.out.printf("상품의 가격 %06d", value3);
		
System.out.printf("상품의 가격 %10.2f", value5);
System.out.printf("상품의 가격 %-10.2f", value5);
System.out.printf("상품의 가격 %010.2f", value5);
		
System.out.printf("상품의 가격 %s", str1);
System.out.printf("상품의 가격 %6s", str1);
System.out.printf("상품의 가격 %-6s", str1);
		
System.out.print("특수문자 \t , %%, \n");
```

### 입력 데이터 변수에 저장

```java
Scanner scanner = new Scanner(System.in);
		
String strX = scanner.nextLine();
int x = Integer.parseInt(strX);
		
String strY = scanner.nextLine();
int y = Integer.parseInt(strY);
```

# 연산자

### 증감 연산자

```java
int x = 10;
int y = 10;		
// x를 1 증가 한 뒤 더하기
int result1 = ++x + 10; // 21
// y를 더한 뒤 y를 1 증가
int result2 = y++ + 10;	// 20

System.out.println(result1);
System.out.println(result2);
```

### 산술 연산자

```java
// 산술 연산자
int result3 = v1 + v2;
int result4 = v1 - v2;
int result5 = v1 * v2;
double result6 = (double)v1 / v2;
int result7 = v1 % v2;
```

### 오버플로우와 언더플로우

※ 정확한 연산은 정수 연산으로 계산하는 것이 좋다.   
※ 나눗셈,나머지 연산자의 예외처리 (NaN과 Infinity)   
```java
byte var1 = 125;
for(int i = 0;i < 5;i++) {
   var1++;
   // 오버플로우
   // var1 = 128 부터 - 128로 변환된다.
}
		
byte var2 = -125;
for(int i = 0;i < 5;i++){
   var2--;
   // 언더플로우
   // var2 = -129 부터 127로 변환된다.
}
```

### 비교 연산자

```java
// ==  , != , <=
int num1 = 10;
int num2 = 10;
boolean result1 = (num1 == num2);	// True
boolean result2 = (num1 != num2);	// False
boolean result3 = (num1 <= num2);	// True
// <
char char1 = 'A';
char char2 = 'B';
boolean result4 = (char1 < char2);	// True
// == 변수 형식 비교
int num3 = 1;
double num4 = 1.0f;
boolean result5 = (num3 == num4);	// True	
// ==  변수 형식 비교
float num5 = 0.1f;
double num6 = 0.1;
boolean result6 = (num5 == num6);		// False
boolean result7 = (num5 == (float)num6);	// True	
// String 비교
String str1 = "자바";
String str2 = "Java";
boolean result8 = (str1.equals(str2));	// False
boolean result9 = (!str1.equals(str2));	// True
```

### 논리 연산자

AND : &&   
OR : ||   
XOR : ^   
NOT : !   

```java
int charCode = 'A';
		
// &&, & 같은 뜻으로 사용된다.
if ((65 <= charCode) && (charCode <= 90)) {
	// 0 ~ 9 숫자
}
if ((65 <= charCode) & (charCode <= 90)) {
	// 대문자
}
if ((97 <= charCode) & (charCode <= 122)) {
	// 소문자
}

// ||, | 같은 뜻으로 사용된다.
int value = 6;
		
if( (value%2 == 0) ||(value%3 == 0)) {
	// 2 또는 3의 배수
}
		
// 2 또는 3의 배수
boolean result = (value%2 == 0) || (value%3 == 0);
```

### 비트 논리 연산자

```java
// 비트 논리곱 연산으로 Unsigned 정수 얻기
byte receiveData = -120;
		
// 자바 API를 이용해서 unsigned 정수 얻기
int unsignedInt1 = receiveData & 255;
int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		
int test = 136;
byte btest = (byte)test;
```

### 비트 이동 연산자

```java
int value = 772;
// 우측으로 3byte 이동, 1바이트만 읽기
byte byte1 = (byte) (value >>> 24);
int int1 = byte1 & 255;	// 0
// 우측으로 2byte 이동, 1바이트만 읽기
byte byte2 = (byte) (value >>> 16);
int int2 = Byte.toUnsignedInt(byte2);	// 0
// 우측으로 1byte 이동, 1바이트만 읽기
byte byte3 = (byte) (value >>> 8);
int int3 = byte3 & 255;	// 3
// 끝 1바이트만 읽기
byte byte4 = (byte) value;
int int4 = Byte.toUnsignedInt(byte4);	// 4
```

```java
//  4  [00000000] [00000000] [00000000] [00000100]
// 보수 [11111111] [11111111] [11111111] [11111011]+1
// -4  [11111111] [11111111] [11111111] [11111100]
//int value = -4;

int value = 0b11111111111111111111111111111100;
System.out.println("첫 번째 부호 없는 값: " + value);

//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음
byte byte1 = (byte) (value >>> 24);
int int1 = byte1 & 255;
System.out.println("첫 번째 부호 없는 값: " + int1);

//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음:
byte byte2 = (byte) (value >>> 16);
int int2 = Byte.toUnsignedInt(byte2);
System.out.println("두 번째 부호 없는 값: " + int2);

//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: 
byte byte3 = (byte) (value >>> 8);
int int3 = byte3 & 255;  
//[11111111] + [11111111] = [11111111]
// int3 [00000000] [00000000]  [00000000]  [11111111]
System.out.println("세 번째 부호 없는 값: " + int3);

//끝 1바이트만 읽음: [11111100]
byte byte4 = (byte) value;
int int4 = Byte.toUnsignedInt(byte4);
System.out.println("네 번째 부호 없는 값: " + int4);
```

### 대입 연산자

```java
int result = 0;
result += 10;	// result = 10
result -= 5;	// result = 5
result *= 3;	// result = 15
result /= 5;	// result = 3
result %= 3;	// result = 0

int result = 14;// 8 + 4 + 2
result &= 3;	// 2 + 1 // and 연산
						// 결과 : 2
System.out.println(result);
		
result = 22;	// 16 + 4 + 2
result |= 24;	// 16 + 8 // or 연산
						// 결과 16 + 8 + 4 + 2
System.out.println(result); 
		
result = 22;	// 16 + 4 + 2
result ^= 24;	// 16 + 8 // xor 연산
						// 결과 : 8 + 4 + 2
System.out.println(result); 
		
result = 2;		// 10
result <<= 1;	// 100
		
System.out.println(result); 
		
result = 2;		// 10
result >>= 1;	// 01
						
System.out.println(result); 
		
result = 32;	// 10000
result >>>= 3;	// 00100
						
System.out.println(result); 
```

### 삼항연산자

```java
// 형태 : 조건 ? 참 : 거짓
char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
// 조건 ? 참 : (조건 ? 참 : 거짓)
```

※ 연산의 방향과 우선순위 → 오른쪽에서 왼쪽으로 읽는다.   
※ 곱셈 및 나눗셈 등의 사칙연산 연산자는 오른쪽에서 * /부터 연산을 한다.   


# 조건문과 반복문

### 조건문 - IF문

※ if(조건) else if(조건) else 형태를 가지고 있다.   
```java
int num = (int)(Math.random() * 6) + 1;
		
if (num == 1) {
     System.out.println("1번이 나왔습니다.");
}
else if (num == 2) {
     System.out.println("2번이 나왔습니다.");	
}
else if (num == 3) {
     System.out.println("3번이 나왔습니다.");	
}
else if (num == 4) {
     System.out.println("4번이 나왔습니다.");
}
else if (num == 5) {
     System.out.println("5번이 나왔습니다.");
}
else if (num == 6) {
     System.out.println("6번이 나왔습니다.");
}
else {
     System.out.println("그 외의 숫자가 나왔습니다.");	
}
```

### 중첩조건문
```java
int score = (int)(Math.random()* 20) + 81;
System.out.println("점수 : " + score);
String grade;
		
if (score >= 90) {
	if(score >= 95) {
		grade = "A+";
	}else {
		grade = "A";
	}
}else {
	if (score >= 85) {
		grade = "B+";
	}else {
		grade = "B";
	}
}
System.out.println("학점 : " + grade);
```

### 조건문 switch문
```java
int num = (int)(Math.random() * 6) + 1;
		
switch(num) {
   case 1:
      System.out.println("1번이 나왔습니다.");
   break;
   case 2:
      System.out.println("2번이 나왔습니다.");
   break;
   case 3:
      System.out.println("3번이 나왔습니다.");
   break;
   case 4:
      System.out.println("4번이 나왔습니다.");
   break;
   case 5:
      System.out.println("5번이 나왔습니다.");
   break;
   case 6:
      System.out.println("6번이 나왔습니다.");
   break;
   default:
      System.out.println("그 외의 숫자가 나왔습니다.");
   break;
}

int score = switch(grade) {
	case 'A' -> 100;
	case 'B' -> {
		int result = 100 - 20;
		yield result;
	}
	default -> 60;
};

switch(grade) {
case 'A', 'a' ->	System.out.println("우수 회원");
case 'B', 'b' ->	System.out.println("일반 회원");
default -> System.out.println("손님");
}
```

### for문 - 구구단
```java
for(int m = 2;m <= 9;m++){
System.out.println("*** " + m  + " 단 ***");	
   for(int n = 2;n <= 9;n++){
     System.out.println(m+" x "+n+" = "+ (m * n));	
  }
}
```

### for문 - float
```java
for(float x = 0.1f;x <= 1.0f;x += 0.1f) {
	System.out.println(x);
}

/*
부동 소수점 방식의 float 타입은 연산 과정에서 정확한 0.1을 표현하지 못한다.
따라서 실제 0.1 값보다 살짝 클수 있다.
0.1
0.2
0.3
0.4
0.5
0.6
0.70000005
0.8000001
0.9000001
*/
```

### While문
```java
int sum = 0;
int i = 1;
		
while(i <=100) {
	sum += i;
	i++;
}
System.out.println("1 ~ " + i +"의 합:" + sum);

Scanner scanner = new Scanner(System.in);
boolean run = true;		
int speed = 0;
		
while(run) {
		System.out.println("--------------------------");
System.out.println("-1. 증속 / 2. 감속 / 3. 중지-");
System.out.println("--------------------------");
System.out.print("선택 : ");
			
String strNum = scanner.nextLine();
	
if(strNum.equals("1")) {
	speed++;
}else if(strNum.equals("2")) {
	speed--;
}else if(strNum.equals("3")) {
	run = false;
}
System.out.println("현재 속도 = " + speed);
}
System.out.println("프로그램 종료");
```

### do-while문

※ 먼저 실행을 하고 조건을 확인한다.

```java
System.out.println("메시지를 입력하세요.");
System.out.println("프로그램을 종료 : q.");
		
Scanner scanner = new Scanner(System.in);
		
String inputString;
		
do {
	System.out.print(">");
	inputString = scanner.nextLine();
         System.out.println(inputString);

}while(!inputString.equals("q"));
		
System.out.println();
System.out.println("프로그램 종료");
```

### break
※ 도중에 반복문을 종료한다.
```java
while(true) {
	int num = (int)(Math.random() * 6) + 1;
			
	System.out.println(num);
		
	if(num == 6) {
		break;
	}
}
// 지정된 반복문을 직접 끝낼 수 있다.
Outter: for(char upper ='A'; upper <= 'Z';upper++) {
	for(char lower = 'a'; lower <= 'z';lower++) {
	System.out.println(upper + "-" + lower);
		if(lower=='q') {
			break Outter;
		}
	}
}

```
### continue

```java
for(int i = 0;i <= 10;i++) {
	if(i%2 != 0) {
		continue;
	}
	System.out.println(i + " ");
}
```

# 참조타입

### 데이터 타입 분류   

데이터 타입   
- 기본 타입 : 값으로 저장
  - 정수 타입
     - byte
     - char
     - short
     - int
     - long
  - 실수 타입
    - float
    - double
	- 논리 타입
	  - boolean
- 참조 타입 : 메모리 번지로 저장
  - 배열타입
  - 열거타입
  - 클래스
  - 객체

※ 객체 = 데이터(필드) + 메소드   
※ 스택 영역 : 기본 타입 변수가 저장되는 장소   
※ 힙 영역 : 참조 타입 변수가 저장되는 장소   


### JVM의 메모리 영역

메소드 영역 : 바이트코드 파일을 읽는 내용이 저장되는 영역, 클래스별로 상수, 정적 필드, 메소드 코드, 생성자 코드 등이 저장된다.

힙 영역 : 객체가 생성되는 영역

스택 영역 : 호출할 때마다 생성되는 프레임이 저장되는 영역
※ 프레임 내부에 로컬 변수 스택이 저장된다.

### 참조 타입 변수의 ==, != 연산

```java
int [] arr1;
int [] arr2;
int [] arr3;
		
arr1 = new int[] {1,2,3};
arr2 = new int[] {1,2,3};
arr3 = arr2;
		
boolean result; 
result = (arr3 == arr1);	// False
result = (arr3 == arr2);	// True
```

### null과 NullPointerException

```java
// NullPointerException : 변수가 null 상태임을 표현해준다.
int[] intArray = null;
// intArray[0] 접근시 NullPointerException
String str = null;
// str 확인시 NullPointerException

// null 표현은 변수를 쓰레기 객체로 만든다.
String hobby = "여행";
hobby = null;
		
String kind1 = "자동차";
String kind2 = kind1;
kind1 = null;
		
// hobby : 쓰레기 객체
// kind1 : 쓰레기 객체
// kind2 : "자동차"
```

### 문자열 타입

#### 문자열 선언
```java
String name;
name = "홍길동";
String hobby = "여행";

// 리터럴 선언
// strVar1 == strVar2 
String strVar1 = "홍길동";
String strVar2 = "홍길동";
		
// 참조 선언
// strVar3 != strVar4
String strVar3 = new String("홍길동");
String strVar4 = new String("홍길동");
```
#### 문자열 비교
```java
// 리터럴 선언
// strVar1 == strVar2 
String strVar1 = "홍길동";
String strVar2 = "홍길동";
		
// 참조 선언
// strVar3 != strVar4
String strVar3 = new String("홍길동");
String strVar4 = new String("홍길동");
		
// strVar1 과 strVar2 비교
boolean check = false;
check = (strVar1 == strVar2);// True : 참조가 같음
check = strVar1.equals(strVar2);// True : 내용이 같음
check = (strVar3 == strVar4);// False : 참조가 다름
check = strVar3.equals(strVar4);// True : 내용이 같음
```
#### 문자열 추출
```java
String ssn = "123456789";
ssn.charAt(0);	// ‘1’
ssn.charAt(1);	// ‘2’
ssn.charAt(2);	// ‘3’
ssn.charAt(3);	// ‘4’
ssn.charAt(4);	// ‘5’
ssn.charAt(5);	// ‘6’
ssn.charAt(6);	// ‘7’
ssn.charAt(7);	// ‘8’
ssn.charAt(8);	// ‘9’
```
#### 문자열 길이
```java
String str = "1234567890";
int len = str.length();	// 10
```
#### 문자열 대체
```java
String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
String newStr = oldStr.replace("자바", "JAVA");
		
System.out.println(oldStr);
//자바 문자열은 불변입니다. 자바 문자열은 String입니다.
System.out.println(newStr);
//JAVA 문자열은 불변입니다. JAVA 문자열은 String입니다.
```
#### 문자열 잘라내기
```java
String ssn = "000000-1234567";
String firstNum = ssn.substring(0,6);		System.out.println(firstNum);	// 000000
		
String secondNum = ssn.substring(7);
System.out.println(secondNum);	// 1234567
```
#### 문자열 찾기
```java
/*
* 자바 프로그래밍
* 01234567
*/
String subject = "자바프로그래밍";
int location = subject.indexOf("프로그래밍");
System.out.println(location);	// location = 3
String subString = subject.substring(location);
System.out.println(subString);	// 프로그래밍

String subject = "자바프로그래밍";
int location = subject.indexOf("자바");
		
if(location != -1) {
	System.out.println("자바와 관련된 책");
}else {
	System.out.println("자바와 관련이 없는 책");
}
		
boolean result = subject.contains("자바");
if(result) {
	System.out.println("자바와 관련된 책");
}else {
	System.out.println("자바와 관련이 없는 책");
}
```
#### 문자열 분리

```java
String board = "번호,제목,내용,성명";
String[] arr = board.split(",");
// arr[0] = 번호
// arr[1] = 제목
// arr[2] = 내용
// arr[3] = 성명
for(int i = 0;i < arr.length;i++){
	System.out.print(arr[i] + " ");
}
```

### 배열 타입

※ 배열 : 같은 타입의 변수를 인덱스를 부여하여 값을 나열시켜 놓은 자료구조를 말한다.   

type [] 변수명 = new type[5]   
※ 배열은 같은 타입의 값만 관리한다.   
※ 배열의 길이는 늘리거나 줄일 수 없다.   

#### 배열 변수 선언
```java
String [] season = {"Spring", "Summer", "Fall", "Winter"};
		
System.out.println("season[0] : " + season[0]);	// Spring
System.out.println("season[1] : " + season[1]);	// Summer
System.out.println("season[2] : " + season[2]);	// Fall
System.out.println("season[3] : " + season[3]);	// Winter
		
season[1] = "여름";
System.out.println("season[1] : " + season[1]);	// 여름

// 총합과 평균구하기		
int[] scores = {83,90,87};
		
int sum = 0;
for(int i = 0;i < 3;i++){
	sum += scores[i];
}
System.out.println("총합 : " + sum);	// 260
double avg = (double) sum / 3;
System.out.println("평균 : " + avg);	// 86.66667
```
#### 배열 항목을 관리하는 예시
```java
// 배열 변수 선언과 배열 생성
int[] arr1 = new int[3];
// 배열 항목의 초기값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr[" + i + "] :" + arr1[i]);
} // arr[0] :0 arr[1] :0 arr[2] :0
		
// 배열 항목의 값 변경
arr1[0] = 10;
arr1[1] = 20;
arr1[2] = 30;		
// 배열 항목의 변경값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr[" + i + "] :" + arr1[i] );
} // arr[0] :10 arr[1] :20 arr[2] :30

// 배열 변수 선언과 배열 생성
double[] arr2 = new double[3];
// 배열 항목의 초기값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr2[" + i + "] :" + arr2[i]);
} // arr2[0] :0.0  arr2[1] :0.0  arr2[2] :0.0
		
// 배열 항목의 값 변경
arr2[0] = 0.1;
arr2[1] = 0.2;
arr2[2] = 0.3;
// 배열 항목의 변경 값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr2[" + i + "] :" + arr2[i]);
} // arr2[0] :0.1  arr2[1] :0.2  arr2[2] :0.3

// 배열 변수 선언과 배열 생성
String[] arr3 = new String[3];
// 배열 항목의 초기값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr3[" + i + "] :" + arr3[i]);
} // arr3[0] :null  arr3[1] :null  arr3[2] :null
				
// 배열 항목의 값 변경
arr3[0] = "1월";
arr3[1] = "2월";
arr3[2] = "3월";
// 배열 항목의 변경 값 출력
for(int i = 0;i < 3;i++){
	System.out.print("arr3[" + i + "] :" + arr3[i]);
} // arr3[0] :1월  arr3[1] :2월  arr3[2] :3월
```

#### 배열 길이

```java
// 배열 변수 선언과 배열 대입
int [] scores = {84,90,96};
		
// 배열 항목의 총합 구하기
int sum = 0;
for(int i = 0;i < scores.length;i++){
	sum += scores[i];
}	// sum = 270
System.out.println("총합 : " + sum);	// 270
		
double avg = (double) sum / scores.length;
System.out.println("평균 : " + avg);	// 90.0
```

### 다차원 배열
```java
int [][] arr = {
	{10,20},
	{30,40,50},
	{60,70,80,90}};

System.out.println(arr.length);	// 3
System.out.println(arr[0].length);	// 2
System.out.println(arr[1].length);	// 3
System.out.println(arr[2].length);	// 4
```


#### 값 목록으로 다차원 배열 생성
```java
int[][] scores = {
	{80,90,96},
	{76,88}
};

System.out.println("1차원 : " + scores.length);
System.out.println("2차원 1번 : " + scores[0].length);
System.out.println("2차원 2번 : " + scores[1].length);
// 첫 번째 반의 세 번째 학생의 점수 읽기
System.out.println("Scores[0][2] " + scores[0][2]);
// 두 번째 반의 두 번째 학생의 점수 읽기
System.out.println("Scores[1][1] " + scores[1][1]);

// 첫 번째 반의 평균 점수 구하기
int class1Sum = 0;
for(int i = 0;i < scores[0].length;i++){
	class1Sum += scores[0][i];
}

double class1Avg = 
(double) class1Sum / scores[0].length;
System.out.println("평균 점수 : " + class1Avg);

// 두 번째 반의 평균 점수 구하기
int class2Sum = 0;
for(int i = 0;i < scores[1].length;i++){
	class2Sum += scores[1][i];
}
		
double class2Avg = 
(double) class2Sum / scores[1].length;
System.out.println("평균 점수 : " + class2Avg);

// 전체 학생의 평균 점수 구하기
int totalStudent = 0;
int totalSum = 0;
// 반의 수만큼 반복
for(int i = 0;i < scores.length;i++){
	totalStudent += scores[i].length;
// 해당 반의 학생 수만큼 반복
	for(int k = 0;k < scores[i].length;k++) {
		totalSum += scores[i][k];
	}		
}		
double totalAvg = (double) totalSum / totalStudent;
System.out.println("전체 학생 평균 점수 : " + totalAvg);
```

#### new 연산자로 다차원 배열 생성
```java
// 각 반의 학생 수가 동일할 경우 한번에 생성
int[][] mathScores = new int[2][3];

// 배열 항목 값 설정
mathScores[0][0] = 80;
mathScores[0][1] = 83;
mathScores[0][2] = 85;
mathScores[1][0] = 86;
mathScores[1][1] = 90;
mathScores[1][2] = 92;

// 각 반의 학생 수가 다를 경우 따로 생성
int[][] englishScores = new int[2][];
englishScores[0] = new int[2];
englishScores[1] = new int[3];

// 배열 항목 값 설정
englishScores[0][0] = 90;
englishScores[0][1] = 91;
englishScores[1][0] = 92;
englishScores[1][1] = 93;
englishScores[1][2] = 94;

// 전체 학생의 수학 평균 구하기
int totalStudent = 0;
int totalMathSum = 0;	
	
for(int i = 0;i < mathScores.length;i++) {
	totalStudent += mathScores[i].length;
	for(int k = 0;k < mathScores[i].length;k++){
		totalMathSum += mathScores[i][k];
	}	
}
// 평균 구하기
double totalMathAvg = 
(double) totalMathSum / totalStudent;

System.out.println("평균 점수 : " + totalMathAvg);

// 전체 학생의 영어 평균 구하기
int totalStudent = 0;
int totalEnglishSum = 0;
		
for(int i = 0;i < englishScores.length;i++) {
	totalStudent += englishScores[i].length;
	for(int k = 0;k < englishScores[i].length;k++){
              totalEnglishSum += englishScores[i][k];
	}	
}
// 평균 구하기	
double totalEnglishAvg = 
(double) totalEnglishSum / totalStudent;
System.out.println("평균 점수 : " + totalEnglishAvg);


```
#### 객체를 참조하는 배열
```java
String[] strArray = new String[3];
// 리터럴로 변수 대입
strArray[0] = "Java";	// 문자열이 같으므로
strArray[1] = "Java";	// str[0] == str[1]
// 참조로 변수 대입
strArray[2] = new String("Java");	// 다른 객체
		
boolean result;
result = strArray[0] == strArray[1];	//객체 같음 true	
result = strArray[0] == strArray[2];	//객체 다름 false
result = strArray[0].equals(strArray[2]);	// true 문자열은 동일
```

#### 배열 복사
```java
// 길이 3인 배열
String[] oldStrArray = {"java", "array","copy"};
		
// 길이 5인 배열
String[] newStrArray = new String[5];
		
// 복사하기
System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
for(int i = 0;i < newStrArray.length;i++) {
	System.out.println(newStrArray[i]);
}
```

#### 배열 항목 반복을 위한 향상된 for 문
```java
int [] scores = {95,71,84,93,87};
		
int sum = 0;
for(int score : scores) {
	sum += score;
}
double avg = (double) sum / scores.length;
System.out.println("점수 총합 : " + sum);
System.out.println("점수 평균 : " + avg);
```

### main 메소드의 String[]

※ 실행시 외부로부터 받아오는 값을 의미한다.   
명령프롬프트 창에서 명령을 내려 값을 전달한다.   
- java 파일명 10 20   

```java
public static void main(String[] args) {		
	String strNum1 = "0";
	String strNum2 = "0";
		
	if(args.length == 0) {
	System.out.println("입력값이 없습니다.");
	}
	else
	{
		strNum1 = args[0];
		strNum2 = args[1];
	}
		
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
		
	int result = num1 + num2;
	System.out.println(result);
}
```
### 열거타입
```java
public enum EnumWeek {
	MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }

EnumWeek today = null;
		
Calendar cal = Calendar.getInstance();
		
int week = cal.get(Calendar.DAY_OF_WEEK);
		
switch(week) {
case 1: today = EnumWeek.SUNDAY; 	break;
case 2: today = EnumWeek.MONDAY;	break;
case 3: today = EnumWeek.TUESDAY; 	break;
case 4: today = EnumWeek.WEDNESDAY;	break;
case 5: today = EnumWeek.THURSDAY; 	break;
case 6: today = EnumWeek.FRIDAY;	break;
case 7: today = EnumWeek.SATURDAY; 	break;
}		
System.out.println(today.toString());
```
