// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
              String input = "aaabbc";
              
              StringBuilder sb =new StringBuilder();
              int count=1;
              for(int i=0;i<input.length();i++)
              {
                  
                  if(i<input.length()-1&& input.charAt(i)==input.charAt(i+1))
                  {
                      count++;
                  }else{
                      
                      sb.append(input.charAt(i)).append(count);
                      count=1;
                  }
                  
              }
              
              System.out.println(sb);

    }
}
