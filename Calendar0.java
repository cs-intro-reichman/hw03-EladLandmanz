/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
		for (int i = 1; i <= 12; i++){
			System.out.println( "Month " + i +  " has " + nDaysInMonth ( i , year ) + " days");
				
		}
		
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		isLeapYear = ((year % 400) == 0);
		// Then checks if the year is divisible by 4 but not by 100
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
	    // Replace the following statement with your code
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		switch (month) {
		case 1: 
			return 31;
		case 2: 
			if (isLeapYear(year)){
				return 29;
			}else {
				return 28;
			}
		case 3: 
			return 31;
    	case 4: 
			return 30;
		case 5: 
			return 31;
    	case 6: 
			return 30;			
		case 7: 
			return 31;
    	case 8: 
			return 31;
		case 9: 
			return 30;
    	case 10: 
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;			

		}
		return 0;
	}
}

