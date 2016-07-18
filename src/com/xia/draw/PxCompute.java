package com.xia.draw;

public class PxCompute {
	public static int xadd(int x1,int x2){
		return x1+x2;
	}
	public static int yadd(int y1,int y2){
		if(y1>y2){
			return y1-y2;
		}else{
			try {
				throw new Exception("Y像素越界");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 0;
			}
			
		}
		
	}
	public static int xsub(int x1,int x2){
		if(x1>x2){
			return x1-x2;
		}else{
			try {
				throw new Exception("X像素越界");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 0;
			}
		}
		
	}
	public static int ysub(int y1,int y2){
		return y1+y2;
	}
}
