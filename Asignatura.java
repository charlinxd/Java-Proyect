package com.leucaruth.primerejemplo;

public class Asignatura {
	private String nombre;
	private double nota;
	private int horasSemanales;
	
	public Asignatura(String nombre, double nota, int horasSemanales) {
		this.nombre = nombre;
		this.nota = nota;
		this.horasSemanales = horasSemanales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Nota: " + nota + " horas: " + horasSemanales;
	}
}
