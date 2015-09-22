package standalone;

public class Machine implements Info{

	private int id = 7;
	protected String sample;
	
	Machine()
	{
		System.out.println("Machine Started");
	}
	
	public void showInfo(){
		System.out.println("The machine id is : "+id);
	}
}
