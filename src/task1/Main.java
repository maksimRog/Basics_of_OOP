package task1;

public class Main {

	public static void main(String[] args) {
	TextFile tf1=new TextFile("111", 1111);
	TextFile tf2=new TextFile("222", 2222);
	Directory directory=new Directory("textfiles", new TextFile[]{tf1,tf2});
	tf2.printFile();
	tf2.delete();
	tf2.printFile();
	}

}
