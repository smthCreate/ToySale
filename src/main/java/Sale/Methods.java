package Sale;

import lombok.Data;

@Data
public class Methods implements ViewFactory{
    @Override
    public ViewFactory newCard(int id, String name,
                               int quantity, int weight){
        return Toy(int id, String name,
        int quantity, int weight)
    }
}
