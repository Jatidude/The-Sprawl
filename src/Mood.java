public enum Mood {
	DISHEARTENED, HOSTILE, NEUTRAL, SUICIDAL, GLAD, HAPPY, JUBILANT;
	
	public int value;
	
	static {
		SUICIDAL.value = -90;
		HOSTILE.value = -70;
		DISHEARTENED.value = -20;
		NEUTRAL.value = 0;
		GLAD.value = 20;
		HAPPY.value = 70;
		JUBILANT.value = 90;
	}

	public int compareTo(Mood m){
		if(this.value > m.value)
			return 1;
		else if(this == m.value)
			return 0;
		else
			return -1;
	}

}