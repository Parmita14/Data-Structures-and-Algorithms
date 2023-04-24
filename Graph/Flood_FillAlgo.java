import java.util.*;
public class Flood_FillAlgo {
    public void helper(int[][] image, int sr,int sc, int color, boolean vis[][] , int orgCol){
        if(sr < 0 || sc < 0 || sr>= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }
        image[sr][sc] = color;
        //left
        helper(image, sr, sc-1, color, vis, image[sr][sc]);
        //right
        helper(image, sr, sc+1, color, vis, image[sr][sc]);
        //up
        helper(image, sr-1, sc, color, vis, image[sr][sc]);
        //down
        helper(image, sr+1, sc, color, vis, image[sr][sc]);
    }
    public int[][] floodfill(int[][] image, int sr, int sc,int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
}
