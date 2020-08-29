package teste;

import java.util.Date;
import java.util.List;

import controle.Adm;
import controle.Cliente;
import controle.Conta;
import controle.Funcionario;
import controle.Contato;
import controle.RegistroOperacao;

public class Teste_Classe {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

//		String a = "30";
//		String b = "50";
//		long aa = Long.parseLong(a);
//		long bb = Long.parseLong(b);
//		long cc = aa+bb;
//		System.out.println(cc);
//		long aaa = new Long(a);
//		long bbb = new Long(b);
//		long ccc = aaa+bbb;
//		System.out.println(ccc);
//		
//		
//		Contato testeContato1 = new Contato("AAAA", "aaaa", "aaaa@aaaa.com", "11111111", "Foi?");
//		if (testeContato1.cadastrarContato()) {
//			System.out.println("\n\nFoi");
//			System.out.println(testeContato1.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(testeContato1.getMsg()+"\n\n");
//		}
//		
//		Contato testeContato2 = new Contato("zzzz", "zzzz", "zzzz@zzzz.com", "22222222", "Foi?");
//		if (testeContato2.cadastrarContato()) {
//			System.out.println("\n\nFoi");
//			System.out.println(testeContato2.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(testeContato1.getMsg()+"\n\n");
//		}
//		
//		Contato testeListagem = new Contato();
//		List<Contato> testeListaContato = testeListagem.listarContatos();
//		if (testeListaContato != null) {
//			for (int i = 0; i < testeListaContato.size(); i++) {
//				System.out.println("\nRegistro: " + testeListaContato.get(i).getId());
//				System.out.println("Nome: " + testeListaContato.get(i).getNome());
//				System.out.println("Assunto: " + testeListaContato.get(i).getAssunto());
//				System.out.println("Email: " + testeListaContato.get(i).getEmail());
//				System.out.println("Telefone: " + testeListaContato.get(i).getTelefone());
//				System.out.println("Texto: " + testeListaContato.get(i).getTexto());
//				System.out.println("####################################################");
//			}
//			System.out.println("\n\nFoi");
//			System.out.println(testeListagem.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(testeListagem.getMsg()+"\n\n");
//		}

		Adm adm = new Adm();
		
		if (adm.cadastrarFuncionario("Jorge Santana", "22222222222", "222222222", new Date("12/03/1987"),
				"Rua 3, 3", "22222222", "22222222", "222222222", "Gerente", "2000")) {
			System.out.println("\n\nFoi");
			System.out.println(adm.getMsg());
		} else {
			System.out.println("\n\nNão foi");
			System.out.println(adm.getMsg());
		}

		Funcionario func = new Funcionario("22222222222");
		if (func.localizarFunc()) {
			System.out.println("\n\nFoi");
			System.out.println(func.getMsg());
		} else {
			System.out.println("\n\nNão foi");
			System.out.println(func.getMsg());
		}
		
//		if (adm.editarFuncionario(func, "Jorge Santana", "22222222222", "222222222",
//				new Date("12/03/1987"), "Rua 3, 3", "22222222", "22222222", "2222222222", "Líder de Projeto", "3000")) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
		
		
		if (adm.cadastrarAdm("22222222222", "jorgeAdm", "123456")) {
			System.out.println("Foi");
			System.out.println(adm.getMsg());
		} else {
			System.out.println("\n\nNão foi");
			System.out.println(adm.getMsg());
		}
		
//		adm.setLogin("jorgeAdm");
//		adm.setSenha("123456");
//		
//		if (adm.loginAdm()) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
//
//		if (adm.editarAdm("jorgeEditado", "123456789")) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
//		
		if (adm.cadastrarCliente("Claudia da Silva", "11111111114", "111111114", new Date("05/04/1945"),
				"Rua 4, 4", "11111114", "11111114", "111111114", "1234")) {
			System.out.println("\n\nFoi");
			System.out.println(adm.getMsg());
		} else {
			System.out.println("\n\nNão foi");
			System.out.println(adm.getMsg());
		}
//		
//		Cliente testeEditarCliente = new Cliente("11111111114");
//
//		if (adm.editarCliente(testeEditarCliente,"Claudia da Silva", "11111111113", "111111113", new Date("05/04/1945"),
//				"Rua 4, 4", "11111113", "11111113", "111111113")) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
//		
//		Conta testeConta = new Conta("9872966533", "1234");
//
//		if (testeConta.login()) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
//
//		if (adm.editarConta(testeConta, "123456789")) {
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg());
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg());
//		}
//		
//		if (testeConta.sacar(20)) {
//			System.out.println("\n\nFoi");
//			System.out.println(testeConta.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(testeConta.getMsg()+"\n\n");
//		}
//
//		if (testeConta.depositar(10)) {
//			System.out.println("\n\nFoi");
//			System.out.println(testeConta.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(testeConta.getMsg()+"\n\n");
//		}
//		
//		List<RegistroOperacao> testeRegistro = adm.listaOpCliente("9872966533");
//		if (testeRegistro != null) {
//			for (int i = 0; i < testeRegistro.size(); i++) {
//				System.out.println("\nRegistro: " + testeRegistro.get(i).getId());
//				System.out.println("Conta: " + testeRegistro.get(i).getConta().getNumConta());
//				System.out.println("Operação: " + testeRegistro.get(i).getTipo_op());
//				System.out.println("Valor:" + testeRegistro.get(i).getValor());
//				System.out.println("####################################################");
//			}
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg()+"\n\n");
//		}
//
//		List<RegistroOperacao> testeRegistroGeral = adm.listarOp();
//		if (testeRegistroGeral != null) {
//			for (int i = 0; i < testeRegistroGeral.size(); i++) {
//				System.out.println("\nRegistro: " + testeRegistroGeral.get(i).getId());
//				System.out.println("Conta: " + testeRegistroGeral.get(i).getConta().getNumConta());
//				System.out.println("Operação: " + testeRegistroGeral.get(i).getTipo_op());
//				System.out.println("Valor:" + testeRegistroGeral.get(i).getValor());
//				System.out.println("####################################################");
//			}
//			System.out.println("\n\nFoi");
//			System.out.println(adm.getMsg()+"\n\n");
//		} else {
//			System.out.println("\n\nNão foi");
//			System.out.println(adm.getMsg()+"\n\n");
//		}
//		
	}
}
