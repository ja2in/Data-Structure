# 이진트리 (Binary Tree)
<br></br>
## :point_up: 정의
각 노드가 최대 2개의 자식을 갖는 트리
<br></br>
<img src = "https://github.com/ja2in/Data_Structure/assets/101400945/0cd0fdaa-af31-4484-9e62-17fcfb6db4de" width="80%" height="80%">
<br></br>

- 루트: 트리의 가장 윗부분에 위치하는 노드
- 리프: 트리의 가장 아랫부분에 위치하는 노드
- 안쪽 노드: 리프를 제외한 나머지 노드(루트 포함)
- 자식: 어떤 노드에서 가지로 연결된 아래쪽 노드
- 부모: 어떤 노드에서 가지로 연결된 바로 위쪽 노드
- 형제: 부모가 같은 노드
- 레벨: 루트로부터 얼마나 떨어져 있는지를 나타낸 값
- 차수: 노드가 갖는 자식의 수
- 높이: 루트에서 가장 멀리 떨어진 리프까지의 거리
- 서브트리: 트리 안에서 다시 어떤 노드를 루트로 정하고 그 자손으로 이루어진 트리

<br></br>

## :v: Binary Tree(이진트리) 순회 방법
- preorder (전위 순회) : root Node - left Node - right Node
- Inorder (중위 순회) : left Node - root Node - right Node
- postorder (후위 순회) : left Node - right Node - root Node
<br></br>
<img src = "https://github.com/ja2in/Data_Structure/assets/101400945/d726da83-f3e0-4410-89cc-e47858fdac2b" width="80%" height="80%">
<br></br>

* preorder (전위 순회) : (1) - (6) - (3) - (5) - (2) - (7) - (8) - (4) - (9)
* Inorder (중위 순회) : (3) - (6) - (2) - (5) - (7) - (1) - (4) - (8) - (9)
* postorder (후위 순회) : (3) - (2) - (7) - (5) - (6) - (4) - (9) - (8) - (1)


<br></br>
## 👌 관련 자료
<a href="https://wodlszz.tistory.com/17" rel="nofollow"> jaein's tistory</a></p>

