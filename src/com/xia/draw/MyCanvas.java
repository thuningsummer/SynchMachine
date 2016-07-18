package com.xia.draw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

//author:made by xia.shunying
public class MyCanvas extends Canvas {
	private String shape;
	private Frame frame;
	private MapedCoordinate mapedcoordinate;
	private Coordinate coordinate;
	private MapedY_X_line mapedy_x_line;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if(shape.equals(Draw.PE_DELTA_LINE)){
			//画方框
			drawRectangle(g);
			
			//花坐标系
			drawCoordinate(g);
			g.drawString("电", 6, 100);
			g.drawString("磁", 6, 114);
			g.drawString("功", 6, 128);
			g.drawString("率", 6, 142);
			g.drawString("Pe(kW)", 6, 156);
			g.drawString("功角Delta(度)", 300, 395);
			//画点
			drawPoints(g);
		}
		if(shape.equals(Draw.U_I_LINE)){
			//画方框
			drawRectangle(g);
			
			//花坐标系
			drawCoordinate(g);
			g.drawString("端", 6, 100);
			g.drawString("电", 6, 114);
			g.drawString("压", 6, 128);
			g.drawString("U(V)", 6, 142);
			g.drawString("电枢电流I(A)", 300, 395);
			//画点
			drawPoints(g);
		}
		if(shape.equals(Draw.If_I_LINE)){
			//画方框
			drawRectangle(g);
			
			//花坐标系
			drawCoordinate(g);
			g.drawString("励", 6, 100);
			g.drawString("磁", 6, 114);
			g.drawString("电", 6, 128);
			g.drawString("流", 6, 142);
			g.drawString("If(A)", 6, 156);
			g.drawString("电枢电流I(A)", 300, 395);
			//画点
			drawPoints(g);
		}
		if(shape.equals(Draw.Eta_P2_LINE)){
			//画方框
			drawRectangle(g);
			
			//花坐标系
			drawCoordinate(g);
			g.drawString("效", 6, 100);
			g.drawString("率", 6, 114);
			g.drawString("Eta(%)", 6, 128);
			g.drawString("输出功率P2(*10^5 kW)", 300, 395);
			//画点
			drawPoints(g);
		}
		
	}
	
	/*画点*/
	public void drawPoints(Graphics g){
		MapedPoint [] array=mapedy_x_line.getArray();
		int [] X=new int[array.length];
		int [] Y=new int[array.length];
		for(int k=0;k<mapedy_x_line.getArray().length;k++){
			X[k]=array[k].getX();
			Y[k]=array[k].getY();
			//System.out.println(" x "+X[k]+" y "+Y[k]);
		}
		
		g.setColor(Color.RED);
		g.drawPolyline(X, Y, array.length);
	}
	/*画坐标系*/
	public void drawCoordinate(Graphics g){
		g.setColor(Color.LIGHT_GRAY);
		int numgridx=Math.abs(mapedcoordinate.getXmax()-mapedcoordinate.getXmin())/mapedcoordinate.getDeltaX();
		int numgridy=Math.abs(mapedcoordinate.getYmax()-mapedcoordinate.getYmin())/mapedcoordinate.getDeltaY();
		for(int i=1;i<numgridx;i++){
			int x1=PxCompute.xadd(mapedcoordinate.getXmin(), mapedcoordinate.getDeltaX()*i);
			int y1=mapedcoordinate.getYmin();
			int x2=x1;
			int y2=mapedcoordinate.getYmax();
			g.drawString(((Double)(coordinate.getXmin()+coordinate.getDeltaX()*i)).toString(), x1, y1+14);
			System.out.println(coordinate.getXmin()+coordinate.getDeltaX()*i);
			g.drawLine(x1, y1, x2, y2);
		}
		g.drawString(((Double)(coordinate.getXmin())).toString(), mapedcoordinate.getXmin(), mapedcoordinate.getYmin()+14);//使字符下沉一个字节
		g.drawString(((Double)(coordinate.getXmax())).toString(), mapedcoordinate.getXmax(), mapedcoordinate.getYmin()+14);
		for(int j=1;j<numgridy;j++){
			int x1=mapedcoordinate.getXmin();
			int y1=PxCompute.yadd(mapedcoordinate.getYmin(), mapedcoordinate.getDeltaY()*j);
			int x2=mapedcoordinate.getXmax();
			int y2=y1;
			g.drawString(((Double)(coordinate.getYmin()+coordinate.getDeltaY()*j)).toString(), x1, y1);
			g.drawLine(x1, y1, x2, y2);
		}
		g.drawString(((Double)(coordinate.getYmin())).toString(), mapedcoordinate.getXmin(), mapedcoordinate.getYmin());
		g.drawString(((Double)(coordinate.getYmax())).toString(), mapedcoordinate.getXmin(), mapedcoordinate.getYmax());
	}
	/*画边框*/
	public void drawRectangle(Graphics g){
		Dimension dimension=this.getPreferredSize();
		
		int width=(int)dimension.getWidth();
		int height=(int)dimension.getHeight();
		int protoox=width/10;
		int protooy=height/10;
		g.setColor(Color.BLACK);
		g.drawRect(protoox, protooy, width*8/10, height*8/10);
	}
	
	
	
	public MapedY_X_line getMapedy_x_line() {
		return mapedy_x_line;
	}
	public void setMapedy_x_line(MapedY_X_line mapedy_x_line) {
		this.mapedy_x_line = mapedy_x_line;
	}
	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public MapedCoordinate getMapedcoordinate() {
		return mapedcoordinate;
	}

	public void setMapedcoordinate(MapedCoordinate mapedcoordinate) {
		this.mapedcoordinate = mapedcoordinate;
	}

	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}


	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	
	
	
	
	
	
}
