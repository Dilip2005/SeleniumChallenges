package week1.day1;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		String[] a = {"abc123", "def45", "ghi7890"};
		int len=a.length;
		int[] digit=new int[len];
		String temp="";
		int count=0;
		
		for (int i=0;i<len;i++){
		temp=temp+a[i]; //re-initialized error
		for(int j=0;j<temp.length();j++){
		    if ((temp.charAt(j)==('0'))||(temp.charAt(j)==('1'))||(temp.charAt(j)==('2'))||(temp.charAt(j)==('3'))||
			(temp.charAt(j)==('4'))||(temp.charAt(j)==('5'))||(temp.charAt(j)==('6'))||(temp.charAt(j)==('7'))||
			(temp.charAt(j)==('8'))||(temp.charAt(j)==('9')))
		   {
			count++;
		   }
		}
		    digit[i]=count;
		    count = 0;
		    temp = "";
		}
		 
		for(int value:digit){
		System.out.println(value);
		}
		 }
		 
	}


