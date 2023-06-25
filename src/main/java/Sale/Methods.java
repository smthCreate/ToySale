package Sale;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Methods{
    public Toy newCard(int id, String name,
                               int quantity, int weight){
        Toy newtoy = new Toy(id,name,quantity,weight);
        return newtoy;
    }
    public Toy changeWeight(Toy toy, int newWeight){
        toy.setWeight(newWeight);
        return toy;
    }
    public Toy runBaraban(List<Toy> toys){
        List<Integer> toyIndex = new ArrayList<>();
        while (toyIndex.size()==0) {
            int probability = (int) (Math.random() * 10);
            for (int i = 0; i < toys.size(); i++) {
                if (toys.get(i).getWeight() >= probability) {
                    toyIndex.add(i);
                }
            }
        }
        List<Integer> sortedToyIndex = toyIndex.stream().sorted().collect(Collectors.toList());
        return toys.get(toyIndex.get(-1));

    }
}
