public class Runner
{
	public static void main(String[] args)
	{
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println("Testing puzzle.getHint(\"AAAAA\"): "+puzzle.getHint("AAAAA"));
		System.out.println("Testing puzzle.getHint(\"HELLO\"): "+puzzle.getHint("HELLO"));
		System.out.println("Testing puzzle.getHint(\"HEART\"): "+puzzle.getHint("HEART"));
		System.out.println("Testing puzzle.getHint(\"HARMS\"): "+puzzle.getHint("HARMS"));
		System.out.println("Testing puzzle.getHint(\"HARPS\"): "+puzzle.getHint("HARPS"));
	}
}
