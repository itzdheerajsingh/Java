public class RemoveduplicateSTR {
  public static void removeduplicate(String str,int index,StringBuilder newstr,boolean map[]){
    if(index==str.length()){
        System.out.println(newstr);
        return;
    }
    //        if (currchr >= 'a' && currchr <= 'z') {
    char currchr=str.charAt(index);
    if(map[currchr-'a']==true){
        //its duplicate element
        removeduplicate(str, index+1, newstr, map);
    }
    else{
        //new element
        map[currchr-'a']=true;
        removeduplicate(str, index+1, newstr.append(currchr), map);
    }
  }
    public static void main(String args[]){
        String str="dheerajjjjsinggggh";
        removeduplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
