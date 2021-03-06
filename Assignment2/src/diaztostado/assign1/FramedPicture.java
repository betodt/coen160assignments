package diaztostado.assign1;

public class FramedPicture {
	private Frame frame;
	private Picture picture;

	public FramedPicture() {
		this.frame = new Frame();
		this.picture = new Picture();
	}
	
	public FramedPicture(Frame frame, Picture picture) {		
		this.picture = picture;
		if(this.fits(frame, picture))
			this.frame = frame;
		else {
			this.frame = new Frame();
			System.out.println("Please use a frame that fits a picture of area: " + this.picture.Area());
		}
		
	}
	
	public Frame getFrame() {
		return this.frame;
	}
	
	public Picture getPicture() {
		return this.picture;
	}
	
	public void setFrame(Frame frame) {
		if(this.fits(frame, this.picture))
			this.frame = frame;
		else
			System.out.println("Please use a frame that fits a picture of area: " + this.picture.Area());
	}
	
	public void setPicture(Picture picture) {
		if(this.fits(this.frame, picture))
			this.picture = picture;
		else
			System.out.println("Please use a picture that fits a frame of area: " + this.frame.Area());
	}
	
	public boolean fits(Frame frame, Picture picture) {
		if (picture.Area() < frame.Area())
			return true;
		else
			return false;	
	}
	
	public String toString() {
		if(this.frame.getMaterial() == "")
			return ("The picture is not framed");
		else
			return "The picture, " + this.getPicture().getTitle() + ", is by " + this.getPicture().getArtist() + " and the frame is made of " + this.getFrame().getMaterial();		
	}

}
