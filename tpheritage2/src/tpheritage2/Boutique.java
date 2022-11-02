package tpheritage2;
public class Boutique {
	private String nom;
	private vetement vet[] ;
	private int nbvte=0;
	private int taille;
	
	public Boutique(String nom , int taille) {
		
		this.nom = nom;
		this.taille=taille;
		vet=new vetement[taille];
	}

	void ajoutVetement(vetement v)
	{
	
		if( nbvte<taille)
		{
			vet[nbvte]=v;
			System.out.println("ajout faite avec succes de vetement numero "+(nbvte+1));
			nbvte++;
			
		}
		else
		{
			System.out.println("Oops ! boutique pleine");
		}
	}
	
	
	
	void afficheStock(int remise)
	{
		int i;
		for(i=0; i <nbvte ; i++)
		{
			
			System.out.println("prix de vetement "+(i+1)+" apres remise="+vet[i].prixttc(remise));
			System.out.println(vet[i].toString());
		}
			
	
		
	}
	
	

	
	
}
