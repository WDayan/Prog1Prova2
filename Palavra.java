class Palavra extends Elemento implements Rotacionavel{

	private double angulo;
	
	public void setAngulo(double a){
		this.angulo = a;
	}
	
	public double getAngulo(){
		return this.angulo;
	}
	
	public void italico(){
		//this.coloca em italico;
	}
	
	public void negrito(){
		//this.coloca em negrito;
	}
	
	public void sublinhado(){
		//this.coloca em sublinhado;
	}
	
	public void rotaciona(double a){
		this.angulo = a;
	}

}