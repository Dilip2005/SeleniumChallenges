package week1.day1;

public class InterviewQuestion {

	public static void main(String[] args) {
		String str = "Interview withjava 1234";
		 int digit=0;
		 for(int i=0;i<str.length();i++){
		 if(str.charAt(i)>= 48 && str.charAt(i) <=57) //ASII key value im not sure
		 digit++;
		 
		
		 
		 System.out.println("Total no of digit=" + digit);
		 }
		 
	}
}

