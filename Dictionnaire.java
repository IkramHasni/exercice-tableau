package ex9;

public class Dictionnaire {
     public int nb_mots=0;
     Mot_dict [] Dict;
     public String Nom;
     public Dictionnaire(int taille,String Nom ) {
        Dict=new Mot_dict[taille];
    	this.Nom=Nom;
     }
     void Ajouter_Mot(Mot_dict m) {
    	 if (nb_mots < Dict.length) {
             Dict[nb_mots]=m;
             nb_mots++;
             Trier();
         }
     }
     public void Trier() {
         for (int i = 0; i<nb_mots-1; i++) {
        	 for (int j =i + 1; j<nb_mots; j++) {
        		 if((Dict[i].getDefinition().compareTo(Dict[j].getDefinition()) > 0) ) {
                     Mot_dict x=Dict[i];
                     Dict[i]=Dict[j];
                     Dict[j]=x;
                 }
        		 }
        	 }
         }
    public void Supprimer_Mot(Mot_dict m) {
    	 for (int i=0; i< nb_mots; i++) {
             if (Dict[i].getMot().equals(m.getMot())) {
                 for (int j=i; j<nb_mots-1;j++) {
                     Dict[j]=Dict[j+1];
                 }
                 Dict[nb_mots-1]=null;
                 nb_mots=nb_mots-1;
     }}}
     public String Recherche_dicho(String mot) {
    	 int deb= 0;
         int fin=nb_mots-1;
         while (deb<=fin) {
             int milieu = (deb+fin)/2;
             int comparaison =
                 Dict[milieu].getMot().compareTo(mot);
             if (comparaison == 0) {
                 return Dict[milieu].getDefinition();
             }
             if (comparaison < 0) {
                 deb=milieu+1;
             } else {
                 fin=milieu-1;
             }
         }
         return null;
}
     public String toString() {	 
    	 String ch ="Dictionnaire : \n";
         for (int i = 0; i < nb_mots; i++) {
    	        ch = ch + Dict[i].toString() + "\n";
    	    }
    	    return ch;
    	}

     public int Nombre_synonyme (Mot_dict mot) {
    	 int nb = 0;
         for (int i = 0; i < nb_mots; i++) {
             if (Dict[i].getMot().equals(mot.getMot()) && Dict[i].synonyme(mot.getDefinition())) {
                 nb++;
             }
         }
         return nb;
             }
         
}




    	 
    	 
     
     
     
     
     
     

