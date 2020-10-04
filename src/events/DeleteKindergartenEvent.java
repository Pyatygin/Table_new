package events;

import entities.Kindergarten;

public class DeleteKindergartenEvent extends KindergartenEvent {
        private Kindergarten kindergarten;

        public DeleteKindergartenEvent(Kindergarten kindergarten) {
            this.kindergarten = kindergarten;
        }

        public Kindergarten getKindergarten() {
            return kindergarten;
        }
    }

}
