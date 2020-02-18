public class VendingMachine implements machine
{

 private machine machine;

 public VendingMachine()
 {
 machine = new Nomoneyinserted();
 }

 public machine getmachine()
 {
 return machine;
 }

 public void setmachine( machine machine )
 {
 this.machine = machine;
 }

 public void selectProductAndInsertMoney( int amount, String productName )
 {
	 machine.selectProductAndInsertMoney(amount, productName);
	 machine Moneyinserted = new Moneyinserted();
 
 if( machine instanceof Nomoneyinserted )
 {
 setmachine(Moneyinserted);
 System.out.println("VendingMachine now has: "
                 + machine.getClass().getName());
 }

 }

 
 public void dispenseProduct()
 {
	 machine Nomoneyinserted = new Nomoneyinserted();
 machine.dispenseProduct();

 
 if( machine instanceof Moneyinserted )
 {
	 setmachine(Nomoneyinserted);
	 System.out.println("VendingMachine now has : "
	                 + machine.getClass().getName());
 }

 }

}