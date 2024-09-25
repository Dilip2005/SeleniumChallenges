package week1.day1;

public class NumCount {
	public static int countDigit(String[] string)
	{
	int digitCount=0;
	//iterate tthrough the string array
	for(int i=0; i<string.length;i++)
	{
	String str= string[i];
	//iterate every char in string
	for(int j=0;j<str.length();j++)
	{
	char ch=str.charAt(j);
	//check if the character is digit
	if(Character.isDigit(ch))
	{
	digitCount++;
	}
	}
	}
	return digitCount;
	}

	public static void main(String[]args)
	{
	String[] string={"abc123", "def45", "ghi7890"};
	int output= countDigit(string);
	System.out.println(" No of digits:" + output);
	
	
}
}
