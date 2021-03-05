# Kotlin



##### Program entry point

---

프로그램의 시작점은 main 함수.

```
fun main(args: Array<String>) {
	// main
}
```



##### Functions

---

함수는 아래와 같이 작성한다.

```
fun sum(a: Int, b: Int) : Int {
	return a + b
}
```



함수 본체를 생략할 수 있다.

```
// return 타입은 추론된다.
fun sum(a: Int, b: Int) = a + b
```



함수가 아무런 값을 반환하지 않을 때

```
fun printSomething() : Unit {
	println("something")
}

// return 타입을 생략할 수 있다.
fun printSomething() {
	println("something")
}
```



##### Variables

---

읽기 전용 변수는 `val` 키워드를 사용해서 선언한다.

```
val a: Int = 1
val b = 2
val c: Int
c = 3 // 지연 값 할당
c = 4 // 이 경우에는 error (Val cannot be resassigned)
```



값을 변경할 수 있는 변수는 `var` 키워드를 사용해서 선언

```
var a: Int = 10
a = 20
```

