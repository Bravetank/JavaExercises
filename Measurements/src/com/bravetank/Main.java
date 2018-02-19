package com.bravetank;

public class Main {

    public static void main(String[] args) {
	Measurements measurements = new Measurements(5, 80, 4);
        System.out.printf("The height is %d, the weight is %d, the depth is %d",
                measurements. getHeight(), measurements.getWeight(),
                measurements.getDepth());
    }
}
