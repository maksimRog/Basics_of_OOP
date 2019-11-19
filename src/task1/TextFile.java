package task1;

public class TextFile extends File {

	public TextFile(String name, int size) {
		super(name, size);
	}

	@Override
	public void printFile() {
		System.out.println("This is text file");
	}
	
	
}
