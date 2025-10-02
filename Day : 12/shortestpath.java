public class shortestpath {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char direc = path.charAt(i);
            //south
            if(direc=='S'){
                y--;
            }
            //north
            else if(direc=='N'){
                y++;
            }
            //west
            else if(direc=='W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        // eq of line -> sqrt( (x2-x1)^2 + (y2-y1)^2 )
        //above computation we have done for finding equation of line x=(x2-x1) and y=(y2-y1) 
        int x2=x*x;
        int y2=y*y;
        //formula to get length from co-ordiantes sqrt{x^2-y^2}
        return (float)Math.sqrt(x2+y2); // float is for type casting
    }
    public static void main(String args[]){
        String path="EWNSEE";
        getshortestpath(path);
        System.out.println(getshortestpath(path));
    }
}
