# this one is like your scripts with argv
def print_two(*args):
	arg1, arg2 = args
	print "arg1: %r, arg2: %r" % (arg1, arg2)

# ok, that *args is actually pointless, we can do it without it
def print_two_again(arg1, arg2):
	print "arg1: %r, arg2: %r" % (arg1, arg2)

# this one just takes one arg
def print_one(arg1):
	print "arg1: %r" % arg1

# taking no args
def print_none():
	print "I got nothin"

# input for the args
print_two("Jake", "Tarnow")
print_two_again("Jake", "Tarnow")
print_one("First")
print_none()