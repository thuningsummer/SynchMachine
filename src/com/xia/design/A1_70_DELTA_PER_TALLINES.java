package com.xia.design;

public class A1_70_DELTA_PER_TALLINES {
	private Line line_0_5_5;
	private Line line_0_6_0;
	private Line line_0_6_5;
	private Line line_0_7_0;
	private Line line_0_7_5;
	
	public Line getLine(double id){
		if(id>=0.5&&id<0.575){
			return line_0_5_5;
		}else if(id>=0.575&&id<0.625){
			return line_0_6_0;
		}else if(id>=0.625&&id<0.675){
			return line_0_6_5;
		}else if(id>=0.675&&id<0.725){
			return line_0_7_0;
		}else if(id>=0.725&&id<=0.775){
			return line_0_7_5;
		}else{
			try {
				throw new Exception("alphaÖµÓĞÎó");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return null;
			}
		}
	}
	
	
	
	
	public void setLine_0_5_5(Line line_0_5_5) {
		this.line_0_5_5 = line_0_5_5;
	}
	
	public void setLine_0_6_0(Line line_0_6_0) {
		this.line_0_6_0 = line_0_6_0;
	}
	
	public void setLine_0_6_5(Line line_0_6_5) {
		this.line_0_6_5 = line_0_6_5;
	}
	
	public void setLine_0_7_0(Line line_0_7_0) {
		this.line_0_7_0 = line_0_7_0;
	}
	
	public void setLine_0_7_5(Line line_0_7_5) {
		this.line_0_7_5 = line_0_7_5;
	}
	
	public A1_70_DELTA_PER_TALLINES(){
		
	}
	public A1_70_DELTA_PER_TALLINES(Line line_0_5_5, Line line_0_6_0, Line line_0_6_5,
			Line line_0_7_0, Line line_0_7_5) {
		super();
		this.line_0_5_5 = line_0_5_5;
		this.line_0_6_0 = line_0_6_0;
		this.line_0_6_5 = line_0_6_5;
		this.line_0_7_0 = line_0_7_0;
		this.line_0_7_5 = line_0_7_5;
	}
	
}
