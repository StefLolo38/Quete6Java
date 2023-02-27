public class Classroom {
    public static void main(String[] args) {
        Wilder gus = new Wilder("Gus", true);
        Wilder nico = new Wilder("Nico", false);

        System.out.println(gus.whoAmI());
        System.out.println(nico.whoAmI());
    }
}