package week1.day1;

public class Sum {
	public int[] twoSum(int []num,int target)
	{
	//loop into the array num
	 
	for(int i=0;i<num.length;i++)  
	{
	for (int j=i+1;j<num.length;j++)
	{
	//Takes the i=0 and j=1 / 2+7=9 
	if(num[i] +num[j]== target) {
	}
	}
	}
	return num;
	}
	 
	 
	public static void main(String[] args)
	{
	 
	Sum s=new Sum();
	int[] num={2,7,11,15};
	int target=9;
	// variable to store indices
	int []output =s.twoSum(num,target);
System.out.println("indices:"+ output[0]+ "," +output[1]);
	}
	}

