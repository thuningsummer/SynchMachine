package com.xia.design;

public class C_DELTA_PER_TALLINES {
	public  Line  line5_5;
	public  Line  line6_0;
	public  Line  line6_5;
	public  Line  line7_0;
	public  Line  line7_5;
	public Line getLine(double id){
		
		
		if(id>=0.5&&id<0.575){
			return line5_5;
		}else if(id>=0.575&&id<0.625){
			return line6_0;
		}else if(id>=0.625&&id<0.675){
			return line6_5;
		}else if(id>=0.675&&id<0.725){
			return line7_0;
		}else if(id>=0.725&&id<0.775){
			return line7_5;
		}else{
			try {
				
				throw new Exception("无法查表");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	
	
	
	
	}
	public C_DELTA_PER_TALLINES(){
		
	}
	public C_DELTA_PER_TALLINES(Line line5_5, Line line6_0, Line line6_5,
			Line line7_0, Line line7_5) {
		super();
		this.line5_5 = line5_5;
		this.line6_0 = line6_0;
		this.line6_5 = line6_5;
		this.line7_0 = line7_0;
		this.line7_5 = line7_5;
	}
	public void setLine5_5(Line line5_5) {
		this.line5_5 = line5_5;
	}
	public void setLine6_0(Line line6_0) {
		this.line6_0 = line6_0;
	}
	public void setLine6_5(Line line6_5) {
		this.line6_5 = line6_5;
	}
	public void setLine7_0(Line line7_0) {
		this.line7_0 = line7_0;
	}
	public void setLine7_5(Line line7_5) {
		this.line7_5 = line7_5;
	}

}
