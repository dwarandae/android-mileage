package com.evancharlton.mileage.calculators;

public class LitresMilesToKilometersCalculationEngine extends MetricCalculationEngine {
	@Override
	public double calculateEconomy(double distance, double fuel) {
		distance = milesToKM(distance);
		return super.calculateEconomy(distance, fuel);
	}

	@Override
	public String getDistanceUnits() {
		return " Miles";
	}

	@Override
	public String getDistanceUnitsAbbr() {
		return " Mi";
	}

	public String help() {
		return "This system expects:\n fuel: litres\n odometer: miles\n economy: litres / 100 km";
	}
}
