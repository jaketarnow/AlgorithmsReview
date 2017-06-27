// for (var x = 0; x <= 100; x++) {
// 	switch (true) {
// 		case (x % 5 === 0 && x % 3 == 0):
// 			console.log("FizzBuzz")
// 			break;
// 		case (x % 3 == 0):
// 			console.log("Fizz")
// 			break;
// 		case (x % 5 == 0):
// 			console.log("Buzz")
// 			break;
// 		default:
// 			console.log(x)
// 			break;
// 	}
// }

for (var n = 0; n <= 100; n++) {
	var output = "";
	if (n % 3 == 0)
		output = "Fizz";
	if (n % 5 == 0)
		output += "Buzz";
	console.log(output || n);
}