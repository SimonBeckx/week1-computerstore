package be.pxl.computerstore.hardware;

import java.util.Random;


public class BasicComponent {
	

	private String vendor = "";
	private String name = "";
	private double price ;
	private String articleNumber = "";
	private Random rand = new Random();;
	
	public BasicComponent(String vendor, String name, double price) {
		super();
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		
		setArticleNumber();
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	private void setArticleNumber() {
		String temp = "";
		String tempor = "";
		int getal;
		int lengte = vendor.length();		//lengte van de vendor
		int random = rand.nextInt(99999);	//random getal van 0 tot 99999
		
		//eerste 3 leters (+ een X indien nodig )
		if(lengte < 3) {
			temp += vendor.toUpperCase();
			for (int i = lengte; i < 3; i++) {
				temp = temp.concat("X");
			}
		}else {
			temp += vendor.substring(0,3).toUpperCase();
		}
		
		// toeveoegen van een - 
		temp += "-";
		
		//
		tempor += random;    // random getal naar een string 
		lengte = tempor.length(); //lengte van het getal.
		
		if(lengte < 2) {
			temp.concat("0000");
		}else if(lengte < 3) {
			temp.concat("000");
		}else if (lengte < 4) {
			temp.concat("00");
		}else if(lengte < 5){
			temp.concat("0");
		}
			temp += tempor;
			
			//toevoegen van een - 
			temp += "-";
			
			// laatste 3 getallen ( geen nullen )
			for (int i = 0; i < 3; i++) {
				getal = rand.nextInt(9) + 1;
				temp += getal;
			}
		this.articleNumber = temp;
	}
	
	public String toString() {
		
		return "ArticleNumber = " +articleNumber + "\\nVendor = " + vendor + "\\nName = " + name + 
				"\\nPrice = " + price ;
		
		/*
		System.out.println("Artiekelnummer = " +articleNumber);
		System.out.println("Vendor = " + vendor );
		System.out.println("Name = " + name);
		System.out.println("Price = " + price);
		*/
	}
	
	
	public String getShortDescription() {
		return "" + this.getArticleNumber() + " * " + this.getName() + " * " + this.getPrice() +"€";
	}
	
	
	
	
	

}
