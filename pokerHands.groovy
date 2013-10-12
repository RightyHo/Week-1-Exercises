boolean validRank(String r){
	if(r == "A" || r == "2" || r == "3" || r == "4" || r == "5" || r == "6" || r == "7" || r == "8" || r == "9" || r == "10" || r == "J" || r == "Q" || r == "K"){
		return true
	} else {
		return false
	}
}

boolean validSuit(String s){
	if(s == "spades" || s == "hearts" || s == "diamonds" || s == "clubs"){
		return true
	} else {
		return false
	}
}

boolean validCard(String rk, String st){
	if(validRank(rk) && validSuit(st)){
		return true
	} else {
		return false
	}
}

//Start of main program

boolean finished = false

for(i = 1; i <= 5; i++){
	print "Please key in the rank of your card: "
	String rank = System.console().readLine()
	print "Please key in the suit of the card: "
	String suit = System.console().readLine()	
	if(validCard(rank,suit)){
		if(i == 1){
			String rank1 = rank
			String suit1 = suit
		} else if(i == 2){
			String rank2 = rank
			String suit2 = suit
		} else if(i == 3){
			String rank3 = rank
			String suit3 = suit
		} else if(i == 4){
			String rank4 = rank
			String suit4 = suit
		} else if(i == 5){
			String rank5 = rank
			String suit5 = suit
		}
//		println "rank " + i + ": "  + rank			//test to check variables are being assigned correctly
//		println "suit " + i + ": " + suit			//test to check variables are being assigned correctly
	} else {
		println "Card: " + rank + " of " + suit + " is NOT a valid card!"
		finished = true
		break
	}
}

