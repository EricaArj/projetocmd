package show;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import show.controller.ShowController;
import show.model.Cadastro;
import show.model.CadastroHomem;
import show.model.CadastroMulher;
import show.model.CadastroOutros;
public class Menu {
	public static void main(String[] args) {
		
				
				Scanner leia = new Scanner(System.in);
				ShowController cliente = new ShowController();
				Cadastro clienteLogado = null;
				int opcao;
				int numCam = 0;
				int pacote = 0;
				boolean x = true;
				boolean logado = false;
				char apagar;
				char deslogar;
				
				String nome,nomeCad, senha,senhaCad, cpf,cpfCad,sexo, telefone,telefoneCad, email,emailbuscar=null,emailAtu,dataNasc,emailCad, generoIdent;
				int tipoSexo,tipoSexoCad;
	
				
				
				cliente.criarCamarotesEspeciais();
				cliente.criarCamarotesTradicionais();
				
				
				//Cadastro c1 = new Cadastro(1, "Brian Schneider de Lima", "R1p4rT3ex", "123.456.789-01", "Masculino", "(11)98765-4321", LocalDate.of(1994, 10, 6), "brian@generation.com");
//				Cadastro c2 = new Cadastro(2, "Vinicius Prazeres", "E#30y0@*", "987.654.321-10", "Masculino", "(11)91234-5678", LocalDate.of(1995, 5, 13), "vprazeres@generation.com");
//				Cadastro c3 = new Cadastro(3, "Erica Araújo da silva Oliveira", "m5R&8t5h", "444.333.55-22", "Feminino", "(11)98237-4765", LocalDate.of(1997, 8, 24), "ericaraujo@generation.com");
//				Cadastro c4 = new Cadastro(4, "Jennifer Cruz", "%0p%L52%", "842.632.919-87", "Feminino", "(11)98888-7777", LocalDate.of(1997, 11, 16), "jennifercruz@generation.com");
				
				//cliente.cadastrar(c1);
//				cliente.cadastrar(c2);
//				cliente.cadastrar(c3);
//				cliente.cadastrar(c4);
				
				//cliente.criarCamarotes(4);
				
	 while (true) {
	 	
	 	System.out.println("_________________________________________________________________________________");
	 	System.out.println("																				 ");
	 	System.out.println(" ##### #### ##### ##### ##### ##### ##### ###### ### ## ## ### ");
	 	System.out.println(" #__# #_## #___# # ##### # #___# # #_# #___# #_# ");
	 	System.out.println(" #### ## #___# #__# # # #___# #___# #_#_# #_# #_#_# ");
	 	System.out.println(" # # # ##### ### ##### # ##### #### # # # # # ");
	 	System.out.println("_________________________________________________________________________________");
	
	
	 	System.out.println("_________________________________________________________________________________");
	 	System.out.println("																				 ");
	 	System.out.println("			#######___##_#_____#_##___########							 		 ");
	 	System.out.println("			##________##__#___#__##___##____###							 ");
	 	System.out.println("			##________##___###___##___##_____###						 ");
	 	System.out.println("			##________##____#____##___##____###							 ");
	 	System.out.println("			#######___##_________##___#######							 ");
	 	System.out.println("_________________________________________________________________________________");
	 	
	 	
	 	System.out.println("																				 ");
	 	System.out.println(" ######## ###### # # ######## #######----------###	 		 ");
	 	System.out.println(" ##---------- ##___## #	 #--##	 # ## #---------# ##				 ");
	 	System.out.println(" ## #####---##__## #____# ####### ##----#--------#--## 			 ");
	 	System.out.println(" ##_____#-----####-----#____#--##	-------##--- #-----------## 		 ");
	 	System.out.println(" ########-----## ##---######--##------- #######--------########		 ");
	 	
	 	System.out.println("_________________________________________________________________________________");
	 	keyPress();
	 	
			do {
				System.out.println("								\n");
		 	System.out.println("								\n");
				System.out.println("Bem-vindo ao sistema de RESERVA!");
				System.out.println("______________MENU________________\n");
				System.out.println("	Escolha uma opção:		");
				System.out.println("	 1- LOGIN		 	");
				System.out.println("	 2- CRIAR CADASTRO		");
				System.out.println("	 0- Sair				");
				System.out.println("__________________________________\n");
				System.out.println("Entre com a opção desejada: ");
				
				
				
				
				try {
					opcao = leia.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Digite valores inteiros de 0 a 6! ");
					leia.nextLine();
					opcao = 0;
					
				}
				if (opcao == 0) {
					System.out.println("#####################################################################");
					System.out.println("\n 		CMD - RELIZAMOS OS SEUS SONHOS						 	 ");
					System.out.println("\n			TENHA UM OTIMO DIA! 									 ");
					System.out.println("#####################################################################");
					leia.close();
					System.exit(0);
				}
				switch (opcao) {
				case 1:
					System.out.print("------------------------------\n");
					System.out.println("Realizando Login...");
					
					System.out.print("------------------------------\n");
					
			 System.out.print("Digite o seu Email: ");
			 String emaillogin = leia.next();
			 System.out.print("\nSenha: ");
			 String senhalogin = leia.next();
			
			 boolean login = cliente.autenticar(emaillogin,senhalogin);
			
			 if (login) {
			 	System.out.print("------------------------------\n");
			 System.out.println("\nAutenticado com sucesso!");
			 System.out.print("------------------------------\n");
			 // Código para redirecionar o usuário para a página principal
			 clienteLogado = cliente.retornaLogado(emaillogin, senhalogin);
			 clienteLogado.visualizar();
			 logado = true;
			 } else {
			 	System.out.print("------------------------------");
			 System.out.println("\nEmail ou senha inválidos!");
			 System.out.println("\n Faça o seu Cadastro Primeiro");
			 System.out.println("\n E Tenta Novamente!");
			 System.out.print("------------------------------");
			 // Código para exibir uma mensagem de erro ao usuário
			
			 }
			
			 keyPress();
					 break;
					
				case 2:
					System.out.print("------------------------------\n");
					System.out.println("Criar Cadastro \n\n");
					System.out.print("------------------------------\n");
					System.out.println("Realizando cadastro...");
					System.out.print("------------------------------\n");
					System.out.print("Informe seu nome: ");
					leia.skip("\\R?");
					nomeCad = leia.nextLine();
	
					System.out.print("Senha: ");
					leia.skip("\\R?");
					senhaCad = leia.nextLine();
					System.out.print("\n");
	
					System.out.println("CPF: ");
					leia.skip("\\R?");
					cpfCad = leia.nextLine();
	
					System.out.println("Digite seu telefone/celular: ");
					leia.skip("\\R?");
					telefoneCad = leia.nextLine();
					
					System.out.print("Entre com a data de nascimento DD/MM/AAAA formatada: ");
					
				
					dataNasc = leia.nextLine();
					
					if(cliente.dataNascimento(dataNasc) == false) {
						System.out.println("\nIdade inválida. Apenas pesosas com idade maior ou igual a 18 são permitidas");
						break;
					}
					System.out.print("Email: ");
					leia.skip("\\R?");
					emailCad = leia.nextLine();
					
					System.out.println("Informe o Sexo ");
					
					do {
						System.out.println("Sexo -> (1-Mulher | 2-Homem | 3-Outros): ");
						tipoSexoCad = leia.nextInt();
					} while (tipoSexoCad < 1 && tipoSexoCad> 3);
	
					switch (tipoSexoCad) {
					case 1 -> {
						System.out.println("Mulheres tem direito de descontos de 20%");
						cliente.cadastrar(new CadastroMulher(nomeCad,senhaCad,cpfCad,tipoSexoCad,telefoneCad,dataNasc,emailCad, 0.2f));
	
	//					limite = leia.nextFloat();
	//					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
	
					}
					case 2 -> {
						System.out.println("Homem ");
						cliente.cadastrar(new CadastroHomem(nomeCad,senhaCad,cpfCad,tipoSexoCad,telefoneCad,dataNasc,emailCad));
	//					aniversario = leia.nextInt();
	//					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
					case 3 -> {
						System.out.println("Outros: ");
						System.out.println("Como você se identifica?");
						leia.skip("\\R?");
						generoIdent = leia.nextLine();
						cliente.cadastrar(new CadastroOutros(nomeCad,senhaCad,cpfCad,tipoSexoCad,telefoneCad,dataNasc,emailCad, generoIdent));
	
	//					aniversario = leia.nextInt();
	//					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
	
					}
					
					
					
					}
	
					keyPress();
					break;
				}	
				
			}while(logado == false);
			
			while (true && logado == true) {
				System.out.println("______________MENU________________\n");
				System.out.println("	 1- LISTA CADASTROS		");
				System.out.println("	 2- ATUALIZAR CADASTRO	");
				System.out.println("	 3- RESERVA(CAMAROTE)	");
				System.out.println("	 4- LISTA(RESERVAS)		");
				System.out.println("	 5- CONSULTAR(CAMAROTE)	");
				System.out.println("	 6- EXCLUIR(RESERVA)	");
				System.out.println("	 7- EXCLUIR CADASTRO	");
				System.out.println("	 8- DESLOGAR 	");
				System.out.println("	 0- Sair				");
				System.out.println("__________________________________\n");
				System.out.println("Entre com a opção desejada: ");
				System.out.println("			 					");
				
				
				try {
					opcao = leia.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Digite valores inteiros de 0 a 6! ");
					leia.nextLine();
					opcao = 0;
					
				}
				
				if (opcao == 0) {
					System.out.println("#####################################################################");
					System.out.println("\n 		CMD - RELIZAMOS OS SEUS SONHOS						 	 ");
					System.out.println("\n			TENHA UM OTIMO DIA! 									 ");
					System.out.println("#####################################################################");
					leia.close();
					System.exit(0);
				}
				
				switch (opcao) {
				case 1:
					System.out.print("------------------------------\n");
					System.out.println("LISTA DE CADASTRO ");
					System.out.print("------------------------------\n");
					
					cliente.listarCadastro();
					
					break;
				
				case 2:
					
					System.out.print("------------------------------\n");
					System.out.println("ATUALIZAR CADASTRO\n\n");
					System.out.print("------------------------------\n");
					System.out.println("Atualizar dados da Conta\n\n");
					System.out.print("Informe seu nome: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
	
					System.out.print("Senha: ");
					leia.skip("\\R?");
					senha = leia.nextLine();
					System.out.print("\n");
	
					System.out.println("CPF: ");
					leia.skip("\\R?");
					cpf = leia.nextLine();
	
	
					System.out.println("Digite seu telefone/celular: ");
					leia.skip("\\R?");
					telefone = leia.nextLine();
					
					System.out.print("Entre com a data de nascimento DD/MM/AAAA formatada: ");
					
				
					dataNasc = leia.nextLine();
	
					if(cliente.dataNascimento(dataNasc) == false) {
						System.out.println("\nIdade inválida. Apenas pesosas com idade maior ou igual a 18 são permitidas");
						break;
					}
					System.out.print("Email: ");
					leia.skip("\\R?");
					emailCad = leia.nextLine();
					
					
	
					System.out.println("Informe o Sexo ");
					
					do {
						System.out.println("Sexo -> (1-Mulher | 2-Homem | 3-Outros): ");
						tipoSexoCad = leia.nextInt();
					} while (tipoSexoCad < 1 && tipoSexoCad> 3);
	
					switch (tipoSexoCad) {
					case 1 -> {
						System.out.println("Mulheres tem direito de descontos de 20%");
						cliente.atualizarCadastro(new CadastroMulher(nome,senha,cpf,tipoSexoCad,telefone,dataNasc,emailCad, 0.2f), clienteLogado);
	
	//					limite = leia.nextFloat();
	//					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
	
					}
					case 2 -> {
						System.out.println("Homem ");
						cliente.atualizarCadastro(new CadastroHomem(nome,senha,cpf,tipoSexoCad,telefone,dataNasc,emailCad), clienteLogado);
	//					aniversario = leia.nextInt();
	//					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
					case 3 -> {
						System.out.println("Outros: ");
						System.out.println("Como você se identifica?");
						leia.skip("\\R?");
						generoIdent = leia.nextLine();
						cliente.atualizarCadastro(new CadastroOutros(nome,senha,cpf,tipoSexoCad,telefone,dataNasc,emailCad, generoIdent), clienteLogado);
	
	//					aniversario = leia.nextInt();
	//					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
	
					}
					
					
					
					}
	
					keyPress();
					break;
	
				case 3:
					
					System.out.print("------------------------------\n");
					System.out.println("RESERVA(CAMAROTE)\n\n");
					System.out.print("------------------------------\n");
					System.out.println("Camarote\n\n");
					do {
						do {
							System.out.println("\nDigite tipo de Camarote (1 - Trad1cional / 2 - Especial):");
							
							try {
								pacote = leia.nextInt();
							} catch (InputMismatchException e) {
								System.out.println("\nDigite valores inteiros!");
								leia.nextLine();
								pacote = 0;
								continue;
							}
		
							// Se o número for menor que 1 ou maiior que 4, recomeça o loop
							if (pacote < 1 || pacote > 2)
								System.out.println("\nDigite um número entre 1 e 2!");
		
						} while (pacote < 1 || pacote > 2);
						x = cliente.agendarCamarote(clienteLogado.getNome(), pacote);
					} while(x == true);
					break;
				case 4:
					System.out.print("------------------------------\n");
					System.out.println("LISTA(RESERVAS)\n\n");
					System.out.print("------------------------------\n");
					cliente.listarTodas();
					
					break;
				case 5:
					System.out.print("------------------------------\n");
					System.out.println("CONSULTAR(CAMAROTE)\n\n");
					System.out.print("------------------------------\n");
					System.out.println("\nDigite tipo de Camarote (1 - Trad1cional / 2 - Especial):");
					pacote = leia.nextInt();
					System.out.println("\nDigitar número do camarote:");
					numCam = leia.nextInt();
					cliente.conferirAgendamento(clienteLogado.getNome(), numCam, pacote);				
					break;
				case 6:
					System.out.print("------------------------------\n");
					System.out.println("EXCLUIR(RESERVA)\n\n");
					System.out.print("------------------------------\n");
					System.out.print("------------------------------\n");
					System.out.println("CONSULTAR(CAMAROTE)\n\n");
					System.out.print("------------------------------\n");
					System.out.println("\nDigite tipo de Camarote (1 - Trad1cional / 2 - Especial):");
					pacote = leia.nextInt();
					System.out.println("\nDigitar número do camarote:");
					numCam = leia.nextInt();
					cliente.cancelarReserva(clienteLogado.getNome(), numCam, pacote);
					
					
					break;
				case 7:
					System.out.print("------------------------------\n");
					System.out.println("EXCLUIR(CADASTRO)\n\n");
					System.out.print("------------------------------\n");
					System.out.println("Excluir Cadastro\n\n");
					System.out.println("Deseja apagar a sua conta? (S/N)");
					apagar = leia.next().charAt(0);
					if(apagar == 's' || apagar == 'S') {
						cliente.deletar(clienteLogado);
						logado = false;
					}
	
					keyPress();
					break;
				case 8:
					System.out.println("Deslogar da conta? (S/N):");
					deslogar = leia.next().charAt(0);
					if(deslogar == 's' || deslogar == 'S')
						logado = false;
					break;
					
				default:
					System.out.println("\nSaindo do sistema!\n Muito Obrigado!");
					break;
				}
	
			}
			
		}
	}
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
