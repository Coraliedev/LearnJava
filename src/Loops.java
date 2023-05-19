public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        String pseudos = "John,john,Mary,Bob";
        String[] pseudosArray = pseudos.split(",");
        for (String pseudo : pseudosArray) {
            System.out.println(pseudo);
        }

        int[] notes = {10, 12, 15, 17, 18};
        int calcul = 0;
//        for (int note : notes) {
//            calcul += note;
//        }
//        System.out.println("Moyenne : " + calcul / notes.length);
        int i = 0;
        while (i < notes.length) {
            calcul += notes[i];
            i++;
        }
        System.out.println("Moyenne : " + calcul / notes.length);
    }
}
