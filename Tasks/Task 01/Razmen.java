class Razmen {
	public static void main(String[] args) {
	
	int summa = 15867;
	
	int curr_coin = summa / 5000;
	System.out.println("5000 - " + curr_coin);    
    summa = summa - curr_coin * 5000;

    curr_coin =  summa / 2000;
	System.out.println("2000 - " + curr_coin);	
	summa = summa - curr_coin * 2000;

	curr_coin =  summa / 1000;
	System.out.println("1000 - " + curr_coin);	    
	summa = summa - curr_coin * 1000; 

	curr_coin =  summa / 500;
	System.out.println("500 - " + curr_coin);	    
	summa = summa - curr_coin * 500; 

	curr_coin =  summa / 200;
	System.out.println("200 - " + curr_coin);	    
	summa = summa - curr_coin * 200; 

    curr_coin =  summa / 100;
	System.out.println("100 - " + curr_coin);	    
	summa = summa - curr_coin * 100; 

	curr_coin =  summa / 50;
	System.out.println("50 - " + curr_coin);	    
	summa = summa - curr_coin * 50; 

	curr_coin =  summa / 10;
	System.out.println("10 - " + curr_coin);	    
	summa = summa - curr_coin * 10; 

	curr_coin =  summa / 5;
	System.out.println("5 - " + curr_coin);	    
	summa = summa - curr_coin * 5; 

	curr_coin =  summa / 2;
	System.out.println("2 - " + curr_coin);	    
	summa = summa - curr_coin * 2;
	
	System.out.println("1 - " + curr_coin);	   
   
	}
}