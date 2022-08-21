import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int wplata = 0;
        int cena = 10;
        int reszta = 0;
        boolean znaleziono = false;

        String [] name;
        name = new String[] {"Anna", "Barbara", "Katarzyna", "Jan", "Tomasz", "Wojciech"};

        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();




        for (int i=0; i< name.length; i++) {


            if (imie.equals(name[i])) {
                znaleziono = true;
                break;
            }
        }
        if (znaleziono ){
            System.out.println("Czesc " +imie +" prosze wejdz do Zoo");

        }

        else {
            System.out.println("Czesc " +imie +"  poprosze wplac 10 zl za wejscie");
            wplata = scanner.nextInt();
            if (wplata == cena) {
                System.out.println("Prosze wchodzisz do Zoo");

            }
            if (wplata > cena){
                System.out.println("Twoja reszta " + (wplata-cena) +" zl, mozesz wejsc");

            }


            if (wplata < cena){
                System.out.println("Prosze doplacic " + (cena - wplata) + " zl");
            }
        }






    }

}





