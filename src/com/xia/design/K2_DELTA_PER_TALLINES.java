package com.xia.design;

public class K2_DELTA_PER_TALLINES {
	private Line line0_0_1;
	private Line line0_0_2;
	private Line line0_0_3;
	private Line line0_0_4;
	private Line line0_0_5;
	private Line line0_0_6;
	
	
	public Line getLine(double id){
		if(id>=0.005&&id<0.015){
			return line0_0_1;
		}else if(id>=0.015&&id<0.025){
			return line0_0_2;
		}else if(id>=0.025&&id<0.035){
			return line0_0_3;
		}else if(id>=0.035&&id<0.045){
			return line0_0_4;
		}else if(id>=0.045&&id<0.055){
			return line0_0_5;
		}else if(id>=0.055&&id<=0.065){
			return line0_0_6;
		}else{
			try {
				
				throw new Exception("无法查表");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return null;
			}
		}
			
	}
	
	public K2_DELTA_PER_TALLINES(){
		
	}
	
	
	public K2_DELTA_PER_TALLINES(Line line0_0_1, Line line0_0_2,
			Line line0_0_3, Line line0_0_4, Line line0_0_5,Line line0_0_6) {
		super();
		this.line0_0_1 = line0_0_1;
		this.line0_0_2 = line0_0_2;
		this.line0_0_3 = line0_0_3;
		this.line0_0_4 = line0_0_4;
		this.line0_0_5 = line0_0_5;
		this.line0_0_6=line0_0_6;
	}
	public void setLine0_0_1(Line line0_0_1) {
		this.line0_0_1 = line0_0_1;
	}
	public void setLine0_0_2(Line line0_0_2) {
		this.line0_0_2 = line0_0_2;
	}
	
	public void setLine0_0_3(Line line0_0_3) {
		this.line0_0_3 = line0_0_3;
	}
	
	public void setLine0_0_4(Line line0_0_4) {
		this.line0_0_4 = line0_0_4;
	}
	
	public void setLine0_0_5(Line line0_0_5) {
		this.line0_0_5 = line0_0_5;
	}

	
	
	public void setLine0_0_6(Line line0_0_6) {
		this.line0_0_6 = line0_0_6;
	}
}
