
public class Parallelogram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int po=10;
		for (int i = 0; i < 11; i++) {
			System.out.print("         ");
			for (int j2 = po; j2 >0; j2--) {
				System.out.print(" ");}
    		for (int j = 0; j < i; j=j+1) {
				System.out.print("* ");	
				
			}
    	
    		System.out.println("");
    		po--;

		    }
		
		int poo=0;
		for (int i = 9; i > 0; i--) {
			System.out.print("          ");
			for (int j2 = 0; j2 <poo; j2++) {
				System.out.print(" ");}
    		for (int j = i; j > 0; j=j-1) {
				System.out.print("* ");
				}
    		System.out.println("");
    		poo++;
			}

System.out.println("\n\n  Parallelogram\n");
int parallelogram=9;
for (int i = 0; i <10; i++) {
	System.out.print("         ");
	for (int j2 = parallelogram; j2 >0; j2--) {
		System.out.print(" ");}
	for (int j = 0; j < 10; j=j+1) {
		System.out.print("* ");	
	}
	System.out.println("");
	parallelogram--;

    }

System.out.println("Again");

int poA=10, po1A=10, j5A=0,po1ADown=9, j5ADwon=9;
for (int i = 0; i < 11; i++) {
	System.out.print("         ");
	for (int j2 = poA; j2 >0; j2--) {
		System.out.print(" ");}
	for (int j = 0; j < i; j=j+1) {
		System.out.print("* ");	
		
	}
	//new
	System.out.print("            ");
	for (int j3 = po1A; j3 >0; j3=j3-1) {
		System.out.print(" ");}
	if(j5A<11) {
		if(j5A==0){
			//System.out.println();
		}
		else if(j5A<11){
			System.out.print(j5A);
		}
		
		j5A++;}
	po1A--;
	//new
	System.out.println("");
	poA--;

    }

int pooAgain=0;
for (int i = 9; i > 0; i--) {
	System.out.print("          ");
	for (int j2 = 0; j2 <pooAgain; j2++) {
		System.out.print(" ");}
	for (int j = i; j > 0; j=j-1) {
		System.out.print("* ");
		}
	//new dwon
	System.out.print("    ");
	for (int j3 =0 ; j3 <po1ADown; j3=j3+1) {
		System.out.print(" ");}
	if(j5ADwon>0) {
		if(j5ADwon==0){
			
		}
		else if(j5ADwon>0){
			System.out.print(j5ADwon);
		}
		
		j5ADwon--;}
	po1ADown++;
	//new down
	
	System.out.println("");
	pooAgain++;
	}

}
	
}