package xtra.reflectionTest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		
		Board board = new Board(30, 90, "wood");
		Field[] boardFields = board.getClass().getDeclaredFields();
		
		System.out.println(board.getMaterial());
		
		for (Field f: boardFields) {
			System.out.println(f.getName());
			if (f.getName().equals("material")) {
				f.setAccessible(true);
				try {
					f.set(board, "vinil");
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(board.getMaterial());
		
		Method[] boardMethods = board.getClass().getDeclaredMethods();
		
		for (Method m: boardMethods) {
			//System.out.println(m.getName());
			if (m.getName().equals("getMaterial")) {
				try {
					System.out.println(m.invoke(board));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				//System.out.println(board.getMaterial());
			}
		}
	}

}
