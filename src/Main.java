import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static boolean turns = true;
    public static void main(String[] args) throws FileNotFoundException {
        player.x_pos = 5;
        player.y_pos = 5;
        File wurld = new File("/home/goldrn/programing/java/all-nighter-game-jam/src/test.txt");
        while(turns) {
            entities.create_entitys();
            world.create_world('.', world.world_width, world.world_height, wurld);
            input_handler.input();
            input_handler.piss_poor_ifs();
            entities.cat.move_cat(world.charles);
        }
    }
}