import java.util.*;
import java.util.Scanner;

// console input and output version of battleship

public class battleship {
	
	static int[][] player_grid = new int[10][10];
	static int[][] opp_grid = new int[10][10];
	static int number_of_hits_on_player = 0;
	static int number_of_hits_on_opp = 0;
	static boolean[] valid_direction_array = new boolean[4];  // Left(0) Up(1) Down(2) Right(3)
	static Scanner scanIn= new Scanner(System.in);
	
        /*
	public static void main(String[] args){
	
		initialize_player_grid();
		initialize_opp_grid();
		play_game();
	
	}
        */
	
	public static void initialize_player_grid(){
		boolean is_size_5_ship_placed = false;
		boolean is_size_4_ship_placed = false;
		boolean is_size_3_1_ship_placed = false;
		boolean is_size_3_2_ship_placed = false;
		boolean is_size_2_ship_placed = false;
		boolean acceptable_input = false;
		boolean all_ships_placed = false;
		int user_input_for_ship_selection = 0;
		
		System.out.println("Welcome to Battleship!");
		System.out.println("This is your board:\n");
		print_console_player_grid();
		
		do{
			acceptable_input = false;
			do{  // reprompt the user if they do not enter an integer between 2 and 5
				try{
					System.out.println("Which ship would you like to place? ");
					System.out.println("The following ships still need to be placed:");
					if(!is_size_5_ship_placed)
						System.out.println("Size 5 ship");
					if(!is_size_4_ship_placed)
						System.out.println("Size 4 ship");
					if(!is_size_3_1_ship_placed)
						System.out.println("Size 3 ship");
					if(!is_size_3_2_ship_placed)
						System.out.println("Size 3 ship");
					if(!is_size_2_ship_placed)
						System.out.println("Size 2 ship");
					System.out.print("Enter the size of the ship you would like to place: ");
					user_input_for_ship_selection = scanIn.nextInt();
					if(user_input_for_ship_selection > 5 || user_input_for_ship_selection < 2){
						System.out.println("Integer was not between 2 and 5");
					}
					else if(user_input_for_ship_selection == 5 && is_size_5_ship_placed){ // user entered 5 when the size 5 ship has already been placed
						System.out.println("You have already placed the size 5 ship");
					}
					else if(user_input_for_ship_selection == 4 && is_size_4_ship_placed){
						System.out.println("You have already placed the size 4 ship");
					}
					else if((user_input_for_ship_selection == 3 && is_size_3_1_ship_placed) && is_size_3_2_ship_placed){
						System.out.println("You have already placed both the size 3 ships");
					}
					else if(user_input_for_ship_selection == 2 && is_size_2_ship_placed){
						System.out.println("You have already placed the size 2 ship");
					}
					else{
						System.out.println("this happens");
						acceptable_input = true;
					}
				}
				catch (InputMismatchException e){  // handle non integer values
					System.out.println("Please enter an integer value between 2 and 5");
					scanIn = new Scanner(System.in);
				}
			}while(!acceptable_input);
			
			valid_direction_array[0] = true;
			valid_direction_array[1] = true;
			valid_direction_array[2] = true;
			valid_direction_array[3] = true;
			
			System.out.println("Place your size " + user_input_for_ship_selection + " piece:");
			print_console_player_grid();
			place_piece(user_input_for_ship_selection);
			print_console_player_grid();
			
			if(user_input_for_ship_selection == 5)
				is_size_5_ship_placed = true;
			if(user_input_for_ship_selection == 4)
				is_size_4_ship_placed = true;
			if(user_input_for_ship_selection == 3){
				if(is_size_3_1_ship_placed)
					is_size_3_2_ship_placed = true;
				else{
					is_size_3_1_ship_placed = true;
				}
			}
			if(user_input_for_ship_selection == 2)
				is_size_2_ship_placed = true;
					
			if(is_size_5_ship_placed){
				if(is_size_4_ship_placed){
					if(is_size_3_1_ship_placed){
						if(is_size_3_2_ship_placed){
							if(is_size_2_ship_placed){
								all_ships_placed = true;
							}
						}
					}
				}
			}
			
			
		}while(!all_ships_placed);
		
		System.out.println("You have now placed all of your ships onto your board!\n");
	}
	
	public static void initialize_opp_grid(){
		
		place_random_piece(5);  // place the size 5 piece randomly on the board
		place_random_piece(4);  // place the size 5 piece randomly on the board
		place_random_piece(3);  // place the size 5 piece randomly on the board
		place_random_piece(3);  // place the size 5 piece randomly on the board
		place_random_piece(2);  // place the size 5 piece randomly on the board
		
	}
	
	public static void play_game(){
		boolean game_over = false;
		
		do{
			player_turn();
			if(number_of_hits_on_opp == 17){
				game_over = true;
			}
			opp_turn();
			if(number_of_hits_on_player == 17){
				game_over = true;
			}
				
		}while(!game_over);
		
		System.out.println("The game is over!");
		if(number_of_hits_on_opp == 17){
			System.out.println("You have won!");
		}
		if(number_of_hits_on_player == 17){
			System.out.println("You have lost!");
		}
	}
	
	public static void place_piece(int size_of_ship){
		int x_coordinate = 0;
		int y_coordinate = 0;
		int valid_directions;
		int desired_direction = 0;
		
		boolean acceptable_input = false;
		boolean acceptable_coordinates = false;
		
		//---------------------------------------
		// code for receiving coordinates for the nose of the ship from user
		//---------------------------------------
		
		System.out.println("Please enter coordinates for the nose of your ship.");
		
		do{
		
			do{  // reprompt the user if they do not enter an integer between 1 and 10
				try{
					System.out.print("Enter the desired row: ");
					y_coordinate = scanIn.nextInt();
					if(y_coordinate > 10 || y_coordinate < 1){
						System.out.println("Integer was not between 1 and 10");
					}
					else{
						acceptable_input = true;
					}
				}
				catch (InputMismatchException e){  // handle non integer values
					System.out.println("Please enter an integer value between 1 and 10");
					scanIn = new Scanner(System.in);
				}
			}while(!acceptable_input);
			
			
			acceptable_input = false;
			do{  // reprompt the user if they do not enter an integer between 1 and 10
				try{
					System.out.print("Enter the desired column: ");
					x_coordinate = scanIn.nextInt();
					if(x_coordinate > 10 || x_coordinate < 1){
						System.out.println("Integer was not between 1 and 10");
					}
					else{
						acceptable_input = true;
					}
				}
				catch (InputMismatchException e){  // handle non integer values
					System.out.println("Please enter an integer value between 1 and 10");
					scanIn = new Scanner(System.in);
				}
			}while(!acceptable_input);
			
			//------
			// check if there is already a ship in the coordinates
			// if there is reprompt for new coordinates
			//------
			
			if(player_grid[y_coordinate-1][x_coordinate-1] != 0){
				acceptable_coordinates = false;
				System.out.println("There is already a ship in those coordinates");
			}
			else
				acceptable_coordinates = true;
			
			
			//----------------------------------------------
			// determine which directions are valid for the ship to go
			//----------------------------------------------
			if(acceptable_coordinates){
				
				valid_directions = determine_valid_direction(x_coordinate, y_coordinate, size_of_ship, player_grid);
				
				//----------------
				// if all directions are invalid, then reprompt for new coordinates
				//----------------
				
				if(!valid_direction_array[0]){
					if(!valid_direction_array[1]){
						if(!valid_direction_array[2]){
							if(!valid_direction_array[3]){
								acceptable_coordinates = false;
								System.out.println("A ship cannot be placed in those coordinates");
							}
						}
					}
				}
				
			}	
		}while(!acceptable_coordinates);
		
		
		//----------------------
		// prompt for desired direction for ship
		// ---------------------
		
		if(valid_direction_array[0])
			System.out.println("Left direction is open, enter '1' to place piece left");
		if(valid_direction_array[1])
			System.out.println("Up direction is open, enter '2' to place piece up");
		if(valid_direction_array[2])
			System.out.println("Down direction is open, enter '3' to place piece down");
		if(valid_direction_array[3])
			System.out.println("Right direction is open, enter '4' to place piece right");
		
		acceptable_input = false;
		do{  // reprompt the user if they do not enter L, U, D, or R
			try{
				System.out.print("Enter the desired direction: ");
				desired_direction = scanIn.nextInt();
				if(desired_direction > 4 || desired_direction < 1){
					System.out.println("Integer was not between 1 and 4");
				}
				else if(!valid_direction_array[0] && desired_direction == 1){
					System.out.println("Left is not a valid direction for this ship position");
				}
				else if(!valid_direction_array[1] && desired_direction == 2){
					System.out.println("Up is not a valid direction for this ship position");
				}
				else if(!valid_direction_array[2] && desired_direction == 3){
					System.out.println("Down is not a valid direction for this ship position");
				}
				else if(!valid_direction_array[3] && desired_direction == 4){
					System.out.println("Right is not a valid direction for this ship position");
				}
				else{
					acceptable_input = true;
				}
			}
			catch (InputMismatchException e){  // handle non integer values
				System.out.println("Please enter an integer value between 1 and 4");
				scanIn = new Scanner(System.in);
			}
		}while(!acceptable_input);
		
		
		
		//--------------------------------
		// now that desired coordinates and direction are determined, 
		// we can place the piece on the board
		//--------------------------------
		
		place_piece_on_board(x_coordinate, y_coordinate, size_of_ship, desired_direction, player_grid);
		
		
	}
	// possibly change this to void
	public static int determine_valid_direction(int x_coord, int y_coord, int size_of_ship, int[][] grid){
		int valid_directions_return;
		check_board_space(x_coord, y_coord, size_of_ship);
		check_for_ships_in_way(x_coord, y_coord, size_of_ship, grid);
				
		return 4;
	}
	
	public static void check_board_space(int x_coord, int y_coord, int size_of_ship){
		
		//----------------------------------
		// check if ship can go up validly
		//-------------------------------
		if(x_coord < size_of_ship)
			valid_direction_array[0] = false;
		else
			valid_direction_array[0] = true;
		
		//------------------------------------
		// check if ship can go down validly
		//----------------------------------
		if(x_coord + size_of_ship - 1 > 10)
			valid_direction_array[3] = false;
		else
			valid_direction_array[3] = true;
		
		//------------------------------------
		// check if ship can go left validly
		//----------------------------------
		if(y_coord < size_of_ship)
			valid_direction_array[1] = false;
		else
			valid_direction_array[1] = true;
		
		//------------------------------------
		// check if ship can go right validly
		//----------------------------------
		if(y_coord + size_of_ship - 1 > 10)
			valid_direction_array[2] = false;
		else
			valid_direction_array[2] = true;
	}
	
	public static void check_for_ships_in_way(int x_coord, int y_coord, int size_of_ship, int[][] grid){
		int sum_check = 0;
		
		//----------------
		// check right for ships if right is a valid direction
		//----------------
		if(valid_direction_array[3]){
			for(int i=0; i < size_of_ship; i++){
				sum_check += grid[y_coord-1][x_coord-1 + i];
			}
			if(sum_check != 0)
				valid_direction_array[3] = false;
		}
		sum_check = 0;
		
		//--------------
		// check left for ships if left is a valid direction
		//--------------
		if(valid_direction_array[0]){
			for(int i=0; i <size_of_ship; i++){
				sum_check += grid[y_coord-1][x_coord-1 - i];
			}
			if(sum_check != 0)
				valid_direction_array[0] = false;
		}
		sum_check = 0;
		
		//--------------------
		// check up for ships if up is a valid direction
		//---------------------
		if(valid_direction_array[1]){
			for(int i=0; i <size_of_ship; i++){
				sum_check += grid[y_coord - size_of_ship + i][x_coord-1];
			}
			if(sum_check != 0)
				valid_direction_array[1] = false;
		}
		sum_check = 0;
		
		//---------------------
		// check down for ships if down is a valid direction
		//---------------------
		if(valid_direction_array[2]){
			for(int i=0; i <size_of_ship; i++){
				sum_check += grid[y_coord - 1 + i][x_coord-1];
			}
			if(sum_check != 0)
				valid_direction_array[2] = false;
		}
		sum_check = 0;
		
	}
	
	public static void place_random_piece(int size_of_ship){
		int x_coordinate = 0;
		int y_coordinate = 0;
		int directionInt = 0;
		int valDir = 0;
		boolean acceptable_randomize = false;
		boolean acceptable_direction = false;
		boolean there_is_a_valid_direction = false;
		
		do{
			x_coordinate = randInt(1, 10);
			y_coordinate = randInt(1, 10);
			
			acceptable_randomize = false;
			acceptable_direction = false;
			
			if(opp_grid[y_coordinate-1][x_coordinate-1] != 0){
				// already a ship there
			}
			else{ // position is free
				valid_direction_array[0] = true;
				valid_direction_array[1] = true;
				valid_direction_array[2] = true;
				valid_direction_array[3] = true;
				
				valDir = determine_valid_direction(x_coordinate, y_coordinate, size_of_ship, opp_grid);
				
				for(boolean value : valid_direction_array){
					if(value){
						there_is_a_valid_direction = true;
						break;
					}
					else
						there_is_a_valid_direction = false;
				}
				
				if(!there_is_a_valid_direction){
					// all are false
					acceptable_randomize = false;
				}
				else{
					do{
						directionInt = randInt(1,4);
						//System.out.println("Direction int: " + directionInt);
						
						if((directionInt == 1) && valid_direction_array[0])
							acceptable_direction = true;
						if((directionInt == 2) && valid_direction_array[1])
							acceptable_direction = true;
						if((directionInt == 3) && valid_direction_array[2])
							acceptable_direction = true;
						if((directionInt == 4) && valid_direction_array[3])
							acceptable_direction = true;
						
						
					}while(!acceptable_direction);
					
					acceptable_randomize = true;
				}
			}
		}while(!acceptable_randomize);
		
		
		place_piece_on_board(x_coordinate, y_coordinate, size_of_ship, directionInt, opp_grid);
		//print_console_opp_grid();
		
	}
	
	public static void place_piece_on_board(int x_coord, int y_coord, int size_of_ship, int direction, int[][] grid){
		//---------------------
		// direction is up
		//---------------------
		if(direction == 1){
			for(int i = 0; i < size_of_ship; i ++){
				grid[y_coord-1][x_coord-1-i] = 2;
			}
		}
		
		//---------------------
		// direction is left
		//---------------------
		if(direction == 2){
			for(int i = 0; i < size_of_ship; i ++){
				grid[y_coord-1-i][x_coord-1] = 2;
			}
		}
		
		//---------------------
		// direction right
		//---------------------
		if(direction == 3){
			for(int i = 0; i < size_of_ship; i ++){
				grid[y_coord -1 + i][x_coord-1] = 2;
			}
		}
		
		//---------------------
		// direction down
		//---------------------
		if(direction == 4){
			for(int i = 0; i < size_of_ship; i ++){
				grid[y_coord-1][x_coord-1+i] = 2;
			}
		}
		
	}
	
	public static void player_turn(){
		int y_coordinate = 0;
		int x_coordinate = 0;
		
		boolean turn_complete = false;
		boolean acceptable_input = false;
		
		System.out.println("Here is your opponent's board: ");
		print_console_opp_grid();
		
		do{
			do{  // re-prompt the user if they do not enter an integer between 1 and 10
				try{
					System.out.print("Enter the desired row for your attack: ");
					y_coordinate = scanIn.nextInt();
					if(y_coordinate > 10 || y_coordinate < 1){
						System.out.println("Integer was not between 1 and 10");
					}
					else{
						acceptable_input = true;
					}
				}
				catch (InputMismatchException e){  // handle non integer values
					System.out.println("Please enter an integer value between 1 and 10");
					scanIn = new Scanner(System.in);
				}
			}while(!acceptable_input);
			
			
			acceptable_input = false;
			do{  // re-prompt the user if they do not enter an integer between 1 and 10
				try{
					System.out.print("Enter the desired column for your attack: ");
					x_coordinate = scanIn.nextInt();
					if(x_coordinate > 10 || x_coordinate < 1){
						System.out.println("Integer was not between 1 and 10");
					}
					else{
						acceptable_input = true;
					}
				}
				catch (InputMismatchException e){  // handle non integer values
					System.out.println("Please enter an integer value between 1 and 10");
					scanIn = new Scanner(System.in);
				}
			}while(!acceptable_input);
			
			
			if((opp_grid[y_coordinate-1][x_coordinate-1] == 0) || (opp_grid[y_coordinate-1][x_coordinate-1] == 2)){
				fire_shot_on_opp(x_coordinate, y_coordinate);
				turn_complete = true;
			}
			else{
				System.out.println("You have already fired upon those coordinates.");
			}
		}while(!turn_complete);
		
		
		print_console_opp_grid();
		if(opp_grid[y_coordinate-1][x_coordinate-1] == 3)
			System.out.println("You have scored a hit!");
		else
			System.out.println("Your attack missed!");
	}
	
	public static void opp_turn(){
		int x_coordinate;
		int y_coordinate;
		boolean acceptable_coordinates = false;
		
		System.out.println("It is your opponent's turn!");
		do{
			x_coordinate = randInt(1, 10);
			y_coordinate = randInt(1, 10);
		
			if((player_grid[y_coordinate-1][x_coordinate-1] == 1) || (player_grid[y_coordinate-1][x_coordinate-1] == 3)){
				// already shot there
			}
			else{
				acceptable_coordinates = true;
			}
		
		}while(!acceptable_coordinates);
			
		fire_shot_on_player(x_coordinate, y_coordinate);
		
		System.out.println("Your opponent has fired upon row " + y_coordinate + ", column " + x_coordinate + ".");
		if(player_grid[y_coordinate-1][x_coordinate-1] == 3)
			System.out.println("Your opponent has scored a hit!");
		else
			System.out.println("Your opponent has missed!");
		System.out.println("Your board:");
		print_console_player_grid();
		
	}
	
	public static void fire_shot_on_opp(int x_coord, int y_coord){
		
		opp_grid[y_coord-1][x_coord-1]++;
		
		if(opp_grid[y_coord-1][x_coord-1] == 3)
			number_of_hits_on_opp++;
	}
	
	public static void fire_shot_on_player(int x_coord, int y_coord){
		
		player_grid[y_coord-1][x_coord-1]++;
		
		if(player_grid[y_coord-1][x_coord-1] == 3)
			number_of_hits_on_player++;
	}
	
	public static void print_console_player_grid(){
		System.out.println("     1  2  3  4  5  6  7  8  9  10");  // displays the column numbers
		for(int y = 0; y < 10; y++){
			
			if(y==9){
				System.out.print(y+1 + " | "); // displays the row number before displaying the contents of the row
			}
			else{
				System.out.print(y+1 + "  | ");
			}
			
			for(int x = 0; x < 10; x++){
				System.out.print(player_grid[y][x] + "  ");  // displays the contents of the row
			}
			System.out.println(); // creates a new line for the next row
		}
		System.out.println();
	}
	
	public static void print_console_opp_grid(){
		System.out.println("     1  2  3  4  5  6  7  8  9  10");  // displays the column numbers
		for(int y = 0; y < 10; y++){
			
			if(y==9){
				System.out.print(y+1 + " | "); // displays the row number before displaying the contents of the row
			}
			else{
				System.out.print(y+1 + "  | ");
			}
			
			for(int x = 0; x < 10; x++){
				if(opp_grid[y][x] == 2)
					System.out.print("0  ");
				else
					System.out.print(opp_grid[y][x] + "  ");  // displays the contents of the row
			}
			System.out.println(); // creates a new line for the next row
		}
		System.out.println();
	}
	
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	
	
}
