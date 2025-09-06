// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
       // (HexAwarE → hEXaWARe).
       
      StringBuilder sb =new StringBuilder();
      
       
      String s="HexAwarE";
      
      for(int i=0;i<s.length();i++)
      {
          char ch= s.charAt(i);
          
          if(Character.isLowerCase(ch))
          {
             sb.append(Character.toUpperCase(ch));
          }else{
              sb.append(Character.toLowerCase(ch)); 
          }
      }
      
      System.out.print(sb);

      
    
    }
}
