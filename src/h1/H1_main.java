package h1;

public class H1_main {

    public static void main(String[] args) {

        Patient p1 = new Patient("Chiara", 1);
        Patient p2 = new Patient("Felix", 2);
        Patient p3 = new Patient("Dilara", 3);

        System.out.println(p1.getName().equals("Chiara") && p1.getPrio() == 1);
        System.out.println(p2.getName().equals("Felix") && p2.getPrio() == 2);
        System.out.println(p3.getName().equals("Dilara") && p3.getPrio() == 3);

        PrioListe prio = new PrioListe(); prio.addPatient(p1); prio.addPatient(p2); prio.addPatient(p3);

        System.out.println(false);// System.out.println(prio.getPosition(p2) == 1 && prio.getPosition(p3) == 2);   // Typo

        System.out.println(prio.getNextPatient().getName().equals("Chiara"));   // ??? Getter

        System.out.println(false);//System.out.println(prio.getPosition(p2) == 0);   // Typo

    }

    private static void printPrioListe(PrioListe prioListe){
        for(Patient patient : prioListe.getMyList()){
            System.out.print(patient.getName());
        }
        System.out.println();
    }

}
