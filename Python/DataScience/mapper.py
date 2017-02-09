# MapReduce approach does not require a central data structure. 3 Steps
# 1. Mapping step that produces intermediate results and associates with an output key
# 2. A shuffling step that groups intermediate results associated with the same output key
# 3. A Reducing step that processes groups of intermediate results with the same output key

# !/usr/bin/python

import sys
import re

for line in sys.stdin:
	line = re.sub( r'^\W+|\W+$', '', line )
	words = re.split(r"\W+", line)

	for word in words:
		print ( word.lower() + "\t1" )