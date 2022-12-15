import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class world {
    public static int world_width = 29;
    public static int world_height = 29;
    public static entities.cat charles = new entities.cat();

    public static void create_world(char ground, int width, int height, File lvl) throws FileNotFoundException {
        char[][] world = new char[width][height];
        Scanner scanner = new Scanner(lvl);


        for(int i = 0; scanner.hasNextLine() && i < height; i++) {
            char[] chars = scanner.nextLine().toCharArray();
            for (int j = 0; j < width; j++) {
                world[i][j] = chars[j];
                player.draw_char(world);
                charles.create_cat(world, 5, 2);
                entities.rock.create_rock(world, 3, 7);
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
}
