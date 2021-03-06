package diaztostado.assign1;

public class Main {

	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(10, 20);
		
		System.out.println("My rectangle has area " + myRectangle.Area());
		
		Square mySquare = new Square(10);
		
		System.out.println(mySquare); //should call toString method
		
		Circle myCircle = new Circle(10);
		
		System.out.println("My circle has an area of about " + myCircle.Area());
		
		Block myBlock = new Block(10, 20, 30);
		
		System.out.println("My block has volume " + myBlock.Volume());
		
		Box myBox = new Box(100, 50, 25, "Racer", "cardboard");
		
		System.out.println(myBox);
		
		Picture myPicture = new Picture(4, 5, "Migrant Mother", "Dorothea Lange");
		
		Frame myFrame = new Frame(2, 3, "Wood");
		
		FramedPicture myFramedPicture = new FramedPicture(myFrame, myPicture);
		
		System.out.println(myFramedPicture); //undersized frame
		
		myFrame.setLength(4);
		
		myFramedPicture.setFrame(myFrame);
		
		System.out.println(myFramedPicture); //still undersized
		
		myFrame.setWidth(6); 
		
		myFramedPicture.setFrame(myFrame);
		
		System.out.println(myFramedPicture); //correct size
		
		Wheel myWheel = new Wheel(5, 5, "rubber");
		
		System.out.println(myWheel);
		
		//make soap box racer using our box and wheel
		SoapBoxRacer myRacer = new SoapBoxRacer(myBox, myWheel);
		
		System.out.println(myRacer);

	}

}
