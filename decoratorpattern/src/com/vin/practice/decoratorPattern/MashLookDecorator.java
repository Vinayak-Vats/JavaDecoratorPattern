package com.vin.practice.decoratorPattern;

public class MashLookDecorator extends PaintDecorator {

	public MashLookDecorator(PaintCar paintcar) {
		super(paintcar);
	}
	
	
	public void doPaintJob() {
		super.doPaintJob();
		System.out.println("adding Mash finish to job");
	}

}
