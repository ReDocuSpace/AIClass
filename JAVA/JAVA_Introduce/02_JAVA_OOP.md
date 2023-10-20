# 클래스

## 목차

### 객체 지향 프로그래밍

#### 생성자
#### 생성자 선언과 호출
#### 기본 생성자
#### 생성자 선언
#### 필드 초기화
#### 생성자 오버로딩
#### 다른 생성자 호출
#### 가변길이 매개변수
#### Return문
#### 메소드 오버로딩
#### 인스턴스와 this
#### 정적멤버
#### 정적블록
#### Final
#### 상수선언
#### 패키지
#### 접근제한자와 getter Setter
#### 싱글톤 패턴

### 상속

#### SUPER
#### 메소드 재정의(오버라이드)
#### Final 클래스와 Final 메소드
#### Protected 접근 제한자
#### 타입변환
#### 다형성
#### 객체 타입 확인
#### 추상 메소드
#### 추상화 메소드 재정의
#### 봉인된 메소드

### 인터페이스

#### 인터페이스
#### 상수 필드
#### 추상 메소드
#### 디폴트 메소드
#### 정적 메소드
#### Private 메소드
#### 다중인터페이스 구현
#### 인터페이스 상속
#### 타입 변환
#### 다형성
#### 객체 타입 확인
#### 봉인된 인터페이스

### 중첩 언언과 익명 객체

#### 중첩 클래스
#### 인스턴스 멤버 클래스
#### 정적 멤버 클래스
#### 로컬 클래스
#### 바깥 멤버 접근
#### 중첩 인터페이스
#### 익명 객체

---
## 내용


### 객체 지향 프로그래밍

- 객체 : 물리적으로 존재하거나 개념적인 것 중에서 다른 것과 식별 가능한 것 – 속성, 동작

- 객체의 상호작용 – 매개변수

- 객체간의 관계
  - 집합 관계
  - 사용 관계
  - 상속 관계

- 객체 지향 프로그래밍의 특징
  - 캡슐화 : 메시지 지향
  - 상속 : 메소드를 물려주는 것
  - 다형성

- 클래스의 두 가지 용도
  - 라이브러리 클래스 : 실행할 수 없으며 다른 클래스에서 이용하는 클래스
  - 실행 클래스

- 클래스의 구성요소
  - 필드 : 객체의 데이터를 저장하는 역할
  - 생성자 : 객체의 초기화를 담당
  - 메소드 : 객체가 수행할 동작

- 인스턴스 : 클래스로부터 생성된 객체
예시) public class 클래스명 [공개클래스 : public]

- 객체 생성방법 
예시) 클래스 변수 = new 클래스()

```java
public class Student {
}

Student s1 = new Student();
```
#### 생성자

```java
public class Car {
	// 생성자
	// 필드
	String Model;
	boolean start;
	int speed;
	// 메소드
}

public class Car {
	// 생성자
	Car(){	
	}
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	// 메소드
}

Car myCar = new Car();
		
System.out.println("제작회사 : " + myCar.company);
System.out.println("모델명 : " + myCar.model);
System.out.println("색깔 : " + myCar.color);
System.out.println("최고속도 : " + myCar.maxSpeed);
System.out.println("현재속도 : " + myCar.speed);
/*
제작회사 : 현대자동차
모델명 : 그랜져
색깔 : 검정
최고속도 : 350
현재속도 : 0
*/
```

#### 생성자 선언과 호출
```java
클래스 변수 = new 클래스();
```

#### 기본 생성자
```java
public Car(){} // 자동추가
Car myCar = new Car();
```

#### 생성자 선언
```java
public Car(String model, String color, int speed){}
Car myCar = new Car(“그랜저”,“검정”,300);
```

#### 필드 초기화
```java
public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}

Korean k1 = new Korean("박자바", "011225-1234567");
	
System.out.println(k1.nation);
System.out.println(k1.name);
System.out.println(k1.ssn);
	
Korean k2 = new Korean("김자바", "930525-0654321");
	
System.out.println(k2.nation);
System.out.println(k2.name);
System.out.println(k2.ssn);
```

#### 생성자 오버로딩
```java
// 생성자 오버로딩
// 생성자 1
Car(){}
// 생성자 2
Car(String model){
	this.model = model;
}
// 생성자 3
Car(String model, String color){
	this.model = model;
	this.color = color;
}
// 생성자 4
Car(String model, String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
}

// 생성자 호출
Car car1 = new Car();
System.out.println("제작회사 : " + car1.company);
System.out.println("모델명 : " + car1.model);
System.out.println("색깔 : " + car1.color);
System.out.println("최고속도 : " + car1.maxSpeed);

Car car2 = new Car("자가용");
System.out.println("제작회사 : " + car2.company);
System.out.println("모델명 : " + car2.model);
System.out.println("색깔 : " + car2.color);
System.out.println("최고속도 : " + car2.maxSpeed);

Car car3 = new Car("자가용","빨강");
System.out.println("제작회사 : " + car3.company);
System.out.println("모델명 : " + car3.model);
System.out.println("색깔 : " + car3.color);
System.out.println("최고속도 : " + car3.maxSpeed);

Car car4 = new Car("택시","검정",200);
System.out.println("제작회사 : " + car4.company);
System.out.println("모델명 : " + car4.model);
System.out.println("색깔 : " + car4.color);
System.out.println("최고속도 : " + car4.maxSpeed);
```

#### 다른 생성자 호출
```java
public class Calculator {
	void powerOn() {
		System.out.println("전원을 켠다.");
	}
	void powerOff() {
		System.out.println("전원을 끈다.");
	}
	int plus(int x, int y) {
		return x + y;
	}
	double divide(int x, int y) {
		return (double)x / (double)y;
	}
}

Calculator myCalc = new Calculator();		
myCalc.powerOn();
		
int result1 = myCalc.plus(5, 6);
System.out.println("result1 : " + result1);
double result2 = myCalc.divide(5 ,6);
System.out.println("result2 : " + result2);
		
myCalc.powerOff();
```

#### 가변길이 매개변수
```java
public class Computer {
	int sum(int ... values) {
		int result = 0;
		
		for(int i = 0;i < values.length;i++){
			result += values[i];
		}
		return result;
	}
}

Computer myCom = new Computer();
		
// 방법 1
int result1 = myCom.sum(1,2,3);
System.out.println("result 1 : " + result1);
		
// 방법 2
int result2 = myCom.sum(1,2,3,4,5);
System.out.println("result 2 : " + result2);
		
// 방법 3
int[] values = {1,2,3,4,5};
int result3 = myCom.sum(values);
System.out.println("result 3 : " + result3);
		
// 방법 4
int result4 = myCom.sum(new int [] {1,2,3,4,5});
System.out.println("result 4 : " + result4);

```
#### Return문
```java
public class Car{
   int gas;
   void setGas(int gas) {
	this.gas = gas;
   }
   boolean isLeftGas() {
 	if (gas == 0) {
		System.out.println("gas가 없습니다");
		return false;
	}
	System.out.println("gas가 있습니다.");
	return true;
   }
   void run() {
	while(true) {
	if (gas > 0) {
	   System.out.println("달립니다. (gas 잔량 : " + gas + ")");
            gas -= 1;
	}else {
		return;
	}
   }
}

Car myCar = new Car();

myCar.setGas(5);
if(myCar.isLeftGas()) {
	System.out.println("출발합니다.");
	myCar.run();
}
System.out.println("가스를 주입해주세요");
```
#### 메소드 오버로딩
- 메소드 이름은 같되 , 매개변수의 타입, 개수, 순서가 다른 메소드를 여러개 선언하는 것을 말한다.
```java
public class Calculator {
 double areaRectangle(double width) {
		return width * width;
	}
 double areaRectangle(double width, double height) {
		return width * height;
	}
}

Calculator myCalcu = new Calculator();
double result1 = myCalcu.areaRectangle(10);
double result2 = myCalcu.areaRectangle(10,20);		
System.out.println("result1 : " + result1);
System.out.println("result2 : " + result2);
```
#### 인스턴스와 this
- 인스턴스
	- Instance Member : 객체에 소속된 변수 및 함수
	- Static Member : 클래스에 고정된 변수 및 함수

- this
	- 객체 내부에서 인스턴스 멤버에 접근하기 위해 this를 사용한다.
```java
public class Car_Sub {
   String model;
   int speed;
	
   Car_Sub(String model){
      this.model = model;
   }
   void setSpeed(int speed) {
      this.speed = speed;
   }	
   void run() {
      this.setSpeed(100);;
      System.out.println(this.model + ":" + this.speed);
   }
}

Car_Sub myCar = new Car_Sub("포르쉐");
Car_Sub yourCar = new Car_Sub("벤츠");
		
myCar.run();	// 포르쉐 : 100 (km)
yourCar.run();	// 벤츠 : 100 (km)
```

#### 정적멤버

- 클래스 로더를 이용하여 메소드 영역에 저장하고 사용한다. 이때 같이 저장되는 멤버를 의미한다.
- 고정된 값을 설정하는 경우가 많다.
```java
public class 클래스{
   static 타입 필드 [ = 초기값 ];
   static 리턴타입 메소드(매개변수, ...){}
}
```
```java
public class Calculator {
   static double pi = 3.14159;
   static int plus(int x, int y) { return x + y; }
   static int minus(int x, int y) { return x – y; }
}
double result1 = 10 * 10 * Calculator.pi;
int result2 = Calculator.plus(10,5);
int result3 = Calculator.minus(10, 5);
		
System.out.println("result1 : " + result1);
System.out.println("result2 : " + result2);
System.out.println("result3 : " + result3);

// Calculator를 New 로 할당하지 않아도 사용 가능
```
#### 정적블록

정적 필드는 다음과 같이 필드 선언과 동시에 초기값을 주는 것이 일반적이다.

```java
public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
```
- 정적 메소드 / 정적 블록은 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.\
- 정적 메소드 / 정적 블록에서 인스턴스 필드나 인스턴스 메소드를 사용하려면 객체를 생성하고 참조 변수로 접근해야 한다.

```java
public class Car {
   int speed;
	
   void run() {
	System.out.println(speed + "으로 달립니다");
}
	
   static void simulate() {
	Car myCar = new Car();
	myCar.speed = 200;
	myCar.run();
   }
	
   public static void main(String[] args) {
	simulate();
		
	Car myCar = new Car();
	myCar.speed = 60;
	myCar.run();
   }
}
```
#### Final
- 값을 변경하는 것을 막고 읽기만 허용하여야 할 때 사용
- final 타입 필드 = [초기값]
	- 필드 선언 시에 초기값 대입
	- 생성자에서 초기값 대입
```java
final String nation = "대한민국";
final String ssn;
	
String name;
	
public Korean(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

Korean k1 = new Korean("123456-1234567", "김자바");
		
System.out.println(k1.nation);
System.out.println(k1.ssn);
System.out.println(k1.name);
		
k1.name = "김자바";	// final이 아닌 경우 
// 값 변경 가능
```
#### 상수선언
```java
public class Earth {
	// 상수선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	// 상수선언
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

 Earth.EARTH_RADIUS
 Earth.EARTH_SURFACE_AREA
		
```
#### 패키지와 Import

- 패키지는 같은 클래스가 있을 경우 이를 구분하기 위해 사용한다.
- 패키지 디렉토리는 클래스를 컴파일 하는 과정에서 자동으로 생성된다.
- 컴파일러는 클래스의 패키지 선언을 보고 디렉토리를 자동 생성시킨다.
- 패키지 이름은 모두 소문자로 작성하는 것이 관례이며 주로 개발 회사의 도메인 이름의 역순으로 만든다.
```java
com.company
```
- Import문
	- 같은 패키지에 있는 클래스는 아무런 조건 없이 사용할 수 있지만, 다른 패키지에 있는 클래스를 사용하려면 Import 문을 이용해서 어떤 패키지의 클래스를 사용하는지 명시해야 한다.

#### 접근제한자와 getter Setter

##### 접근제한자

- public
	- 클래스, 필드, 생성자, 메소드

- protected
	- 필드, 생성자, 메소드
	- 같은 패키지, 자식 객체

- default
	- 클래스, 필드, 생성자, 메소드
	- 같은 패키지
- private
	- 필드, 생성자, 메소드
	- 객체 내부


##### 생성자 접근제한자

- public
	- 클래스
	- 모든 패키지에서 생성자를 호출할 수 있다. = 모든 패키지에서 객체를 생성할 수 있다.
- default
	- 클래스
	- 같은 패키지에서만 생성자를 호출할 수 있다. = 같은 패키지에서만 객체를 생성할 수 있다.
- private
	- 클래스
	- 클래스 내부에서만 생성자를 호출할 수 있다. = 클래스 내부에서만 객체를 생성할 수 있다.


##### 필드와 메소드의 접근 제한

- public
	- 필드
	- 메소드
	- 모든 패키지에서 필드를 읽고 변경할 수 있다.
	- 모든 패키지에서 메소드를 호출할 수 있다.
- default
	- 필드
	- 메소드
	- 같은 패키지에서만 필드를 일고 변경할 수 있다.
	- 같은 패키지에서만 메소드를 호출할 수 있다.
- private
	- 필드
	- 메소드
	- 클래스 내부에서만 필드를 읽고 변경할 수 있다.
	- 클래스 내부에서만 메소드를 호출할 수 있다.

##### Getter Setter
```java
public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {	return speed; }
	public void setSpeed(int speed) {
		this.speed = speed; }
	public boolean isStop() {	return stop; }
	public void setStop(boolean stop) {
		this.stop = stop; }
}
```
#### 싱글톤 패턴

오직 하나의 인스턴스만을 사용한다.
```java
public class Singleton {
  private static Singleton singleton = new Singleton();
  private Singleton() {}	
  public static Singleton getInstance() {
	return singleton;
  }
}
```

### 상속
- 부모가 자식에게 물려주는 행위
- [클래스명] extends [부모 클래스]

##### 부모
```java
public class Phone {
   public String model;
   public String color;
   //메소드 선언
   public void bell() {
   	System.out.println("벨이 울립니다.");
   }
   public void sendVoice(String message) {
 	System.out.println("자기: " + message);
   }
	
   public void receiveVoice(String message) {
  	System.out.println("상대방: " + message);
   }
   public void hangUp() {
	System.out.println("전화를 끊습니다.");
   }
}
```

##### 자식
```java
public class SmartPhone extends Phone{
   public boolean wifi;
   //생성자 선언
   public SmartPhone(String model, String color) {
  	this.model = model;
	this.color = color;
   }
   //메소드 선언
   public void setWifi(boolean wifi) {
        this.wifi = wifi;
    System.out.println("와이파이 상태를 변경했습니다.");
   }
   public void internet() {
	System.out.println("인터넷에 연결합니다.");
   }
}
```

```java
//SmartPhone 객체 생성
SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
//Phone으로부터 상속받은 필드 읽기
System.out.println("모델: " + myPhone.model);
System.out.println("색상: " + myPhone.color);
//SmartPhone의 필드 읽기
System.out.println("와이파이 상태: " + myPhone.wifi);
//Phone으로부터 상속받은 메소드 호출
myPhone.bell();
			myPhone.sendVoice("여보세요.");
			myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
myPhone.sendVoice("아~ 네, 반갑습니다.");
myPhone.hangUp();
			
//SmartPhone의 메소드 호출
myPhone.setWifi(true);
myPhone.internet();
```

#### SUPER

##### 생성자에 매개변수가 없을 때
```java
public Phone() {
	System.out.println("Phone() 생성자 실행");
}
public SmartPhone(String model, String color) {
	super();
	this.model = model;
	this.color = color;
	System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
}
```
##### 생성자에 매개변수가 있을 때
```java
public Phone(String model, String color) {
	this.model = model;
	this.color = color;
	System.out.println("Phone() 생성자 실행");
}

public SmartPhone(String model, String color) {
	super(model, color);
	System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
}
```

#### 메소드 재정의(오버라이드)

##### 부모
```java
public class Calculator {
	
   public double areaCircle(double r) {
	System.out.println("Calculator 객체의 areaCircle() 실행");
	return 3.14159 * r * r;
   }
}
```
##### 자식
```java
public class Computer extends Calculator{
   @Override
   public double areaCircle(double r) {
 	System.out.println("Computer 객체의 areaCircle() 실행");
	return Math.PI * r * r;
   }
}
```
##### 예제
```java
int r = 10;
		
Calculator calculator = new Calculator();
System.out.println(calculator.areaCircle(r));
// Calculator 객체의 areaCircle() 실행
		
Computer computer = new Computer();
System.out.println(computer.areaCircle(r));
// Computer 객체의 areaCircle() 실행
```
#### Final 클래스와 Final 메소드
- final 클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없음
```java
public final class Member {}

public class VeryImportantPerson extends Member {}
```

- 메소드를 선언할 때 final 키워드를 붙이면 오버라이딩할 수 없음
```java
public final void stop() {
	System.out.println("멈춤");
	speed = 0; 
}
@Override	// Error
public final void stop() {
	System.out.println("멈춤");
	speed = 0;
}
```

#### Protected 접근 제한자
- 상속받은 자식 클래스만 접근이 가능하다.
- 같은 패키지에서만 접근이 가능하다.

```java
// protected : 같은 패키지에서만 접근 가능
// 필드 선언
protected String field;
// 생성자 선언
protected A() {}
// 메소드 선언
protected void method() {}

// 같은 패키지 사용가능
// 다른 패키지 사용 불가능
public void Method() {
	A a = new A();
	a.field = "";
	a.method();
}

public class D extends A{
	public D() {
		super();
	}	
	public void method1() {
		// A 필드 값 변경
		this.field ="Hello World";
		// 메소드 선언 가능
		this.method(); 
	}
}
```
#### 타입변환
- 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일한 기능을 가짐

```java
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

B b = new B();
C c = new C();
D d = new D();
E e = new E();
// 다음과 같이 타입이 변환된다.
A a1 = b;	// A를 상속받았으므로 가능하다.
A a2 = c;	// A를 상속받았으므로 가능하다.
A a3 = d;	// A를 상속받았으므로 가능하다.
A a4 = e;	// A를 상속받았으므로 가능하다.
B b1 = d;	// B를 상속받았으므로 가능하다.
C c1 = e;	// C를 상속받았으므로 가능하다.

public class Parent {
	
	// 필드 선언
	public String field1;
	
	// 메소드 선언
	public void method1() {}
	public void method2() {}
}

public class Child extends Parent{
	// 필드 선언
	public String field2;	
	// 메소드 선언
	public void method3() {}
}
```
##### 부모 타입 변환
```java
Child child = new Child();
		
Parent parent = child;
parent.method1();
parent.method2();
		
// 부모이므로 자식의 메소드에는 접근이 불가능하다.
//parent.method3();
child.method3();
```
##### 자식 타입 변환
```java
Parent parent = new Child();	
parent.field1 = "data1";
parent.method1();
parent.method2();	
// Child에 있는 필드 및 메소드는 접근이 불가능하다.
//parent.field2 = "";
//parent.method3();	
// Child로 객체를 변환해주면 접근이 가능하다.
Child child = (Child)parent;
child.field2 = "";
child.method3();
```

#### 다형성
- 사용 방법은 동일하지만 실형 결과가 다양하게 나오는 성질
- 다형성을 구현하기 위해서는 자동 타입 변환과 매소드 재정의가 필요
```java
public class Car {
	public Tire tire;
	void run() {
		tire.roll();
	}
}

public class Tire {
	public void roll() {}
}
public class HankookTire extends Tire{
	@Override
	public void roll() {// 한국 타이어}
}
public class KumhoTire extends Tire{
	@Override
	public void roll() {// 금호 타이어	}
}

//Car 객체 생성
Car myCar = new Car();

myCar.tire = new Tire();
myCar.run();
		
// 한국 타이어
myCar.tire = new HankookTire();
myCar.run();
		
// 금호 타이어
myCar.tire = new KumhoTire();
myCar.run();
```
##### 매개변수로 사용되는 예시
```java
public class Vehicle {
	public void run() {}
}
public class Taxi extends Vehicle {
	@Override
	public void run() {}
}
public class Bus extends Vehicle{
	@Override
	public void run() {}
}
public class Driver {
// 메소드 선언(클래스 타입의 매개변수를 가지고 있다)
	public void drive(Vehicle vehicle) {}
}

Driver driver = new Driver();		
driver.drive(new Vehicle());
driver.drive(new Bus());
driver.drive(new Taxi());
```

#### 객체 타입 확인
- instanceof : 매개변수가 아니더라도 변수가 차조하는 객체의 타입을 확인할 때 사용
```java
if(person instanceof Student) {
			
	// Student 객체일 경우 강제 타입 변환
	Student student = (Student) person;
}
```
#### 추상 메소드
```java
public abstract class Phone {
   String owner;
	
   Phone(String owner){
	this.owner = owner;
   }	
   void turnOn() {
	System.out.println("폰 전원을 켭니다");
   }
   void turnOff() {
	System.out.println("폰 전원을 끕니다");	
   }
}

public class SmartPhone extends Phone{

   SmartPhone(String owner) {
	super(owner);
   }

   void internetSearch() {
	System.out.println("인터넷 검색을 합니다.");
   }
}

SmartPhone smartPhone = new SmartPhone("홍길동");
		
smartPhone.turnOn();
smartPhone.internetSearch();
smartPhone.turnOff();
```
#### 추상화 메소드 재정의
```java
public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
}

public class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");	
	}
}
public class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound(); // 멍멍
		
		Cat cat = new Cat();
		cat.sound(); // 야옹
		
		animalSound(new Dog()); // 멍멍
		animalSound(new Cat());  // 야옹
}
	
public static void animalSound(Animal animal) {
		animal.sound();
}
```

#### 봉인된 메소드

- 무분별한 상속을 제어하기 위하여 sealed [클래스] permit을 사용한다.

```java
public sealed class Person permits Employee, Manager{
   public String name;
   public void work() {
   System.out.println("하는 일이 결정되지 않았습니다.");
   }
}

// final : 봉인
public final class Employee extends Person {
   @Override
   public void work() {
	System.out.println("제품을 생산합니다.");
   }
}
// non-sealed : 봉인 해제

public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
public class Director extends Manager{
   @Override
   public void work() {
	System.out.println("제품을 기획합니다.");
   }
}
```

### 인터페이스

- 인터페이스 역할
- 두 객체를 연결하는 역할 
- 다형성 구현에 주된 기술

- 인터페이스와 구현 클래스 선언
	- 인터페이스 선언은 class 키워드 대신 interface 키워드를 사용
	- 접근 제한자로는 클래스와 마찬가지로 같은 패키지 내에서만 사용 가능한 default, 패키지와 상관없이 사용하는 public을 사용할 수 있다.

#### 인터페이스

```java
package ch08.sec01;

public interface RemoteControl {
	public void turnOn();
}
public class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켰어");
	}
}

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("오디오를 켰어");
	}
}
RemoteControl rc;
		
// Television 
rc = new Television();
rc.turnOn();

// rc 변수에 Audio 타입 
rc = new Audio();
rc.turnOn();
```

#### 상수 필드

- 인터페이스는 public static final 특성을 갖는 불변의 상수 필드를 멤버로 갖리 수 있음
- 인터페이스에 선언된 필드는 모두 public stgatic final 특성을 갖기 때문에 public static final을 생략해도 자동으로 컴파일 과정에서 붙음
- 서로 다른 언어로 구성되어 있을 경우에는 언더바(_)로 연결하는 것이 관례
  
```java
//public static final 생략되어 있음
int MAX_VOLUME = 10;
int MIN_VOLUME = 0;

RemoteControl.MAX_VOLUME;
RemoteControl.MIN_VOLUME;
```

#### 추상 메소드

- 리턴 타입, 메소드명, 매개변수만 기술되고 중괄호를 붙이지 않는 메소드
- abstract를 생략하더라도 컴파일 과정에서 자동으로 붙음
- 추상 메소드는 객체 A가 인터페이스를 통해 어떻게 메소드를 호출 할 수 있는지 방법을 알려주는 역할

```java
public interface RemoteControl {
	// 상수영역
	// public static final 생략되어 있음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

private int volume;
	
@Override
public void turnOn() {
	System.out.println("TV를 켰어");
}
@Override
public void turnOff() {
	System.out.println("TV를 껏어");
}
@Override
public void setVolume(int volume) {
   if (volume > RemoteControl.MAX_VOLUME) {
	this.volume = RemoteControl.MAX_VOLUME;
   }else if(volume < RemoteControl.MIN_VOLUME) {
	this.volume = RemoteControl.MIN_VOLUME;
   }else {
	this.volume = volume;
   }
	System.out.println("볼륨 : " + volume);
}
```

#### 디폴트 메소드

- 구현 객체가 필요한 메소드이다.
- 실행부 (원본) 이 있는 메소드를 의미한다.

```java
default void setMute(boolean mute) {
	if(mute) {
		setVolume(MIN_VOLUME);
	}else {
		System.out.println("무음 해제");
	}
}
```
#### 정적 메소드

- 상수 필드를 제외한 추상 메소드, 디폴트 메소드 등을 호출 할 수 없다. 
- 구현 객체가 필요 없는 메소드를 말한다.

```java
static void ChangeBattery() {
   System.out.println("리모콘 건전지를 교환합니다.");
};
```
#### Private 메소드

- private 메소드 : 구현 객체가 필요한 메소드이다.
- 디폴트 메소드 안에서만 호출이 가능하다.
  
```java
// default 메소드
default void defaultMethod1() {
	defaultCommon();
}	
default void defaultMethod2() {
	defaultCommon();
}
	
// private 메소드
private void defaultCommon() {
}

// 정적 메소드
static void staticMeteod1() {
	staticCommon();
}
static void staticMethod2() {
	staticCommon();
}
	
//private 정적 메소드
private static void staticCommon() {
}
```

#### 다중인터페이스 구현

- 구현 객체는 여러 개의 인터페이스를 통해 구현 객체를 사용할 수 있다.
- 구현 클래스는 모든 인터페이스를 상속받아 재정의를 해주어야 한다.

```java
public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		// Searchable 의 search 재정의
	}

	@Override
	public void turnOn() {
		// RemoteControl turnOn 재정의
	}

	@Override
	public void turnOff() {
		// RemoteControll turnOff 재정의
	}
}
```
#### 인터페이스 상속

```java
public interface InterfaceB {
	// 추상 메소드
	void MethodB();
}
public interface InterfaceA {
	// 추상 메소드
	void methodA();
}
public interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}

public class InterfaceCImpl implements InterfaceC {
	@Override
	public void methodA() {
		// MethodA
	}
	@Override
	public void MethodB() {
		// MethodB
	}
	@Override
	public void methodC() {
		// MethodC
	}
}
```

#### 타입 변환

```java
B b = new B();		// implement A
C c = new C();		// implement A
D d = new D();		// extends B
E e = new E();		// extends C
		
// 인터페이스 변수 선언
A a;

a = b;	//  A ← B (자동 타입 변환)
a = c;	//  A ← C (자동 타입 변환)
a = d;	//  A ← D (자동 타입 변환)
a = e;	//  A ← E (자동 타입 변환)

Vehicle vehicle = new Bus();
vehicle.run();		// 인터페이스 메소드
		
Bus bus = (Bus) vehicle;	// 강제 형 변환
bus.run();	// 인터페이스 메소드
bus.checkFare();	// 버스 클래스 메소드
```

#### 다형성

```java
public interface Tire {
	void roll();
}
public class KumhoTire implements Tire{
	@Override
	public void roll() {}
}
public class HankookTire implements Tire{
	@Override
	public void roll() {}
}

public class Car {
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}

// 아래와 같이 변환 가능
Car myCar = new Car();
		
myCar.run();
		
myCar.tire1 = new KumhoTire();
myCar.tire2 = new KumhoTire();

myCar.run();

//
public interface Vehicle {
	void run();
}

public class Taxi implements Vehicle{

	@Override
	public void run() {
	}
}


public class Bus implements Vehicle{

	@Override
	public void run() {
	}
}

public class Driver {
	void drive(Vehicle vehicle){
		vehicle.run();
	}
}

Driver driver = new Driver();
		
Bus bus = new Bus();
Taxi taxi = new Taxi();
		
driver.drive(bus);
driver.drive(taxi);
```

#### 객체 타입 확인

```java
public interface Vehicle {
	void run();
}

public class Taxi implements Vehicle{

	@Override
	public void run() {
	}

}
public class Bus implements Vehicle{

	public void CheckFare() {
	}

	@Override
	public void run() {
	}
}

public static void main(String[] args) {
	Taxi taxi = new Taxi();
	Bus bus = new Bus();
		
	ride(taxi);
	ride(bus);
}

public static void ride(Vehicle vehicle) {
	if(vehicle instanceof Bus bus) {
		bus.CheckFare();
	}		
	vehicle.run();
}
```

#### 봉인된 인터페이스

```java
public sealed interface InterfaceA permits InterfaceB{
	void methodA();
}
public non-sealed interface InterfaceB extends InterfaceA {
	void methodB();
}

public interface InterfaceC extends InterfaceB{
	void methodC();
}

public class ImplClass implements InterfaceC{
	@Override
	public void methodB() {}
	@Override
	public void methodA() {}
	@Override
	public void methodC() {}
}

ImplClass impl = new ImplClass();
		
InterfaceA ia = impl;
ia.methodA();
		
InterfaceB ib = impl;
ib.methodA();
ib.methodB();
		
InterfaceC ic = impl;
ic.methodA();
ic.methodB();
ic.methodC();
```

### 중첩 언언과 익명 객체

#### 중첩 클래스

- 클래스 내부에 선언한 클래스, 클래스의 멤버를 쉽게 사용할 수 있고, 외부에는 중첩 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있음
	- 멤버 클래스 : 클래스의 멤버로 선언되는 중첩 클래스
	- 로컬 클래스 : 메소드 내부에도 선언되는 중첩 클래스

```java
public class A {
	// Instance member class
	class B{}
	// 인스턴스 필드 값으로 B 객체 대입
	B field = new B();
	// A 클래스 생성자
	A(){
		B b = new B();
	}
	// A 클래스 메소드
	void method() {
		B bMethod = new B();
	}
}
```

#### 인스턴스 멤버 클래스

- A클래스의 멤버로 선언된 B 클래스
- 인스턴스 멤버 클래스 B는 주로 A클래스 내부에서 사용되므로 private 접근 제한을 갖는 것이 일반적
  
```java
public class A {
   // Instance member class
   class B{
	// 인스턴스 필드 값으로 B 객체 대입
	int field1 = 1;
	
	// 정적 필드
	static int field2 = 2;
	
	// B 클래스 생성자
	B(){
            System.out.println("B – 생성자 실행");
	}
	// A클래스 메소드
	void method1() {
	   System.out.println("B - 메소드1 실행");
	}
	// A 클래스 메소드
	static void method2() {
	   System.out.println("B - 메소드2 실행");
	}
   }

   // 인스턴스 메소드
   void useB() {
	// B 객체 생성 및 인스턴스 필드와 메소드 사용
	B b = new B();
	System.out.println(b.field1);
	b.method1();
		
	// B 클래스의 정적 필드와 메소드 사용
	System.out.println(B.field2);
	B.method2();
   }
}

//B 객체 생성 및 인스턴스 필드 및 메소드 사용
A.B b = new A.B();
System.out.println(b.field1);
b.method1();

//B 클래스의 정적 필드 및 메소드 사용
System.out.println(A.B.field2);
A.B.method2();
```

#### 정적 멤버 클래스

```java
public class A {
   //메소드
   void useB() {
  	//로컬 클래스
	class B {
	   //인스턴스 필드
	   int field1 = 1;
	   //정적 필드(Java 17부터 허용)
	   static int field2 = 2;
	   //생성자
	   B() {
		System.out.println("B-생성자 실행");
	   }

	   //인스턴스 메소드
	   void method1() {
		System.out.println("B-method1 실행");
	   }

	   //정적 메소드(Java 17부터 허용)
	   static void method2() {
		System.out.println("B-method2 실행");
	   }
	}
		
	//로컬 객체 생성
	B b = new B();
		
	//로컬 객체의 인스턴스 필드와 메소드 사용
	System.out.println(b.field1);
	b.method1();
	
	//로컬 클래스의 정적 필드와 메소드 사용
	System.out.println(B.field2);
		B.method2();
   }
}
```

#### 로컬 클래스

- 생성자 또는 메소드 내부에서 선언된 클래스를 로컬 클래스라고 한다.
  
```java
public class A {
	//생성자
	A() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}

	//메소드
	void method() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}
}

//로컬 객체 생성
B b = new B();
		
//로컬 객체의 인스턴스 필드와 메소드 사용
System.out.println(b.field1);
b.method1();
		
//로컬 클래스의 정적 필드와 메소드 사용
System.out.println(B.field2);
B.method2();

//로컬 변수 
int var = 1; 					//final int var = 1;
		
//로컬 클래스
class B {
	//메소드
	void method2() {
	//로컬 변수 읽기
	System.out.println("arg: " + arg);	//(o)
	System.out.println("var: " + var);	//(o)
				
	//로컬 변수 수정
	//arg = 2;	      //(x)
	//var = 2;	      //(x)
	}
}
		
//로컬 객체 생성
B b = new B();
//로컬 객체 메소드 호출
b.method2();
		
//로컬 변수 수정
//arg = 3;      //(x)
//var = 3;      //(x)
```

#### 바깥 멤버 접근

- 중첩 클래스는 바깥 클래스와 긴밀한 관계를 맺으면서 바깥 클래스의 멤버에 접근할 수 있다.

	- 인스턴스 멤버 클래스 : 바깥 클래스의 모든 필드와 메소드
	- 정적 멤버 클래스 : 바깥 클래스의 정적 필드와 정적 메소드

```java
//A의 인스턴스 필드와 메소드
int field1;
void method1() { }

//A의 정적 필드와 메소드
static int field2;
static void method2() { }

//인스턴스 멤버 클래스
class B {
	void method() {
		//A의 인스턴스 필드와 메소드 사용
		field1 = 10;		//(o)
		method1();		//(o)		
		//A의 정적 필드와 메소드 사용
		field2 = 10;		//(o)
		method2();		//(o)
		}
	}

	//정적 멤버 클래스
	static class C {
		void method() {
		//A의 인스턴스 필드와 메소드 사용
		//field1 = 10;		//(x)
		//method1();		//(x)
		//A의 정적 필드와 메소드 사용
		field2 = 10;		//(o)
		method2();		//(o)
	}
}	
```

#### 중첩 인터페이스

```java
public static interface ClickListener {
	//추상 메소드
	void onClick();
}
//필드
private ClickListener clickListener;

//메소드
public void setClickListener(ClickListener clickListener) {
	this.clickListener = clickListener;


public void click() {
	this.clickListener.onClick();
}
```

#### 익명 객체

- 이름이 없는 객체
```java
Tire tire = new Tire() {
	@Override
	public void roll() {
		System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
	}
};

tire.roll();

private Tire tire2 = new Tire() {
	@Override
	public void roll() {
	System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
	}
};
```

- 익명 구현 객체
```java
//필드에 익명 구현 객체 대입
private RemoteControl rc = new RemoteControl() {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
};
		
//메소드(필드 이용)
public void use1() {
	rc.turnOn();
	rc.turnOff();
}
	
//메소드(로컬 변수 이용)
public void use2() {
	//로컬 변수에 익명 구현 객체 대입
   RemoteControl rc = new RemoteControl() {
   
   @Override
   public void turnOn() {
      System.out.println("에어컨을 켭니다.");
   }
   @Override
   public void turnOff() {
      System.out.println("에어컨을 끕니다.");
   };
   rc.turnOn();
   rc.turnOff();
}
	
//메소드(매개변수 이용)
public void use3(RemoteControl rc) {
	rc.turnOn();
	rc.turnOff();
}

//Home 객체 생성
Home home = new Home();

//익명 구현 객체가 대입된 필드 사용
home.use1();
		
//익명 구현 객체가 대입된 로컬 변수 사용
home.use2();

//익명 구현 객체가 대입된 매개변수 사용
home.use3(new RemoteControl() {

@Override
public void turnOn() {
	System.out.println("난방을 켭니다.");
}
@Override
public void turnOff() {
	System.out.println("난방을 끕니다.");
}
```
- 명시적인 구현 클래스를 만들지 않고 직접적으로 구현했을 경우의 예시
```java
//Ok 버튼 객체 생성
Button btnOk = new Button();

//Ok 버튼 객체에 ClickListener 구현 객체 주입
btnOk.setClickListener(new Button.ClickListener() {
	@Override
	public void onClick() {
		System.out.println("Ok 버튼을 클릭했습니다.");
	}
});

//Ok 버튼 클릭하기
btnOk.click();

		//----------------------------------------------

//Cancel 버튼 객체 생성
Button btnCancel = new Button();

//Cancel 버튼 객체에 ClickListener 구현 객체 주입
btnCancel.setClickListener(new Button.ClickListener() {
	@Override
	public void onClick() {
		System.out.println("Cancel 버튼을 클릭했습니다.");
	}
});

//Cancel 버튼 클릭하기
btnCancel.click();
```
