package prabhuprp;
import java.util.Scanner;
public class prabhu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		s2=in.nextLine();
		int l=s1.length();
		String[] s3=s2.split(":");
		/*for(int i=0;i<s3.length;i++){
			System.out.println(s3[i]+"     ");
		}*/
		String[] s4=s1.split("_");
		//System.out.println(s4[0]+"  "+s4[1]);
		int n=s3.length;
		//String s5[]=new String[n];
		int l1=s4[0].length();
		int l2=s4[1].length();
		int count=0;
		String sr="";
		for(int i=0;i<n;i++)
		{
			if(l==s3[i].length()){
			if(s4[0].equalsIgnoreCase(s3[i].substring(0,l1))&&s4[1].equalsIgnoreCase(s3[i].substring(l2+1)))
			{
				System.out.print(sr+s3[i].toUpperCase());
				count++;
				sr=":";
			}
			
			}
			
		}
		
		if(count==0)
		{
			System.out.println("ERROR");
		}

	}

}
