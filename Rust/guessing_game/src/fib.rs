pub fn fibo(n: u64) -> u64 {
	if n <= 2 {
		1
	} else {
		fibo(n - 1) + fibo(n - 2)
	}
}