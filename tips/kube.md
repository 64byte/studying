# Kubernetes



#### 인증서 생성 시, clusster-issuer 문제

- https://github.com/jetstack/cert-manager/issues/405



#### Ingress에서 서브 도메인 인증서 관련 문제

- 서브 도메인을 포함해 인증서를 생성하고 싶은 경우에는 tls.hosts에 여러 개의 sub domain을 적어서 하도록 한다.

  ```...
   tls:
   - hosts:
     - suba.domain.com
     - subb.domain.com
     secretName: tls-secret
  ```

  

