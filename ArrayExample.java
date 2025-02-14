public class ArrayExample {
    public static void main(String[] args) {
        String[] cats = {"Takeru", "Ha-chan", "Koro", "Chappy"};

        System.out.println("猫の名前一覧:");
        for (String cat : cats) {
            System.out.println(cat);
        }

        cats[1] = "Roku";
        System.out.println("変更後のリスト:");
        for (String cat : cats) {
            System.out.println(cat);
        }
    }
}
