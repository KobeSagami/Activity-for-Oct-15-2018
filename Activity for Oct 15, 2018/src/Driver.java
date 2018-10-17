import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver
{
	static String yesOrNo;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String manufacturer;
		String model;
		float price;
		String carrier;
		List<MobilePhone> phoneList = new ArrayList<MobilePhone>();
		int i = 0;
		
		do
		{
			System.out.println("Who made your phone?: ");
			manufacturer = input.nextLine();
			
			System.out.println("What is the model of your phone?: ");
			model = input.nextLine();
			
			System.out.println("What is the price of your phone?: ");
			price = input.nextFloat();
			input.nextLine();
			
			System.out.println("Who is the carrier of your phone?: ");
			carrier = input.nextLine();
			
			phoneList.add(new MobilePhone(manufacturer, model, price, carrier));
			
			System.out.println(phoneList.get(i).call("4061234567"));
			System.out.println(phoneList.get(i).text("Hello there"));
			System.out.println(phoneList.get(i).toString());
			
			i++;
			
			System.out.println("Do you want to add another phone?: (Y or N)");
			yesOrNo = input.nextLine();
			yesOrNo = yesOrNo.substring(0, 1).toLowerCase();
			
		} while(yesOrNo.equals("y"));
		
	}

}
