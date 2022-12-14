import java.util.Objects;
import java.util.Scanner;
public class input_handler {
    private static String player_output;
    public static void input(){
        Scanner player_input = new Scanner(System.in);
        System.out.println("what do you do - ");
        player_output = player_input.nextLine();
    }
    public static void piss_poor_ifs(){
        if (Objects.equals(player_output, "up") && player.y_pos > 0) {
            player.y_pos -= 1;
        }
        if (Objects.equals(player_output, "down") && player.y_pos < 11) {
            player.y_pos += 1;
        }
        if (Objects.equals(player_output, "right") && player.x_pos > 0) {
            player.x_pos -= 1;
            System.out.println("urmom");
        }
        if (Objects.equals(player_output, "left") && player.x_pos < 11) {
            player.x_pos += 1;
        }
    }
}
