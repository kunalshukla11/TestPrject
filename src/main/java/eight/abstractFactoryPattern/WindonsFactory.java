package eight.abstractFactoryPattern;

import eight.abstractFactoryPattern.model.*;

public class WindonsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}
