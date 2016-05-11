function isPower(val) {
	if (!(val & val - 1)) {
		return 1;
	} else {
		return 0;
	}
}

function testPower() {
	var testPower = 24;
	var testPower2 = 32;
	console.log("Number: " + testPower);
	console.log("Validation: " + isPower(testPower));
	console.log("Number: " + testPower2);
	console.log("Validation: " + isPower(testPower2));
}

testPower();