package Sale;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Data
public class RunBaraban {
    Random random = new Random();
    public Toy runBaraban(List<Toy> toys){
        List<Integer> toyIndex = new ArrayList<>();
        while (toyIndex.size()==0) {
            int probability = (int) (Math.random() * 10);
            for (int i = 0; i < toys.size(); i++) {
                if (toys.get(i).getWeight() >= probability && toys.get(i).getQuantity()>0) {
                    toyIndex.add(i);
                    toys.get(i).setQuantity(toys.get(i).getQuantity());
                }
            }
        }
        List<Integer> sortedToyIndex = toyIndex.stream().sorted().collect(Collectors.toList());
        return toys.get(toyIndex.get(random.nextInt(0, toyIndex.size())));

    }
}
