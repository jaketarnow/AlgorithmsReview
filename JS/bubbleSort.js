/* Sorting Algorithms -- bubble sort -- Introduction to Algorithms Third Edition
Probably asking yourself... really??? BubbleSort?
BubbleSort is popular, but inefficient, sorting algorithm...
It works by repeatedly swapping adjacent elements that are out of order
*/
var bubbleSort = function (array) {
	//
	var aLength = array.length;
	for (var i = aLength - 1; i >= 0; i--) {
		for (var j = 1; j <= i; j++) {
			if (array[j - 1] > array[j]) {
				var tmp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = tmp;
			}
		}
	}
	return array;
}

function testBubble() {
	var unsortedArray = [5, 7, 2, 4, 3, 9];
	console.log("Unsorted Array: " + unsortedArray);
	console.log("Sorted Array: " + bubbleSort(unsortedArray));
}

testBubble();