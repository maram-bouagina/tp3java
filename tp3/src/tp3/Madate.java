package tp3;

public class Madate {
	private int jour;
	private int mois;	
	private int annee;
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
	public int getjour() {
		return jour;
	}
	public int getmois() {
		return mois;
	}
	public int getannee() {
		return annee;
	}
	public void setjour(int jour) {
		this.jour=jour;
	}
	public void setmois(int mois) {
		this.mois=mois;
	}
	public void setannee(int annee) {
		this.annee=annee;
		this.jour=1;
		this.mois=1;
	}
	public Madate(int jour,int mois,int annee) {
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public Madate(int annee) {
		this.annee=annee;
	}
	public void ajouterUnJour() {
		if((jour==31) && ((mois==1)||(mois==3)||(mois==5)||(mois==7)||(mois==9)||(mois==11))) {
			jour=1;
			mois++;
		}
		else if((jour==30) && ((mois==4)||(mois==6)||(mois==8)||(mois==10)||(mois==12))) {
			jour=1;
			if(mois==13) {
				mois=1;
				annee++;
			}	
		}
		else if((jour==29) && (mois==2)) {
			jour=1;
			mois++;
		}
		else {
			jour++;
		}
	}
	public void ajouterPluseursJours(int n) {
		for(int i=0;i<n;i++) {
			ajouterUnJour();
		}
	}
	public void ajouterUnMoi() {
		if(mois==12) {
			mois=1;annee++;
		}
		else {
			mois++;
		}
	}
	public void ajouterUnAn() {
		annee++;
	}

}
