package models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import models.*;
public class MiLista<T> extends ArrayList<T>  {

	private Comparator <T>comp;
	
	// constructor
	public MiLista(Comparator<T> comp) {

		this.comp = comp;
	}

	
}
