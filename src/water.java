public abstract class water implements vehicle{
    public abstract void energy();

    @Override
    public void movementPlace() {
        System.out.println("Передвигается по воде");
    }
    public abstract void movementPrinciple();
    public abstract void capacity();

    public class sailboat extends water {
        @Override
        public void energy() {
            System.out.println("Сила ветра");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Парус");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 15 человек");
        }
    }

    public class motorShip extends water {
        @Override
        public void energy() {
            System.out.println("Бензин");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Лодочный мотор");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 5 человек");
        }
    }

    public class submarine extends water {
        @Override
        public void energy() {
            System.out.println("Ядерный реактор");
        }

        @Override
        public void movementPlace() {
            System.out.println("Передвигается под водой");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Турбина");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 150 человек");
        }
    }

}
