# 계층 프로토콜



## OSI 7 계층

<img src="https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile1.uf.tistory.com%2Fimage%2F9907D5415C68F552036E2D" alt="osi 7 layer 이미지 검색결과" style="zoom:75%;" />

국제표준화기구(ISO)에서 개발한 모델로, 컴퓨터 네트워크 프로토콜 디자인과 계층을 나누어 설명한 것



1. 물리 계층
2. 데이터 링크 계층
3. 네트워크 계층
4. 전송 계층
5. 세션 계층
6. 표현 계층
7. 응용 계층



## TCP/IP 4 계층

<img src="https://1cp3v31bcrm1lv5jv1crjrq1-wpengine.netdna-ssl.com/wp-content/uploads/2017/12/3_scheme.jpg" alt="tcp ip 4 layer 이미지 검색결과" style="zoom:75%;" />



#### 전송 계층 프로토콜

---

#### TCP (Transmission Control Protocol)

-  연결형 서비스로 메세지(세그먼트)를 보내기 위해 IP와 사용하는 프로토콜
- 가상 회선 방식으로 메세지를 전송한다.
  - 두 지점이 가상의 회선으로 연결되어 있고, 점대점 통신을 하는 것
- 흐름 제어와 혼잡 제어를 제공한다.
- 높은 신뢰성을 보장한다.
- 전송 속도가 느리다
- 응용 계층에서 HTTP 1/2, FTP 등이 TCP를 사용한다.



#### UDP (User Datagram Protocol)

- 비연결형 서비스로 메세지(데이터그램)을 보내기 위해 사용하는 프로토콜
- 낮은 신뢰성을 가진다.
- 최소한의 오류만 검출한다.
- 전송 속도가 빠르다

- HTTP/3, 스트리밍, P2P 게임 서버 등이 UDP를 사용한다.



#### 응용 계층 프로토콜

---

#### HTTP(S) (HyperText Transfer Protocol)

- HTML 문서와 같은 리소스를 가져올 수 있도록 해주는 프로토콜
- 클라이언트 - 서버 프로토콜 (Web browser - WAS)

