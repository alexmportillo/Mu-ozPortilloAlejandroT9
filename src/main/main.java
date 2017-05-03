package main;
import java.util.ArrayList;
import java.util.Queue;

import exceptions.*;
import models.*;
import models.MiLista;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lista = new MiLista <Integer>(
(Integer a, Integer b) -> a-b
);
		Queue<Integer> ListaCola = new ListaOrdenada<Integer>(
				(Integer a, Integer b) -> a-b
				);
		lista.add(1);	
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		
		try {
			lista.add(11);
			}catch (Exception e){
				System.out.println(e);
			}
		try {
			lista.add(11, 11);
			}catch (Exception e){
				System.out.println(e);
			}
		try {
			lista.add(1, 11);
			}catch (Exception e){
				System.out.println(e);
			}
		System.out.println(lista.size());	
		try {
			lista.clear();
			}catch (Exception e){
				System.out.println(e);
			}	
		System.out.println(lista.size());
		ListaCola.add(1);
		ListaCola.add(2);
		ListaCola.add(3);
		ListaCola.add(4);
		ListaCola.add(5);
		ListaCola.add(6);
		ListaCola.add(7);
		ListaCola.add(8);
		ListaCola.add(9);
		ListaCola.add(10);
		try {
			ListaCola.add(11);
		}catch (Exception e){
			System.out.println(e);
		}
		try {
			ListaCola.add(12);
			}catch (Exception e){
				System.out.println(e);
			}	
		System.out.println(ListaCola.size());
		}
	}
