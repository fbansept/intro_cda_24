public class Promotion {

    private String nom;
    private Etudiant[] etudiants;

    public Promotion(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[30];
    }

    public void ajoutEtudiant(Etudiant nouvelEtudiant) {
        //Si le tableau d'etudiant' n'est pas plein
        if(etudiants[etudiants.length - 1] == null){

            //on parcours le tableau jusqu'à trouver un index libre
            int index = 0;
            while (etudiants[index] != null) {
                index++;
            }

            //on affecte le nouveau etudiant à l'index libre
            etudiants[index] = nouvelEtudiant;
        }
    }

    public float moyenne() {
        //parcourir les etudiants et faire la moyenne de leurs moyennes
        float cumulMoyenne = 0;

        for(Etudiant etudiant : etudiants) {
            //TODO cumuluer la moyenne de l'etudiant
        }

        //retourner la moyenne des moyennes (cumul moyenne / par nombre d'etudiants)
        return 0;
    }
}
