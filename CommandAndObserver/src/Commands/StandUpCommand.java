package Commands;

public class StandUpCommand implements BaseCommand{
	
	private String name; 
	
	public StandUpCommand() {
		this.name = "'Stand Up'";
	}
	
	public String getName() {
		return this.name;
	}
}

