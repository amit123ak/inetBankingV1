// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
       int [] input={-1, -20, 30, 40, 50, -8};
//Output: {-1, -20, -8, 30, 40, 50}

   int temp[]=new int[input.length];
   int j=0;
   for(int i=0;i<input.length;i++)
   {
       if(input[i]<0)
       {
          temp[j]=input[i];
          j++;
       }
       
   }
   
   for(int p=0;p<input.length;p++)
   {
       if(input[p]>0)
       {
           temp[j]=input[p];
           j++;
       }
   }
   
   for(int k=0;k<temp.length;k++)
   {
       System.out.print(temp[k]+" ");
   }
  
    }
}
