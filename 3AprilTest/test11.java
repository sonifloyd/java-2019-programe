class Test11 
{
   public void methodA(int i)
   {
      System.out.println(i); 
	
   }
   public int methodA(int i) 
   {
      System.out.println(i+1); 
      return i+1; 
   }
   public static void main(String args[]) 
   {
      Test11 X = new Test11();
      X.methodA(5);
   }
}