# 스택 (Stack)
<br></br>
## :point_up: 정의
* 데이터를 일시적으로 쌓아 놓는 자료구조
* 데이터의 입력과 출력 순서는 후입선출 (LIFO: Last In First Out)  
<br></br>
<img src = "https://user-images.githubusercontent.com/101400945/221166028-ded2a522-865d-4e85-aaa6-6ab0472a426c.jpg" width="60%" height="60%">


<br></br>


## :v: Stack class
```java
Stack<Integer> s = new Stack<Integer>();
Stack<Integer> s = new Stack<Integer>(int capacity);                       // 스택의 capacity 결정
```


<br></br>
## :ok_hand: Method
```java
push(int item)	  //스택에 데이터를 저장
pop()	            //스택의 꼭대기에 있는 데이터를 제거하고, 그 값을 반환
isFull()	        //스택이 empty 상태인지 확인
isEmpty()       	//스택이 full 상태인지 확인
clear()	          //스택의 모든 요소를 삭제
peek()	          //스택의 가장 최상위(마지막)에 위치한 데이터 출력
capacity()	      //스택의 용량 확인 (스택 전체 크기)
size()	          //스택의 크기 확인 (push된 만큼의 크기)
indexOf(int item)	//item의 index 반환
```


<br></br>
## :metal: 관련 문제 && 관련 자료
<a href="https://www.acmicpc.net/problem/1920" rel="nofollow">BOJ [NO.1920]</a></p>
<a href="https://wodlszz.tistory.com/11" rel="nofollow"> jaein's tistory</a></p>
