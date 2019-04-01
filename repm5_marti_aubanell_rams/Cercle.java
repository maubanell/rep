public class Cercle{
	private float x;
	private float y;
	Cercle(float xx, float yy)
	{
		this.x=xx;
		this.y=yy;
	}
	Cercle(){
		this.y=3;
		this.x=3;
	}
	Cercle(Cercle cerc){
		cerc.y=cerc.x;
		cerc.x=cerc.y;
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
        public void setCercle(float xx, float yy){
            this.x = xx;
            this.y = yy;
        }
        public float getCercleX(){
            return this.x;
        }
        public float getCercleY(){
            return this.y;
        }
}