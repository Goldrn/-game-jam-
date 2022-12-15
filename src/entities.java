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




}
