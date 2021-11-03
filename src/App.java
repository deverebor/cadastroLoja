public class App {
    public static void main(String[] args) throws Exception {
        Funcionario func = new Funcionario();
        Prestador prest = new Prestador();

        func.setName("Astrogildo Silva");
        func.setPhone("71 9 8888-7777");
        func.setEmail("the_real_astro@email.com");
        func.setDepartament("RH");
        func.setMatriculation("9898-99\n");

        func.showPessoaContent();

        prest.setName("Zurema");
        prest.setPhone("71 9 8888-7777");
        prest.setEmail("zuzu_love@email.com");
        prest.setCpf("989.989.989-90");
        prest.setCompany("EMBASA");

        prest.showPessoaContent();
    }
}
