package Commands;

public class StandUpCommand implements BaseCommand{
	
	private String name; 
	
	public StandUpCommand() {
		this.name = "'Stand Up'";
	}
	
	@Override
	public void executeCommand() {
	}
	
	public String getName() {
		return this.name;
	}
}

