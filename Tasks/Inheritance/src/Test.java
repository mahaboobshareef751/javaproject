public class Test {
public static void main(String[] args) {
	CreditCard cc=new CreditCard();
	cc.bankName="SBI";
	cc.CardNumber="34411178281";
	cc.cvv=822;
	cc.expDate="23/26";
	cc.creditLimit=380000;
	cc.swipe();
	cc.withdraw();
	
	
}
}
