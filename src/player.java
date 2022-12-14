public class player {
    public static int x_pos;
    public static int y_pos;
    private static char symbol = '@';

    public static void draw_char(char[][] args) {
        args[y_pos][x_pos] = symbol;
    }
}
