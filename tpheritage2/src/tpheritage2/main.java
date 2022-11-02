package tpheritage2;

public class main {

	public static void main(String[] args) {
	
		vetement vet=new vetement("M200","Manteau","gris",169.900f,5);
		VentementEnfant vetenfant=new VentementEnfant("R100","Robe","rouge",29.900f,10,0.5f);
		Boutique b =new Boutique("HM",50);
        b.ajoutVetement(vetenfant);
        b.ajoutVetement(vet);
        b.afficheStock(6);
	}
}
