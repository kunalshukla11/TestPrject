package eight.generics.genericClass;

import eight.domain.Bike;

import java.util.List;

public class BikeRental extends Rental<Bike>{

    @Override
    public List<Bike> getElements() {
        return super.getElements();
    }

    @Override
    public void setElements(List<Bike> elements) {
        super.setElements(elements);
    }

    @Override
    public Bike rent() {
        if (null == this.elements || this.elements.isEmpty()) {
            System.out.println("No Bikes present");
            return null;
        } else {
            return elements.get(elements.size() - 1);
        }
    }

    @Override
    public void returnElement(Bike element) {
        super.returnElement(element);
    }
}
