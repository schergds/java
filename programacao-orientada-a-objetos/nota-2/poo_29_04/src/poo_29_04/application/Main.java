package poo_29_04.application;

import poo_29_04.entities.Pessoa;
import poo_29_04.entities.Programador;

public class Main {

	public static void main(String[] args) {
		Pessoa weber = new Pessoa();
		System.out.println(weber.trabalhar());
		
		Programador scher = new Programador();
		System.out.println(scher.trabalhar());
		
		System.out.println(scher.dizerOla());
		System.out.println(scher.dizerOla("Scher"));
	}
}
