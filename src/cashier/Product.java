package cashier;

public class Product {
	private long stockCode;
	private String stockName;
	private double stockPrice;
	
	/**
	 * 
	 */
	public Product() {
		stockCode = 0;
		stockName = "";
		stockPrice = 0.0;
	}

	/**
	 * @param stockCode
	 * @param stockName
	 * @param stockPrice
	 */
	public Product(long stockCode, String stockName, double stockPrice) {
		super();
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
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
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return the stockPrice
	 */
	public double getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice the stockPrice to set
	 */
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [Code=").append(stockCode)
				.append(", Name=").append(stockName)
				.append(", Price=").append(stockPrice).append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product(1234, "Sirene", 7.50);
		Product p3 = new Product(1235, "Domati", 4.25);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
