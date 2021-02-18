# Github Action



sub directory 프로젝트를 빌드하거나 배포할 때 workding-directory를 지정해주어야 한다.



ex)

```
- name: Build with Gradle
  working-directory: './backend'
  run: ./gradlew build
```



그렇지 않고 상대 경로로 명령어를 실행할 때 제대로 동작하지 않는 경우가 있다.

ex)

```
- name: Build Docker image
  working-directory: './backend'
  run: docker build -f ./backend/Dockerfile -t kube-backend:latest ./backend
```



제대로 동작하는 듯 보이나, 도커 이미지를 빌드할 때 내부적으로 파일을 찾지 못하는 듯하다.
