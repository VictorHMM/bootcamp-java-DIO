package com.dio.bootcampjava.calculator;

public class Calculadora {
	public Calculadora() {}
	
	public static double soma(double nbr1, double nbr2)
	{
		double result = nbr1 + nbr2;
		return result;
	}
	public static double subtrai(double nbr1, double nbr2)
	{
		double result = nbr1 - nbr2;
		return result;
	}
	public static double multiplica(double nbr1, double nbr2)
	{
		double result = nbr1 * nbr2;
		return result;
	}
	public static double divide(double nbr1, double nbr2)
	{
		double result = nbr1 / nbr2;
		return result;
	}
}
