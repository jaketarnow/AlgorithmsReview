/* Recursive Algorithm Review -- Fibonacci -- */
var fibonacci = function(n) {
	if (n <= 1) {
		return n;
	} else {
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

function testFibo() {
	var num = 12;
	console.log("n is: " + num);
	console.log("nth Fibo is: " + fibonacci(num));
}

testFibo();