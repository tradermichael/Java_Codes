import java.util.Scanner;

public class WhackAMole {
	
	int score, molesLeft, attempts, gridDimension, numAttempts;
	char[][] moleGrid;
	
	WhackAMole(int numAttempts, int gridDim){
		this.gridDim= gridDim;
		this.score = 0;
		this.molesLeft = 0;
		this.attempts = numAttempts;
		this.numAttempts = 0;
		this.moleGrid = new char[gridDim][gridDim];
		for (int i = 0; i < gridDim; i++)
			for (int j =0; j < gridDim; j++)
				moleGrid[i][j] = '*';
	}
	
	boolean place(int x, int y){
		if (this.moleGrid[x][y] != '*'){
			this.moleGrid[x][y] = 'M';
			this.molesLeft += 1;
			return true;
		}
		else
			return false;
	}
	
	void whack(int x, int y){
		if (this.moleGrid[x][y] != 'M')
			this.numAttempts += 1;
		else if (this.moleGrid[x][y] == 'M'){
			this.score += 1;
			this.moleGrid[x][y] = 'W';
			this.molesLeft -= 1;
		}
	}
	
	void printGridToUser(){
		for (int i = 0; i < this.gridDim; i++){
			for (int j =0; j < this.gridDim; j++){
				if (moleGrid[i][j] == 'W')
					System.out.print('You got the mole!');
				else
					System.out.print('Empty!');
			}
			System.out.println();
		}
	}
	
	void printGrid(){
		for (int i = 0; i < this.gridDim; i++){
			for (int j =0; j < this.gridDim; j++){
				if (moleGrid[i][j] == 'W')
					System.out.print('W');
				else if (moleGrid[i][j] == 'M')
					System.out.print('M');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int numAttempts = 50;
		int gridDim = 10;
		int numMoles = 10;
		
		WhackAMole grid = new WhackAMole(numAttempts, gridDim);
		
		System.out.print('x');
		System.out.print("   ");
		System.out.println('y');
		
		for (int i = 0; i < numMoles; ){
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			if (grid.place(a, b)){
				i++;
				System.out.print(a);
				System.out.print("   ");
				System.out.println(b);
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while((grid.attempts != grid.numAttempts) && (grid.molesLeft != 0)){
			
			grid.printGridToUser();
			System.out.print("Enter x: ");
			int x = scanner.nextInt();
			System.out.print("Enter y: ");
			int y = scanner.nextInt();
			
			grid.whack(x, y);
			
			if ((x == -1) && (y == -1)){
				System.out.println("Awh man, looks like you've given up.");
				grid.printGrid();
				break;
			}	
		}	
		
		if (grid.attempts == grid.numAttempts)
			System.out.println("Sorry, this is the end!");
		else if (grid.molesLeft == 0)
			System.out.println("You've won! I smell a winner");
	}
}
