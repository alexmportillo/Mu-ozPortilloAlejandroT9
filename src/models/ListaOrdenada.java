package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

import exceptions.ElementNotAllowedException;
import exceptions.ListSizeOverflownException;

public class ListaOrdenada<E> extends PriorityQueue<E> {
private final byte MAX_SIZE = 100;
 /*Lo he probado con 10 numeros y salta la excepcion*/
//private final byte MAX_SIZE=10;

public ListaOrdenada(Comparator <E>comp) {
	super(comp);
}

@Override
public boolean add(E element) throws  ElementNotAllowedException,ListSizeOverflownException, NullPointerException {
	if (element != null) {
		if (this.size() <= MAX_SIZE) {
			return super.add(element);
		} else {
			throw new  ListSizeOverflownException("La cola está llena!");
		}
	} else {
		throw new ElementNotAllowedException("No acepto valores null!");
	}
}


@Override
public boolean addAll(Collection<? extends E> collection) throws ListSizeOverflownException, NullPointerException {
	if(collection.size()+this.size() <= MAX_SIZE) {
		return super.addAll(collection);
	} else {
		throw new ListSizeOverflownException("La cola está llena!");
	}
}
}


