package be.pxl.computerstore.hardware;

public abstract class Peripheral extends BasicComponent {

	public Peripheral(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	
	@Override
	public String getShortDescription() {
		return "" + this.getArticleNumber() + " * " + this.getClass().getSimpleName() +  " * "+ this.getName() + " * " + this.getPrice() +"€";
	}

	
	
	
	
	
	
	

}
