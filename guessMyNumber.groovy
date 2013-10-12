int numberToGuess = Math.abs(1000 * Math.random()), guess = 0, guessCount =0
boolean bangOn = false

println "Try to guess my number!  Hint:  It lies between 0 and 1,000."

while(!bangOn){
	print "Tell me a number: "
	guess = Integer.parseInt(System.console().readLine())
	guessCount++
	if(guess < numberToGuess){
		println "No!  My number is higher."
	} else if(guess > numberToGuess){
		println "No!  My number is lower."
	} else {
		println "CORRECT!"
		println "You needed " + guessCount + " guesses."
		bangOn = true
	}
}
