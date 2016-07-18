package com.xia.design;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//author:made by xia.shunying
public class Test {
	public static void inputParam(){
		/*Main.SN=1111000;
		Main.COSPHIN=0.9;
		Main.UN=26000;
		Main.NN=107.1;
		Main.NR=202;
		Main.FN=50;
		Main.M=3;
		Main.D1=1800;
		Main.DI=1680;
		Main.Z=672;
		Main.a=7;
		Main.NS=2;
		Main.DELTA=3.6;
		Main.DELTAMax=4.86;
		Main.bp=70;
		Main._a=2.24;
		Main._b=7.10;
		Main._C=82; 
		Main.bs=2.85;
		Main.hs=25.6;
		Main.hk=0.65;
		Main.deltai=0.599;
		Main.nv=77;
		Main.bv=0.6;
		Main.lt=365;
		Main.KFe=0.93;
		Main.a1=1.8;//(cm)
		Main.c1=1.8;
		Main.lp=360;
		Main.lm=360;
		Main.t2=7.85;//(cm)
		Main.bsh=0.001;
		Main.hsh=0;
		Main.hp=5.35;//(cm)zijichatude
		Main.bm=54;//(cm)
		Main.hm=28;//(cm)
		Main.DELTAp=0.20;//(cm)
		Main.dampringtype=0;//shanxing
		Main.damphere=1;
		Main.windingtype=0;
		Main.af=14;//(mm)
		Main.bf=110;
		Main.Wf=16.5;
		Main.dampmate=0;
		Main.windingmate=0;
		Main.dB=2.4;
		Main.lB=360;
		Main.aR=4.75;
		Main.bR=3;
		Main.AR=14.25;
		Main.DR=1671.3;
		Main.isdamperlink=1;
		Main.Si_Fe_mate="Wx";
		Main.deltai=0.624;//(cm)
		Main.h2=25.2;//(cm)
		Main.AirCool=0;
		Main.DELTApp=0.2;//(cm)
		Main.nB=9;//zunitiaogenshu
*/
		
		/*Main.SN=1111000;
		Main.COSPHIN=0.9;
		Main.UN=24000;
		Main.NN=83.3;
		Main.NR=162;
		Main.FN=50;
		Main.M=3;
		Main.D1=2153;
		Main.DI=2040;
		Main.Z=864;
		Main.a=8;
		Main.NS=2;
		Main.DELTA=3.7;
		Main.DELTAMax=5.0;
		Main.bp=63;
		Main._a=2.24;
		Main._b=6.7;
		Main._C=82; 
		Main.bs=2.67;
		Main.hs=25.4;
		Main.hk=0.65;
		Main.deltai=0.553;
		Main.nv=69;
		Main.bv=0.6;
		Main.lt=325;
		Main.KFe=0.93;
		Main.a1=1.8;//(cm)
		Main.c1=1.8;
		Main.lp=320;
		Main.lm=320;
		Main.t2=7.42;//(cm)
		Main.bsh=0.001;
		Main.hsh=0;
		Main.hp=5.35;//(cm)zijichatude p101
		Main.bm=48;//(cm)
		Main.hm=29.5;//(cm)
		Main.DELTAp=0.20;//(cm)
		Main.dampringtype=0;//shanxing
		Main.damphere=1;
		Main.windingtype=0;
		Main.af=14;//(mm)
		Main.bf=110;
		Main.Wf=17.5;
		Main.dampmate=0;
		Main.windingmate=0;
		Main.dB=2.3;
		Main.lB=320;
		Main.aR=3.87;//AR/dB
		Main.bR=3;
		Main.AR=11.63;
		Main.DR=1671.3;
		Main.isdamperlink=1;
		Main.Si_Fe_mate="Wx";
		Main.DELTAi=0.578;//(cm)
		Main.h2=26.7;//(cm)
		Main.AirCool=0;
		Main.DELTApp=0.2;//(cm)
		Main.nB=8;//zunitiaogenshu
*/		
		
		
		//My Data
		Main.SN=555600;
		//Main.PN=500040;
		Main.COSPHIN=0.9;
		Main.UN=20000;
		Main.NN=75;
		Main.NR=151;
		Main.vN=74;
		Main.FN=50;
		Main.M=3;
		Main.D1=1971.0;  
		Main.DI=1876.6;
		Main.Z=840;
		Main.a=8;
		Main.NS=2;
		//Main.DELTA=3.1; //(1)
		//Main.DELTA=4.1; //(2)
		Main.DELTA=2.1; //(3)
		//Main.DELTAMax=4.14; //(1)
		//Main.DELTAMax=5.14; //(2)
		Main.DELTAMax=3.14; //(3)
		Main.bp=51;
		
		Main.Y1=9;
		Main.b=3;
		Main.c=1;
		Main.d=2;
		
		Main._a=1.9;
		Main._b=6.7;
		Main._C=80; 
		Main.bs=2.49;
		Main.hs=21.1;
		Main.hk=0.65;
		Main.deltai=0.461; 
		Main.nv=68;
		Main.bv=0.6;
		Main.lt=320; //(1)
		//Main.lt=345; //(2)
		//Main.lt=295; //(3)
		Main.KFe=0.93;
		Main.a1=1.8;//(cm)
		Main.c1=1.8;
		Main.lp=312; //(1)
		//Main.lp=337;  //(2)
		//Main.lp=287;  //(3)
		Main.lm=312; //(1)
		//Main.lm=337; //(2)
		//Main.lm=287; //(3)
		Main.t2=7.85;//(cm)
		Main.bsh=0.5;//------------
		Main.hsh=0.3;//---------
		Main.hp=8.30;//(cm)zijichatude
		Main.bm=42;//(cm)
		//Main.hm=24.3;//(cm)(1)
		//Main.hm=24.3-1;//(2)
		Main.hm=24.3+1;//(3)
		
		Main.DELTAp=8;//(cm)
		Main.dampringtype=0;//扇形阻尼环
		Main.damphere=1;//有无阻尼环
		Main.windingtype=0;
		Main.af=16;//(mm)
		Main.bf=103;//(mm)
		Main.Wf=12.5;
		Main.dampmate=0;
		Main.windingmate=0;
		
		Main.dB=22;//阻尼条直径
		Main.lB=312;//(1)
		//Main.lB=337;//(2)
		//Main.lB=287;//(3)
		Main.aR=1.5;//阻尼环厚度
		Main.bR=4.8;//阻尼环高度
		Main.AR=7.00;
		Main.DR=1869.4; //(1)
		//Main.DR=1867.4; //(2)
		//Main.DR=1871.4;  //(3)
		Main.isdamperlink=1;
		Main.Si_Fe_mate="Wx";
		Main.h2=22.1;//(cm)励磁线圈侧边高度
		Main.AirCool=0;
		Main.DELTApp=0.2;//(cm)
		Main.nB=6;//阻尼条根数

		
		
		
		/*//xinjiashuju
		Main.SN=611111;
		//Main.PN=500040;
		Main.COSPHIN=0.9;
		Main.UN=18000;
		Main.NN=142.9;
		Main.NR=279;
		Main.vN= 87.86;
		Main.FN=50;
		Main.M=3;
		Main.D1=1279.2;//(1)
		Main.DI=1181.0;//(1)
		Main.Z=486;
		Main.a=6;
		Main.NS=2;
		//Main.DELTA=3.35; //(1)
		//Main.DELTA=4.1; //(2)
		Main.DELTA=3.0; //(3)
		//Main.DELTAMax=5.025; //(1)
		//Main.DELTAMax=5.14; //(2)
		Main.DELTAMax=4.5; //(3)
		Main.bp=66.7;
		
		Main.Y1=10;
		Main.b=3;
		Main.c=6;
		Main.d=7;
		
		Main._a=2.24;
		Main._b=8;
		Main._C=66; 
		Main.bs=2.69;
		Main.hs=20.03;
		Main.hk=0.65;
		Main.deltai=0.461; 
		Main.nv=67;
		Main.bv=0.4;
		Main.lt=288.3; //(1)
		//Main.lt=300; //(2)
		//Main.lt=295; //(3)
		Main.KFe=0.98;
		Main.a1=1.8;//(cm)
		Main.c1=1.8;
		Main.lp=288.3; //(1)
		//Main.lp=300;  //(2)
		//Main.lp=287;  //(3)
		Main.lm=288.3; //(1)
		//Main.lm=300; //(2)
		//Main.lm=287; //(3)
		Main.t2=6.26;//(cm)
		Main.bsh=0.1;//------------
		Main.hsh=0.3;//---------
		Main.hp=6.2;//(cm)zijichatude
		Main.bm=53.3;//(cm)
		Main.hm=25.5;//(cm)
		Main.DELTAp=5;//(cm)
		Main.dampringtype=0;//扇形阻尼环
		Main.damphere=1;//有无阻尼环
		Main.windingtype=0;
		Main.af=10.6;//(mm)
		Main.bf=136;//(mm)
		Main.Wf=21;
		Main.dampmate=0;
		Main.windingmate=0;
		
		Main.dB=20.49;//阻尼条直径(mm)
		Main.lB=335.911;//(1)
		//Main.lB=347.61;//(2)
		//Main.lB=287;//(3)
		Main.aR=8.6;//阻尼环厚度
		Main.bR=3;//阻尼环高度
		Main.AR=26.8216;
		Main.DR=1168.3; //(1)
		//Main.DR=1867.4; //(2)
		//Main.DR=1169.0;  //(3)
		Main.isdamperlink=1;
		Main.Si_Fe_mate="Wx";
		Main.h2=22.26;//(cm)励磁线圈侧边高度
		Main.AirCool=0;
		Main.DELTApp=0.2;//(cm)
		Main.nB=7;//阻尼条根数
		//Main.nB=9;
*/		
		
		
		/*//靖霖霖在这改成你的数据，我的已经保存了
		Main.SN=611111;     
		//Main.PN=500040;
		Main.COSPHIN=0.9;
		Main.UN=18000;
		Main.NN=142.9;		//转速
		Main.NR=279;	//飞逸转速
		Main.vN=74;		//转子圆周速度
		Main.FN=50;
		Main.M=3;		//相数
		Main.D1=1279.2;  //定子外径
		Main.DI=1181.0;	 //定子内径
		Main.Z=504;		 //槽数
		Main.a=6;		//并联支路数
		Main.NS=2;		//每槽导体数
		Main.DELTA=3.0; //(1)		//气隙
		//Main.DELTA=4.1; //(2)
		//Main.DELTA=2.1; //(3)
		Main.DELTAMax=4.5; //(1)	//最大气隙
		//Main.DELTAMax=5.14; //(2)
		//Main.DELTAMax=3.14; //(3)
		Main.bp=66.7;						//极靴宽度
		
		Main.Y1=10;						//第一节距
		Main.b=0;						//分数槽三个数
		Main.c=4;
		Main.d=1;
		
		Main._a=2;				//导线高度
		Main._b=7;				//导线宽度
		Main._C=66; 				//C
		Main.bs=2.945;				//定子槽宽
		Main.hs=14.725;				//高
		Main.hk=0.5;				//槽楔高
		Main.deltai=0.461; 			//定子线圈距原单边厚度   
		Main.nv=67;					//通风槽
		Main.bv=0.4;				//通风槽宽
		Main.lt=288.3; //(1)			//总长度
		//Main.lt=345; //(2)
		//Main.lt=295; //(3)
		Main.KFe=0.95;
		Main.a1=1.8;//(cm)			//梯形部分高
		Main.c1=1.8;				//梯形部分宽
		Main.lp=288.3; //(1)
		//Main.lp=337;  //(2)
		//Main.lp=287;  //(3)
		Main.lm=288.3; //(1)
		//Main.lm=337; //(2)
		//Main.lm=287; //(3)
		Main.t2=6.26;//(cm)			//阻尼条节距
		Main.bsh=0.1;//------------		//阻尼绕组槽口宽
		Main.hsh=0.3;//---------		//阻尼绕组槽口高
		Main.hp=6.2;//(cm)zijichatude		//极靴高度
		Main.bm=53.3;//(cm)					//极靴宽度
		Main.hm=25.5;//(cm)					//极身宽度
		Main.DELTAp=5;//(cm)				//磁极压板厚度
		Main.dampringtype=0;//扇形阻尼环		//不用改
		Main.damphere=1;//有无阻尼环			//不用改
		Main.windingtype=0;					//波绕组
		Main.af=16;//(mm)					//励磁铜线厚
		Main.bf=103;//(mm)					//励磁铜线宽
		Main.Wf=12.5;						//励磁绕组每极匝数
		Main.dampmate=0;					//不用改 阻尼材料铜
		Main.windingmate=0;					//不用改 磁极绕组材料铜
		
		Main.dB=22;//阻尼条直径
		Main.lB=312;//(1)
		//Main.lB=337;//(2)
		//Main.lB=287;//(3)
		Main.aR=1.5;//阻尼环厚度
		Main.bR=4.8;//阻尼环高度
		Main.AR=7.00;
		Main.DR=1869.4; //(1)
		//Main.DR=1867.4; //(2)
		//Main.DR=1871.4;  //(3)
		Main.isdamperlink=1;
		Main.Si_Fe_mate="Wx";
		Main.h2=22.1;//(cm)励磁线圈侧边高度
		Main.AirCool=0;
		Main.DELTApp=0.2;//(cm)			//磁极冲片厚
		Main.nB=6;//阻尼条根数*/
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diagrams d=new Diagrams();
		//Tables tables=new Tables();
		
		/*W1_VLINES k1_=d.getW1_vlines();
		Line line=k1_.getLineR();
		Point p=new Point();
		p.setX(87);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*K1_DELTAMAX_PER_DELTALINES k1_=d.getK1_deltamax_per_deltalines();
		Line line=k1_.getLine();
		Point p=new Point();
		p.setX(1.7);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
/*		K_LT_PER_TALLINES k_lt_per_tallines=d.getK_lt_per_tallines();
		Line line=k_lt_per_tallines.getLine();
		Point p=new Point();
		p.setX(1.7);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*W1_VLINES k_vlines=d.getW1_vlines();
		Line line=k_vlines.getLineR();
		Point p=new Point();
		p.setX(32);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*K_COSPHILINES k_cosphilines=d.getK_cosphilines();
		Line line=k_cosphilines.getLine();
		Point p=new Point();
		p.setX(0.86);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*CS_TALLINES cs=d.getCs_tallines();
		Line line=cs.getLine();
		Point p=new Point();
		p.setX(35);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*CFE_LT_PER_TALLINES cfe_lt=d.getCfe_lt_per_tallines();
		Line line=cfe_lt.getLine();
		Point p=new Point();
		p.setX(1.6);
		MyMath.Newton(line.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*A2_71_DELTALINES a2_71=d.getA2_71_deltalines();
		Line line_2_0=a2_71.getLine(1.75);
		Point p=new Point();
		p.setX(0.035);
		MyMath.Newton(line_2_0.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*A1_71_ALPHAPLINES a1_71=d.getA1_71_alphaplines();
		Line line_2_0=a1_71.getLine(1.75);
		Point p=new Point();
		p.setX(0.625);
		MyMath.Newton(line_2_0.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*B1_160_DELTA_PER_TALLINES b1_160=d.getB1_160_delta_per_tallines();
		Line line_2_0=b1_160.getLine(1.75);
		Point p=new Point();
		p.setX(0.015);
		MyMath.Newton(line_2_0.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*A1_70_DELTA_PER_TALLINES a1_70=d.getA1_70_delta_per_tallines();
		Line line_0_5_5=a1_70.getLine(0.56);
		Point p=new Point();
		p.setX(0.015);
		MyMath.Newton(line_0_5_5.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*int [] i={1,2};
		System.out.println(i.length);
		
		FE_LOSE_B fe_lose_blines=d.getFe_lose_blines();
		Line lineW315_50=fe_lose_blines.getLineW315_50();
		Point p_fe_lose_b=new Point();
		p_fe_lose_b.setX(5050);
		MyMath.ToLine(lineW315_50.getArray(), p_fe_lose_b);
		System.out.println(p_fe_lose_b.getX()+","+p_fe_lose_b.getY());*/
		
		/*ArrayList<GAMA_MATE> gama_mate_list=tables.getGama_mate_list();
		Iterator it=gama_mate_list.iterator();
		GAMA_MATE gama_mate=null;
		while(it.hasNext()){
			GAMA_MATE gama_mate_next=(GAMA_MATE) it.next();
			if(gama_mate_next.getId().toString().equals("Wx".toString())){
				gama_mate=gama_mate_next;
				System.out.println(gama_mate.getGama());
			}
		}*/
		
		/*KAD_ALPHAPLINES kad_alphapines=d.getKad_alphaplines();
		Line line0_0_1=kad_alphapines.getLine();
		Point pkad=new Point();
		pkad.setX(0.63);
		MyMath.Newton(line0_0_1.getArray(), pkad);
		System.out.println(pkad.getX()+","+pkad.getY());*/
		
		/*K2_DELTA_PER_TALLINES k2_delta_per_tallines=d.getK2_delta_per_tallines();
		Line line0_0_1=k2_delta_per_tallines.getLine(0.012);
		Point pk2_delta_per_tal=new Point();
		pk2_delta_per_tal.setX(0.625);
		MyMath.Newton(line0_0_1.getArray(), pk2_delta_per_tal);
		System.out.println(pk2_delta_per_tal.getX()+","+pk2_delta_per_tal.getY());*/
		
		/*K1_ALPHAPLINES k1_alphalines=d.getK1_alphaplines();
		Line line1_0=k1_alphalines.getLine(1.2);
		Point pk1_alpha=new Point();
		pk1_alpha.setX(0.675);
		MyMath.Newton(line1_0.getArray(), pk1_alpha);
		System.out.println(pk1_alpha.getX()+","+pk1_alpha.getY());
		*/
		/*D_DELTA_PER_TALLINES d_delta=d.getD_delta_per_tallines();
		Line line1_0=d_delta.getLine(1.2);
		Point p1_0=new Point();
		p1_0.setX(0.025);
		MyMath.Newton(line1_0.getArray(), p1_0);
		System.out.println(p1_0.getX()+","+p1_0.getY());*/
		
		/*C_DELTA_PER_TALLINES c_delta=d.getC_delta_per_tallines();
		Line line0_5_5=c_delta.getLine(0.56);
		Point p0_5_5=new Point();
		p0_5_5.setX(0.025);
		MyMath.Newton(line0_5_5.getArray(), p0_5_5);
		System.out.println(p0_5_5.getX()+","+p0_5_5.getY());*/
		
		/*B_BP_PER_TALLINES b_bp=d.getB_bp_per_tallines();
		Line line1_0=b_bp.getLine(1.2);
		Point p=new Point();
		p.setX(0.66);
		MyMath.Newton(line1_0.getArray(), p);
		System.out.println(p.getX()+","+p.getY());*/
		
		/*Point [] points={new Point(1,0),new Point(3,2),new Point(4,15),new Point(7,12)};
		Point p2=new Point();
		p2.setX(7);
		MyMath.Newton(points , p2);
		System.out.println(p2.getX()+","+p2.getY());*/
		
		//System.out.println(Math.sin(3.14/6));
		
		//System.out.println(Main.gongyueshu(2,3));
		//Main.slouteABC(22,8);
		/*Tables t=new Tables();
		ArrayList qlist=t.getQ_beta_y1_kdp1_kp1list();
		Q q=new Q(4,0,1);
		Iterator i=qlist.iterator();
		while(i.hasNext()){
			Q_Beta_Y1_Kdp1_Kp1 qbykk=(Q_Beta_Y1_Kdp1_Kp1) i.next();
			Q qq=qbykk.getQ();
			if(q.equals(qq)){
				double beta=0.916;
				if(qbykk.getBeta()==0.916){
					System.out.println(qq.getB()+"-"+qq.getC()+"-"+qq.getD()+"-"+qbykk.getBeta());
				}
				
			}
		}*/
	//}

}
