
public class JavaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Radhika Margam";
		
		//Print S with single character
		for (int i=0; i<s.length(); i++ )
		{
			System.out.println(s.charAt(i));
		}
		
		//Print S in reverse order
		for (int i=s.length()-1; i>=0; i-- )
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
