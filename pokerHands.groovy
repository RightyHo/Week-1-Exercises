boolean validCard = true

print "Please key in the rank and suit of your first card (eg; 5H for the Five of Hearts):"
String card1 = System.console().readLine()

//check if the rank is 10 which is only situation when string should be longer than 2 chars

if(card1.length()>2){
	String rank1 = card1.substring(0,2)
	if(rank1 != "10"){
		validCard = false
		println card1 + "is not a valid card"
	}
	String suit1 = card1.substring(3)
	if(!(suit1 == "S" || suit1 == "H" || suit1 == "D" || suit1 == "C")){
		validCard = false
		println card1 + "is not a valid card"
	}	
} else {
	String rank1 = card1.substring(0,1)
	if(!(rank1 == "A" || rank1 == "2" || rank1 == "3" || rank1 == "4" || rank1 == "5" || rank1 == "6" || rank1 == "7" || rank1 == "8" || rank1 == "9" || rank1 == "J" || rank1 == "Q" || rank1 == "K")){
		validCard = false
		println card1 + "is not a valid card"
	}
	String suit1 = card1.substring(3)
	if(!(suit1 == "S" || suit1 == "H" || suit1 == "D" || suit1 == "C")){
		validCard = false
		println card1 + "is not a valid card"
	}
}

println "rank is: " + rank1
println "suit is: " + suit1
println "card is: " + card1