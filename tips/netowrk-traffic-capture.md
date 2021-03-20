# 안드로이드 네트워크 디버깅



### HTTP Traffic Capture

---

0. Fidller 설치
1. Fiddler Tools > Options > Connections의 Proxy Port 확인
2. 스마트폰에서 네트워크 연결 
   1. WI-FI 고급 설정 > Host의 IP와 Port 설정



### HTTPS Traffic Capture

---

0. Fiddler Tools > Options > HTTPS탭에서 Capture HTTPS CONNECTs 활성화
1. http://ipv4.fiddler:8888으로 접속하여 Fiddler Root 인증서 설치



### Application HTTPS Traffic Capture

---

0. 위의 절차만 해도 브라우저 트래픽은 모니터링 할 수 있다.
   - 애플리케이션의 경우(App WebView, etc...)에서는 인증서의 문제 때문에 트래픽을 캡쳐할 수 없다.
1. 특정 App을 

