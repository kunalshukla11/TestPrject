package eight.abstractFactoryPattern.model;

import eight.abstractFactoryPattern.model.Button;

public class MacButon implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button used");
    }
}
