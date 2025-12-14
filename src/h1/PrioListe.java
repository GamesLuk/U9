package h1;

import java.util.ArrayList;

public class PrioListe {

    private ArrayList<Patient> myList = new ArrayList<>();

    public void addPatient(Patient p) {
        if (myList.isEmpty()){
            myList.add(p);
            return;
        }
        int checkIndex = 0;
        while(checkIndex < myList.size() && myList.get(checkIndex).getPrio() < p.getPrio()){
            checkIndex += 1;
        }

        myList.add(checkIndex, p);
    }

    public Patient getNextPatient(){
        if (myList.isEmpty()) return null;
        Patient next = myList.getFirst();
        myList.remove(next);
        return next;
    }

    public int getPostion(Patient p) {
        if(!myList.contains(p)) return -1;
        return myList.indexOf(p);
    }

    public ArrayList<Patient> getMyList() {
        return myList;
    }

}
