public class Customer
{

 public static void main( String[] args )
 {

 VendingMachine vendingMachine = new VendingMachine();

System.out.println("Vending Machine has: "
                 + vendingMachine.getmachine().getClass().getName());

vendingMachine.dispenseProduct();
  vendingMachine.selectProductAndInsertMoney(2, "Pepsi");
 
  vendingMachine.dispenseProduct();
 vendingMachine.selectProductAndInsertMoney(2, "Coke");
 
 vendingMachine.dispenseProduct();
 vendingMachine.selectProductAndInsertMoney(1, "Water"); 
 
 vendingMachine.dispenseProduct();
 vendingMachine.selectProductAndInsertMoney(2, "Mountain Dew"); 
 System.out.println("VendingMachine now has: Nomoneyinserted");
 }
 
}