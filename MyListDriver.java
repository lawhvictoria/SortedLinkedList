import java.util.Scanner;

public class MyListDriver {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		MySortedList list = new MySortedList();

		System.out.println("a (add)\n"
				+ "d (delete)\n"
				+ "x (max)\n"
				+ "m (min)\n"
				+ "p (print)\n"
				+ "e (isEmtpy)\n"
				+ "q (quit)\n");
		
		boolean cont = true;
		while(cont)
		{
			System.out.println("Please enter an option: ");
			String choice = scan.next();
			
			switch(choice)
			{
			case "a":
				System.out.println("Please enter a number you would like to add to the linked list.");
				int add = scan.nextInt();
				list.add(add);
				System.out.println(add + " has been added to the linked list.");
				break;
				
			case "d":
				try{
					System.out.println("Please enter a number you would like to delete to the linked list.");
					int delete = scan.nextInt();
					list.delete(delete);
					System.out.println(delete + " has been deleted from the linked list.");
				}
				catch(Exception e)
				{
					if(!list.isEmpty())
					{
						System.out.println("The linked list is empty!");
					}
					
					else
					{
						System.out.println("The number is not in the linked list.");
					}
				}
				break;
				
			case "x":
				try{
					System.out.println("The max value in the linked list is: " + list.max());
				}
				catch(Exception e)
				{
					System.out.println("The linked list is empty!");
				}
				break;
				
			case "m":
				try{
					System.out.println("The min value in the linked list is: " + list.min());
				}
				catch(Exception e)
				{
					System.out.println("The linked list is empty!");
				}
				break;
				
			case "p":
				list.print();
				break;
				
			case "e":
				System.out.println(list.isEmpty());
				break;
				
			case "q":
				cont = false;
				break;
				
			default:
				System.out.println("Invalid Option! Please try again...");
				break;
			}
		}
	}
}
