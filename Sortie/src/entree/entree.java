import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TP1 {
	
	/**
	 * @author Louis
	 * 
	 */ 

   public static void main (String [] args) {
   
      //exécution du logiciel
      
   } // FIN MAIN
   
   public void FichierEntree() {
   
   // CRÉATION DU FICHIER D'ENTRÉE
      JSONObject entree = new JSONObject();
      JSONObject elementsun = new JSONObject();
      JSONObject elementsdeux = new JSONObject();
      JSONObject elementstrois = new JSONObject();
      JSONArray liste = new JSONArray();
      
      entree.put("nombre_eleves", new Integer(23));
      entree.put("age", new Integer(8));
      
      elementsun.put("description", "Spectacle de magie");
      elementsun.put("nombre_parents_accompagnateurs", new Integer(4));
      elementsun.put("prix_unitaire_enfant", "3.45 $");
      elementsun.put("prix_unitaire_adulte", "7.00 $");
      elementsun.put("transport", new Integer(0));
      elementsun.put("distance", new Integer(0));
      elementsun.put("date", "2015-10-14");
      
      elementsdeux.put("description", "Sortie au Mont-Royal");
      elementsdeux.put("nombre_parents_accompagnateurs", new Integer(0));
      elementsdeux.put("prix_unitaire_enfant", "0.00 $");
      elementsdeux.put("prix_unitaire_adulte", "0.00 $");
      elementsdeux.put("transport", new Integer(1));
      elementsdeux.put("distance", new Integer(18));
      elementsdeux.put("date", "2015-12-15");
      
      elementstrois.put("description", "Glissades d'eau");
      elementstrois.put("nombre_parents_accompagnateurs", new Integer(8));
      elementstrois.put("prix_unitaire_enfant", "10.00 $");
      elementstrois.put("prix_unitaire_adulte", "5.00 $");
      elementstrois.put("transport", new Integer(2));
      elementstrois.put("distance", new Integer(44));
      elementstrois.put("date", "2016-06-20");
      
      entree.put("activites", elementsun);
      entree.put(elementsdeux);
      entree.put(elementstrois);
      
      FileWriter texte = new FileWriter("c:\\entree.json");
		file.write(entree.toJSONString());
		file.flush();
		file.close();

      System.out.print(entree);
      
      //FIN FICHIER D'ENTRÉE
      
   } // FIN MÉTHODE FICHIERENTREE
    
}//FIN CLASSE TP1
