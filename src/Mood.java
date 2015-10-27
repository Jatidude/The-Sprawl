public enum Mood {
	DISHEARTENED, HOSTILE, NEUTRAL, SUICIDAL, GLAD, HAPPY, JUBILANT;
	
	public int value;
	
	static {
		SUICIDAL.value = -90;       //Unit may kill themeselves
		HOSTILE.value = -70;        //Unit may attack others unrprovoked
        AGITATED.value = -50;       //Unit is angry and unhappy
		DISHEARTENED.value = -20;   //Unit is mildly glum
		NEUTRAL.value = 0;          //No strong feelings
		CONTENT.value = 20;         //Generally happy
        GLAD.value = 50;            //Overtly happy
		HAPPY.value = 70;           //Outwardly cheery and untroubled
		JUBILANT.value = 90;        //Not a care in the world. Might not have noticed the apocalypse
	}

	public void /* int */ compareTo() {
		/*
		if(this.value > m.value)
			return 1;
		else if(this == m.value)
			return 0;
		else
			return -1;
		*/
	}

}
