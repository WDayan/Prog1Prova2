class Imagem extends Elemento implements Rotacionavel, Transformavel{

	private double angulo, altura, largura;
	
	public void setAngulo(double a){
		this.angulo = a;
	}
	
	public double getAngulo(){
		return this.angulo;
	}
	
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
	
	public void rotaciona(double a){
		this.angulo = a; 
	}
	
	public void alteraTamanho(double a, double b){
		this.altura = a;
		this.largura = b;
	
	}
}