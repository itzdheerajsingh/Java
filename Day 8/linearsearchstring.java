public class linearsearchstring {

    public static String search (String menu[], String key){
        for ( int i=0;i<menu.length;i++){
            if(menu[i]==key){
                System.out.println("key found at index "+i);
                return menu[i];
            }    
        }
        System.out.println("key not found");
        return null;
    }
   public static void main(String args[]){
    String menu[]={"chole","bature","puri","halwa"};
    String key="chole";
    search(menu,key);
   } 
}
