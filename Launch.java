
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Task1 t1 =new Task1();
//          Task2 t2 = new Task2();
//          
//          Thread r1 = new Thread(t1);
//          Thread r2 = new Thread(t2);
//          
//          r1.start();
//          r2.start();
       
		Runnable r1 = ()-> {
				for(int i =1;i<=10;i++) {
					System.out.println(5*i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Runnable r2 =()-> {
				for(int i =1;i<=10;i++) {
					System.out.println(8*i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			
		};
		
		
		Thread th1 = new Thread(r1);
        Thread th2 = new Thread(()-> {
			for(int i =1;i<=10;i++) {
				System.out.println(8*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		
	});
        
        th1.start();
        th2.start();
		
      
          
	}

}
