package com.vin.practice.decoratorPattern;

public class RunPaintJob {

	public static void main(String[] args) {
		PaintCar paint = new MashLookDecorator(new MetalFinishDecorator(new DefaultPaint()));
		paint.doPaintJob();
	}

}
