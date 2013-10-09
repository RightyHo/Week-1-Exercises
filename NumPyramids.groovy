print "How many layers do you want on your pyramid? (1-9):"
int numFloors = Integer.parseInt(System.console().readLine())
int level = 1

while(level <= numFloors){
	int count = 0
	while(count < level){
		print level
		count++
	}
	println " "
	level++
}

	
	