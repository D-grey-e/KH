package edu.kh.note.book;

public class Block {

	public void block() {

		for (int y = 0; y < 50; y++) { // 50줄
			for (int x = 0; x < 80; x++) { // 80칸
				if (x == 0 || x == 79 || y == 0 || y == 49 ) {
					System.out.print("_");
				}
				if (x > 0 && x <79) {

					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}