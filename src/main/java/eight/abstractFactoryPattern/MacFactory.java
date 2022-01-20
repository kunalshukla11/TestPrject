package eight.abstractFactoryPattern;

import eight.abstractFactoryPattern.model.*;

public class MacFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacButon();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacChecbox();
    }
}
