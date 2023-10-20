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
```
#### Return문
```java
```
#### 메소드 오버로딩
```java
```
#### 인스턴스와 this
```java
```
#### 정적멤버
```java
```
#### 정적블록
```java
```
#### Final
```java
```
#### 상수선언
```java
```
#### 패키지
```java
```
#### 접근제한자와 getter Setter
```java
```
#### 싱글톤 패턴
```java
```

### 상속

#### SUPER
```java
```
#### 메소드 재정의(오버라이드)
```java
```
#### Final 클래스와 Final 메소드
```java
```
#### Protected 접근 제한자
```java
```
#### 타입변환
```java
```
#### 다형성
```java
```
#### 객체 타입 확인
```java
```
#### 추상 메소드
```java
```
#### 추상화 메소드 재정의
```java
```
#### 봉인된 메소드
```java
```

### 인터페이스

#### 인터페이스
```java
```
#### 상수 필드
```java
```
#### 추상 메소드
```java
```
#### 디폴트 메소드
```java
```
#### 정적 메소드
```java
```
#### Private 메소드
```java
```
#### 다중인터페이스 구현
```java
```
#### 인터페이스 상속
```java
```
#### 타입 변환
```java
```
#### 다형성
```java
```
#### 객체 타입 확인
```java
```
#### 봉인된 인터페이스
```java
```

### 중첩 언언과 익명 객체

#### 중첩 클래스
```java
```
#### 인스턴스 멤버 클래스
```java
```
#### 정적 멤버 클래스
```java
```
#### 로컬 클래스
```java
```
#### 바깥 멤버 접근
```java
```
#### 중첩 인터페이스
```java
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
