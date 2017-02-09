# !/usr/bin/python
# sys is for standard in, re is for regular expressions
import sys
import re

sums = {}

for line in sys.stdin:
	line = re.sub( r'^\W+|\W+$', '', line)
	words = re.split(r'\W+', line)

	for word in words:
		word = word.lower()
		sums[word] = sums.get( word, 0 ) + 1

print sums