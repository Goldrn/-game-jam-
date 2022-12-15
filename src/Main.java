
public class Main {
    public static boolean turns = true;
    public static void main(String[] args) {
        player.x_pos = 5;
        player.y_pos = 5;
        while(turns) {
            entities.create_entitys();
            world.create_world('.', 11, 11);
            input_handler.input();
            input_handler.piss_poor_ifs();
        }

    }
}