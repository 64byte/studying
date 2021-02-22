# 알고리즘 (Algorithm)



### 정렬 알고리즘



#### 버블 정렬 (Bubble Sort)

---

서로 인접한 두 원소를 비교하여 정렬하는 알고리즘



```
void bubble(vector<int>& arr) {
	size_t arrSize = arr.size();

	for (int i = 0; i < arrSize; ++i) {

		for (int j = i + 1; j < arrSize; ++j) {
			if (arr[i] > arr[j]) {
				swap(arr[i], arr[j]);
			}
		}

	}

}

TEST(areTheySameAfterSorting, BubbleSort) {
	vector<int> arr{ 3, 4, 2, 1, 5};
	vector<int> arr2{ 1, 2, 3, 4, 5 };

	bubble(arr);

	// arr == arr2
	EXPECT_EQ(arr, arr2);
}
```



1~N까지 인접한 원소를 비교하면서 위치를 바꾸므로 N*(N-1)/2이므로 시간 복잡도는 O(N^2)



#### 선택 정렬 (Selection Sort)

---

하나의 원소를 선택해 다른 원소들과 비교하여 그 원소가 제일 작다(크다)면 위치를 바꾸어 정렬하는 알고리즘



```
void selection(vector<int>& arr) {
	size_t arrSize = arr.size();

	int idx = 0;
	for (int i = 0; i < arrSize; ++i) {
		idx = i;

		for (int j = i + 1; j < arrSize; ++j) {
			if (arr[idx] > arr[j]) {
				idx = j;
			}
		}

		swap(arr[i], arr[idx]);
	}
}

TEST(areTheySameAfterSorting, selectionSort) {
	vector<int> arr{ 3, 4, 2, 1, 5 };
	vector<int> arr2{ 1, 2, 3, 4, 5 };

	selection(arr);

	// arr == arr2
	EXPECT_EQ(arr, arr2);
}
```



1~N까지 N번 비교하여 선택해야 하므로 반복 횟수는 N*(N-1)/2이다.

그러므로 시간 복잡도는 O(N^2)



#### 삽입 정렬 (Insertion Sort)

---

하나의 원소를 선택해 해당 원소 보다 작은(큰) 원소는 오른쪽으로 밀어가면서 정렬하는 알고리즘

카드 게임을 할 때, 손에 쥐고 있는 카드를 정렬한다고 생각하면 이해가 빠르다.



```
void insertion(vector<int>& arr) {
	size_t arrSize = arr.size();

	int curr = 0;
	for (int i = 1; i < arrSize; ++i) {
		curr = arr[i];

		for (int j = i - 1; j >= 0 && curr < arr[j]; --j) {
			arr[j + 1] = arr[j];
			arr[j] = curr;
		}
	}

}


TEST(areTheySameAfterSorting, insertionSort) {
	vector<int> arr{ 3, 4, 2, 1, 5 };
	vector<int> arr2{ 1, 2, 3, 4, 5 };

	insertion(arr);

	// arr == arr2
	EXPECT_EQ(arr, arr2);
}
```



해당 정렬 알고리즘은 위에 서술된 알고리즘과 다른 부분이 있는데, 시간 복잡도는 O(N^2)이지만, 다른 알고리즘보다 빠른 편이다.



해당 코드를 봤을 때, 모든 요소가 정렬되어 있다면, 다른 요소와 비교할 필요없이 2번째 루프는 동작하지 않으므로 O(N)이다.



#### 병합 정렬

---

분할 정복 알고리즘의 하나로, 정렬할 요소를 나눈 다음에, 그것을 하나씩 합쳐 가면서 정렬하는 알고리즘이다.



```
void merge(vector<int>& arr, int low, int high) {

	int mid = (high - low) / 2 + low;
	if (low >= high) {
		return;
	}
	else {
		merge(arr, low, mid);
		merge(arr, mid + 1, high);

		int l = low;
		int m = mid + 1;
		vector<int> copy(arr);

		for (int k = low; k <= high; ++k) {
			if (m > high) {
				arr[k] = copy[l++];
			}
			else if (l > mid) {
				arr[k] = copy[m++];
			}
			else if (arr[l] <= arr[m]) {
				arr[k] = copy[l++];
			}
			else {
				arr[k] = copy[m++];
			}
		}
	}
}

TEST(areTheySameAfterSorting, mergeSort) {
	vector<int> arr{ 3, 4, 2, 1, 6, 5 };
	vector<int> arr2{ 1, 2, 3, 4, 5, 6 };

	merge(arr, 0, arr.size()-1);

	EXPECT_EQ(arr, arr2);
}
```



#### 퀵 정렬

---



```
void quick(vector<int>& arr, int low, int high) {
	if (low >= high) {
		return;
	}

	int l = low;
	int h = high;
	int p = arr[low];

	do {
		while (l <= high && arr[l] < p) l++;

		while (h >= low && arr[h] > p) h--;

		if (l <= h) {
			swap(arr[l], arr[h]);
		}

	} while (l < h);

	int mid = h;
	quick(arr, low, mid-1);
	quick(arr, mid + 1, high);

}


TEST(areTheySameAfterSorting, quickSort) {
	vector<int> arr{ 6, 5, 4, 3, 2, 1 };
	vector<int> arr2{ 1, 2, 3, 4, 5, 6 };

	quick(arr, 0, arr.size() - 1);

	EXPECT_EQ(arr, arr2);
}
```

