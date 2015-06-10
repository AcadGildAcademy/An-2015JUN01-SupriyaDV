
public class EntryPoint {

	public static void main(String[] args) {
				
		// Eligibility to vote?
		short MIN_AGE = 18;
		short age;
		System.out.println("**************************");
		System.out.println("Are you eligible to vote?");
		System.out.println("**************************");
        System.out.println("Enter your age:"); //Class.object.method
        age = 22;
		if (age>MIN_AGE) {
	        System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are NOT eligible to vote");
		}
		System.out.println();
		// Odd or even number?
		System.out.println("**************************");
		System.out.println("Even or Odd number?");
		System.out.println("**************************");
		int in_num = 23;
		if ((in_num % 2) == 0) {
	        System.out.println("Number is EVEN");
		} else {
			System.out.println("Number is ODD");
		}
		System.out.println();
		
		//Leap year or not?
		System.out.println("**************************");
		System.out.println("Leap year or not?");
		System.out.println("**************************");
		int year = 2004;
	    if (year % 100 == 0) {
	        if (year % 400 == 0) {
	            System.out.println(year + " is a leap year");
	        } else {
	            System.out.println(year + " is not a leap year");
	        }
	    } else {
	        if (year % 4 == 0) {
	            System.out.println(year + " is a leap year");
	        } else {
	            System.out.println(year + " is not a leap year");
	        }
	    }
	    System.out.println();
	    
	    //Vowel or consonant
	    System.out.println("**************************");
	    System.out.println("Vowel or consonant?");
	    System.out.println("**************************");
	    char ch = 'e';
	    if ((ch == 'a') || (ch == 'e') || (ch == 'i') || 
	    		(ch == 'o')|| (ch == 'u')) {
	    	System.out.println(ch + " is a vowel");
	    } else {
	    	System.out.println(ch + "is a consonant");
	    }
	    System.out.println();
	    
	    //How many days in a month
	    System.out.println("**************************");
	    System.out.println("How many days in a month?");
	    System.out.println("**************************");
	    String[] monthName = {"", "January", "February", "March", "April",
	    		"May", "July", "August", "September", "October",
	    		"November", "December"};

	    int month = 2;
	    switch (month)
	    {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(monthName[month] + " has 31 days");
    	     	break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(monthName[month] + " has 30 days");
				break;
			case 2:
				System.out.println(monthName[month] + " has 28 days/29 in a leap year");
				break;
			default:
				System.out.println("Invalid month");
				break;
	    }
	
	}
}
