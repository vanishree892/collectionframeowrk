package collectionframeowrk;

public class Runner {

	public Runner() {
		// TODO Auto-generated constructor stub
	}
//Insertion at beginning
//	Insertion at end
//	Insertion at nth position
	public static void main(String[] args) {
		LinkedList listObj=new LinkedList();

		listObj.insertBeginning(15);
        listObj.insertBeginning(10);
        listObj.insertBeginning(5);

        listObj.display();

        listObj.insertEnd(20);
        listObj.insertEnd(25);
        listObj.insertEnd(30);
        listObj.insertEnd(35);

        listObj.display();

        listObj.insertAfter(3,100);

        listObj.display();
}
}
