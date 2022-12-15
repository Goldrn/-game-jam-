import java.util.Random;

public class entities {

    public static int[][] entitys = new int[world.world_width][world.world_height];

    public static void create_entitys(){
        int i;
        for (i = 0; i < world.world_width; i++ ){
            int j;
            for ( j = 0;  j < world.world_height; j++){
                entitys[i][j] = 0;
            }
        }
    }
    public static class rock {
        private static final char graphic = '®';

        public static void create_rock(char[][] args, int x, int y){
            args[x][y] = graphic;
            entitys[x][y] = 1;
        }

    }

    public static class cat {
        private static final char graphic = '©';
        public static int cat_x;
        public static int cat_y;

        public static void create_cat(char[][] args, int x, int y){
            cat_x = x;
            cat_y = y;
            args[x][y] = graphic;
            entitys[x][y] = 1;
        }
        public  static void move_cat(entities.cat cat){
            Random rand = new Random();
            int x_move = rand.nextInt(-1, 1);
            int y_move = rand.nextInt(-1, 1);
            cat_x += x_move;
            cat_y += y_move;
        }
    }




}
