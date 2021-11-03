public class Prestador extends Pessoa {
  private String cpf;
  private String company;

  public String getCompany() {
    return company;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public void showPessoaContent() {
    System.out.println("<==--- Perfil do Prestador ---==>\n");
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
    System.out.println("CPF do usuário: " + getCpf());
    System.out.println("Empresa do usuário: " + getCompany());
  }

}
