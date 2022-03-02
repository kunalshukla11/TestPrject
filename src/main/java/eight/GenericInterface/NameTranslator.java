package eight.GenericInterface;

public class NameTranslator implements StringTranslator{
    @Override
    public String translate(String name) {
        return "Mr/MS--"+name;
    }
}
