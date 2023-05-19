public class Array {
    public static void main(String[] args) {
        String[] names = new String[]{"John", "john", "Mary", "Bob"};
        for (int i = 0; i < names.length - 1; i++) {
            if (names[i].equalsIgnoreCase(names[i + 1])) {
                System.out.println(names[i] + " is equal to " + names[i + 1]);
            } else {
                System.out.println(names[i] + " is not equal to " + names[i + 1]);
            }
        }

        String pseudos = "John,john,Mary,Bob";
        String[] pseudosArray = pseudos.split(",");
        System.out.println(pseudosArray[0]);

        int[][] numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(numbers[0][0]);
    }
}
