public class Nomoneyinserted implements machine
{

 public void selectProductAndInsertMoney( int amount, String productName )
 {
 System.out.println("\n"+amount + "$ inserted and " + productName + " has been selected");
 System.out.println("Your product has been dispensed");
 System.out.println("Please pick up your product"+"\n");

 }
 public void dispenseProduct()
 {
	 
 System.out.println("No money is inserted. Can't dispense product");

 }

}