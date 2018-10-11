import java.util.*;
class qus2{
public static void main(String[] args)
 {
Scanner s=new Scanner(System.in);
  String str1=s.next();
  int i=0;
  while( i<str1.length()) {
   System.out.println(str1.charAt(i));
   i++;
}
for(i=0;i<str1.length();i++)
{
  for(int j=0;j<str1.length();j++) 
  {
    System.out.print(str1.charAt(i));
     System.out.println(str1.charAt(j));
  }
}
System.out.println(str1.substring(0,str1.length()));
}
}