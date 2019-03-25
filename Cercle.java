public class Cercle{
	private float x;
	private float y;
	Cercle(float xx, float yy)
	{
		this.x=xx;
		this.y=yy;
	}
	Cercle(){
		this.y=yy;
		this.x=xx;
	}
	Cercle(Cercle cerc){
		cerc.y=yy;
		cerc.x=xx;
	}
	public String toString(){
		return x + " " + y;
	}
	public boolean equals(Cercle cerc){
		if(cerc.x == this.x && cerc.y == this.y){
			return true;
		}		
		else {
			return false;
		}
	}
}