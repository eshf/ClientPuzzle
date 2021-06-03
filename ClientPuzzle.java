
public class ClientPuzzle {
	
	
	
	
	
    static void getCount() {


	int e;
	int count;
	int p1, p2;
	for(e=0; e<64; e++) {
		count =0;
		for(p1=1; p1<8; p1++) {
			for(p2=1; p2<8; p2++) {
			if(p1+p2==e) {
				count++;
			}
		}
			System.out.println("E: " + e + " Count: "+ count);
		
		
		}
		}
	
	}
public static void main(String[] args) {
		ClientPuzzle.getCount();

}
}