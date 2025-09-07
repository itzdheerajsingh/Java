
public class arrayfunction {
    public static void update(int marks[],int nonchanable){
        nonchanable=10;
        //updating array by adding 1 in each element
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }

public static void main(String args[]){
    int marks[]= {15,20,35,40};
    int nonchanable=5;
    update(marks,nonchanable);
    //printing updated array
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
      
    }
    System.out.println();
    System.out.println(nonchanable);
    
}
}
