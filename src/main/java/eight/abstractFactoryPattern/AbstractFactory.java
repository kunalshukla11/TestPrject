package eight.abstractFactoryPattern;

import eight.abstractFactoryPattern.model.Button;
import eight.abstractFactoryPattern.model.Checkbox;

public interface AbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}
