package tpheritage2;

public class VentementEnfant extends vetement {

	private float age;
	public VentementEnfant(String code, String libelle, String coleur, float prixht , int quantite,float age) {
		super(code,libelle,coleur,prixht ,quantite);
		this.age=age;
		
	}

	public void setAge(float age) {
		this.age = age;
	}

	
float prixttc(int remise)
{

	if(remise>0.5)
	{
		return super.prixttc(remise);
	}else
	{
		return super.prixttc(); // ou return prixttc(); car 
	}
}

	@Override
	public String toString() {
		return "vetementEnfant [age=" + age + ", code=" + code + ", libelle=" + libelle + ", coleur=" + coleur
				+ ", quantite=" + quantite + ", prixht=" + prixht + "]";
	}

	
	
}
