public class BoomerSooner{
	
	public static void main(String[] args){
		
		int lower=1;
		int upper=1000;
		
		for(int i=lower; i<=upper; i++){
			
			boolean printNum = true;
			
			if((i%3)==0){
				System.out.print("Boomer");
				printNum = false;
			}
			
			if((i%5)==0){
				System.out.print("Sooner");
				printNum = false;
			}
			
			if(printNum){
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
		}
		
}