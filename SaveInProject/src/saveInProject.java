
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class saveInProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String password;
		try {
			System.out.println("Please input your name");
			name = input.nextLine();
			System.out.println("Please enter your password");
			password = input.nextLine();
			FileWriter fw = new FileWriter("information.txt", true);
			fw.write("User name: "+name+"\n");
			fw.write("Password: "+password);
			fw.flush();
			fw.close();
			int c;
			FileReader fr = new FileReader("information.txt");
			while((c=fr.read()) !=-1)
			{
				System.out.println((char)c);
			}
			fr.close();
			
		}
		catch(Exception  e)
		{
			System.out.println(e.toString());
			
			
		}
		finally 
		{
			input.close();
		}
	

	}

}
