package com.howtoprogram.junit5.responsabilities;

public class LollipopImpl implements ICandyMachine{

	private ICandyMachine chain;
	private double price = 1;
	
	@Override
	public void setNextChange(ICandyMachine nextChain) {
		this.chain = nextChain;		
	}

	@Override
	public void dispense(ProductosMachine productosMachine) {
		
		GansitoImpl gansitoImpl = GansitoImpl.getInstace();
		int contador = gansitoImpl.instancia(productosMachine, this.price);
		productosMachine.setPaletas(contador);
		if(this.chain != null) {
			this.chain.dispense(productosMachine);
		}
		
	}

}
