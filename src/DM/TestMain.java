package DM;

import java.util.*;

public class TestMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> path = new LinkedList<>();
		
		//<Src<Dst,dist>> �׷��� ����� Map
		HashMap<Integer,HashMap<Integer,Integer>> GraphMap = new HashMap<>();
		
		//<Dst,dist> GraphMap�� V�� �� ���޿� Map
		HashMap<Integer,Integer> TempMap = new HashMap<>();
		
		//�ִܰŸ� ���ϱ�
		final int M = Integer.MAX_VALUE;
		int[][] G = { { 0, 10, M, 30, 100 }, { M, 0, 50, M, M }, { M, M, 0, M, 10 }, { M, M, 20, 0, 60 },
				{ M, M, M, M, 0 } };
		int s = 0;
		int[] D = G[s].clone();
		boolean[] used = new boolean[G.length];

		for (int n = 0; n < used.length; n++) {
			int minIndex = -1;
			int minVal = M;
			for (int i = 0; i < D.length; i++) {
				if (!used[i] && minVal > D[i]) {
					minIndex = i;
					minVal = D[i];
				}
			}
			used[minIndex] = true;

			for (int i = 0; i < D.length; i++) {
				if (!used[i] && G[minIndex][i] != M && D[i] > D[minIndex] + G[minIndex][i]) {
					D[i] = D[minIndex] + G[minIndex][i];

				}
			}
		}

		System.out.println("������: 1");
		for (int i = 1; i < D.length; i++) {
			System.out.println("���� [" + (i + 1) + "] ���� : " + D[i]);
		}
	}

}
