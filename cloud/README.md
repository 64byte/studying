# Kubernetes Cluster 접속



### ~/.kube/config (yaml)

- 해당 cluster에 접속할 수 있다.

  `kubectl get version`



### --kubeconfig option

- 명령어 사용할 때 --kubeconfig=(config.yaml)로 cluster에 접속할 수 있다.

  `kubectl --kubeconfig=kube-config.yaml get po`



