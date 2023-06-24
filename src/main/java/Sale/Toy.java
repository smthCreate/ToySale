package Sale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int weight;
    public void changeWeight(int newWeight){
        weight = newWeight;
        System.out.println("Weight was changed!");

    }
}
