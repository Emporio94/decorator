
public class BearDecorator extends LevelDecorator
{
	public BearDecorator(LevelGenerator level)
	{
		this.level=level;
	}
	
	public String generateLevel()
	{
		return "Beyond that you see bear \n"+ level.generateLevel();
	}


}
