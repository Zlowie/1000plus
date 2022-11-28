
public class tusind {
	private static long startTime;
	private static long startTime2;

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 0;
		int c = 0;
		
		
		startTime = System.nanoTime();
		
		for (int i=1 ; i<=a ; i++) {
			 b = b + i;
			
		}
		System.out.println("tid 1 er: "+((System.nanoTime()-startTime))+" nanosekunder.");
		
		startTime2 = System.nanoTime();
		
		
		
			 c = (a*(a+1)/2);
		
		System.out.println("tid 2 er: "+((System.nanoTime()-startTime2))+" nanosekunder.");
		
		
		System.out.println("Summen af beregning 1 er: "+b);
		System.out.println("Summen af beregning 1 er: "+c);
		
	}
}
