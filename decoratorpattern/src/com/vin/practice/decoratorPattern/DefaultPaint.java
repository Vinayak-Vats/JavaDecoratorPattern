package com.vin.practice.decoratorPattern;

public class DefaultPaint implements PaintCar {

	@Override
	public void doPaintJob() {
		System.out.println("Car Painted Black");
	}

}
