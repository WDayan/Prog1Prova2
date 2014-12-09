class Video extends Elemento implements Transformavel{

	private double altura, largura;
	
	public void setAltura(double a){
		this.altura = a;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setLargura(double a){
		this.largura = a;
	}
	
	public double getLargura(){
		return this.largura;
	}

	public void alteraTamanho(double a, double b){
		this.altura = a;
		this.largura = b;
	}


}