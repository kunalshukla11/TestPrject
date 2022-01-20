package eight.abstractFactoryPattern;

import eight.abstractFactoryPattern.model.Button;
import eight.abstractFactoryPattern.model.Checkbox;

public class JobRunner {
    private Checkbox checkbox;
    private Button button;

    public JobRunner(AbstractFactory abstractFactory){
      this.checkbox=abstractFactory.createCheckbox();
      this.button=abstractFactory.createButton();
    }

    public void runTheJob(){
        checkbox.check();
        button.click();
    }

}
