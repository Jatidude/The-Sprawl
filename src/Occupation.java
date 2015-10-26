public enum Occupation {
	ACCOUNTANT, ARCHITECT, ARTIST, ATHLETE, 
	BARBER, BARTENDER, 
	CARPENTER, CHEMIST, 
	DENTIST, 
	ENGINEER, 
	FARMER, 
	LAWYER, 
	MANAGER, MODEL, 
	PHARMACIST, PHOTOGRAPHER, PILOT, PLUMBER, POLICE_OFFICER, PROFESSOR, PROGRAMMER,
	NURSE, 
	MATHEMATICIAN, MUSICIAN, 
	SOLDIER, STUDENT, SURGEON, 
	TEACHER;
	
	private double intelligence;
	private double resourcefulness;
	private double strength;
	
	static {
		// each stat will have a floor and ceiling
		PROFESSOR.intelligence = 95.0; // 88.0 -> 100.0
		PROGRAMMER.intelligence = 80.0; // 76.0 -> 98.0
		NURSE.intelligence = 77.0; // 76.0 - > 98.0
		MATHEMATICIAN.intelligence = 96.0; // 73.0 -> 100.0
		MUSICIAN.intelligence = 53.0; // 53.0 -> 79.0
		
	}
	
}