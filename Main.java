package sudoku;

import java.util.*;




public class Main {

	public static void main(String[] args) {



		//int[][] board = {{7, 8, 0, 4, 0, 0, 1, 2, 0},{6, 0, 0, 0, 7, 5, 0, 0, 9},{0, 0, 0, 6, 0, 1, 0, 7, 8},{0, 0, 7, 0, 4, 0, 2, 6, 0},{0, 0, 1, 0, 5, 0, 9, 3, 0},{9, 0, 4, 0, 6, 0, 0, 0, 5},{0, 7, 0, 3, 0, 0, 0, 1, 2},{1, 2, 0, 0, 0, 7, 4, 0, 0},{0, 4, 9, 2, 0, 6, 0, 0, 7}};
		//int[][] board2 = {{7, 8, 0, 4, 0, 0, 1, 2, 0},{6, 0, 0, 0, 7, 5, 0, 0, 9},{0, 0, 0, 6, 0, 1, 0, 7, 8},{0, 0, 7, 0, 4, 0, 2, 6, 0},{0, 0, 1, 0, 5, 0, 9, 3, 0},{9, 0, 4, 0, 6, 0, 0, 0, 5},{0, 7, 0, 3, 0, 0, 0, 1, 2},{1, 2, 0, 0, 0, 7, 4, 0, 0},{0, 4, 9, 2, 0, 6, 0, 0, 7}};

		//int[][] board1 = {{9, 0, 6, 0, 7, 0, 4, 0, 3}, {0, 0, 0, 4, 0, 0, 2, 0, 0}, {0, 7, 0, 0, 2, 3, 0, 1, 0 }, {5, 0, 0, 0, 0,0, 1, 0, 0}, {0, 4, 0, 2, 0, 8, 0, 6, 0}, {0, 0, 3, 0, 0, 0,0,0,5}, {0, 3, 0, 7, 0, 0, 0, 5, 0}, {0,0,7,0,0,5,0,0,0}, {4,0,5,0,1,0,7,0,8}};
		//int[][] board2 = {{9, 0, 6, 0, 7, 0, 4, 0, 3}, {0, 0, 0, 4, 0, 0, 2, 0, 0}, {0, 7, 0, 0, 2, 3, 0, 1, 0 }, {5, 0, 0, 0, 0,0, 1, 0, 0}, {0, 4, 0, 2, 0, 8, 0, 6, 0}, {0, 0, 3, 0, 0, 0,0,0,5}, {0, 3, 0, 7, 0, 0, 0, 5, 0}, {0,0,7,0,0,5,0,0,0}, {4,0,5,0,1,0,7,0,8}};
		// bu sudoku'nun birden fazla çözümü var

		// int[][] createdBoard = {{5,0,7,0,0,0,0,0,4}, {0,0,0,0,0,0,6,0,0}, {8,0,0,5,6,2,1,0,7}, {7,0,4,0,0,0,3,2,0}, {0,0,0,0,1,0,0,0,0}, {0,0,9,7,2,8,0,6,0}, {3,0,5,0,0,9,0,0,8}, {4,0,1,0,0,0,0,5,0}, {0,0,0,0,0,5,0,0,0,}};
		// int[][] createdBoard2 = {{5,0,7,0,0,0,0,0,4}, {0,0,0,0,0,0,6,0,0}, {8,0,0,5,6,2,1,0,7}, {7,0,4,0,0,0,3,2,0}, {0,0,0,0,1,0,0,0,0}, {0,0,9,7,2,8,0,6,0}, {3,0,5,0,0,9,0,0,8}, {4,0,1,0,0,0,0,5,0}, {0,0,0,0,0,5,0,0,0,}};

		//int[][] board = {{0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
		//int[][] board2 = {{0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
		// bunun da birden fazla çözümü var

		/*
		MultiSolution sudoku = new MultiSolution(board);
		MultiSolution sudoku2 = new MultiSolution(board);


		int[][] newBoard = sudoku.getBoard();
		//int[][] initialBoard = sudoku.getUntouchedBoard();
		sudoku.printBoard(newBoard);
		sudoku.solve();
		System.out.println("######################");
		sudoku.printBoard(newBoard);
		//sudoku.solveV2();
		System.out.println("######################");
		//sudoku.printBoard(initialBoard);
		sudokuV2.printBoard(board);
		 */

		//Sudoku sudoku = new Sudoku(board);
		//int[][] sudokuInit = copyBoard(board1);
		//Sudoku sudoku2 = new Sudoku(board2);
		//int[][] sudokuInit2 = copyBoard(board2);

		//System.out.println(hasUniqueSolution(sudoku, sudoku2));

		/*
		printBoardForArray(board1);
		solveForArray(board1);


		System.out.println("######################");

		printBoardForArray(board1);

		System.out.println("######################");

		printBoardForArray(board2);
		System.out.println("######################");
		solveForArray(board2);
		printBoardForArray(board2);*/

		//System.out.println(hasUniqueSolution(sudoku, sudoku2));
		//System.out.println(hasUniqueSolutionForArray(sudokuInit, sudokuInit2));

		// sonuçlarý farklý da olsa ayný da olsa false gösteriyor bunu çözmem lazým 
		// yarýn yapýlacaklar => boþ bir sudoku array'inin random bir yerine random bir sayý ekle (gene backtracking'le eklemelisin ki 
		// kilitlenmiþ olma) ama burda her sayý koyduðunda güncel sudoku'nun birden fazla çözümü olup olmadýðýný kontrol ediyorsun ve
		// ilk kez, tek çözüm olan halini bir puzzle olarak kullanýyorsun

		int[][] filledSudoku = copyBoard(emptyBoard);
		int[][] filledSudoku2 = copyBoard(emptyBoard);

		//System.out.println(hasUniqueSolutionForArray(board1, board2));
		//solveForArray(board1);
		//printBoardForArray(board1);

		//solveForArray(createdBoard);
		//printBoardForArray(createdBoard);

		randomSolverForArray(filledSudoku);
	//	randomSolverForArray(filledSudoku2);
		/////////////////////////////////////////
		createSudoku(filledSudoku, filledSudoku2);
		filledSudoku2 = copyBoard(filledSudoku);
		printBoardForArray(filledSudoku);
		
		solveForArray(filledSudoku);
		solve2ForArray(filledSudoku2);
		printBoardForArray(filledSudoku);
		printBoardForArray(filledSudoku2);
		/*		randomSolverForArray(filledSudoku);
		printBoardForArray(filledSudoku);
		
		//printBoardForArray(filledSudoku);
		solveForArray(filledSudoku);
		printBoardForArray(filledSudoku);
		
	//	printBoardForArray(filledSudoku);
		solve2ForArray(filledSudoku);
		printBoardForArray(filledSudoku);
		
		printBoardForArray(filledSudoku2);
		solve2ForArray(filledSudoku2);
		printBoardForArray(filledSudoku2);*/
		//////////////////////////////////////
	}

	public static boolean hasUniqueSolutionForArray(int[][] sudokuInit, int[][]sudokuInit2) { 
		///////////public static boolean hasUniqueSolution(Sudoku sudoku1, Sudoku sudoku2) { 
		// this method takes 2 sudokus which are identical, then solves each one with different methods.
		// I have written these methods such that if there is more than 1 possible answer the solutions will be different.
		// Also because of the solveForArray method if there exist no such solution then we return the array we have started with.

		// Using those 2 cases we can say that sudoku has a unique solution if two different solutions are same and initial sudoku is not equa to the solution


		// solves another object with same values therefore, original sudokus do not get changed
		int[][] s1 = copyBoard(sudokuInit);
		int[][] s2 = copyBoard(sudokuInit2);

		//Sudoku s1 = new Sudoku(sudoku1);
		//Sudoku s2 = new Sudoku(sudoku2);

		solveForArray(s1);
		solve2ForArray(s2);

		if (Arrays.deepEquals(s1, s2) && !Arrays.deepEquals(s1, sudokuInit)) { // since they are identical we say that there is a unique solution
			return true;
		}
		return false;
	}

	static int[][] emptyBoard = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};

	public static boolean randomSolverWithoutASpesificNumberAndPosition(int[][] board, int[] numRowCol) { // bu method belli  bir cell için o sayýsýyý kullanamýyor olmalý!!!!!!!!!!!
		int[] find = findEmptyForArray(board); // boþ olan kare'nin (row, col) þeklinde adresini verdik

		int[][] trialBoard = copyBoard(board);
		
		if(find == null) { // eðer boþ yer yoksa sudoku çözülmüþtür ve find variable'ýmýz null'dýr diyip bu durumda sudoku'yu çözdük anlamýnda true return'ledik
			return true;
		}
		/**/	List<Integer> pos = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++) {
		/*	if(noUse != i) {
				pos.add(i);	
			}*/
			pos.add(i);
		}
		Collections.shuffle(pos); // with upper 4-5 lines I have created an array taht consists of 1,2...9 and then shuffle them so that my algoritym tries randomly numbers

		for(int num = 1; num < 10; num++) { // burda num sudokunda deneyeceðimiz sayýlar olduklarý için 1'den 9'a kadar gidiyor
			// bu spesifik bir sayýyý kullanmadýðý için array'in boyu küçülecek o yüzden num < 9
			if(isValidForArray(trialBoard, pos.get(num - 1), find[0], find[1])) { // koyduðumuz sayý kurallara uyuyor mu diye kontrol ettik
				if(!(pos.get(num - 1) == numRowCol[0] && find[0] == numRowCol[1] && find[1] == numRowCol[2])) {
					trialBoard[find[0]][find[1]] = pos.get(num - 1); // sayýyý yerleþtirdik
					if(randomSolverWithoutASpesificNumberAndPosition(trialBoard, numRowCol)) { // method'u tekrardan çaðýrdýk 
						return true; // sonraki yer için de bir sonuç bulabilirse return true diyerek run'lamaya devam ediyoruz
					}
					trialBoard[find[0]][find[1]] = 0; // eðer hiç bir sayý için 
				}
			}
		}
		return false;
	}

	/*
	 	public static int[] removeRandomlyFromSudoku(int[][] filledSudoku) {
		Random random = new Random();
		int randRow = random.nextInt(9);
		int randCol = random.nextInt(9);
		while(filledSudoku[randRow][randCol] == 0) {
			randRow = random.nextInt(9);
			randCol = random.nextInt(9);
		}
		
		int lastlyRemoved = filledSudoku[randRow][randCol];
		filledSudoku[randRow][randCol] = 0;

		if(randomSolverWithoutASpesificNumber(filledSudoku, lastlyRemoved)) { ///////////// this means that there exist a second solution //bu yanlýþ olabilir düzeltmem gerkebilir
			filledSudoku[randRow][randCol] = lastlyRemoved;
			return null;
		}

		int[] numRowCol = {lastlyRemoved, randRow, randCol};

		return numRowCol;
	}
	
	*/
	
	public static boolean removeRandomlyFromSudoku(int[][] filledSudoku) {
		Random random = new Random();
		int randRow = random.nextInt(9);
		int randCol = random.nextInt(9);
		while(filledSudoku[randRow][randCol] == 0) {
			randRow = random.nextInt(9);
			randCol = random.nextInt(9);
		}
		
		int lastlyRemoved = filledSudoku[randRow][randCol];
		filledSudoku[randRow][randCol] = 0;
		
		int[] numRowCol = {lastlyRemoved, randRow, randCol};

		if(randomSolverWithoutASpesificNumberAndPosition(filledSudoku, numRowCol)) { ///////////// this means that there exist a second solution //bu yanlýþ olabilir düzeltmem gerkebilir
			filledSudoku[randRow][randCol] = lastlyRemoved; // bu engel oluyor olabilir
			return false;
		}

		 //int[] numRowCol = {lastlyRemoved, randRow, randCol};

		return true;
	}
	/*
	public static int[] removeRandomlyFromSudoku(int[][] filledSudoku) {
		Random random = new Random();
		int randRow = random.nextInt(9);
		int randCol = random.nextInt(9);
		while(filledSudoku[randRow][randCol] == 0) {
			randRow = random.nextInt(9);
			randCol = random.nextInt(9);
		}
		
		int lastlyRemoved = filledSudoku[randRow][randCol];
		filledSudoku[randRow][randCol] = 0;
		
		int[] numRowCol = {lastlyRemoved, randRow, randCol};

		if(randomSolverWithoutASpesificNumberAndPosition(filledSudoku, numRowCol)) { ///////////// this means that there exist a second solution //bu yanlýþ olabilir düzeltmem gerkebilir
			filledSudoku[randRow][randCol] = lastlyRemoved;
			return null;
		}

		 //int[] numRowCol = {lastlyRemoved, randRow, randCol};

		return numRowCol;
	}*/
	
	/*public static boolean IsInTheArray(int[][] arr, int targetValue) {
	    for (int[] s: arr) {
	        if (Arrays.deepEquals()) {
	            return true;
	        }
	    }
	    return false;
	}*/

	static int count = 0;
	static int[][] positionsTried = new int[81][2]; // because at most we will have 81 positions
	
	public static boolean createSudoku(int[][] filledSudoku, int[][] filledSudoku2) {
		
		//int[]numRowCol = removeRandomlyFromSudoku(filledSudoku);
		if (removeRandomlyFromSudoku(filledSudoku)) {
			count++;
			createSudoku(filledSudoku, filledSudoku2);
			return true;
		}
		return true;



		/*if(removeRandomlyFromSudoku(filledSudoku) != null) {
			count++;
			if(count >= 64) {
				int counter = 0;
				return true;
			}
			createSudoku(filledSudoku, filledSudoku2);
		}*/


	}

	public static void printBoardForArray(int[][] board) {
		for(int row = 0; row < board.length; row++) {
			if (row % 3 == 0 && row != 0) {
				System.out.println("- - - - - - - - - - - ");
			}
			for(int col = 0; col < board[0].length; col++) {
				if(col % 3 == 0 && col != 0) {
					System.out.print("| ");
				}
				if(col == 8) {
					System.out.println(board[row][col]);
				}else {
					System.out.print(board[row][col] + " ");
				}
			}
		}
		System.out.println("#####################");
	}

	public static int[][] copyBoard(int[][] board) {
		int[][] newArray = new int[9][9];
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[0].length; col++) {
				newArray[row][col] = board[row][col];
			}
		}
		return newArray;
	}

	/* I will randomize the solvers trying pattern*/

	public static boolean randomSolverForArray(int[][] board) {
		int[] find = findEmptyForArray(board); // boþ olan kare'nin (row, col) þeklinde adresini verdik

		if(find == null) { // eðer boþ yer yoksa sudoku çözülmüþtür ve find variable'ýmýz null'dýr diyip bu durumda sudoku'yu çözdük anlamýnda true return'ledik
			return true;
		}
		/**/	List<Integer> pos = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++) {
			pos.add(i);
		}
		Collections.shuffle(pos); // with upper 4-5 lines I have created an array taht consists of 1,2...9 and then shuffle them so that my algoritym tries randomly numbers

		for(int num = 1; num < 10; num++) { // burda num sudokunda deneyeceðimiz sayýlar olduklarý için 1'den 9'a kadar gidiyor
			if(isValidForArray(board, pos.get(num - 1), find[0], find[1])) { // koyduðumuz sayý kurallara uyuyor mu diye kontrol ettik
				board[find[0]][find[1]] = pos.get(num - 1); // sayýyý yerleþtirdik
				if(randomSolverForArray(board)) { // method'u tekrardan çaðýrdýk 
					return true; // sonraki yer için de bir sonuç bulabilirse return true diyerek run'lamaya devam ediyoruz
				}
				board[find[0]][find[1]] = 0; // eðer hiç bir sayý için 
			}
		}
		return false;
	}

	public static boolean solveForArray(int[][] board) { // normal solve()'dan farký bunda sayýlarý denemeye 1'den baþlamaktansa 9'dan baþlýyor 
		// böylece birden fazla çözüm varsa bulabiliriyorum.
		int[] find = findEmptyForArray(board); // boþ olan kare'nin (row, col) þeklinde adresini verdik

		if(find == null) { // eðer boþ yer yoksa sudoku çözülmüþtür ve find variable'ýmýz null'dýr diyip bu durumda sudoku'yu çözdük anlamýnda true return'ledik
			return true;
		}

		for(int num = 1; num < 10; num++) { // burda num sudokunda deneyeceðimiz sayýlar olduklarý için 1'den 9'a kadar gidiyor
			if(isValidForArray(board, num, find[0], find[1])) { // koyduðumuz sayý kurallara uyuyor mu diye kontrol ettik
				board[find[0]][find[1]] = num; // sayýyý yerleþtirdik
				if(solveForArray(board)) { // method'u tekrardan çaðýrdýk 
					return true; // sonraki yer için de bir sonuç bulabilirse return true diyerek run'lamaya devam ediyoruz
				}
				board[find[0]][find[1]] = 0; // eðer hiç bir sayý için 
			}
		}
		return false;
	}
	
	public static boolean solve2ForArray(int[][] board) { // normal solve()'dan farký bunda sayýlarý denemeye 1'den baþlamaktansa 9'dan baþlýyor 
		// böylece birden fazla çözüm varsa bulabiliriyorum.
		int[] find = findEmptyForArray(board); // boþ olan kare'nin (row, col) þeklinde adresini verdik

		if(find == null) { // eðer boþ yer yoksa sudoku çözülmüþtür ve find variable'ýmýz null'dýr diyip bu durumda sudoku'yu çözdük anlamýnda true return'ledik
			return true;
		}

		for(int num = 9; num > 0; num--) { // burda num sudokunda deneyeceðimiz sayýlar olduklarý için 1'den 9'a kadar gidiyor
			if(isValidForArray(board, num, find[0], find[1])) { // koyduðumuz sayý kurallara uyuyor mu diye kontrol ettik
				board[find[0]][find[1]] = num; // sayýyý yerleþtirdik
				if(solve2ForArray(board)) { // method'u tekrardan çaðýrdýk 
					return true; // sonraki yer için de bir sonuç bulabilirse return true diyerek run'lamaya devam ediyoruz
				}
				board[find[0]][find[1]] = 0; // eðer hiç bir sayý için 
			}
		}
		return false;
	}

	public static int[] findEmptyForArray(int[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if(board[row][col] == 0) {
					int[] pos = {row, col};
					return pos;
				}
			}
		}
		return null;
	}

	public static boolean isValidForArray(int[][] board,int num, int currentRow, int currentCol) {
		// þuanki pozisyonumuzdaki column'u kontrol ettik
		for(int row = 0; row < board.length; row++) {
			if(board[row][currentCol] == num && row != currentRow) return false;
		}
		// þuanki pozisyonumuzdaki row'u kontrol ettik
		for(int col = 0; col< board[0].length; col++) {
			if(board[currentRow][col] == num && col != currentCol) return false;
		}
		// þuanki pozisyonumuzdaki alaný 9 alan kareyi kontrol ettik
		int boxX = currentCol / 3; // gives right result because of the integer division
		int boxY = currentRow / 3; // same for the above
		// doðru þekilde o karelþeri dolaþtýk
		for(int row = boxY * 3; row < boxY * 3 + 3; row++) {
			for(int col = boxX * 3; col < boxX * 3 + 3; col++) {
				if(board[row][col] == num && currentRow != row && currentCol != col) return false;
			}
		}
		// herhangi bir þekilde false returnlemediysek bu sayý valid'dir diyip true return'liyoruz.
		return true;
	}



}
