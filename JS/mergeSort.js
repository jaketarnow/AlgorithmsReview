/* Sorting Algorithms -- merge sort -- Introduction to Algorithms Third Edition
MergeSort - divide-and-conquer algorithm. 
Divide: Divide the n-element sequence to be sorted into two subsequences of n/2
Conquer: Sort the two subsequences recursively using merge sort
Combine: Merge the two sorted subsequences to produce the sorted answer
*/
var mergeSort = function(array) {
	var p = array.length;
	var r = 2;
	if (p < r) {
		return array;
	}
	var mid = Math.floor(p/2);
	var left = array.slice(0, mid);
	var right = array.slice(mid);
	return merge(mergeSort(left), mergeSort(right));
}

function merge(left, right) {
	var result = [];
	var i = 0;
	var j = 0;
	var leftLength = left.length;
	var rightLength = right.length;

	while (i < leftLength && j < rightLength) {
		if (left[i] < right[j]) {
			result.push(left[i++]);
		} else {
			result.push(right[j++]);
		}
	}
	return result.concat(left.slice(i)).concat(right.slice(j));
}

function testMergeSort() {
	var unsortedArray = [5, 7, 2, 4, 3, 9];
	console.log("Unsorted Array: " + unsortedArray);
	console.log("Sorted Array: " + mergeSort(unsortedArray));
}

testMergeSort();