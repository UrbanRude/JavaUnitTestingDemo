package com.howtoprogram.junit5.responsabilities;

public class NitoImpl implements ICandyMachine {

	private ICandyMachine chain;
	private double price = 11;
	
	@Override
	public void setNextChange(ICandyMachine nextChain) {
		this.chain = nextChain;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense(ProductosMachine productosMachine) {

		GansitoImpl gansitoImpl = GansitoImpl.getInstace();
		int contador = gansitoImpl.instancia(productosMachine, this.price);
		productosMachine.setNitos(contador);
		if(this.chain != null) {
			this.chain.dispense(productosMachine);
		}
		
	}

}
