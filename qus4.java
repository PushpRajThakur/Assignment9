import java.util.*;
class qus4{
public static void main(String[] args) {
int i=0,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a String : ");
String str=s.nextLine();
while(i<str.length()){
if(str.charAt(i)==' '){
count++;
}
i++;
}
count=count+1;
System.out.println(+count);
}
}