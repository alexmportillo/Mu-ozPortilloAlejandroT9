package test;
import org.junit.Before;
import org.junit.Test;
import exceptions.*;
import models.*;

public class ListaOrdenadaTest {
	private  ListaOrdenada<Integer> c;

	@Test
	public void AddSuccess() {
		assert (c.add(100));
	}

	@Test
	public void AddFail() {
		for (int i = 0; i < 100; i++) {
			c.add(i);
		}
		try {
			c.add(10);
		} catch (ListSizeOverflownException e) {
			assert (c.size() == 101);
			assert (!c.contains(101));
		}
	}

	@Before
	public void Setup() {
		c = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);
	}

}