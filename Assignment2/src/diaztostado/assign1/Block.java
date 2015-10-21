package diaztostado.assign1;

public class Block extends Rectangle{
	private int depth;
	
	public Block(){
		super(0,0);
		
		this.depth = 0;
	}
	
	public Block(int length, int width, int depth) {
		super(length, width);
		
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
}
