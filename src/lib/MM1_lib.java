package lib;

public class MM1_lib {
	
	private double ��,��,��;

	public MM1_lib(double ��, double ��) {
		this.�� = ��;
		this.�� = ��;
		�� = ��/��;
	}
	
	public double getRho(){
		return ��;
	}
	
	public double getLength(){
		return (��/(1-��));
	}
	
	public double getQueue(){
		return (Math.pow(��,2)/(1-��));
	}
	
	public double getTime(){
		return (1/(1-��)*1/��);
	}
	
	public double getWtime(){
		return(��/(1-��)*1/��);
	}

}
