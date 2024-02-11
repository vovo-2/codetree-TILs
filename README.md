### 240107
Math.pow(): return double  
Math.floor(): return double

### 240108
stream에서 Collectors 쓰려면  

```java
import java.util.stream.*;
import java.util.*;
import java.io.*;
```
이렇게 3개 모두 해야 합니다.  

문자열 내에서 정렬을 하고 싶을 경우에는 문자열을 char[]로 바꿔서 정렬 진행해야 한다.  

### 240109
```java
String str = "abcdefg";
// str.함수();

equals();
indexOf();
substring();
toUpperCase();
toLowerCase();
startWith();
endWith();
replaceAll(); //정규식 가능
replace();
split();
trim();
compareTo();
contains();
chatAt();
```
--
Comparator: compare(Point p1, Point p2)
Comparable: compareTo(Point other)

### 240110
자료형별 compare
```java
String: compareTo(b);
Integer: Integer.compare(a,b);

```

### 240115
숫자(10진법) ⇒ 2진법
숫자를 계속 2로 나눠주며 나머지를 쭉 적어주는 식으로 이진법을 만들 수 있다.
```java
  while(true){
  	if(n<2){
  		answer[i++] = n;
  		break;
  	}
  	answer[i++] = n%2;
  	n=n/2;
  }
```

2진법 => 10진법
숫자를 계속 2로 나눈 나머지로 만든 2진법을 10진법으로 바꾸려면 반대로 *2를 해주면 된다.
```java
num = num*2 + binary[i];
```


### 240211
최장 연속되는 같은 숫자 개수 확인할 때
초기값 cnt=1!!!!!!!!!!연속되는 숫자의 가장 작은 값은 0이 아니라 1이다.
{1, 2, 3, 4}라는 배열이 있을 때, 연속되는게 없는게 아니라 연속 길이는 1이다.
