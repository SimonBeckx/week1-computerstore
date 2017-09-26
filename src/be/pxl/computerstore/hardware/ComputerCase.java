package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends BasicComponent{

	private Dimension dimension ;
	private double weight ;
	
	public ComputerCase(String vendor, String name, double price) {
		super(vendor,name,price);
		dimension = new Dimension(200, 430, 445);
	}
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\\nWidth = " + dimension.getWidth() +"mm" + "\\nHeight = " + dimension.getHeight() + "mm"+
				"\\nDepth = " + dimension.getDepth() + "mm" + "\\nWeight = " + weight + "kg";
	}

	

	
	
	
	

}
