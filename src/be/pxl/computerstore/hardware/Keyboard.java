package be.pxl.computerstore.hardware;

public class Keyboard  extends Peripheral{
	
	private String keyboardLayout ;

	public Keyboard(String vendor, String name, double price, String keyboardLayout) {
		super(vendor, name, price);
		this.keyboardLayout = keyboardLayout;
	}

	public String getKeyboardLayout() {
		return keyboardLayout;
	}

}
