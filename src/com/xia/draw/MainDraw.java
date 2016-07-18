package com.xia.draw;

import com.xia.design.*;

public class MainDraw {
	public static Diagrams diagrams=new Diagrams();
	
	public static void main(String[] args) {
		
		
		/*Point [] arrayPe_delta_line={
			new Point(0,0),new Point(20,800000),new Point(40,1400000),	
			new Point(80,1800000),new Point(160,500000),new Point(180,0)
		};
		Pe_delta_line Pe_delta_line=new Pe_delta_line();
		Pe_delta_line.setArray(arrayPe_delta_line);
		diagrams.setPe_delta_line(Pe_delta_line);
		
		
		//U V I A
		Point [] arrayU_I_line={
			new Point(0,32000),
			new Point(10000,30000),new Point(20000,27500),new Point(30000,24000)	
			
		};
		U_I_line u_i_line=new U_I_line();
		u_i_line.setArray(arrayU_I_line);
		diagrams.setU_I_line(u_i_line);
		
		//If A I A
		Point [] arrayIf_I_line={
				new Point(0,2000),new Point(15000,2500),new Point(30000,3700)	
				
		};
		If_I_line if_i_line=new If_I_line();
		if_i_line.setArray(arrayIf_I_line);
		diagrams.setIf_I_line(if_i_line);

		//Eta % P2 10^5
		Point [] arrayEta_P2_line={
				new Point(0,0),new Point(1,90),new Point(2,95),	
				new Point(10,100)
		};
		Eta_P2_line eta_p2_line=new Eta_P2_line();
		eta_p2_line.setArray(arrayEta_P2_line);
		diagrams.setEta_P2_line(eta_p2_line);*/
		
		
		//solutePe_delta();
		/*Draw draw=new Draw();
		draw.setDiagrams(diagrams);
		draw.drawLine();*/
		
	}
	
	public static void soluteIf_I(){
		//给定点
		Point [] arrayIf_I_line={
				new Point(0,2047),new Point(15000,2600),new Point(30000,3767)	
				
		};
		If_I_line if_i_line=new If_I_line();
		if_i_line.setArray(arrayIf_I_line);
		diagrams.setIf_I_line(if_i_line);
		Draw draw=new Draw();
		draw.setDiagrams(diagrams);
		draw.drawLine();
	}
	
	public static void soluteU_I(){
		
		//给定点
		Point [] arrayU_I_line={
			new Point(0,32500),new Point(24670.6,26000),new Point(30000,24000)
		};
		
		
		U_I_line u_i_line=new U_I_line();
		u_i_line.setArray(arrayU_I_line);
		diagrams.setU_I_line(u_i_line);
		Draw draw=new Draw();
		draw.setDiagrams(diagrams);
		draw.drawLine();
	}
	
	public static void soluteEta_P2(){
		double P2min=0;
		double P2max=600000;
		double P2=P2min;
		double DeltaP2=10000.0;//每1kW取点
		int num=(int)((P2max-P2min)/DeltaP2)+1;
		//double Eta=0.0;
		double Eta=0;
		Point [] arrayEta_P2_line=new Point[num];
		double PN=0;//P2;
		double SN=0;//PN/Main.COSPHIN;//3
		
		double IN=0;//SN*1000)/(Math.sqrt(3)*Main.UN);//6
		double IPHI=0;//IN;//7
		double IA=0;//IPHI/Main.a;//19
		double IS=0;//Main.NS*IA;//20
		double t1=(3.14*Main.DI)/Main.Z;//21  ( cm)
		double A=0;//IS/t1;//23  (A/cm)
		double PFei=0;
		double PFej=0;
		double Pad=0;
		double Pcu=0;
		double Pcuf=0;
		double Pfv=0;
		double PFe=0;
		double Pk=0;
		double Pmcc=0;
		double EPSILONP=0;
		for(int i=0;i<num;i++){
			arrayEta_P2_line[i]=new Point(P2/100000.0,Eta*100.0);
			P2=P2+DeltaP2;
			
			PN=P2;
			SN=PN/Main.COSPHIN;//3
			IN=(SN*1000)/(Math.sqrt(3)*Main.UN);//6
			IPHI=IN;//7
			IA=IPHI/Main.a;//19
			IS=Main.NS*IA;//20
			A=IS/t1;//23  (A/cm)
			
			PFei=0.9*SN/A;
			PFej=0.08*SN/A;
			Pad=0.07*SN*(Main.tal+A*(1+Main.Xd))/(A*Main.tal);
			Pcu=9*A*Main.DI*Main.lc*0.0000001;
			Pcuf=0.8*2*Main.P*Main.lt*Main.Ffn*Math.sqrt(Main.SITAf)*0.0000001;
			Pfv=0.171*(Main.vN/10)*(Main.vN/10)*(PFei+PFej+Pad+Pcu+Pcuf)/(1.1*25-0.171*(Main.vN/10)*(Main.vN/10));
			
			PFe=PFei+PFej+Main.PFep0;
			Pk=Pcu+Main.Pcu3+Main.Ppl+Main.Pkv+Pad+Main.Pt3;
			Pmcc=Pfv+498;
			EPSILONP=PFe+Pk+Pcuf+Pmcc;
			Eta=1-(EPSILONP/(PN+EPSILONP));
			
		}
		
		System.out.println("P2----------------------------");
		for(int i=0;i<num;i++){
			
			System.out.println(arrayEta_P2_line[i].getX());
		}
		System.out.println("Eta----------------------------");
		for(int i=0;i<num;i++){
			
			System.out.println(arrayEta_P2_line[i].getY());
		}
		
		Eta_P2_line eta_p2_line=new Eta_P2_line();
		eta_p2_line.setArray(arrayEta_P2_line);
		diagrams.setEta_P2_line(eta_p2_line);
		Draw draw=new Draw();
		draw.setDiagrams(diagrams);
		draw.drawLine();
		
	}
	
	public static void solutePe_delta(){
		/*double U=20000;//Main.UN;;my
		double E0=11547.005383792515;//Main.UPHI;;my
		int m=3;//Main.M;my
		double Xd= 0.6616406271881907;//Main.Xd;my
		double Xq=0.42397638126825654;//Main.Xq;my
*/		
		double U=18000;//Main.UN;;yu
		double E0= 10392.304845413264;//Main.UPHI;;yu
		int m=3;//Main.M;yu
		double Xd= 0.7268;//Main.Xd;yu
		double Xq=0.5155;//Main.Xq;yu
		double deltamin=0;
		double deltamax=Math.PI;
		double Pemain=0;
		double delta=deltamin;
		double Pe=0;
		/*Point [] arrayPe_delta_line={
				new Point(0,0),new Point(20,800000),new Point(40,1400000),	
				new Point(80,1800000),new Point(160,500000),new Point(180,0)
		};*/
		double Deltadelta=Math.PI/180;//每一度取点
		int num=(int)((deltamax-deltamin)/Deltadelta)+1;
		Point [] arrayPe_delta_line=new Point[num];
		for(int i=0;i<num;i++){
			if(delta<=deltamax){
				Pe=(1.0*m*U*E0/Xd)*Math.sin(delta)+(m*U*U*(1.0/Xq-1.0/Xd)/2.0)*Math.sin(2.0*delta) ;
				arrayPe_delta_line[i]=new Point(delta*180/Math.PI,Pe/1000.0);
				
				delta=delta+Deltadelta;
			}else{
				break;
			}
			
			
		}
		System.out.println("delta----------------------------");
		for(int i=0;i<num;i++){
			
			System.out.println(arrayPe_delta_line[i].getX());
		}
		System.out.println("Pe----------------------------");
		for(int i=0;i<num;i++){
			
			System.out.println(arrayPe_delta_line[i].getY());
		}
		Pe_delta_line Pe_delta_line=new Pe_delta_line();
		Pe_delta_line.setArray(arrayPe_delta_line);
		diagrams.setPe_delta_line(Pe_delta_line);
		Draw draw=new Draw();
		draw.setDiagrams(diagrams);
		draw.drawLine();
	}
}
