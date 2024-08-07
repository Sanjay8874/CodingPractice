package Thread;


public class Mythread1 implements Runnable {

	@Override
	public void run() {
		int start=0;
		int end=10;
		
		for(int i=start;i<=end;i++) {
			System.out.println(i);
			if(i==5) { 
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					System.out.println(e);
				}
				
			}
			
		}
		
	}
	

}
