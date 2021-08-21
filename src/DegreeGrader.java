iimport java.util.Scanner;

/* 1. Within the York grading project, create a DegreeGrader class */

public class DegreeGrader {

	
	/* 2. Within the class, create a method called gradeDegree, which 
	 * takes four first attempt module results (i.e. all module average, 
	 * ISM module average, number of compensatable failed credits and 
	 * number of outright failed modules) as parameters and returns the 
	 * degree classification (e.g. “distinction”, “merit”, “pass” or “fail”). 
	 * Here is an example of some of the parameters taken by the gradeDegree
	 * method: gradeDegree(44, 55, 14, 2) */
	
	public String gradeDegree(int moduleAverage, int ismAverage, int compCredits, int failedModules) {
		
		if (moduleAverage >= 70 && ismAverage >= 70 && compCredits == 0 && failedModules == 0) {
			return "Your degree classification is Distinction!";
		
		}else if (moduleAverage >= 60 && ismAverage >= 60 && compCredits <= 15 && failedModules == 0) {
			return "Your degree classification is Merit!";
			
		}else if (moduleAverage >= 50 && ismAverage >= 50 && compCredits <= 30 && failedModules == 0) {
			return "Your degree classification is Pass!";
					
		}else {
			return "Failed";
		}
	} // end of gradeDegree method
	
	/* 3. Write one or more methods that will prompt the user for input from 
	 * the keyboard for all the module averages: ISM module average, number of 
	 * compensatable failed credits, and number of outright failed modules. 
	 * The methods should also validate the input (e.g. module average in the 
	 * range 0 to 100, number of compensentable failed credits in the range 
	 * of 0-180, and number of outright failed modules in the range of 0-11). 
	 * It will keep prompting the user until valid inputs have been entered. */
	

	// 3a. Method to prompt user to input the module average (value between 0-100).
	public int inputModuleAverage() {
		
		int moduleAverage; 
		Scanner keyboard = new Scanner(System.in); 
		
		do {
			
			System.out.println("Please enter the module average. (0-100).");
			moduleAverage = keyboard.nextInt();
			
		} while (moduleAverage > 100 || moduleAverage < 0); // do/while to ensure correct value is entered 
		return moduleAverage;
	}
		
	// 3b. Prompt user to enter ISM average until correct value is entered (0-100).	
	public int inputISMAverage() {
		
		int ismAverage; 
		Scanner keyboard = new Scanner(System.in); 
		
		do {
			
			System.out.println("Please enter the ISM average. (0-100.)");
			ismAverage = keyboard.nextInt();
			
		}while (ismAverage > 100 || ismAverage < 0);
		return ismAverage;
	}
		
	
	//3c. Prompt user to enter # of compensatable credits until correct value entered (0-180).
	public int inputCompCredits() {	
		
		int compCredits; 
		Scanner keyboard = new Scanner(System.in); 
		
		do {
			
			System.out.println("Please enter the number of compensatable failed credits. (0-180).");
			compCredits = keyboard.nextInt();
			
		}while (compCredits > 180 || compCredits < 0);
		return compCredits; 
	}
		
	
	//3d. Prompt user to enter # of failed modules until correct value entered (0-11).	
	public int inputFailedModules() {
		
		int failedModules; 
		Scanner keyboard = new Scanner(System.in); 
		
		do {
			
			System.out.println("Please enter the number of failed modules. (0-11)");
			failedModules = keyboard.nextInt();
			
		}while (failedModules > 12 || failedModules < 0);
		return failedModules;
		
	} 
	
	/* 4. Write a further method called startDegreeGrading, the method will start with 
	 * displaying ("*********** Degree Classification Program *********", it will then
	 * prompt for the results to grade. For valid results, the grade will be printed 
	 * on screen. The system will then ask the user a whether he/she would like to 
	 * continue grading, or not, by inputting - yes/no (y/n) - This method needs to 
	 * call the methods developed in “Part B 2.” and “Part B 3.” above. */
	
	public void startDegreeGrading () {
		
		int mAverage;
		int ism;
		int compC;
		int failed;
		String grade;
		char response;
		
		System.out.println(" ");
		System.out.println("*********** Degree Classification Program *********");
		System.out.println(" ");
		
		do {
			
			mAverage = inputModuleAverage(); // call methods to store respective values
			ism = inputISMAverage();
			compC = inputCompCredits();
			failed = inputFailedModules();
			
			grade = gradeDegree(mAverage, ism, compC, failed); // input parameters to calculate degree result
			
			System.out.println(" ");
			System.out.println(grade); // Print degree classification
			
			//Prompt user whether to grade again or not
			Scanner keyboard=new Scanner(System.in);

			System.out.println( "");
			System.out.println(">> Would you like to continue grading? (Y/N) ");
			response = keyboard.next().charAt(0);
			
		}while (response == 'y' || response == 'Y');	
		
	}
	
} // end of class

