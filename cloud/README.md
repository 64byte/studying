# Kubernetes Cluster 접속



### ~/.kube/config (yaml) 파일 수정

- 해당 cluster에 접속할 수 있다.

  `kubectl version`



### --kubeconfig option

- 명령어를 사용할 때 --kubeconfig={config-file-name}.yaml로 cluster에 접속할 수 있다.

  `kubectl --kubeconfig=kube-config.yaml get po`



