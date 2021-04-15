# Kubernetes PV, PVC



쿠버네티스를 Helm을 사용하여 배포 시에, Helm uninstall하여도 PVC, PV는 삭제되지 않음.

당연한 이야기지만, 파드와 볼륨의 사이클은 다르기 때문. (파드가 사라진다고 데이터가 사라지는 상황이 발생해선 안된다.)

그렇기 때문에, 재설치 시에 PV, PVC를 배포한다고 하더라도 기존 PV, PVC ([참조](https://bcho.tistory.com/1306))에 묶여있다.

이 경우에 기존 볼륨에 설정 파일이 존재하므로, 새롭게 설정을 바꾸어 (ConfigMap, Secret, etc..) 재배포한다고 하더라도 바뀌지 않음 (PV, PVC를 새롭게 생성는 게 아니니까)
