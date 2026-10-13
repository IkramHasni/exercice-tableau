package ex9;

public class Test1 {
	public static void main(String[] args) {
		Mot_dict m1=new Mot_dict("Maison", "def1"); 
		Mot_dict m2=new Mot_dict("chat", "def2");
		Mot_dict m3=new Mot_dict("ecole", "def3");
		Mot_dict m4=new Mot_dict("hospital", "def4");
        Dictionnaire d=new Dictionnaire(7,"dictionnaire");
        d.Ajouter_Mot(m1);
        d.Ajouter_Mot(m2);
        d.Ajouter_Mot(m3);
        d.Ajouter_Mot(m4);
        d.Supprimer_Mot(m2);
        System.out.println(d.Recherche_dicho("ecole"));
        System.out.println(d.Recherche_dicho("l"));
        System.out.println(d);
        System.out.println("Nombre de synonymes de "+m1.getMot()+" : " + d.Nombre_synonyme(m1));
        }

}
