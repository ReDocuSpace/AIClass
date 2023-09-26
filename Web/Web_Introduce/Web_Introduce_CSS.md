## 목차



- [선택자](#선택자)   
  - [.1 기본 선택자](#기본-선택자)   
  - [.2 결합 선택자](#결합-선택자)   
  - [.3 속성 선택자](#속성-선택자)   
  - [.4 가상 클래스 선택자](#가상-클래스-선택자)   
  - [.5 가상 요소 선택자](#가상-요소-선택자)   

- [프로퍼티](#프로퍼티)   
  - [.1 박스 모델 프로퍼티](#박스-모델-프로퍼티)  
  - [.2 배경 관련 프로퍼티](#배경-관련-프로퍼티)
  - [.3 포지셔닝 프로퍼티](#포지셔닝-프로퍼티)   
    	- [position](#position)   
    	- [float](#float)   
    	- [clear](#clear)   
    	- [margin](#margin)   
    	- [padding](#padding)   
  - [.4 다이나믹 프로퍼티](#다이나믹-프로퍼티)   
  	- [transition](#transition)   
    	- [transfrom](#transfrom)
  - [※ 여러가지 border Style](#※-여러가지-border-Style)


## 선택자

### 기본 선택자

1. [*전체 선택자*] : 임의의 공간을 초기화 할때 사용한다

```html
* { color: red; }
```
  
2. [*태그 선택자*]

```html
div { color: skyblue; }
span { color: green;}
```

3. [*아이디 선택자*]

```html
#bluebox { color: blue; }
#orangebox { color: orange; }
```

4. [*클래스 선택자*]

```html
.font24 { font-size: 24px; }
.purple { background: purple; color: #fff;}
```

### 결합 선택자
 
```html

```

### 속성 선택자

```html

```

### 가상 클래스 선택자

### 가상 요소 선택자

#### 문장 가상요소 선택자
  
::after : 특정 선택자의 앞에 문자를 추가한다.   
::before : 특정 선택자의 문자 뒤에 문자를 추가한다.   

::first-letter : .선택한 요소의 가장 첫 번째 글자를 선택한다.   
::first-line : 선택한 요소의 첫 줄을 선택한다.   
::selection : 선택한 요소를 드래그 했을 때의 스타일을 변경한다.   

```html
<!-- 문장 가상 요소 선택자 1 -->
.after::after { content: '★'; }
.before::before { content: '♥'; }

<!-- 문장 가상 요소 선택자 2 -->
p::first-letter { color: #ff0000; font-size: xx-large;}
p::first-line { color: #0000ff; font-variant: small-caps; }
p::selection{ background-color:pink; color:purple;}
```

#### Form 가상 요소 선택자

:enabled : 대부분의 입력 양식에 사용되며 활성화 필드를 지정한다.
:disabled : 대부분의 입력 양식에 사용되며 비활성화 필드를 지정한다.
:focus : 포커스가 있는 요소를 선택한다. 키보드 이벤트, 사용자 입력을 허용하는 요소에서 사용할 수 있다.

```html
<!-- Form 가상 요소 선택자-->
input:enabled { background-color: yellow; }
input:disabled { background-color: #eeeeee; color: #999999; }
input:focus { background-color: skyblue; }
```

## 프로퍼티


### 박스 모델 프로퍼티

- basic
- display
- opacity

### 배경 관련 프로퍼티

- background-color
- background-image
- background-repeat
- background-size
- background-position
- background-attachment

```html
<!-- 그라데이션 -->
background: linear-gradient(to bottom,red 0%,black 100%);
```
- gradient
  - linear-gradient [선형]

```html
#box01{
    width: 300px;
		height: 300px;
		background: linear-gradient(45deg, yellow 0%, blue 100%);
	}
#box02{
    width: 600px;
		height: 300px;
		background: linear-gradient(to top right, yellow 0%, blue 100%);
	}
#box03{
    width: 100%;
		height: 300px;
		background: linear-gradient(to right, red, yellow, green, blue, purple);
	}
```

  - radial-gradient [원형]
 
```html
.radial .circle,
.radial .square {
  background: radial-gradient(white, gold, rgb(186, 117, 6));
}

.radial-position1 .circle,
.radial-position1 .square {
  background: radial-gradient(farthest-corner at 65% 35%, white, gold, rgb(186, 117, 6));
}

.radial-position2 .circle,
.radial-position2 .square {
  background: radial-gradient(farthest-side at 65% 35%, white, gold, rgb(186, 117, 6),
  rgb(127, 123, 151) 110%);
}
```



### 포지셔닝 프로퍼티

#### position

#### float

LEFT   

```html
div{ width: 200px; height: 200px; border: 5px dashed pink; }
.left{ float: left; }
```
![Image alt text](sample/4_float_left.svg)

RIGHT   

```html
div{ width: 200px; height: 200px; border: 5px dashed pink; }
.right{ float: right; }
```
![Image alt text](sample/4_float_right.svg)


#### clear

clear 프로퍼티가 적용된 요소의 왼쪽, 오른쪽, 또는 양쪽 float 프로퍼티를 가진 부모나 형제 관계에서의 상위 요소의 접근을 허용하지 않을 때 사용.

```html
div{ width: 200px; height: 200px; text-align: center; line-height: 200px; }
.box01{ border: 5px dashed rgba(255,0,0,0.5); float: left; }
.box02{ background-color: rgba(0,0,255,0.5); float: right; }
.box03{ background-color: rgba(0,255,0,0.5); float: left; }

/* clear속성을 가진 클래스를 생성해 div요소에 적용합니다 */
.clear{ border: 5px dashed rgba(0,255,0,0.5); clear: both; }
```
![Image alt text](sample/4_clear.svg)

#### margin

한 개의 값일 경우 : 사방에 모두 같은 값을 지정한다.   
```html
/* 부모요소 */
body > div { position: absolute; width: 200px; height: 200px; background-color: #9cc; }
/* 자식요소 */
div > div { width: 100px; height: 100px; background-color: #ff9; }
#box01{ margin: 50px; }
```
![Image alt text](sample/4_margin01.svg)

두 개의 값일 경우 : 첫번째는 상하, 두번째는 좌우의 값을 지정한다.   
```html
/* 부모요소 */
body > div { position: absolute; width: 200px; height: 200px; background-color: #9cc; }
/* 자식요소 */
div > div { width: 100px; height: 100px; background-color: #ff9; }
#box01{ margin: 20px 50px; }
```
![Image alt text](sample/4_margin02.svg)

세 개의 값일 경우 : 첫번째 자리는 상단의 값, 두번째 자리는 좌우의 값, 세번째 자리는 하단의 값을 지정한다.   
```html
/* 부모요소 */
body > div { position: absolute; width: 200px; height: 200px; background-color: #9cc; }
/* 자식요소 */
div > div { width: 100px; height: 100px; background-color: #ff9; }
#box01{ margin: 20px 50px 10px; }
```
![Image alt text](sample/4_margin03.svg)

네 개의 값일 경우 : 상우하좌의 순서로 값을 지정한다.
```html
/* 부모요소 */
body > div { position: absolute; width: 200px; height: 200px; background-color: #9cc; }
/* 자식요소 */
div > div { width: 100px; height: 100px; background-color: #ff9; }
#box01{ margin: 20px 30px 40px 50px; }
```
![Image alt text](sample/4_margin04.svg)

#### padding
  
한 개의 값일 경우 : 박스의 상우하좌 사방에 같은 값을 지정한다.
```html
body > div {width: 200px; height: 200px; background-color: #ccc; }
#box01{ padding: 50px; }
```
![Image alt text](sample/4_padding01.svg)

두 개의 값일 경우 : 첫번째 자리는 상하값, 두번째 자리는 좌우값을 지정한다.
```html
body > div {width: 200px; height: 200px; background-color: #ccc; }
#box01{ padding: 20px 50px; }
```
![Image alt text](sample/4_padding02.svg)

세 개의 값일 경우 : 첫번째 자리는 상단의 값, 두 번째 자리는 좌우의 값, 세번째 자리는 하단의 값을 지정한다.
```html
body > div {width: 200px; height: 200px; background-color: #ccc; }
#box01{ padding: 20px 50px 10px; }
```
![Image alt text](sample/4_padding03.svg)

네 개의 값일 경우 : 상우하좌의 순서로 값을 지정한다.
```html
body > div {width: 200px; height: 200px; background-color: #ccc; }
#box01{ padding: 20px 30px 40px 50px; }
```
![Image alt text](sample/4_padding04.svg)

### 다이나믹 프로퍼티

#### transition

transition-property : value : 변화시킬 프로퍼티를 지정한다.
transition-duration : 변화가 완료될 때 까지의 시간을 초 또는 밀리초로 지정한다.
transition-delay : 변화 시작의 지연 시간을 초 또는 밀리초로 지정한다.

```html
div {	
	height: 100px;
	font-size: 3em;
	text-align: center;
	margin-bottom: 20px;
	background-color: #b0a2ce;
	color: #fff;
}

#box01:hover {
		background-color: yellow;
		color: #333;
		transition-property: background-color, color;
		transition-duration: 2s, 2s;
}

/* 가상선택자에 transition속성을 지정할 때와 실제 요소에 transition속성을 지정할 때 변화 방식이 다릅니다. */
#box02 {
		transition-property: background-color;
		transition-duration: 2s;
		transition-delay: 1s;
}

#box02:hover {
		background-color: #7ebf41;
		color: #666;
}
```
![Image alt text](sample/4_transition.svg)

accordion

```html
/* 첫 로딩 시 hover시 랜더링 될 요소가 깜빡이는 현상 제거 */
.accordion>ul>li ul.subList { opacity: 0; }
.accordion>ul>li ul.subList a { height: 0; }
```
#### transfrom

- translate(x,y)   
```html
/* 모든 div 크기를 동일하게 지정합니다. */
div{ width: 200px; height: 200px; box-sizing:border-box;}

/* 기준이 될 검정선 박스의 크기를 지정합니다. */
.box{ border:3px solid #999; position: absolute; z-index: -999;}

/* #box01에 마우스를 올리면 지정한 값만큼 #box01을 이동시키기 */
#box01{ 
	background-color: rgba(255,255,0,0.5); 
	transform:translate(0px,0px); 
	transition:transform 1s ease;
}
#box01:hover{ transform: translate(50px,30px);}
```
![Image alt text](sample/4_transform01_1.svg)

- translate(x)  
```html
/* #box01-1에 마우스를 올리면 X축으로 지정한 값만큼 #box01-1을 이동시키기 */
#box01-1{ 
	background-color: rgba(255,255,0,0.5); 
	transform:translateX(0px); 
	transition:transform 1s ease;
}
#box01-1:hover{ transform: translateX(120px);}
```
![Image alt text](sample/4_transform01_2.svg)

- translate(y)   
```html
/* #box01-2에 마우스를 올리면 Y축으로 지정한 값만큼 #box01-2을 이동시키기 */
#box01-2{ 
	background-color: rgba(255,255,0,0.5); 
	transform:translateY(0px); 
	transition:transform 1s ease;
}
#box01-2:hover{ transform: translateY(80px);}
```
![Image alt text](sample/4_transform01_3.svg)

- skewX(x-Angle)
```html
#box02-1{ 
	background-color: rgba(0,0,255,0.5);
	transform: skewX(0deg); 
	transition: transform 0.5s ease-in;
}
#box02-1:hover{ transform: skewX(-15deg);}
```
![Image alt text](sample/4_transform02_1.svg)

- skewX(y-Angle)
```html
#box02-2{ 
	background-color: rgba(0,0,255,0.5);
	transform: skewX(0deg); 
	transition: transform 0.5s ease-in;
}
#box02-2:hover{ transform: skewY(25deg);}
```
![Image alt text](sample/4_transform02_2.svg)

- scale(x,y)
```html
/* scale(x,y) */
#box03{ 
	background-color: rgba(0,0,255,0.5);
	transform: scale(0.5,1); 
	transition: transform 0.5s ease-in;
}
#box03:hover{ transform: scale(1,0.5);}
```
![Image alt text](sample/4_transform03_1.svg)

- scale(x)
```html
#box03-1{ 
	background-color: rgba(0,0,255,0.5);
	transform: scaleX(0.2); 
	transition: transform 0.5s ease-in;
}
#box03-1:hover{ transform: scale(1);}
```
![Image alt text](sample/4_transform03_2.svg)

- scale(y)
```html
/* scale(y) */
#box03-2{ 
	background-color: rgba(0,0,255,0.5);
	transform: scaleY(1); 
	transition: transform 0.5s ease-in;
}
#box03-2:hover{ transform: scaleY(0.1);}
```
![Image alt text](sample/4_transform03_3.svg)


- rotate
```html
#box04{ 
	background-color: rgba(255,255,0,0.5); 
	transform:rotate(0deg); 
	transition:transform 1s ease;
}
#box04:hover{ transform:rotate(225deg);}
```
![Image alt text](sample/4_transform04.svg)


### ※ 여러가지 border Style

```html
/* ul의 type을 표시하지 않습니다. */
ul{ list-style: none;  }

li{ width: 50%; height: 50px; margin: 20px 0;
/* ↓ 모든 li요소에 border-color와 border-width값을 공통으로 지정합니다.*/
	border-color: #9999ff; border-width: 12px;
}
	
/* id 속성값이 각기 다른 요소에 각각 다른 스타일 지정합니다 */
#box1{ border-style: dotted; }
#box2{ border-style: dashed; }
#box3{ border-style: solid; }
#box4{ border-style: double; }
#box5{ border-style: groove; }
#box6{ border-style: ridge; }
#box7{ border-style: inset; }
#box8{ border-style: outset; }
#box9{ border-style: none; }
#box10{ border-style: hidden; }

/* div요소에 border-style값을 4가지로 지정합니다.*/
div{ width: 50%; height: 100px;
     border-color: #999999;
     border-style: dashed double solid dotted;
}
```
![Image alt text](sample/4_border_style.svg)

