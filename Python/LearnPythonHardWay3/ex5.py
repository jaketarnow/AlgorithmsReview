my_name = 'Jake Tarnow'
my_age = 25 # mmhmmm
my_height_foot = 5 # foot
my_height_inches = 10 #foot inches
my_weight = 181 # lbs
my_eyes = 'blue/green'
my_teeth = 'White'
my_hair = 'Brown'

print "Let's talk about %s." % my_name
print "He's %d feet and %d inches tall." % (my_height_foot, my_height_inches)
print "He's %d pounds heavy." % my_weight
print "Actually that's not too heavy."
print "He's got %s eyes and %s hair." % (my_eyes, my_hair)
print "His teeth are usually %s depending on the coffee." % my_teeth

# this line is tricky, try to get it exactly right
print "If I add %d, %d, and %d I get %d." % (
    my_age, my_height_foot, my_weight, my_age + my_height_foot + my_weight)