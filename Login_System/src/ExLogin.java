public class ExLogin implements LoginMethods  {

    private static final String USERNAME = "lucas";
    private static final String PASSWORD = "1234";



    @Override
    public boolean login(String username, String password) {

        return username.equals(USERNAME) && password.equals(PASSWORD);


    }


    public static void main(String[] args) {


        ExLogin p = new ExLogin();

        System.out.println(p.login("lucas", "1234"));
    }
}
