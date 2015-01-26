package lib;

public class MMS_lib {
	
	private double lambda, mu, rho, alpha;
	private int s, r;
	
	public MMS_lib(double lambda, double mu, int s){
		super();
		this.lambda = lambda;
		this.mu = mu;
		this.alpha  = lambda / mu;
		this.rho = this.alpha / s;
		this.s = s;
	}
	
	public int getFactorial(int s){
		
		//階乗の値
		int f = 1;
		for(int i =s; i>=0; i--){
			if(i == 0){
				f *= 1;
			}else{
				f *= i;
			}
		}
		return f;
	}
			
	public int getConbination(int s, int r){
		
		//組み合わせの値
		int c;
		c = getFactorial(s)/(getFactorial(r)*(getFactorial(s-r)));
		return c;
	}
	
	public double getP0(){
		double p0 = 0,p01 = 0,p02 = 0;
		
		for(int k=0;k<this.s;k++){
			p01 +=Math.pow(this.alpha,  k)/getFactorial(k);
		}
		p02 = Math.pow(this.alpha,  this.s)/getFactorial(this.s)/(1-this.rho);
		p0 = 1/(p01 + p02);
		return p0;
	}
	
	//待ち人数算出
	public double getLq(){
		double lq;
		lq = Math.pow(this.s, this.s)*Math.pow(this.rho,this.s+1)*getP0()/getFactorial(this.s)/Math.pow(1-this.rho, 2);
		return lq;
	}
	
	//平均系内人数
	public double getL(){
		double l;
		l = getLq() + this.alpha;
		return l;
	}
	
	//平均待ち時間
	public double getWq(){
		double wq;
		wq = getLq() / this.lambda;
		return wq;
	}
	
	//平均系内時間
	public double getW(){
		double w;
		w = getWq() + 1 / this.mu;
		return w;
	}
	
	//利用率
	public double getRho(){
		return rho;
	}

}
