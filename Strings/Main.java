public class Main {
    // public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // String k = new String("aniket");
        // String s = new String("aniket");
        // System.out.println(s + " " + k);
        // System.out.println(s == k);
        heyOptimized();
    }
    public static void hey() {
		// String s = scn.nextLine();
        String ans = "h";

      for(int i = 0; i < 2 * (s.length() - 2); i ++) {
          ans = ans + 'e';
      }
      ans = ans + 'y';
      System.out.println(ans);
	}

    public static void heyOptimized() {
        String s = "heeeey";
        StringBuilder sb = new StringBuilder(); //declaration
        sb.append("h");
        for(int i = 0; i < 2 * (s.length() - 2); i ++) {
          sb.append('e');
        }
        sb.append('y');
        System.out.println(sb.toString());
    }
}