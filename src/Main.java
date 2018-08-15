import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marks marks= new Marks(50,60,70,80);
		
		Marks[] m = new Marks[4];
		
			m[0]= new Marks(70,60,80,80);
			m[1]= new Marks(90,60,80,80);
			m[2]= new Marks(70,90,50,80);
			m[3]= new Marks(80,60,80,80);

			
		System.out.println(Arrays.toString(m));
	}
	

}
