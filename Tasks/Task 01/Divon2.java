class Divon2 {
	public static void main(String[] args) {
	
	int num = 137;
	
	// 0
	int num_ostatok0 = num % 2; 

	 // 1
	num = num/2;
	int num_ostatok1 = num % 2;

	// 2
	num = num/2;
	int num_ostatok2 = num % 2;

	// 3
    num = num/2;
	int num_ostatok3 = num % 2;
	
	// 4
    num = num/2;
	int num_ostatok4 = num % 2;
  	
	// 5
    num = num/2;
	int num_ostatok5 = num % 2;
  
	// 6
	num = num/2;	
	int num_ostatok6 = num % 2;
	
	// 7
	num = num/2;	
	int num_ostatok7 = num % 2;
   	
    // Вывод в обратном порядке
   	System.out.print(num_ostatok7);	
   	System.out.print(num_ostatok6);	
	System.out.print(num_ostatok5);		
 	System.out.print(num_ostatok4);	
 	System.out.print(num_ostatok3);
 	System.out.print(num_ostatok2);
 	System.out.print(num_ostatok1);
 	System.out.print(num_ostatok0);

	}
}