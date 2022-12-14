public class world {

    public static void create_world(char ground, int width, int height) {
        char[][] world = new char[width][height];

        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                world[i][j] = ground;
                player.draw_char(world);
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
}
