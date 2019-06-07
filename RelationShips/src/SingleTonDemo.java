class MySingleTon
{
	private static MySingleTon obj = new MySingleTon();
	private MySingleTon (){
		
	}
	public static MySingleTon getInstance(){
		/*if(obj==null){
			obj  = new MySingleTon();
		}*/
		return obj;
	}
}

public class SingleTonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MySingleTon obj1 = MySingleTon.getInstance();
		System.out.println("First Object "+obj1);
		MySingleTon obj2 = MySingleTon.getInstance();
		System.out.println("Second Object "+obj2);

	}

}
