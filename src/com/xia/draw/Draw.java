package com.xia.draw;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;

import com.xia.design.Point;

public class Draw {
	private Diagrams diagrams;
	public static final String PE_DELTA_LINE="Pe_delta_line";
	public static final String U_I_LINE="U_I_line";
	public static final String If_I_LINE="if_i_line";
	public static final String Eta_P2_LINE="eta_p2_line";
	
	public void drawLine() {
		//drawPe_delta_line();
		//drawU_I_line();
		//drawIf_I_line();
		drawEta_P2_line();
	}
	
	public void drawPe_delta_line(){
		
		Frame frame=new Frame();
		frame.setBounds(0, 0, 600, 400);
		Dimension dimension=frame.getSize();
		//映射坐标系
		Coordinate coordinate=new Coordinate(0, 180, 0, 2000000, 20, 200000);
		MapedCoordinate mapedcoordinate=mapCoordinate(coordinate, dimension);
		//映射点系
		Pe_delta_line pe_delta_line=diagrams.getPe_delta_line();
		MapedPe_delta_line mapedpe_delta_line=(MapedPe_delta_line) mapY_X_line(pe_delta_line, mapedcoordinate, coordinate);
		
		MyCanvas myc=new MyCanvas();
		myc.setFrame(frame);
		myc.setCoordinate(coordinate);
		myc.setMapedcoordinate(mapedcoordinate);
		myc.setMapedy_x_line(mapedpe_delta_line);
		myc.setShape(PE_DELTA_LINE);
		myc.setPreferredSize(dimension);
		frame.add(myc);
		frame.pack();
		frame.setVisible(true);
		myc.repaint();
	}
	public void drawU_I_line(){
		Frame frame=new Frame();
		frame.setBounds(0, 0, 600, 400);
		Dimension dimension=frame.getSize();
		//映射坐标系
		Coordinate coordinate=new Coordinate(0, 30000, 0, 40000, 5000, 5000);
		MapedCoordinate mapedcoordinate=mapCoordinate(coordinate, dimension);
		//映射点系
		U_I_line u_i_line=diagrams.getU_I_line();
		MapedU_I_line mapedu_i_line=(MapedU_I_line) mapY_X_line(u_i_line, mapedcoordinate, coordinate);
		
		MyCanvas myc=new MyCanvas();
		myc.setFrame(frame);
		myc.setCoordinate(coordinate);
		myc.setMapedcoordinate(mapedcoordinate);
		myc.setMapedy_x_line(mapedu_i_line);
		myc.setShape(U_I_LINE);
		myc.setPreferredSize(dimension);
		frame.add(myc);
		frame.pack();
		frame.setVisible(true);
		myc.repaint();
	}
	
	public void drawIf_I_line(){
		Frame frame=new Frame();
		frame.setBounds(0, 0, 600, 400);
		Dimension dimension=frame.getSize();
		//映射坐标系
		Coordinate coordinate=new Coordinate(0, 30000, 0, 5000, 5000, 500);
		MapedCoordinate mapedcoordinate=mapCoordinate(coordinate, dimension);
		//映射点系
		If_I_line if_i_line=diagrams.getIf_I_line();
		MapedIf_I_line mapedif_i_line=(MapedIf_I_line) mapY_X_line(if_i_line, mapedcoordinate, coordinate);
		
		MyCanvas myc=new MyCanvas();
		myc.setFrame(frame);
		myc.setCoordinate(coordinate);
		myc.setMapedcoordinate(mapedcoordinate);
		myc.setMapedy_x_line(mapedif_i_line);
		myc.setShape(If_I_LINE);
		myc.setPreferredSize(dimension);
		frame.add(myc);
		frame.pack();
		frame.setVisible(true);
		myc.repaint();
	}
	public void drawEta_P2_line(){
		Frame frame=new Frame();
		frame.setBounds(0, 0, 600, 400);
		Dimension dimension=frame.getSize();
		//映射坐标系
		Coordinate coordinate=new Coordinate(0, 6, 0, 100, 1, 10);
		MapedCoordinate mapedcoordinate=mapCoordinate(coordinate, dimension);
		//映射点系
		Eta_P2_line eta_p2_line=diagrams.getEta_P2_line();
		MapedEta_P2_line mapedeta_p2_line=(MapedEta_P2_line) mapY_X_line(eta_p2_line, mapedcoordinate, coordinate);
		
		MyCanvas myc=new MyCanvas();
		myc.setFrame(frame);
		myc.setCoordinate(coordinate);
		myc.setMapedcoordinate(mapedcoordinate);
		myc.setMapedy_x_line(mapedeta_p2_line);
		myc.setShape(Eta_P2_LINE);
		myc.setPreferredSize(dimension);
		frame.add(myc);
		frame.pack();
		frame.setVisible(true);
		myc.repaint();
	}
	
	public MapedY_X_line mapY_X_line(Y_X_line y_x_line,MapedCoordinate mapedcoordinate,Coordinate coordinate){
		Point [] array=y_x_line.getArray();
		MapedPoint [] mapedarray=new MapedPoint [array.length];
		
		for(int i=0;i<array.length;i++){
			int x= PxCompute.xadd(mapedcoordinate.getXmin(), (int)(array[i].getX()*(mapedcoordinate.getDeltaX()/coordinate.getDeltaX()))) ;
			int y= PxCompute.yadd(mapedcoordinate.getYmin(), (int)(array[i].getY()*(mapedcoordinate.getDeltaY()/coordinate.getDeltaY()))) ;
			MapedPoint mapedpoint=new MapedPoint(x, y);
			mapedarray[i]=mapedpoint;
		}
		if(y_x_line instanceof Pe_delta_line){
			return new MapedPe_delta_line(mapedarray);
		}else if(y_x_line instanceof U_I_line){
			return new MapedU_I_line(mapedarray);
		}else if(y_x_line instanceof If_I_line){
			return new MapedIf_I_line(mapedarray);
		}else if(y_x_line instanceof Eta_P2_line){
			return new MapedEta_P2_line(mapedarray);
		}else{
			try {
				throw new Exception("无此曲线");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return null;
			}
		}
	}
	
	public MapedCoordinate mapCoordinate(Coordinate coordinate,Dimension dimension){
		MapedCoordinate mapedcoordinate=new MapedCoordinate();
		int deltax=(int)((dimension.width*8/10)*(coordinate.getDeltaX()/(coordinate.getXmax()-coordinate.getXmin())));
		int deltay=(int)((dimension.height*8/10)*(coordinate.getDeltaY()/(coordinate.getYmax()-coordinate.getYmin())));
		mapedcoordinate.setXmin(dimension.width/10);
		mapedcoordinate.setXmax(dimension.width*9/10);
		mapedcoordinate.setYmin(dimension.height*9/10);
		mapedcoordinate.setYmax(dimension.height/10);
		mapedcoordinate.setDeltaX(deltax);
		//System.out.println(" deltax "+deltax);
		mapedcoordinate.setDeltaY(deltay);
		//System.out.println(" deltay "+deltay);
		return mapedcoordinate;
	}
	public Diagrams getDiagrams() {
		return diagrams;
	}
	public void setDiagrams(Diagrams diagrams) {
		this.diagrams = diagrams;
	}
	
}
