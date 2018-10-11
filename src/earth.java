public abstract class earth implements vehicle {
    public abstract void energy();

    @Override
    public void movementPlace() {
        System.out.println("Передвигаются по земле");
    }

    @Override
    public void movementPrinciple() {
        System.out.println("Передвигаются c помощью колес");
    }

    public abstract void capacity();


    public class bus extends earth {
        @Override
        public void energy() {
            System.out.print("Дизельное топливо");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 60 человек");
        }
    }

    public class trolleybus extends earth {
        @Override
        public void energy() {
            System.out.print("Электричество");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 40 человек");
        }
    }

    public class tram extends earth {
        @Override
        public void energy() {
            System.out.print("Электричество");
        }

        @Override
        public void movementPrinciple() {
            // super.movementPrinciple();
            System.out.print("Передвигается по рельсам");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 50 человек");
        }
    }

    public class metro extends tram {
        @Override
        public void energy() {
            super.energy();
        }
    }
}