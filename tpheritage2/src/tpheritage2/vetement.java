package tpheritage2;

public class vetement {
	
	
  protected String code;
  protected String libelle,coleur;
  protected int quantite;
  protected float prixht;
  public static final int tva= 18;  //(variable static theoriquemnt public)
 // kan final akhaw nejm ne7otha private
  //variable static d'une methode d'une classe automatiquemnt methode devient public
public vetement(String code, String libelle, String coleur, float prixht , int quantite) {
	this.code = code;
	this.libelle = libelle;
	this.coleur = coleur;
	this.prixht = prixht;
	this.quantite=quantite;
}




@Override
public String toString() {
	return "vetement [code=" + code + ", libelle=" + libelle + ", quantite=" + quantite + ", prixht=" + prixht + "]";
	//jarb fazet y aziz
}



public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
  
  
float prixttc()
{
	return prixht*(1+(float) tva/100);
}

float prixttc(int remise)
{
	return prixttc()*(1-(float)remise/100);
}

}
