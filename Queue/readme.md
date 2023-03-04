# 큐 (Queue)
<br></br>
## :point_up: 정의
* 데이터를 일시적으로 쌓아 놓는 자료구조
* 데이터의 입력과 출력 순서는 선입선출 (FIFO: FirstIn First Out)
<br></br>
<img src = "https://user-images.githubusercontent.com/101400945/222890229-4602832d-28fc-4ad5-bc60-eee0cb0bcaec.jpg" width="80%" height="80%">
<br></br>


## :v: Queue class
```java
Queue<Integer> q = new LinkedList<>();
```


<br></br>
## :ok_hand: Method
```java
offer(int item), add(int item)	  //큐에 데이터를 저장
poll(), remove() 	                //큐의 맨 앞에 있는 데이터를 제거하고, 그 값을 반환
isFull()	                       //큐가 full 상태인지 확인
isEmpty()       	                //큐가 empty 상태인지 확인
clear()	                         //큐의 모든 요소를 삭제
peek()	                       //큐의 맨 앞에 위치한 데이터 출력
size()	                         //큐의 크기 확인 (offer, add된 만큼의 크기)
```


<br></br>
## :metal: 관련 문제 && 관련 자료
<a href="https://www.acmicpc.net/problem/18258">BOJ [NO.1920]</a></p>
<a href="https://wodlszz.tistory.com/11" rel="nofollow"> jaein's tistory</a></p>
