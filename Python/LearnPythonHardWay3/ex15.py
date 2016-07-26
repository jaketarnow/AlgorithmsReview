from sys import argv

script, filename = argv

txt = open(filename)
# open creates a file object... python will not restrcit you from opening a file more than once
# used for reading and writing .. r / w
print "Here's your file %r:" % filename
print txt.read()

print "Type the filename again:"
file_again = raw_input("> ")

txt_again = open(file_again)

print txt_again.read()