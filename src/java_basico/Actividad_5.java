package java_basico;
public class Actividad_5 {
    public interface Coche_CRUD{
        void save();
        void delete();
        void findAll();
    }
    public static class CocheCRUD_Impl  implements Coche_CRUD{
        @Override
        public void save() {
        }
        @Override
        public void delete() {
        }
        @Override
        public void findAll() {
        }
        String save = "saving", delete= "erasing", findAll= "searching";
        @Override
        public String toString() {
            return "CocheCRUD_Impl{" +
                    "save='" + save + '\'' +
                    ", delete='" + delete + '\'' +
                    ", findAll='" + findAll + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Coche_CRUD cocheCRUD = new CocheCRUD_Impl();
        System.out.println(cocheCRUD);
    }

}
