package h1;

public class H1_main {

    public static void main(String[] args) {

        Patient A = new Patient("A", 1);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        PrioListe prioListe = new PrioListe();

        prioListe.addPatient(A);
        printPrioListe(prioListe);
        prioListe.addPatient(B);
        printPrioListe(prioListe);
        prioListe.addPatient(C);

        printPrioListe(prioListe);

        prioListe.addPatient(D);

        printPrioListe(prioListe);

        System.out.println(prioListe.getNextPatient().getName());

        printPrioListe(prioListe);

        System.out.println(prioListe.getPostion(C));
    }

    private static void printPrioListe(PrioListe prioListe){
        for(Patient patient : prioListe.getMyList()){
            System.out.print(patient.getName());
        }
        System.out.println();
    }

}
