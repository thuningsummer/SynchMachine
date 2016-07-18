package com.xia.design;

public class B1_160_DELTA_PER_TALLINES {
	private Line line_1_0;
	private Line line_1_5;
	private Line line_2_0;
	private Line line_2_5;
	private Line line_3_0;
	
	public Line getLine(double id){
		if(id>=0.5&&id<1.25){
			return line_1_0;
		}else if(id>=1.25&&id<1.75){
			return line_1_5;
		}else if(id>=1.75&&id<2.25){
			return line_2_0;
		}else if(id>=2.25&&id<2.75){
			return line_2_5;
		}else if(id>=2.75&&id<=3.5){
			return line_3_0;
		}else{
			try {
				throw new Exception("deltamax/deltaÖµÓĞÎó");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return null;
			}
		}
	}
	
	public void setLine_1_0(Line line_1_0) {
		this.line_1_0 = line_1_0;
	}
	
	public void setLine_1_5(Line line_1_5) {
		this.line_1_5 = line_1_5;
	}
	
	public void setLine_2_0(Line line_2_0) {
		this.line_2_0 = line_2_0;
	}
	
	public void setLine_2_5(Line line_2_5) {
		this.line_2_5 = line_2_5;
	}
	
	public void setLine_3_0(Line line_3_0) {
		this.line_3_0 = line_3_0;
	}
	
	public B1_160_DELTA_PER_TALLINES(){
		
	}
	public B1_160_DELTA_PER_TALLINES(Line line_1_0, Line line_1_5, Line line_2_0,
			Line line_2_5, Line line_3_0) {
		super();
		this.line_1_0 = line_1_0;
		this.line_1_5 = line_1_5;
		this.line_2_0 = line_2_0;
		this.line_2_5 = line_2_5;
		this.line_3_0 = line_3_0;
	}
	
}
