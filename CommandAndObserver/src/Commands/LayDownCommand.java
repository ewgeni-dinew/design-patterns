package Commands;

public class LayDownCommand implements BaseCommand{
	
	private String name; 
	
	public LayDownCommand() {
		this.name = "'Lay Down'";
	}
	
	@Override
	public void executeCommand() {
	}
	
	public String getName() {
		return this.name;
	}
}
