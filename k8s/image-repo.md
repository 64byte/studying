# K8s Container Image Repository



- 쿠버네티스 개발 환경에서 이미지를 직접 빌드하고 사용 시, `imagePullPolicy: Never`로 둔다.
- Never가 아니라면 Pod 실행 시에 (아래에 설정된, 혹은 되어 있다면) Registry로부터 image를 가져오므로 Pod가 실행되지 않음
  - (이미지를 찾을 수 없어서.)
