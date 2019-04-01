public class Cercle{
	private float x;
	private float y;
	Cercle(float xx, float yy)
	{
		this.x=xx;
		this.y=yy;
	}
	Cercle(){
		this.y=1;
		this.x=2;
	}
	Cercle(Cercle cerc){
		cerc.y=this.y;
		cerc.x=this.x;
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
        public static void main(String[] args) {
            Cercle rodona = new Cercle(3,4);
        }
}
