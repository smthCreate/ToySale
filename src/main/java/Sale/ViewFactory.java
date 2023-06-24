package Sale;

public interface ViewFactory {
    ViewFactory newCard(int id, String name, int quantity, int weight);
    ViewFactory changeWeight(int id, int newWeight);
    ViewFactory runBaraban();


}
