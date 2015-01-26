package lib;

public class MM1_lib {
	
	private double ƒÉ,ƒÊ,ƒÏ;

	public MM1_lib(double ƒÉ, double ƒÊ) {
		this.ƒÉ = ƒÉ;
		this.ƒÊ = ƒÊ;
		ƒÏ = ƒÉ/ƒÊ;
	}
	
	public double getRho(){
		return ƒÏ;
	}
	
	public double getLength(){
		return (ƒÏ/(1-ƒÏ));
	}
	
	public double getQueue(){
		return (Math.pow(ƒÏ,2)/(1-ƒÏ));
	}
	
	public double getTime(){
		return (1/(1-ƒÏ)*1/ƒÊ);
	}
	
	public double getWtime(){
		return(ƒÏ/(1-ƒÏ)*1/ƒÊ);
	}

}
