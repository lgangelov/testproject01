package cashier;

import java.util.LinkedList;
import java.util.ListIterator;

public class Bond {
	private long bondId;
	private String date;
	public LinkedList<Order> orderList = new LinkedList<>();
	
	
	/**
	 * 
	 */
	public Bond() {
		bondId = 0;
		date = "01/01/1985";
	}

	/**
	 * @param bondId
	 * @param date
	 * @param orderList
	 */
	public Bond(long bondId, String date, LinkedList<Order> orderLst) {
		super();
		this.bondId = bondId;
		this.date = date;
		orderList = orderLst;
	}
	
	/**
	 * @return the bondId
	 */
	public long getBondId() {
		return bondId;
	}

	/**
	 * @param bondId the bondId to set
	 */
	public void setBondId(long bondId) {
		this.bondId = bondId;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the orderList
	 */
	public LinkedList<Order> getOrderList() {
		return orderList;
	}

	/**
	 * @param orderList the orderList to set
	 */
	public void setOrderList(LinkedList<Order> orderList) {
		this.orderList = orderList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bond [Id=").append(bondId).append(", date=")
				.append(date);
		ListIterator<Order> lit = orderList.listIterator();
		while(lit.hasNext()) {
			Order currOrder = lit.next();
			int ind = lit.nextIndex();
			builder.append(", Order "+ ind + ": ").append(currOrder);
		}
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p2 = new Product(1234, "Sirene", 7.50);
		Product p3 = new Product(1235, "Domati", 4.25);
		Order ord = new Order(1, p2.getStockCode(), 5);
		Order ord2 = new Order(2, p3.getStockCode(), 2);
		LinkedList<Order> orderLst = new LinkedList<>();
		orderLst.add(ord);
		orderLst.add(ord2);
		Bond bnd = new Bond(4321, "11/10/2014", orderLst);
		System.out.println(bnd);

	}

}
