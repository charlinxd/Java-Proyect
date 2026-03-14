package com.leucaruth.primerejemplo;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private int edad;
	private ArrayList<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		Asignatura programacion = new Asignatura("Programacion", 0, 7);
		listaAsignaturas.add(programacion);
	}
	
	public void addAsignatura(Asignatura asignatura) {
		listaAsignaturas.add(asignatura);
	}
	
	public double calcularMedia() {
		double sumaNotas=0.0;
		for(Asignatura a: listaAsignaturas) {
			sumaNotas+= a.getNota();
		}
		double media =sumaNotas/listaAsignaturas.size();
		
		return media;
	}
	
	private String getNombresAsignaturas() {
		String nombresAsignaturas = "";
		for(Asignatura a: listaAsignaturas) {
			nombresAsignaturas+= a.getNombre() + ", ";
		}
		
		return nombresAsignaturas;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", edad: " + this.edad + ", asignaturas: " + getNombresAsignaturas();
	}
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public ArrayList<Asignatura> getListaAsignaturas(){
		return this.listaAsignaturas;
	}
	
	public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}
	
	

}
