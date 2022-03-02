package eight.generics.genericClass;

import eight.domain.Car;

import java.util.List;

public class CarRental extends Rental<Car>{

    @Override
    public List<Car> getElements() {
        return super.getElements();
    }

    @Override
    public void setElements(List<Car> elements) {
        super.setElements(elements);
    }

    @Override
    public Car rent() {
        if (null == this.elements || this.elements.isEmpty()) {
            System.out.println("No Cars present");
            return null;
        } else {
            return elements.get(elements.size() - 1);
        }
    }

    @Override
    public void returnElement(Car element) {
        super.returnElement(element);
    }
}
