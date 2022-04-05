public class Array {
    public static void main(String[] args) {
        String[] strings = new String[3];

        strings[0] = "Fahmi";
        strings[1] = "Idris";
        strings[2] = "A";

        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        String[] names = {
            "Fahmi", "Idris", "A"
        };

        int[] ints = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        System.out.println(ints.length);

        String[][] members = {
            {"Fahmi", "Idris"},
            {"Ahmad", "Eko"},
            {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
