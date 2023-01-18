package steps;

import elementos.ElementosTeste;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosTeste;
import runnes.Executa;
import utils.DicionarioDeMensagens;
import utils.MassaDados;

public class LoginTeste {


	 MetodosTeste metodo = new MetodosTeste();
	 ElementosTeste el = new ElementosTeste();
	 MassaDados massa = new MassaDados();
	 DicionarioDeMensagens msg = new DicionarioDeMensagens();
	 
	 @Given("que esteja na tela de login")
	 public void queEstejaNaTelaDeLogin() {
	  Executa.abrirNavegador();

	 }
	 @After
	 public void finalizarTeste() {
	  Executa.fecharNavegador();
	 }

	 @Given("preencher o usuario")
	 public void preencherOUsuario() {
	           metodo.escrever(el.username, massa.standard_user);
	 }
	 @Given("preencher a senha")
	 public void preencherASenha() {
	          metodo.escrever(el.password,massa.secret_sauce);
	 }
	 

	 @When("realizar o login")
	 public void realizarOLogin() {
	          metodo.clicar(el.btLogin);
	 }

	 @Then("login realizado com sucesso")
	 public void loginRealizadoComSucesso() {
	  metodo.currentUrl("https://www.saucedemo.com/inventory.html");

	 }
	 
	  @Given("preencher com usuario bloqueado")
	  public void preencherComUsuarioBloqueado() {
	   metodo.escrever(el.username, massa.locked_out_user);
	  }


	  @Given("preencher  senha")
	  public void preencherSenha() {
	    metodo.escrever(el.password,massa.secret_sauce);
	  }
	  @Then("sistema apresenta mensagem de usuario bloqueado")
	  public void sistemaApresentaMensagemDeUsuarioBloqueado() {
	 
	   metodo.validarTexto(el.msgBlock,msg.msgBlock);
	   
	  }
	 
	 

	   @Given("preencher o usuario invalidos")
	   public void preencherOUsuarioInvalidos() {
	      metodo.escrever(el.username, massa.secret);
	   }


	   @Given("preencher a senha invalidos")
	   public void preencherASenhaInvalidos() {
	     metodo.escrever(el.password, massa.secret);
	   }
	   @Then("sistema apresenta mensagem de usuario e senha inavalida")
	   public void sistemaApresentaMensagemDeUsuarioESenhaInavalida() {
	       metodo.validarTexto(el.msgInvalida, msg.msgIvalida);
	   }



	  
	  

	   @Given("nao preencher nenhum dado")
	   public void naoPreencherNenhumDado() {
	     metodo.clicar(el.btLogin);
	   }


	   @Then("sistema apresenta dados em branco")
	   public void sistemaApresentaDadosEmBranco() {
	      metodo.validarTexto(el.msgemBranco, msg.msgEmBranco);
	   }


}
