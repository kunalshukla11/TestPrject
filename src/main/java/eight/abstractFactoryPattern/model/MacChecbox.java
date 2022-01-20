package eight.abstractFactoryPattern.model;

import eight.abstractFactoryPattern.model.Checkbox;

public class MacChecbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("mac check box used");
    }
}
