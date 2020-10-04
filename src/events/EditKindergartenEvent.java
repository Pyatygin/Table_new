package events;

import entities.Kindergarten;

public class EditKindergartenEvent extends KindergartenEvent {
    private Kindergarten kindergarten;
    public EditKindergartenEvent(Kindergarten kindergarten) {
        this.kindergarten = kindergarten;
    }
    public Kindergarten getKindergarten() {
        return kindergarten;
    }
}

