package i2.logic;

public class LineItem {
	private String itemName;
	private double itemPricePerUnit;
	private int quantity;
	private double subtotal;
	
	public LineItem(String itemName,double itemPricePerUnit,int quantity, double subtotal) {
		super();
		this.itemName=itemName;
		this.itemPricePerUnit=itemPricePerUnit;
		this.quantity=quantity;
		
	}

	public LineItem(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public double ComputeSubtotal() {
		subtotal=itemPricePerUnit*quantity;
		return subtotal;
	}
}
