package nemanjasimic;

 class GlavnaKlasa {


    public static void main(String[] args) {
        
        NemanjaSimic n = new NemanjaSimic();
        
        String s3 = "";
        String s2i = n.getS2();
        
        StringBuilder sb= new StringBuilder(s2i);
		s2i = sb.reverse().toString();

        
        System.out.println(n.getS1()+s2i);
   
        
        
    }
    
}
