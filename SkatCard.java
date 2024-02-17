public class SkatCard {
    final private SkatCardColor color;
    final private SkatCardValue value;

    public SkatCard(SkatCardColor color, SkatCardValue value){
        this.color = color;
        this.value = value;
    }

    public SkatCardColor getColor(){
        return color;
    }

    public SkatCardValue getValue(){
        return value;
    }

    public String getSkatDescription(){
        return color.getDescription() + " " + value.getDescription();
    }
}
