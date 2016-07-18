package com.xia.design;

public class MyMath {
	//用于查表
	// ToLine array步长应相等
	/* 
	 * ToLine方法
	 * 作用：曲线局部线性化
	 * array——需要线性化的曲线，point——需要查表的点
	 * */
	public static void ToLine(Point [] array,Point point){
		
		int length=array.length;
		if(length==0){
			return;
		}else if(point.getX()<array[0].getX()||point.getX()>array[length-1].getX()){
			return;
		}else{
			double x_first=array[0].getX();
			double x_last=array[length-1].getX();
			double step=Math.round((x_last-x_first)/(length));
			Point p=new Point();
			Point p_plus=new Point();
			p.setX( ((int)(point.getX()/step))*step );
			p_plus.setX( ((int)(point.getX()/step))*step+step );
			for(int i=0;i<length;i++){
				if(p.getX()==array[i].getX()){
					p.setY(array[i].getY());
				}
				if(p_plus.getX()==array[i].getX()){
					p_plus.setY(array[i].getY());
				}
			}
			point.setY( p.getY()+(point.getX()-p.getX())*((p_plus.getY()-p.getY())/(p_plus.getX()-p.getX())) );
		}
	}

	/* 
	 * Newton方法
	 * 牛顿插值多项式
	 * array——需要线性化的曲线，point——需要查表的点
	 * */
	public static void Newton(Point [] array,Point point){
		
		double zhankaishi=1.0;
		double perresult=array[0].getY();
		double result=perresult;
		for(int i=0;i<array.length-1;i++){
			zhankaishi=(point.getX()-array[i].getX())*zhankaishi;
			perresult=chaShang(array,0,i+1)*zhankaishi;
			result+=perresult;
		}
		point.setY(result);
		
	}
	//计算差商
	public static double chaShang(Point [] array,int pre,int last){
		
		if(last==pre+1){
			return (array[last].getY()-array[pre].getY())/(array[last].getX()-array[pre].getX());
		}else{
			return (chaShang(array,pre+1,last)-chaShang(array,pre,last-1))/(array[last].getX()-array[pre].getX());
		}
		
	}
	
	public static int gongyueshu(int Z,int P6) {
		int gongyueshu=1;
		int a=Z;
		int b=P6;
		int buf=0;
		boolean flag=true;
		if(Z<=0||P6<=0){
			return 0;
		}
		while(flag){
			if(a>b){
				buf=a-b;
				
				a=buf;
				
			}else{
				buf=b-a;
				b=buf;
			}
			
			if(a==b){
				flag=false;
				gongyueshu=a;
			}
			
					
		}
		return gongyueshu;
	}
}
