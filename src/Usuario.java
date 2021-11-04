import java.util.concurrent.atomic.AtomicInteger;

public class Usuario extends Pessoa {
  private static final AtomicInteger count = new AtomicInteger(0);
  private Integer sytemId;
  private String system;

  public String getSystem() {
    return system;
  }

  public Integer getSystemId() {
    return sytemId;
  }

  public void setSystemId() {
    sytemId = count.incrementAndGet();
  }

  public void setSystem(String system) {
    this.system = system;
  }

  @Override
  public void showPessoaContent() {
    System.out.println("<==--- Perfil do Usuário ---==>\n");
    System.out.println("Nome do usuário: " + getName());
    System.out.println("Telefone do usuário: " + getPhone());
    System.out.println("Email do usuário: " + getEmail());
    System.out.println("Id do usuário: " + getSystemId());
    System.out.println("Pedido do usuário: " + getSystem());
  }
}
