public class Prestador extends Pessoa {
  private String cpf;
  private String company;
  private String user_type = "Prestador";

  public Prestador() {}

  public Prestador(String nome, String cpf, String email) {
    super(nome, cpf, email);
    
    System.out.println(user_type + "adicionado com sucesso!");
    System.out.println("Nome do" + user_type + ":" + getName());
    System.out.println("Telefone do " + user_type + ": " + getPhone());
    System.out.println("Email do " + user_type + ": " + getEmail());
  }

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
  public void showProfileContent() {
    System.out.println("<==--- Perfil do Prestador ---==>\n");
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
    System.out.println("CPF do usuário: " + getCpf());
    System.out.println("Empresa do usuário: " + getCompany());
  }

}
