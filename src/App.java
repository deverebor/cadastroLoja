public class App {
    public static void main(String[] args) throws Exception {
        Funcionario func = new Funcionario();
        Funcionario func2 = new Funcionario();
        Prestador prest = new Prestador();
        Prestador prest2 = new Prestador();
        Usuario user = new Usuario();
        Usuario user2 = new Usuario();

        // Cadastro do funcionário.
        func.setName("Astrogildo Silva");
        func.setPhone("71 9 8888-7777");
        func.setEmail("the_real_astro@email.com");
        func.setDepartament("RH");
        func.setMatriculation("9898-99\n");

        func2.setName("Adeobaldo Pinto");
        func2.setPhone("71 9 8888-7777");
        func2.setEmail("dedezinho@email.com");
        func2.setDepartament("RH");
        func2.setMatriculation("7676-77\n");

        func.showProfileContent();
        func2.showProfileContent();

        // Manipulação das pessoas no sistema.
        func.addNewPerson(func);
        func.addNewPerson(func2);
        func.removePerson("Astrogildo Silva");
        func.changePerson("Astrogildo Silva", func2);
        func.showPersonList();

        // Cadastro do prestador de serviço.
        prest.setName("Zurema Santos");
        prest.setPhone("71 9 8888-7777");
        prest.setEmail("zuzu_love@email.com");
        prest.setCpf("989.989.989-90");
        prest.setCompany("EMBASA");

        prest2.setName("Zach Bell");
        prest2.setPhone("71 9 8888-7777");
        prest2.setEmail("zach_bell@email.com");
        prest2.setCpf("989.989.989-90");
        prest2.setCompany("COELBA");

        prest.showProfileContent();
        prest2.showProfileContent();

        // Manipulação das pessoas no sistema.
        prest.addNewPerson(prest);
        prest.addNewPerson(prest2);
        prest.removePerson("Zurema Santos");
        prest.changePerson("Zurema Santos", prest2);
        prest.showPersonList();

        // Cadastro do usuário.
        user.setName("Shiryu de Dragão");
        user.setPhone("71 9 8888-7777");
        user.setEmail("the_real_astro@email.com");
        user.setSystem("RH");
        user.setSystemId();

        user2.setName("Tio Patinhas");
        user2.setPhone("71 9 8888-7777");
        user2.setEmail("jojo@email.com");
        user2.setSystem("Manutenção do poste de luz");
        user2.setSystemId();

        user.showProfileContent();
        user2.showProfileContent();

        // Manipulação das pessoas no sistema.
        user.addNewPerson(user);
        user.addNewPerson(user2);
        user.removePerson("Shiryu de Dragão");
        user.changePerson("Shiryu de Dragão", user2);
        user.showPersonList();
    }
}
