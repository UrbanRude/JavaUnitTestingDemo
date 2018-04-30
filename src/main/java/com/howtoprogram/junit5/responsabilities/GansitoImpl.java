package com.howtoprogram.junit5.responsabilities;

public class GansitoImpl implements ICandyMachine{
	
	private ICandyMachine chain;
	private double price = 22;
	private static GansitoImpl gansitoImpl;
	
	@Override
	public void setNextChange(ICandyMachine nextChain) {
		this.chain = nextChain;		
	}

	public static GansitoImpl getInstace() {
		if(gansitoImpl != null) {
			gansitoImpl = new GansitoImpl();
		}
		return gansitoImpl;
	}
	
	@Override
	public void dispense(ProductosMachine productosMachine) {
		int contador = this.instancia(productosMachine, this.price);
		productosMachine.setGansitos(contador);
		if(this.chain != null) {
			this.chain.dispense(productosMachine);
		}
	}
	
	public int instancia(ProductosMachine productosMachine,double precie) {
		int contador = 0;
		Double money = productosMachine.getMoney();
		while(money >= price) {
			contador++;
			money -= price;
		}
		productosMachine.setMoney(money);
		return contador;
	}
}
