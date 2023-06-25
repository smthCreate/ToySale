package Sale;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class View {
    RunBaraban baraban = new RunBaraban();
    List<Toy> toys = new ArrayList<>();
    public void run() {
        System.out.println("Choose what you want to do from list of menu (input number of menu point)");
        while (true) {
            menuView();
            int menuPoint = Prompt.promptInt("Input your choice: ");
            if (menuPoint==1) {
                String name = Prompt.prompt("Input name of toy: ");
                int quantity = Prompt.promptInt("Input quantity of toy: ");
                int weight = Prompt.promptInt("Input weight of toy: ");
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
                LocalDateTime now = LocalDateTime.now();
                int id = Integer.parseInt(dtf.format(now));
                toys.add(new Toy(id,name,quantity,weight));
                System.out.println("Toy was added");
            }
            if (menuPoint==2) {
                if (toys.size()>0){
                    int id = Prompt.promptInt("Input weight of toy: ");
                    for (Toy toy:
                         toys) {
                        if (toy.getId()==id){
                            int newWeight = Prompt.promptInt("Input new weight: ");
                            if (newWeight>=0) {
                                toy.changeWeight(newWeight);
                            }else{
                                System.out.println("You inputed wrong weight");
                            }
                        }
                    }
                }
            }
            if (menuPoint==3) {
                Toy winnedToy = baraban.runBaraban(toys);
                System.out.printf("Congratulations! You win %d %s%n",winnedToy.getId(),winnedToy.getName());
            }
            if (menuPoint!=1 && menuPoint!=2 && menuPoint!=3) {
                break;
            }



        }

    }
    public void menuView(){
        String[] menu = new String[]{"1. Add toy","2. Change toy's weight",
        "3. Run baraban!","4. End work"};
        for (String s : menu) {
            System.out.println(s);
        }
    }
}
