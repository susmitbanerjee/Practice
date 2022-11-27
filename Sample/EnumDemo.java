package Sample;

public class EnumDemo {

    enum Developer{
        BACKEND{
            String getDeveloper(){
                return "BACKEND-1";
            }
        },
        FRONTEND{
            String getDeveloper(){
                return "FRONTEND";
            }
        }
    }

    public static void main(String[] args) {
        Developer developer = Developer.BACKEND;
        System.out.println(developer);

    }
}
