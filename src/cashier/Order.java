package cashier;

public class Order {
	private int position;
	private long stockCode;
	private int quantity;
	
	
	/**
	 * @param position
	 * @param stockCode
	 * @param quantity
	 */
	public Order(int position, long stockCode, int quantity) {
		super();
		this.position = position;
		this.stockCode = stockCode;
		this.quantity = quantity;
	}
	
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}



	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}



	/**
	 * @return the stockCode
	 */
	public long getStockCode() {
		return stockCode;
	}



	/**
	 * @param stockCode the stockCode to set
	 */
	public void setStockCode(long stockCode) {
		this.stockCode = stockCode;
	}



	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [position=").append(position)
				.append(", Code=").append(stockCode).append(", quantity=")
				.append(quantity).append("]");
		return builder.toString();
	}
	
}
