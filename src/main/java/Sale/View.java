package Sale;

public class View {
    public void run() {
        while (true) {
            System.out.println("Choose what you want to do from list of menu (input number of menu point)");
            menuView();
            int menuPoint = Prompt.promptInt("Input your choice: ");
            while (true) {
                if (menuPoint==1) {
                    Integer[] arg = Prompt.promptIntAr("Введите второй аргумент: ");
                    continue;
                }
                if (menuPoint==2) {
                    Integer[] arg = Prompt.promptIntAr("Введите второй аргумент: ");
                    continue;
                }
                if (menuPoint==3) {
                    break;
                }
            }
            String cmd = Prompt.prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }

    }
    public void menuView(){
        String[] menu = new String[]{"1. Add toy","2. Change toy's weight",
        "3. Run baraban!","4. Exit"};
        for (String s : menu) {
            System.out.println(s);
        }
    }
}
