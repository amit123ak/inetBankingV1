class Main {
    public static void main(String[] args) {
        HashSet<Character> set =new HashSet<>();
   String s="abcda";
   String longesttillNow="";
   String longestOverall="";
   
   for(int i=0;i<s.length();i++)
   {
       
       char ch=s.charAt(i);
       if(set.contains(ch))
       {
           longesttillNow="";
           set.clear();
       }
       longesttillNow+=ch;
       set.add(ch);
       
      if(longesttillNow.length()>longestOverall.length())
      {
          longestOverall=longesttillNow;
      }
   }
   System.out.println(longestOverall);

    }
}
