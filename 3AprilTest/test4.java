//What happens when the following program is compiled and run. Select the one correct answer.


public class test4{
   int i[] = {0};
   public static void main(String args[]) {
      int i[] = {1};
      change_i(i);
      System.out.println(i[0]);
   }
   public static void change_i(int i[]) {
      int j[] = {2};
      i[0] = j[0];
      System.out.println(i);
   }
}