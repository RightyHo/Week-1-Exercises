int x = 2, printCount = 0
boolean finished = false

while(!finished){
	boolean isPrime = true
	for(int i = 2; i < x; i++){
		if(x % i == 0){
			isPrime = false
		}
	} 
	if(isPrime){
		println x
		printCount++
		if(printCount >= 1000){
			finished = true
		}
	}
	x++
}