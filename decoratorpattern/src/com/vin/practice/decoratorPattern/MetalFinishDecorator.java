package com.vin.practice.decoratorPattern;

public class MetalFinishDecorator extends PaintDecorator {

	public MetalFinishDecorator(PaintCar paintcar) {
		super(paintcar);
	}

	public void doPaintJob() {
		super.doPaintJob();
		System.out.println("adding metal finish to job");
	}

}
