package com.leucaruth.primerejemplo;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	public static void main(String[] args) {
		Alumno alumnoA = new Alumno("Pepe",20);
			Asignatura asignaturaA = new Asignatura("Lengua",7.0,7);
			Asignatura asignaturaB = new Asignatura("Mates",5.0,10);
			Asignatura asignaturaC = new Asignatura("Ciencias",10.0,4);
			alumnoA.addAsignatura(asignaturaA);
			alumnoA.addAsignatura(asignaturaB);
			alumnoA.addAsignatura(asignaturaC);
		listaAlumnos.add(alumnoA);
		
		
		Alumno alumnoB = new Alumno("Antonio", 19);
			Asignatura asignaturaD = new Asignatura("Lengua",7.0,2);
			Asignatura asignaturaE = new Asignatura("Historia",5.0,5);
			Asignatura asignaturaF = new Asignatura("Educacion Fisica",2.0,10);
			alumnoB.addAsignatura(asignaturaD);
			alumnoB.addAsignatura(asignaturaE);
			alumnoB.addAsignatura(asignaturaF);
		listaAlumnos.add(alumnoB);
		
		int contador=0;
		double notaMediaTodosLosAlumnos=0.0;
		for(Alumno alumno: listaAlumnos) {
			System.out.println("########### Alumno " + contador + " ##########");
			System.out.println("Nombre Alumno: " + alumno.getNombre());
			System.out.println("Edad Alumno: " + alumno.getEdad());
			ArrayList<Asignatura> listaAsignaturas = alumno.getListaAsignaturas();
			System.out.println("Asignaturas: ");
			for(Asignatura asignatura: listaAsignaturas) {
				System.out.println("  -" + asignatura.toString());
			}
			System.out.println("Nota media: " + alumno.calcularMedia());
			notaMediaTodosLosAlumnos+=alumno.calcularMedia();
			
			contador++;
			System.out.println();
		}
		double media =notaMediaTodosLosAlumnos/listaAlumnos.size();
		
		System.out.println("La nota media de todos los alumnos es " + media);
	}

}
