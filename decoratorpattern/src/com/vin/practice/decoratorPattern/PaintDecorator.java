package com.vin.practice.decoratorPattern;

public class PaintDecorator implements PaintCar {
	
	private PaintCar paintcar;
	
	
	public PaintDecorator(PaintCar paintcar) {
		this.paintcar = paintcar;
	}


	@Override
	public void doPaintJob() {
		paintcar.doPaintJob();
	}

}
