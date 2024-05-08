import br.unipar.ContaCorrente;
import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTeste {
   @Test
   public void testDepositoContaCorrente(){
      ContaCorrente conta = new ContaCorrente();
      conta.depositar(5000d);

      assertEquals(conta.obterSaldo(), 5000);
   }
   @Test
   public void testSaqueContaCorrente(){
      ContaCorrente conta = new ContaCorrente();
      conta.depositar(3000d);
      boolean validacao = conta.saque(1500d);

      assertTrue(validacao);
      assertEquals(1500, conta.obterSaldo());
   }
   @Test
   public void testSaqueContaPoupanca(){
      ContaPoupanca conta = new ContaPoupanca();
      conta.depositar(10d);
      boolean validacao = conta.saque(5d);

      assertTrue(validacao);
      assertEquals(0, conta.obterSaldo());
   }

}
