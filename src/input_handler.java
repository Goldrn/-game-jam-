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
            if (player_output.equals("up") && player.y_pos > 0 && entities.entitys[player.y_pos - 1][player.x_pos] != 1 ) {
                player.y_pos -= 1;
            }
            else if (player_output.equals("down") && player.y_pos < 11 && entities.entitys[player.y_pos + 1][player.x_pos] != 1) {
                player.y_pos += 1;
            }
            else if (player_output.equals("right") && player.x_pos > 0 && entities.entitys[player.y_pos][player.x_pos - 1] != 1) {
                player.x_pos -= 1;
            }
            else if (player_output.equals("left") && player.x_pos < 11 && entities.entitys[player.y_pos][player.x_pos + 1] != 1) {
                player.x_pos += 1;
            }
            else if (player_output.equals("done")){
                Main.turns = false;
            }
            else {
                System.out.println("u dumbass");
            }

        }
    }

