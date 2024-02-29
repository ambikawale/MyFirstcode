package basicsofjava;

public class String_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name ="Ambika"; 
     int c1=name.length();
     System.out.println(c1);// length of name 
     String c2=name.toUpperCase();
     System.out.println(c2);
     String c3=name.toLowerCase();
     System.out.println(c3);
    	char s1=name.charAt(0);
    	System.out.println(s1);
    	String Name1= "        Ambika Yuvraj Birajdar";
    	String a1=Name1.trim();
    	System.out.println(a1);
    	String a2=Name1.trim();
    	System.out.println("trim name : "+a2);
    	
    	String name2="Avyan";
    	String surname="Birajdar";
    	String space=" ";
    	String Fullname = name2.concat(surname);
    	System.out.println(Fullname);
    	String Fullname1 = name2.concat(space).concat(surname);
    	System.out.println(Fullname1);
    	String name3="Orange";
    	boolean answer=name.endsWith("e");
    	System.out.println(answer);
    	String a5= name.replace('e', 'a');
    	System.out.println(a5);
    	 
    	
    			
    	}

}
