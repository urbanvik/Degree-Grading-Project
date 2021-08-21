import java.util.Scanner;

/* Practical Programming Assignment 1
 * @Author (Viktoria Urban)
 * @Date: 10.05.2020
 */

/* 1. Using Eclipse you should create a new project called: York grading project. 
 * Within the project, create a ModuleGrader class. */

public class ModuleGrader {
	
	/* 2. Within the class, create a method called gradeModule, 
	 * which takes a mark (e.g. 65) as parameter and returns a grade (e.g. “Good”).*/
	
	public String gradeModule(int mark) {
		
		/* 70-100 - Excellent
		 * 60-69 - Good
		 * 50-59 - Satisfactory
		 * 40-49 - Compensatable fail
		 * 0-39 - Outright fail */
		
		if (mark >= 70 && mark <= 100) {
			
			return "Your grade is Excellent.";
			
		} else if (mark >= 60 && mark <= 69) {
			
			return "Your grade is Good.";
			
		}else if (mark >= 50 && mark <= 59) {
	
			return "Your grade is Satisfactory.";
			
		}else if (mark >= 40 && mark <= 49) {
			
			return "You grade is Compensatable Fail.";
			
		}else if (mark >= 0 && mark <= 39) {
			
			return "Your grade is Outright Fail.";
			
		} else {
			
			return "Error";
		}
	}
	
	/* 3. Write another method called getValidModuleMark, this method will 
	 * prompt the user for input from the keyboard and validate a mark in 
	 * the range 0 to 100. It will keep prompting the user until a valid 
	 * input has been taken.*/
	
	public int getValidModuleMark() {
		
		int mark;
		
		Scanner keyboard = new Scanner(System.in);
	
		do {
			System.out.print("Please enter a valid mark between 0-100: ");
			mark = keyboard.nextInt();
			
		} while (mark < 0  || mark > 100);
		return mark;
	}	

	/* 4. Write a third method called startModuleGrading, the method will 
	 * start with displaying "*********** Module Grading Program *********", 
	 * it will then prompt the user for a module mark to grade. For a valid 
	 * mark, the grade will be printed on screen. The system will then ask 
	 * the user whether he/she would like to continue grading , or not, by 
	 * inputting - yes/no (y/n) - This method needs to call the methods 
	 * developed in “Part A 2.” and “Part A 3.” above.*/
	
	public void startModuleGrading() {
		
		int validMark;
		String gradeText;
		char response;
		
		System.out.println(" ");
		System.out.println("*********** Module Grading Program *********");
		System.out.println(" ");
		
		do 
        {
           validMark = getValidModuleMark();    // Verify and get mark from user
           gradeText = gradeModule(validMark);  // Insert the verified mark into method to get grade 
           System.out.println(gradeText);        
         
           
           Scanner sc=new Scanner(System.in);   //Ask user whether to continue grading or not
           System.out.print("Would you like to continue grading? (Y/N) ");
           response = sc.next().charAt(0);
        } while (response == 'y'|| response =='Y');  // Account for lower case and upper case differences
		
	}
	} // end of class

