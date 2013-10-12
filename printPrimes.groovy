int x = 2

while(x <=1000){
	boolean isPrime = true
	for(int i = 2; i < x; i++){
		if(x % i == 0){
			isPrime = false
		}
	} 
	if(isPrime){
	println x
	}
	x++
}