public class Count {
    public static void main(String[] args){
        String str = " shreeji gopu ";
        int v =0,s=0,c=0;
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)==  'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
                v++;
              }
           else if(str.charAt(i)== ' '){
                s++;
               }
            else{
                c++;
                }
        }
        System.out.println("Total vowel: "+v);
        System.out.println("Total consonents: "+c);
        System.out.println("Total space: "+s);
    }
}
