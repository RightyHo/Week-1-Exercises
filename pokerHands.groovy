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

int setCardNum(String s){
	if(s == "A"){
		return 1
	} else if(s == "J"){
		return 11
	} else if(s == "Q"){
		return 12
	} else if(s == "K"){
		return 13
	} else {
		return (Integer.parseInt(s))
	}
}

boolean sameRank(int x, int y){
	if(x == y){
		return true
	} else {
		return false
	}
}

boolean tripTest(int x,int y,int z){
	if(x != y){
		return false
	} else if(x != z){
		return false
	} else if(y != z){			//Not sure if this extra check is necessary?
		return false
	} else {
		return true
	}
}

boolean is4oK(int a, int b, int c, int d){
	if(a != b){
		return false
	} else if(a != c){
		return false
	} else if(a != d){			
		return false
	} else if(b != c){
		return false
	} else if(b != d){
		return false
	} else if(c != d){
		return false
	} else {
		return true
	}	
}

boolean isFlush(String s1, String s2, String s3, String s4, String s5){
	if(s1 == s2 && s1 == s3 && s1 == s4 && s1 == s5){
		return true
	} else {
		return false
	}
}

boolean isStraight(String r1, String r2, String r3, String r4, String r5){
	//convert cards to integers
	int num1 = setCardNum(r1)
	int num2 = setCardNum(r2)	
	int num3 = setCardNum(r3)
	int num4 = setCardNum(r4)
	int num5 = setCardNum(r5)
	//find lowest ranked card
	int smallest = num1
	if(smallest > num2){smallest = num2}
	if(smallest > num3){smallest = num3}
	if(smallest > num4){smallest = num4}
	if(smallest > num5){smallest = num5}
	int nextCard = smallest + 1
	//test if cards are consecutive	
	for(i = 0; i < 4; i++){
		if(!(nextCard == num1 || nextCard == num2 || nextCard == num3 || nextCard == num4 || nextCard == num5)){
			return false
		} else {
			nextCard++
		}
	}
	return true
}

boolean isStraightFlush(String rA, String rB, String rC, String rD, String rE, String sA, String sB, String sC, String sD, String sE){
	if(isStraight(rA, rB, rC, rD, rE) && isFlush(sA, sB, sC, sD, sE)){
		return true
	} else {
		return false
	}
}

boolean isPair(String r1, String r2, String r3, String r4, String r5){
	//convert cards to integers
	int num1 = setCardNum(r1)
	int num2 = setCardNum(r2)	
	int num3 = setCardNum(r3)
	int num4 = setCardNum(r4)
	int num5 = setCardNum(r5)
	//check for pair
	if(sameRank(num1,num2)||sameRank(num1,num3)||sameRank(num1,num4)||sameRank(num1,num5)||sameRank(num2,num3)||sameRank(num2,num4)||sameRank(num2,num5)||sameRank(num3,num4)||sameRank(num3,num5)||sameRank(num4,num5)){
		return true
	} else {
		return false
	}
}

boolean isTrips(String r1, String r2, String r3, String r4, String r5){
	//convert cards to integers
	int num1 = setCardNum(r1)
	int num2 = setCardNum(r2)	
	int num3 = setCardNum(r3)
	int num4 = setCardNum(r4)
	int num5 = setCardNum(r5)
	//check for 3 of a kind
	if(tripTest(num1,num2,num3)||tripTest(num1,num2,num4)||tripTest(num1,num2,num5)||tripTest(num1,num3,num4)||tripTest(num1,num3,num5)||tripTest(num1,num4,num5)||tripTest(num2,num3,num4)||tripTest(num2,num3,num5)||tripTest(num2,num4,num5)||tripTest(num3,num4,num5)){
		return true
	} else {
		return false
	}
}

boolean isPoker(String r1, String r2, String r3, String r4, String r5){
	//convert cards to integers
	int num1 = setCardNum(r1)
	int num2 = setCardNum(r2)	
	int num3 = setCardNum(r3)
	int num4 = setCardNum(r4)
	int num5 = setCardNum(r5)
	//figure out if there are 4 of a kind 	
	if(is4oK(num1,num2,num3,num4)||is4oK(num1,num2,num3,num5)||is4oK(num1,num2,num4,num5)||is4oK(num1,num3,num4,num5)||is4oK(num2,num3,num4,num5)){
		return true
	} else {
		return false
	}
}

boolean isFullHouse(String r1, String r2, String r3, String r4, String r5){
	//convert cards to integers
	int num1 = setCardNum(r1)
	int num2 = setCardNum(r2)	
	int num3 = setCardNum(r3)
	int num4 = setCardNum(r4)
	int num5 = setCardNum(r5)
	//check for full house
	
}

//Start of main program
String bestHand = "",  rank1 = "",  rank2 = "",  rank3 = "",  rank4 = "",  rank5 = "", suit1 = "", suit2 = "", suit3 = "", suit4 = "", suit5 = ""

//read cards and check validity
for(i = 1; i <= 5; i++){
	print "Please key in the rank of your card: "
	String rank = System.console().readLine()
	print "Please key in the suit of the card: "
	String suit = System.console().readLine()	
	if(validCard(rank,suit)){
		if(i == 1){
			rank1 = rank
			suit1 = suit
		} else if(i == 2){
			rank2 = rank
			suit2 = suit
		} else if(i == 3){
			rank3 = rank
			suit3 = suit
		} else if(i == 4){
			rank4 = rank
			suit4 = suit
		} else if(i == 5){
			rank5 = rank
			suit5 = suit
		}
	} else {
		println "Card: " + rank + " of " + suit + " is NOT a valid card!"
		finished = true
		break
	}
}

println "rank1: " + rank1			//test to check variables are being assigned correctly
println "rank2: " + rank2			//test to check variables are being assigned correctly
println "rank3: " + rank3			//test to check variables are being assigned correctly
println "rank4: " + rank4			//test to check variables are being assigned correctly
println "rank5: " + rank5			//test to check variables are being assigned correctly
println "suit1: " + suit1			//test to check variables are being assigned correctly
println "suit2: " + suit2			//test to check variables are being assigned correctly
println "suit3: " + suit3			//test to check variables are being assigned correctly
println "suit4: " + suit4			//test to check variables are being assigned correctly
println "suit5: " + suit5			//test to check variables are being assigned correctly

//Calculate the best hand
if(isStraightFlush(rank1, rank2, rank3, rank4, rank5, suit1, suit2, suit3, suit4, suit5)){
	bestHand = "Straight Flush"
} else if(isPoker(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Poker - a.k.a. 4 of a Kind"
} else if(isFullHouse(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Full House"
} else if(isFlush(suit1, suit2, suit3, suit4, suit5)){
	bestHand = "Flush"
} else if(isStraight(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Straight"
} else if(isTrips(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Three of a Kind"
} else if(isTwoPair(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Two Pairs"
} else if(isPair(rank1, rank2, rank3, rank4, rank5)){
	bestHand = "Two Pairs"
} else {
	bestHand = "Nothing"
}

println "Your best hand is " + bestHand + "!"