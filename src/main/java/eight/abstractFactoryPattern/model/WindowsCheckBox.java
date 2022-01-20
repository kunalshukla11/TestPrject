package eight.abstractFactoryPattern.model;

import eight.abstractFactoryPattern.model.Checkbox;

public class WindowsCheckBox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox being used");
    }
}
