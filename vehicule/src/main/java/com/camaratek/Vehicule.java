package com.camaratek;

public class Vehicule {
	private String marque;
	private String couleur;
	private int age;
	
	public Vehicule(){}

	public Vehicule(String marque, String couleur, int age) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.age = age;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
