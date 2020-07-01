package step.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pr1_5543 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minBurger = Integer.MAX_VALUE;
        int minDrink = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int burger = Integer.parseInt(br.readLine());
            if(burger < minBurger)
                minBurger = burger;
        }
        for (int i = 0; i < 2; i++) {
            int drink = Integer.parseInt(br.readLine());
            if(drink < minDrink)
                minDrink = drink;
        }
        System.out.println(minBurger + minDrink - 50);
    }
}
