package com.xia.draw;

public class Diagrams {
	private Pe_delta_line Pe_delta_line;
	private U_I_line U_I_line;
	private If_I_line If_I_line;
	private Eta_P2_line Eta_P2_line;

	public Pe_delta_line getPe_delta_line() {
		return Pe_delta_line;
	}

	public void setPe_delta_line(Pe_delta_line pe_delta_line) {
		Pe_delta_line = pe_delta_line;
	}

	public U_I_line getU_I_line() {
		return U_I_line;
	}

	public void setU_I_line(U_I_line u_I_line) {
		U_I_line = u_I_line;
	}

	public If_I_line getIf_I_line() {
		return If_I_line;
	}

	public void setIf_I_line(If_I_line if_I_line) {
		If_I_line = if_I_line;
	}

	public Eta_P2_line getEta_P2_line() {
		return Eta_P2_line;
	}

	public void setEta_P2_line(Eta_P2_line eta_P2_line) {
		Eta_P2_line = eta_P2_line;
	}
	public Diagrams(){
		
	}
	public Diagrams(com.xia.draw.Pe_delta_line pe_delta_line,
			com.xia.draw.U_I_line u_I_line, com.xia.draw.If_I_line if_I_line,
			com.xia.draw.Eta_P2_line eta_P2_line) {
		super();
		Pe_delta_line = pe_delta_line;
		U_I_line = u_I_line;
		If_I_line = if_I_line;
		Eta_P2_line = eta_P2_line;
	}
	
}
