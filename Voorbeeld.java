class Voorbeeld{
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(args[2]);
		Bank ing;
		ing = new Bank();
		ing.naam = "ABN-AMRO";
		Bank tweedeBank = new Bank();
		tweedeBank.naam = "Triodos";
		System.out.println(ing.balans);
		Bank.balans = 14;
		System.out.println(ing.balans);
	}
}
class Bank{
	String naam = "ING";
	static int balans;

}




