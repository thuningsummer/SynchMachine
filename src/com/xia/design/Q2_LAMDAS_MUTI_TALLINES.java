package com.xia.design;

public class Q2_LAMDAS_MUTI_TALLINES {
	private Line line240;
	private Line line400;
	private Line line550;
	private Line line600;
	private Line line700;
	private Line line900;
	
	public Line getLine(double id){
		if(id>=200&&id<320){
			return line240;
		}else if(id>=320&&id<475){
			return line400;
		}else if(id>=475&&id<570){
			return line550;
		}else if(id>=570&&id<650){
			return line600;
		}else if(id>=650&&id<800){
			return line700;
		}else if(id>=800){
			return line900;
		}else{
			try {
				throw new Exception("Azhiyouwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return null;
			}
		}
	}
	
	public void setLine240(Line line240) {
		this.line240 = line240;
	}
	
	public void setLine400(Line line400) {
		this.line400 = line400;
	}
	
	public void setLine550(Line line550) {
		this.line550 = line550;
	}
	
	public void setLine700(Line line700) {
		this.line700 = line700;
	}
	public Q2_LAMDAS_MUTI_TALLINES(){
		
	}
	public Q2_LAMDAS_MUTI_TALLINES(Line line240, Line line400, Line line550
			,Line line600,Line line700,Line line900) {
		super();
		this.line240 = line240;
		this.line400 = line400;
		this.line550 = line550;
		this.line600=line600;
		this.line700 = line700;
		this.line900=line900;
	}
}
