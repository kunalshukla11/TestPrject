package eight.abstractFactoryPattern.model;

import eight.abstractFactoryPattern.model.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button used");
    }
}
