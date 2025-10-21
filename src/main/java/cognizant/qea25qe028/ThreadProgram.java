package cognizant.qea25qe028;

public class ThreadProgram {
	StringBuffer buffer = new StringBuffer();
	public int changeStringBuilderObj() {
		return buffer.length();
	}
	public static void main(String args[]) throws InterruptedException{
		
		ThreadProgram obj = new ThreadProgram();
		Thread t1 = new Thread() {
		@Override
		public void run() {
			for(int i=1;i<=10000;i++) {
			obj.buffer.append("h");
			}
		}
	};
	
	Thread t2 = new Thread() {
	@Override
	public void run() {
		for(int i=1;i<=30000;i++) {
			obj.buffer.append("h");
		}
	}
};

	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(obj.changeStringBuilderObj()+" this is the length of string buffer");

}}
