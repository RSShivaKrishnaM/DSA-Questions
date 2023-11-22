package matrices.others;

public class ChessBoard {
	/*
	 * Given N, where 1 <= N <= 10000. Output a chess board pattern like if N = 5
	 * WBWBW BWBWB WBWBW BWBWB WBWBW
	 */
	public static void main(String[] args) {
		Character[][] res = genrateChessBoard(5);
		int N = 5;
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j <N; j++) {
				System.out.print(res[i][j] +" "); 
			}
			System.out.println();
		}
		System.out.println();
	}

	private static Character[][] genrateChessBoard(int N) {
		Character[][] chessBoard = new Character[N][N];
		// Assuming first row will start with W
		chessBoard[0][0] = 'W';
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < N; j++) {
				if (chessBoard[i - 1][j - 1] == 'W') {
					chessBoard[i - 1][j] = 'B';
				} else {
					chessBoard[i - 1][j] = 'W';
				}

				if (chessBoard[i - 1][j - 1] == 'W') {
					chessBoard[i][j-1] = 'B';
				} else {
					chessBoard[i][j-1] = 'W';
				}
			}
		}
		return chessBoard;
	}
}
