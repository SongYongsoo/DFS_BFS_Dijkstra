package DM;

import java.io.*;
import java.util.*;

public class ReadFile {
//	LinkedList<String> 
	

	public void read() throws FileNotFoundException, IOException {
//		File file = new File("input.txt");
//		Scanner filescan = new Scanner(file);

		FileReader reader = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(reader);
		String line = "";
		int row = 0, i;
		int[][] aList = new int[10][10];

		while ((line = br.readLine()) != null) {
			String[] token = line.split(" ");
			for (i = 0; i < 10; i++) {
				aList[row][i] = Integer.parseInt(token[i]);
			}
			for (i = 0; i < 10; i++) {
				System.out.print(aList[row][i] + " ");
				System.out.println();
				row++;
			}
		}
		br.close();

//		
//		
//		int row = 0, col = 0;
////		int size;
////		int lineNum;
//		int Src;
//		int Dst;
//		int dist;
//
//		while (filescan.hasNextLine()) {
//			++row;
//			scan = new Scanner(filescan.nextLine());
//			while (scan.hasNext()) {
//				++col;
//			}
//		}
//		String aList[][];
//		int bList[][];
//		filescan = new Scanner(new File("input.txt"));
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; i < col; j++) {
//				if (filescan.hasNextInt()) {
////					aList[i][j] = filescan.nextInt();
//
//				}
//			}
//		}
//
	}

}
