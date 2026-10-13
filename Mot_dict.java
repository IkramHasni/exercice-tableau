package ex9;

public class Mot_dict {
    private String Mot;
    private String Def;
    public Mot_dict(String Mot,String Def) {
    	this.Mot=Mot;
    	this.Def=Def;
    }
    public String getMot() {
    	return Mot;
    }
    public String getDefinition() {
    	return Def;
    }
    void setDefinition(String x) {
    	this.Def=x;
    }
    void setMot(String y) {
    	this.Mot=y;
    }
    Boolean synonyme (String a) {
    	if(this.Def.equals(a)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public String toString() {
        return Mot + " : " + Def;
    }
}