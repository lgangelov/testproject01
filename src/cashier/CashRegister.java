package cashier;

import java.util.LinkedList;
import java.util.ListIterator;

public class CashRegister {
	private double sum;
	private String firm;
	public LinkedList<Product> listProducts = new LinkedList<>();
	
	public void initialize() {
		Product p1 = new Product(1233, "Krushi", 6.90);
		Product p2 = new Product(1234, "Sirene", 7.50);
		Product p3 = new Product(1235, "Domati", 4.25);
		listProducts.add(p1);
		listProducts.add(p2);
		listProducts.add(p3);
		firm = "Borsata";
		sum = 0.0;
	}
	
	public Bond newBond(long bondId ,String date ,LinkedList<Order> orderLst) {
		Bond bnd = new Bond(bondId, date, orderLst);
		return bnd;
	}
	
	public Product getProduct(Order ord) {
		long code = ord.getStockCode();
		ListIterator<Product> lit = listProducts.listIterator();
		while(lit.hasNext()) {
			Product prd = lit.next();
			if(prd.getStockCode() == code)
				return prd;
		}
		return null;
	}
	
	public void printBond(Bond bnd) {
		System.out.println("New Bond");
		System.out.println("Dealer: "+ firm);
		System.out.println("Bond numer: " + bnd.getBondId());
		System.out.println("From date: " + bnd.getDate());
		ListIterator<Order> lit = bnd.getOrderList().listIterator();
		while(lit.hasNext()) {
			Order curr = lit.next();
			int pos = lit.nextIndex();
			System.out.print(pos + ": ");
			Product prd = getProduct(curr);
			if(curr == null)
				continue;
			double price = curr.getQuantity()*prd.getStockPrice();
			System.out.println(prd.getStockName() + " " + curr.getQuantity() + "x" + prd.getStockPrice() + "=" + price);
			sum += price;
		}
		System.out.println("Total w/o VAT: " + sum);
		System.out.println("Total inc VAT: " + (sum*1.2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1233, "Krushi", 6.90);
		Product p2 = new Product(1234, "Sirene", 7.50);
		Product p3 = new Product(1235, "Domati", 4.25);
		Order ord = new Order(1, p2.getStockCode(), 5);
		Order ord2 = new Order(2, p3.getStockCode(), 2);
		
		LinkedList<Order> orderLst = new LinkedList<>();
		orderLst.add(ord);
		orderLst.add(ord2);
		Bond bnd = new Bond(4321, "11/10/2014", orderLst);
		CashRegister cr = new CashRegister();
		cr.initialize();
		cr.newBond(bnd.getBondId(), bnd.getDate(), bnd.getOrderList());
		cr.printBond(bnd);
		
		System.out.println("");
		System.out.println("");
		
		orderLst = new LinkedList<>();
		Order ord3 = new Order(1, p1.getStockCode(), 7);
		orderLst.add(ord3);
		bnd = new Bond(412345,"05/09/2014", orderLst);
		cr = new CashRegister();
		cr.initialize();
		cr.newBond(bnd.getBondId(), bnd.getDate(), bnd.getOrderList());
		cr.printBond(bnd);
		
		System.out.println("");
		System.out.println("");
		
		orderLst = new LinkedList<>();
		orderLst.add(ord);
		orderLst.add(ord2);
		orderLst.add(ord3);
		bnd = new Bond(12234453,"05/11/2014", orderLst);
		cr = new CashRegister();
		cr.initialize();
		cr.newBond(bnd.getBondId(), bnd.getDate(), bnd.getOrderList());
		cr.printBond(bnd);

	}

}
