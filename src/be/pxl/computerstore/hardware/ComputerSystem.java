package be.pxl.computerstore.hardware;

import java.util.ArrayList;

import be.pxl.computerstore.util.Computable;

public class ComputerSystem implements Computable{
	
	private Processor processor;
	private ComputerCase computerCase;
	private ArrayList<Peripheral> randapparaten = new ArrayList<Peripheral>();
	private int count = 0;
	
	public ComputerSystem() {
		
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}
	
	public void addPeripheral(Peripheral pheripheral) throws TooManyPeripheralsException
	{
		if (count <= 2) {
			randapparaten.add(pheripheral);
			
			count ++;
		}else {
		    throw new TooManyPeripheralsException();
		}
	}
	
	public void removePeripheral(String artiekelNumber) {
		
		for (int i = 0 ; i < randapparaten.size(); i++) {
			Peripheral test = randapparaten.get(i);
			if (test.getArticleNumber().equals(artiekelNumber)) {
				randapparaten.remove(i);
				count--;
			}else {
				System.out.println("Geen overeenkomsten");
			}
			
		}
	}
	
	public int getNumberOfPeripherals() {
		return count;
	}

	@Override
	public double totalPriceIncl() {
		double totaal = totalPriceExcl();
		
		totaal = totaal + ((totaal/100)*BTW);
		
		return totaal;
		
	}

	@Override
	public double totalPriceExcl() {
		double totaal = 0;
		
		totaal += processor.getPrice();
		totaal += computerCase.getPrice();
		
		for (Peripheral peripheral : randapparaten) {
			totaal += peripheral.getPrice();
		}
		
		return totaal;
	}
	
	
	

}
