package com.xia.design;

import java.util.ArrayList;

public class Tables {
	private   ArrayList<Q_Beta_Y1_Kdp1_Kp1> q_beta_y1_kdp1_kp1list;
	private ArrayList<GAMA_MATE> gama_mate_list;  
	
	public ArrayList<GAMA_MATE> getGama_mate_list() {
		return gama_mate_list;
	}

	public void setGama_mate_list(ArrayList<GAMA_MATE> gama_mate_list) {
		this.gama_mate_list = gama_mate_list;
	}

	public ArrayList getQ_beta_y1_kdp1_kp1list() {
		return q_beta_y1_kdp1_kp1list;
	}

	public void setQ_beta_y1_kdp1_kp1list(ArrayList q_beta_y1_kdp1_kp1list) {
		this.q_beta_y1_kdp1_kp1list = q_beta_y1_kdp1_kp1list;
	}

	public Tables() {
		super();
		initialQ_beta_y1_kdp1_kp1list();
		initialGama_Matelist();
	}
	
	public   void initialGama_Matelist(){
		gama_mate_list=new ArrayList();
		GAMA_MATE gama_mateD11=new GAMA_MATE("D11",7.80);
		GAMA_MATE gama_mateD12=new GAMA_MATE("D12",7.80);
		GAMA_MATE gama_mateD21=new GAMA_MATE("D21",7.75);
		GAMA_MATE gama_mateD31=new GAMA_MATE("D31",7.65);
		GAMA_MATE gama_mateD41=new GAMA_MATE("D41",7.55);
		GAMA_MATE gama_mateD42=new GAMA_MATE("D42",7.55);
		GAMA_MATE gama_mateD43=new GAMA_MATE("D43",7.55);
		GAMA_MATE gama_mateWx=new GAMA_MATE("Wx",7.60);
		gama_mate_list.add(gama_mateD11);
		gama_mate_list.add(gama_mateD12);
		gama_mate_list.add(gama_mateD21);
		gama_mate_list.add(gama_mateD31);
		gama_mate_list.add(gama_mateD41);
		gama_mate_list.add(gama_mateD42);
		gama_mate_list.add(gama_mateD43);
		gama_mate_list.add(gama_mateWx);
		
		
		
	}

	public   void initialQ_beta_y1_kdp1_kp1list(){
		q_beta_y1_kdp1_kp1list=new ArrayList();
		Q q_1_1_2=new Q(1,1,2); 
		Q q_1_4_5     =new Q(1,4,5);
		Q q_1_7_8     =new Q(1,7,8);
		Q q_2_0_1     =new Q(2,0,1);
		Q q_2_1_10     =new Q(2,1,10);
		Q q_2_1_8     =new Q(2,1,8);
		Q q_2_1_7    =new Q(2,1,7);
		Q q_2_1_5    =new Q(2,1,5);
		
		Q q_2_1_2     =new Q(2,1,2);
		Q q_2_4_7     =new Q(2,4,7);
		Q q_2_4_5     =new Q(2,4,5);
		Q q_2_7_8     =new Q(2,7,8);
		Q q_3_0_1     =new Q(3,0,1);
		Q q_3_1_5     =new Q(3,1,5);
		Q q_3_1_4     =new Q(3,1,4);
		Q q_3_3_7     =new Q(3,3,7);
		Q q_3_1_2     =new Q(3,1,2);
		Q q_3_3_4     =new Q(3,3,4);
		Q q_3_6_7     =new Q(3,6,7);
		Q q_4_0_1     =new Q(4,0,1);
		Q q_4_1_8     =new Q(4,1,8);
		Q q_4_1_5     =new Q(4,1,5);
		Q q_4_1_2     =new Q(4,1,2);
		Q q_4_4_5     =new Q(4,4,5);
		Q q_4_7_8     =new Q(4,7,8);
		Q q_5_0_1     =new Q(5,0,1);
		Q q_5_1_2     =new Q(5,1,2);
		Q q_6_0_1     =new Q(6,0,1);
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_1_1_2,5,0.89,0.94,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_1_4_5,6,0.926,0.948,0.994));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_1_4_5,5,0.74,0.876,0.944));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_1_7_8,6,0.89,0.94,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_0_1,6,0.833,0.934,0.966));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_10,7,0.952,0.953,0.998));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_10,6,0.794,0.912,0.955));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_8,7,0.94,0.95,0));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_8,6,0.784,0.90,0.943));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_7,7,0.933,0.95,0.995));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_7,6,0.778,0.90,0.94));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_5,7,0.91,0.945,0.99));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_5,6,0.76,0.887,0.925));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_2,8,0.933,0.95,0.995));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_2,7,0.8,0.907,0.951));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_1_2,6,0.667,0.827,0.866));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_4_7,8,0.907,0.944,0.989));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_4_7,7,0.778,0.90,0.94));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_4_5,9,0.952,0.953,0.997));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_4_5,8,0.833,0.922,0.966));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_4_5,7,0.715,0.862,0.902));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_7_8,9,0.927,0.948,0.994));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_2_7_8,8,0.91,0.913,0.956));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_0_1,10,1,0.96,1));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_0_1,9,0.89,0.945,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_0_1,8,0.778,0.902,0.94));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_0_1,7,0.667,0.831,0.866));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_5,10,0.938,0.95,0.995));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_5,9,0.833,0.922,0.956));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_4,10,0.923,0.948,0.993));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_4,9,0.82,0.916,0.959));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_4,8,0.718,0.862,0.903));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_3_7,10,0.875,0.937,0.981));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_3_7,9,0.778,0.902,0.94));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_2,11,0.952,0.953,0.997));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_2,10,0.857,0.93,0.974));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_2,9,0.762,0.884,0.93));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_1_2,8,0.667,0.831,0.866));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_3_4,11,0.89,0.94,0.985));
		
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_3_4,10,0.80,0.907,0.951));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_6_7,11,0.865,0.934,0.978));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_3_6_7,10,0.778,0.902,0.94));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_0_1,12,0.916,0.95,0.991));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_0_1,11,0.833,0.926,0.966));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_0_1,10,0.75,0.885,0.924));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_0_1,9,0.667,0.831,0.866));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_8,12,0.89,0.94,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_8,11,0.808,0.911,0.955));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_5,12,0.872,0.935,0.98));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_5,11,0.793,0.905,0.948));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_2,13,0.89,0.94,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_2,12,0.815,0.916,0.959));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_1_2,11,0.74,0.877,0.917));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_4_5,14,0.902,0.943,0.988));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_4_5,13,0.833,0.922,0.966));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_7_8,14,0.89,0.94,0.985));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_4_7_8,13,0.82,0.916,0.959));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_5_0_1,14,0.866,0.935,0.978));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_5_0_1,13,0.80,0.91,0.951));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_5_0_1,12,0.733,0.875,0.914));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_5_1_2,14,0.79,0.902,0.944));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_5_1_2,15,0.848,0.928,0.972));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_6_0_1,16,0.833,0.925,0.966));
		q_beta_y1_kdp1_kp1list.add(new Q_Beta_Y1_Kdp1_Kp1(q_6_0_1,15,0.778,0.90,0.94));
		
		
		
		
		
	}
}
