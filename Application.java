import java.io.*;

/**
 * @author abhay
 *
 */
class Application {
	
	public static void main(String... args) throws IOException {
		MovieManager manager=new MovieManager();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. Get all movies");
			System.out.println("2. Get movie of a specific type");
			System.out.println("3. Check whether a movie is blockbuster");
			System.out.println("4. Exit");
			System.out.println("Enter choice");
			int n=Integer.parseInt(br.readLine());
			if(n==4)
				break;
			
			switch(n) {
			case 1:
				manager.showAllMovies();
				break;
			case 2:
				System.out.println("Enter type \n 1. Tollywood \n 2. Bollywood \n 3. Hollywood");
				int type=Integer.parseInt(br.readLine());
				if(type>=0&&type<=2)
					manager.showSpecificMovie(type);
				else
					System.out.println("Invalid type");
				break;
			case 3:
				System.out.println("Enter movie name");
				String name=br.readLine();
				manager.isBlockBuster(name);
				break;
			default:
				System.out.println("Invalid choice");
				
			}
			
		}
	}
}
