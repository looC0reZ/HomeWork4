public abstract class air implements vehicle {
    public abstract void energy();

    @Override
    public void movementPlace() {
        System.out.println("Передвигается по воздуху");
    }
    public abstract void movementPrinciple();
    public abstract void capacity();

    public class helicopter extends air {
        @Override
        public void energy() {
            System.out.println("Авиационный керосин");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Летает с помощью винта");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 10 человек");
        }
    }

    public class airplane extends air {
        @Override
        public void energy() {
            System.out.println("Авиационный керосин");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Летает с помощью крыльев");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 200 человек");
        }
    }

    public class balloon extends air {
        @Override
        public void energy() {
            System.out.println("Газ");
        }

        @Override
        public void movementPrinciple() {
            System.out.println("Летает с помощью разошретого воздуха в шаре");
        }

        @Override
        public void capacity() {
            System.out.println("Вместимость 5 человек");
        }
    }

}
