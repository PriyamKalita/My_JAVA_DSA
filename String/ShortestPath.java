public class ShortestPath {
    public static float getShortestPath(String s){
        int x = 0; 
        int y = 0;

        for(int i = 0; i < s.length(); i++){
            char direction = s.charAt(i);
            // South
            if(direction == 's'){
                y--;
            }
            // North
            else if(direction == 'N'){
                y++;
            }
            // West
            else if(direction == 'W'){
                x--;
            }
            // East
            else{
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        // Given a route containg 4 directions(E, W, N, S),
        // Find the Shortest path to reach destination
        // "WNEENESSENNN"
        String s = "WNEENESSENNN";
        System.out.println(getShortestPath(s));
    }
    
}
