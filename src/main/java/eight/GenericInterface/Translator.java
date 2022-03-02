package eight.GenericInterface;
@FunctionalInterface
public interface Translator <T, R>{
     R translate(T input);
}
