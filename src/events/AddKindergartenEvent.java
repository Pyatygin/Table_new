package events;

import entities.Kindergarten;

public class AddKindergartenEvent extends KindergartenEvent {
    private Kindergarten kindergarten;

    public AddKindergartenEvent(Kindergarten kindergarten) {
        this.kindergarten = kindergarten;
    }

    public Kindergarten getKindergarten() {
        return kindergarten;
    }
}
