package org.pursuit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class DanteParadiso implements GameOver {
    Scanner scanner = new Scanner(System.in);
    String userName;
    String eastOrWest;
    List<String> userHopsChoice = new ArrayList<>();
    List<String> correctHopsList = new ArrayList<>(Arrays.asList("left", "left", "up", "right"));
    List<String> userCrystalCity = new ArrayList<>();
    ArrayList<String> correctCrystalCity = new ArrayList<>(Arrays.asList("right", "up", "down", "right"));
    int chances = 2;
    boolean hops = false;


    public void startGame() {
        welcomeToParadiso();
        introduction();
        startAdventure();
    }


    private void welcomeToParadiso() {
        System.out.println("\n" +
                "                                                                                                                            ,---. \n" +
                ",------.                           ,--.,--.                    ,--.  ,--.                 ,----.                            |   | \n" +
                "|  .--. ' ,--,--.,--.--. ,--,--. ,-|  |`--' ,---.  ,---.     ,-'  '-.|  ,---.  ,---.     '  .-./    ,--,--.,--,--,--. ,---. |  .' \n" +
                "|  '--' |' ,-.  ||  .--'' ,-.  |' .-. |,--.(  .-' | .-. |    '-.  .-'|  .-.  || .-. :    |  | .---.' ,-.  ||        || .-. :|  |  \n" +
                "|  | --' \\ '-'  ||  |   \\ '-'  |\\ `-' ||  |.-'  `)' '-' '      |  |  |  | |  |\\   --.    '  '--'  |\\ '-'  ||  |  |  |\\   --.`--'  \n" +
                "`--'      `--`--'`--'    `--`--' `---' `--'`----'  `---'       `--'  `--' `--' `----'     `------'  `--`--'`--`--`--' `----'.--.  \n" +
                "                                                                                                                            '--'  \n");
        System.out.println("               T~~\n" +
                "               |\n" +
                "              /\"\\\n" +
                "      T~~     |'| T~~\n" +
                "  T~~ |    T~ WWWW|\n" +
                "  |  /\"\\   |  |  |/\\T~~\n" +
                " /\"\\ WWW  /\"\\ |' |WW|\n" +
                "WWWWW/\\| /   \\|'/\\|/\"\\\n" +
                "|   /__\\/]WWW[\\/__\\WWWW\n" +
                "|\"  WWWW'|I_I|'WWWW'  |\n" +
                "|   |' |/  -  \\|' |'  |\n" +
                "|'  |  |LI=H=LI|' |   |\n" +
                "|   |' | |[_]| |  |'  |\n" +
                "|   |  |_|###|_|  |   |\n" +
                "'---'--'-/___\\-'--'---'");
    }

    private void introduction() {
        System.out.println("\nDante: My friend, your journey is about to begin. What should you have me call you before we continue onward?");
        userName = scanner.nextLine();
        System.out.println("Dante: " + userName + ", this journey will be one based on your own choices. It's up to you to make it to Paradise or to failure...");
        scanner.nextLine();
        System.out.println("Dante: For your first test, you have two options. Go to the gates facing East or go to the beach facing West.");
        scanner.nextLine();
        System.out.println("Dante: At either one, you will be challenged by the a great beast to test your moral compass. Good luck, " + userName + "...");
    }


    private void startAdventure() {
        System.out.println("\nDante: Where do you want to begin, East or West?: ");
        eastOrWest = scanner.nextLine().toLowerCase();
        if (!eastOrWest.equals("east") && !eastOrWest.equals("west")) {
            System.out.println("\nDante: I don't know what that means...");
            startAdventure();
        } else if (eastOrWest.equals("east")) {
            easternGates();
        } else if (eastOrWest.equals("west")) {
            beachOnTheWest();
        }
    }

    private void easternGates() {
        System.out.println("\n" +
                "   /|_/|\n" +
                "  / ^ ^(_o\n" +
                " /    __.'\n" +
                " /     \\\n" +
                "(_) (_) '._\n" +
                "  '.__     '. .-''-'.\n" +
                "     ( '.   ('.____.''\n" +
                "     _) )'_, )mrf\n" +
                "    (__/ (__/");
        String rightAnswerForEast = "adversity";
        System.out.println("\nDante: This is Leviathan. She will decide whether or not you make it to Paradiso.");
        scanner.nextLine();
        System.out.println("Leviathan: Hello, " + userName + ". I have a riddle for you... ");
        scanner.nextLine();
        System.out.println("Leviathan: Poor people have it. Rich people need it. It can make you or break you. What do you think it is?: ");
        String userEastAnswer = scanner.nextLine().toLowerCase();
        if (userEastAnswer.equals(rightAnswerForEast)) {
            System.out.println("\nLeviathan: Great job! You move on to the next level!");
            scanner.nextLine();
            System.out.println("Dante: For the next challenge, you can go to the Icey Island in the North or the City of Crystals in the South.");
            scanner.nextLine();
            System.out.println("Dante: What will it be, North or South?");
            String northOrSouth = scanner.nextLine().toLowerCase();
            if (!northOrSouth.equals("north") && !northOrSouth.equals("south")) {
                System.out.println("Dante: What's that?");
            } else if (northOrSouth.equals("north")) {
                iceyIslandNorth();
            } else {
                cityOfCrystalsSouth();
            }
        } else {
            gameOver("Leviathan");
        }
    }

    private void beachOnTheWest() {
        System.out.println("        .-\"\"\"\".\n" +
                "       /       \\\n" +
                "   __ /   .-.  .\\\n" +
                "  /  `\\  /   \\/  \\\n" +
                "  |  _ \\/   .==.==.\n" +
                "  | (   \\  /____\\__\\\n" +
                "   \\ \\      (_()(_()\n" +
                "    \\ \\            '---._\n" +
                "     \\                   \\_\n" +
                "  /\\ |`       (__)________/\n" +
                " /  \\|     /\\___/\n" +
                "|    \\     \\||VV\n" +
                "|     \\     \\|\"\"\"\",\n" +
                "|      \\     ______)\n" +
                "\\       \\  /`\n" +
                "jgs      \\(");
        String rightAnswerForWest = "secrets";
        System.out.println("\nDante: Welcome to the beach on the West.");
        scanner.nextLine();
        System.out.println("Dante: This is Behemoth who will test you on your knowledge of life.");
        scanner.nextLine();
        System.out.println("Behemoth: " + userName.toUpperCase() + "! This beach is not as sweet as you would hope >:)!");
        scanner.nextLine();
        System.out.println("Behemoth: Answer me this or face your doom!");
        scanner.nextLine();
        System.out.println("Behemoth: If you have me, you want to share me. If you share me, you haven’t got me. What am I?");
        String userWestAnswer = scanner.nextLine();
        if (userWestAnswer.equals(rightAnswerForWest)) {
            System.out.println("\nBehemoth: UGH! You're right! And I was ready to send you packing! >:(");
            scanner.nextLine();
            System.out.println("Behemoth: Move on to the next level!");
            scanner.nextLine();
            System.out.println("Dante: Congrats " + userName + ". You beat the beast Behemoth. One more level and you may see Paradiso.");
            scanner.nextLine();
            System.out.println("Dante: For the next challenge, you can go to the Icey Island in the North or the City of Crystals in the South.");
            scanner.nextLine();
            System.out.println("Dante: What will it be, North or South?");
            String northOrSouth = scanner.nextLine().toLowerCase();
            if (!northOrSouth.equals("north") && !northOrSouth.equals("south")) {
                System.out.println("Dante: What's that?");
            } else if (northOrSouth.equals("north")) {
                iceyIslandNorth();
            } else if (northOrSouth.equals("south")) {
                cityOfCrystalsSouth();
            }
        } else if (!userWestAnswer.equals(rightAnswerForWest)) {
            gameOver("Behemoth");
        }
    }

    private void iceyIslandNorth() {
        System.out.println("    _.-._         ..-..         _.-._\n" +
                "   (_-.-_)       /|'.'|\\       (_'.'_)\n" +
                " mrf.\\-/.        \\)\\-/(/        ,-.-.\n" +
                " __/ /-. \\__   __/ ' ' \\__   __/'-'-'\\__ \n" +
                "( (___/___) ) ( (_/-._\\_) ) ( (_/   \\_) )\n" +
                " '.Oo___oO.'   '.Oo___oO.'   '.Oo___oO.'");
        System.out.println("Dante: We have arrived to the Northern Icey Island, run by the Cherubim.");
        scanner.nextLine();
        System.out.println("Cherubim: Hi there, " + userName + "! We have a fun game for you!");
        scanner.nextLine();
        System.out.println("Cherubim Michael: If you want to make it to Paradiso...");
        scanner.nextLine();
        System.out.println("Cherubim Gabriel: You'll have to play Subzero...");
        scanner.nextLine();
        System.out.println("Cherubim Uriel: Don't try to be a hero...");
        scanner.nextLine();
        System.out.println("Cherubim Michael: Or else you'll be smashed like avocado! :)");
        scanner.nextLine();
        System.out.println("Dante: Navigate through the icebergs and you'll beat this challenge. GO!");
        subZero((ArrayList) userHopsChoice);
    }


    private void cityOfCrystalsSouth() {
        System.out.println("\n" +
                "         . \n" +
                "        /'\n" +
                "       //\n" +
                "   .  //           \n" +
                "   |\\//7\n" +
                "  /' \" \\\n" +
                " .   . .  \n" +
                " | (    \\     '._\n" +
                " |  '._  '    '. '\n" +
                " /    \\'-'_---. ) )\n" +
                ".              :.' \n" +
                "|               \\\n" +
                "| .    .   .     .\n" +
                "' .    |  |      |\n" +
                " \\^   /_-':     /\n" +
                " / | |    '\\  .'\n" +
                "/ /| |     \\\\  |\n" +
                "\\ \\( )     // /\n" +
                " \\ | |    // /\n" +
                "  L! !   // / \n" +
                "   [_]  L[_| ");
        System.out.println("\nDante: We've arrived to the City of Crystals! This is Leontina, the unicorn princess.");
        scanner.nextLine();
        System.out.println("Leontina: Welcome, " + userName + ". I'm very pleased to meet you!");
        scanner.nextLine();
        System.out.println("Leontina: Come ride around with me as we journey around. It's up to you to choose the correct path to the end of the City!");
        scanner.nextLine();
        System.out.println("Leontina: Be careful, though. The crystals are sharp!");
        scanner.nextLine();
        System.out.println("Dante: What's your first move, " + userName + "? (left, right, up, or down): ");
        userCrystalCity.add(scanner.nextLine().toLowerCase());
        System.out.println("                ()\n" +
                "                /\\\n" +
                "               //\\\\\n" +
                "              <<  >>\n" +
                "          ()   \\\\//   ()\n" +
                "()._____   /\\   \\\\   /\\   _____.()\n" +
                "   \\.--.\\ //\\\\ //\\\\ //\\\\ /.--./\n" +
                "    \\\\__\\\\/__\\//__\\//__\\\\/__//\n" +
                "     '--/\\\\--//\\--//\\--/\\\\--'\n" +
                "        \\\\\\\\///\\\\//\\\\\\////\n" +
                "    ()-= >>\\\\< <\\\\> >\\\\<< =-()\n" +
                "        ////\\\\\\//\\\\///\\\\\\\\\n" +
                "     .--\\\\/--\\//--\\//--\\//--.\n" +
                "    //\"\"/\\\\\"\"//\\\"\"//\\\"\"//\\\"\"\\\\\n" +
                "   /'--'/ \\\\// \\\\// \\\\// \\'--'\\\n" +
                " ()`\"\"\"`   \\/   //   \\/   `\"\"\"\"`()\n" +
                "          ()   //\\\\   ()\n" +
                "              <<  >>\n" +
                "        jgs    \\\\//\n" +
                "                \\/\n" +
                "                ()");
        System.out.println("Leontina: Watch out, a tall crystal! Where should we go next?: ");
        userCrystalCity.add(scanner.nextLine().toLowerCase());
        System.out.println("     _, .--.\n" +
                "    (  / (  '-.\n" +
                "jgs .-=-.    ) -.\n" +
                "   /   (  .' .   \\\n" +
                "   \\ ( ' ,_) ) \\_/\n" +
                "    (_ , /\\  ,_/\n" +
                "      '--\\ `\\--`\n" +
                "         _\\ _\\\n" +
                "         `\\ \\\n" +
                "          _\\_\\\n" +
                "          `\\\\\n" +
                "            \\\\\n" +
                "        -.'.`\\.'.-");
        System.out.println("Leontina: Oh no! Lightning struck! Next move? ");
        userCrystalCity.add(scanner.nextLine().toLowerCase());
        System.out.println("              .\n" +
                "               \t\t\t\t\t\n" +
                "              |\t\t\t\t\t\n" +
                "     .               /\t\t\t\t\n" +
                "      \\       I     \t\t\t\t\n" +
                "                  /\n" +
                "        \\  ,g88R_\n" +
                "          d888(`  ).                   _\n" +
                " -  --==  888(     ).=--           .+(`  )`.\n" +
                ")         Y8P(       '`.          :(   .    )\n" +
                "        .+(`(      .   )     .--  `.  (    ) )\n" +
                "       ((    (..__.:'-'   .=(   )   ` _`  ) )\n" +
                "`.     `(       ) )       (   .  )     (   )  ._\n" +
                "  )      ` __.:'   )     (   (   ))     `-'.:(`  )\n" +
                ")  )  ( )       --'       `- __.'         :(      ))\n" +
                ".-'  (_.'          .')                    `(    )  ))\n" +
                "                  (_  )                     ` __.:'\n" +
                "                                        \t\n" +
                "--..,___.--,--'`,---..-.--+--.,,-,,..._.--..-._.-a:f--.");
        System.out.println("Leontina: One more move and we might be there!");
        userCrystalCity.add(scanner.nextLine().toLowerCase());
        for (String userChoice : userCrystalCity) {
            for (String correctWay : correctCrystalCity) {
                if (userChoice.equals(correctWay)) {
                    youWon();
                } else if (!userChoice.equals(correctWay)) {
                    gameOver("Leontina");
                }
            }
        }



    }


    @Override
    public void gameOver(String beast) {
        System.out.println("     .-\"\"\"\"\"\"-.\n" +
                "   .'          '.\n" +
                "  /   O      O   \\\n" +
                " :           `    :\n" +
                " |                |   \n" +
                " :    .------.    :\n" +
                "  \\  '        '  /\n" +
                "   '.          .'\n" +
                "jgs  '-......-'");
        System.out.println("\n" + beast + ": Unfortunately you failed :( Too bad, so sad.");
        scanner.nextLine();
        System.out.println("Dante: Do you want to play again? Y/n ");
        String playAgain = scanner.nextLine().toLowerCase();
        if (playAgain.equals("y")) {
            startGame();
        } else if (playAgain.equals("n")) {
            System.out.println("Dante: Bye " + userName + ", see you on your next adventure...");
        }
    }


    @Override
    public void subZero(ArrayList arrayList) {
        System.out.println("\nCherubim: What's your first move? (left, right, up, or down): ");
        userHopsChoice.add(scanner.nextLine().toLowerCase());
        System.out.println("\n        _    .  ,   .           .\n" +
                "    *  / \\_ *  / \\_      _  *        *   /\\'__        *\n" +
                "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\n" +
                " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\n" +
                "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\n" +
                "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\n" +
                " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\n" +
                "/jgs     `.  / /       `.~-^=-=~=^=.-'      '-._ `._");
        System.out.println("\nCherubim: Watch out for the iceberg! Next move!");
        userHopsChoice.add(scanner.nextLine().toLowerCase());
        System.out.println("\n  _,-\"\"`\"\"-~`)\n" +
                "(`~_,=========\\\n" +
                " |---,___.-.__,\\\n" +
                " |        o     \\ ___  _,,,,_     _.--.\n" +
                "  \\      `^`    /`_.-\"~      `~-;`     \\\n" +
                "   \\_      _  .'                 `,     |\n" +
                "     |`-                           \\'__/ \n" +
                "    /                      ,_       \\  `'-. \n" +
                "   /    .-\"\"~~--.            `\"-,   ;_    /\n" +
                "  |              \\               \\  | `\"\"`\n" +
                "   \\__.--'`\"-.   /_               |'\n" +
                "              `\"`  `~~~---..,     |\n" +
                " jgs                         \\ _.-'`-.\n" +
                "                              \\       \\\n" +
                "                               '.     /\n" +
                "                                 `\"~\"`");
        System.out.println("\nCherubim: Look out! There's a polar bear! Next move!");
        userHopsChoice.add(scanner.nextLine().toLowerCase());
        System.out.println("                        |\n" +
                "                    \\       /\n" +
                "                      .-\"-.\n" +
                "                 --  /     \\  --\n" +
                "`~~^~^~^~^~^~^~^~^~^-=======-~^~^~^~~^~^~^~^~^~^~^~`\n" +
                "`~^_~^~^~-~^_~^~^_~-=========- -~^~^~^-~^~^_~^~^~^~`\n" +
                "`~^~-~~^~^~-^~^_~^~~ -=====- ~^~^~-~^~_~^~^~~^~-~^~`\n" +
                "`~^~^~-~^~~^~-~^~~-~^~^~-~^~~^-~^~^~^-~^~^~^~^~~^~-`\n" +
                "                  jgs");
        System.out.println("\nCherubim: One more move and you might be home free!");
        userHopsChoice.add(scanner.nextLine().toLowerCase());
        for (String userChoice : userHopsChoice) {
            for (String correctHop : correctHopsList) {
                if (correctHop.equals(userChoice)) {
                    youWon();
                } else if (!correctHop.equals(userChoice)) {
                    chances--;
                    switch (chances) {
                        case 1:
                            while (!userChoice.equals(correctHop)) {
                                arrayList.clear();
                                System.out.println("Cherubim: You got crushed! You have one chance left!");
                                subZero(arrayList);
                            }
                            break;
                        case 0:
                            gameOver("Cherumim");
                            break;
                    }
                }
            }
        }
    }


    @Override
    public void youWon() {
        System.out.println("                                   .''.\n" +
                "       .''.      .        *''*    :_\\/_:     .\n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :    /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_ '.':'.'\n" +
                " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\     '  *\n" +
                "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
                "      *        |   *..*         :       |.   |' .---\"|\n" +
                "        *      |     _           .--'|  ||   | _|    |\n" +
                "        *      |  .-'|       __  |   |  |    ||      |\n" +
                "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
                " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
                "jgs~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "  &                    ~-~-~-~-~-~-~-~-~-~   /|\n" +
                " ejm97    )      ~-~-~-~-~-~-~-~  /|~       /_|\\\n" +
                "        _-H-__  -~-~-~-~-~-~     /_|\\    -~======-~\n" +
                "~-\\XXXXXXXXXX/~     ~-~-~-~     /__|_\\ ~-~-~-~\n" +
                "~-~-~-~-~-~    ~-~~-~-~-~-~    ========  ~-~-~-~\n" +
                "      ~-~~-~-~-~-~-~-~-~-~-~-~-~ ~-~~-~-~-~-~\n" +
                "                        ~-~~-~-~-~-~");
        System.out.println("Dante: Congrats " + userName + "! You won the game!");
        scanner.nextLine();
        System.out.println("\n" +
                "                                                                                                                                    ,---. \n" +
                ",--.   ,--.       ,--.                                    ,--.             ,------.                           ,--.,--.              |   | \n" +
                "|  |   |  | ,---. |  | ,---. ,---. ,--,--,--. ,---.     ,-'  '-. ,---.     |  .--. ' ,--,--.,--.--. ,--,--. ,-|  |`--' ,---.  ,---. |  .' \n" +
                "|  |.'.|  || .-. :|  || .--'| .-. ||        || .-. :    '-.  .-'| .-. |    |  '--' |' ,-.  ||  .--'' ,-.  |' .-. |,--.(  .-' | .-. ||  |  \n" +
                "|   ,'.   |\\   --.|  |\\ `--.' '-' '|  |  |  |\\   --.      |  |  ' '-' '    |  | --' \\ '-'  ||  |   \\ '-'  |\\ `-' ||  |.-'  `)' '-' '`--'  \n" +
                "'--'   '--' `----'`--' `---' `---' `--`--`--' `----'      `--'   `---'     `--'      `--`--'`--'    `--`--' `---' `--'`----'  `---' .--.  \n" +
                "                                                                                                                                    '--'  \n");
        scanner.nextLine();
        System.out.println("Dante: Play again? Y/n: ");
        String playAgain = scanner.nextLine().toLowerCase();
        if (!playAgain.equals("y") && !playAgain.equals("n")) {
            System.out.println("Dante: What was that?");
        } else if (playAgain.equals("y")) {
            startGame();
        } else {
            System.out.println("Bye " + userName + ", see you on your next adventure...");
        }

    }
}
