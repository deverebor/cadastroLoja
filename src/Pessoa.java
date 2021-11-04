public class Pessoa {
  public Pessoa[] personList;
  public Integer maxSize = 10;
  public Integer index = 0;
  private String name;
  private String phone;
  private String email;

  public Pessoa() {
    personList = new Pessoa[maxSize];
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void showPessoaContent() {
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
  }

  public void addNewPerson(Pessoa person) {
    try {
      personList[index] = person;
      this.index++;

      System.out.println("Pessoa adicionada com sucesso!");
    } catch (Exception e) {
      System.out.println("Erro ao adicionar pessoa: " + e.getMessage());
    }
  }

  public void removePerson(String name) {
    try {
      for (int i = 0; i < personList.length; i++) {
        if (personList[i].getName().equals(name)) {
          personList[i] = null;
          System.out.println("Pessoa removida com sucesso!");
        }
      }
    } catch (Exception e) {
      System.out.println("Erro ao remover pessoa: " + e.getMessage());
    }
  }

  public void changePerson(String name, Pessoa person) {
    try {
      for (int i = 0; i < personList.length; i++) {
        if (personList[i].getName().equals(name)) {
          personList[i] = person;
          System.out.println("Pessoa alterada com sucesso!\n");
        }
      }
    } catch (Exception e) {
      System.out.println("Erro ao alterar pessoa: " + e.getMessage());
    }
  }

  public void showPersonList() {
    for (int i = 0; i < personList.length; i++) {
      if (personList[i] != null) {
        System.out.println("\n-------Nova Pessoa Cadastrada-------");
        System.out.println("Nome: " + personList[i].getName());
        System.out.println("Telefone: " + personList[i].getPhone());
        System.out.println("Email: " + personList[i].getEmail());
      }
    }
  }

}
