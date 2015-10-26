public enum Nature {
	
	ABLE, ACTIVE, ADVENTUROUS, AFFECTIONATE, AFRAID, ALERT, AMBITIOUS,
	ANGRY, ANNOYED, ANXIOUS, APOLOGETIC, ARROGANT, ATTENTIVE, AVERAGE, 
	BAD, BLUE, BOLD, BORED, BOSSY, BRAINY, BRAVE, BRIGHT, BRILLIANT, 
	BUSY, CALM, CAREFUL, CARELESS, CAUTIOUS, CHARMING, CHEERFUL, CHILDISH,
	CLEVER, CLUMSY, COARSE, CONCERNED, CONFIDENT, CONFUSED, CONSIDERATE, 
	COOPERATIVE, COURAGEOUS, COWARDLY, CROSS, CRUEL, CURIOUS, DANGEROUS,
	DARING, DARK, DECISIVE;
	
	private double strength;
	// When calculating stats for each colonist or wanderer, you add up their natures, their mood, and their occupational stats
	// Maybe have stats increase or decrease over time?
	// Maybe take into account their job as well in factoring the stats increase or decrease

	static { // Scale from 0.1 to 10.0
		ABLE.strength = ((double)(Math.random()*5)+5.0); // Floor: 5.0 points added minimum; 10.0 points maximum
		
	}
	
}
