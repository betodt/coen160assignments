package diaztostado.assign1;

public class Box extends Block {
	private String content;
	private String material;

	public Box() {
		super(0,0,0);
		this.content = "";
		this.material = "";
	}

	public Box(int length, int width, int depth, String content, String material) {
		super(length, width, depth);
		this.content = content;
		this.material = material;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Boolean isEmpty() {
		return (content == "");
	}
	
	public void emptyBox() {
		this.content = "";
	}
	
	public String toString() {
		String content;
		
		if(this.isEmpty()) {
			content = "nothing";
		}
		else {
			content = this.getContent();
		}
		
		return "This box is made of " + this.getMaterial() + ", contains " + content + ", and has a volume of " + this.Volume();		
	}

}
