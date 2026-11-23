public class Hussh {
    public static void main(String[] args) {
        String[] Stuff = {"noga" , "noga" , "volvo" , "stuff" , "starw" , "java"};
        String[] Stuff11 = new String[6];
        for (int i = 0 ; i < 6 ; i++){
            char[] chars = Stuff[i].toCharArray();
            int x = chars.length - 1 ; 

            while(x > 0 ){
                chars [x] = (char)(chars[x]+2);
                x-- ; 
            }


            String Y = new String(chars);
            Stuff11[i] = Y ; 

        }

        for (int i = 0 ; i < 6 ; i++){
           for (int j = i+1 ; j < 6 ; j++){
                if(Stuff11[i].equalsIgnoreCase(Stuff11[j])){
                    System.out.println("same hush for: " + Stuff11[i] + " and " + Stuff11[j]);
                } 

            }
        }
        
    }
    
}
