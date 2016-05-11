/* Recursive Algorithm Review -- Rec Sum -- */
function sum(array) {
	var low = 0;
	var high = array.length;

	if (low == high) {
		return 0;
	} else {
		return array[0] + sum(array.slice(1));
	}
}

function testSum() {
	var testArray = [1, 2, 3, 4, 5];
	console.log("Array: " + testArray);
	console.log("Sum: " + sum(testArray));
}

testSum();