package method;

public class RcmdText {
	private String idioma;
	private String[] txts = {
		"<html><center><h3>Executa "
		+"comandos shell remotamente pelo GitHub</h3></center>"                      // [0] Texto Banner
		+"<p>1 - Adicione usuario e email do GitHub para <br>autenticar e clique em Configurar."
		+"<br>2 - Reabra a aplicação, adicione o tempo de (30s/2h/1d...)<br>espera pelo comando e inicie."
		+"<br>3 - Abra o seu github por outro aparelho, em <br>qualquer outro lugar, "
		+"adicione o comando desejado no <br>arquivo comando do repositório .cmd para <br>"
		+"executar remotamente.</p></html>",     
		"Tempo de espera",                                             // [1] Tempo de espera label
		"Usuário GitHub",                                              // [2] user label
		"Email GitHub",                                                // [3] email label
		"Iniciar",                                                     // [4] botão iniciar
		"Resetar",                                                     // [5] botão resetar
		"Parar",                                                       // [6] botão parar
		"Sair",                                                        // [7] botão sair
		"<html><center>Modo<br>Bateria</center></html>",               // [8] botão save mode
		"<html><center>Rodando...</center></html>",                    // [9] lblInfo rodando
		"<html><center>Parado!</center></html>",                       // [10] lblInfo parado
		"<html><center>Você realmente quer remover todas as<br>"          // [11] JOptionPane Reset confirm 
		+"configuraçoes da aplicaçao?",  
		"Configurar",                                                  // [12] botão configurar
		"<html><center>Configurado com sucesso!<br>A aplicação "       // [13] JOptionPane informação de config com sucesso
		+"fechará.<br>Abra novamente!</center></html>",
		"Saindo...",                                                    // [14] lblInfo saindo
		"<html><center>Resetado com sucesso!<br> A aplicação fechará"   // [15] JOtionPane reset com sucesso
		+"<br>Abra novamente!</center></html>",  
		"<html><center>Falhou!<br>Requer Tempo espera</center></html>", // [16] lblinfo falha ao executar
		"Resetando...",                                                 // [17] lblinfo Resetando
		"Falhou!",                                                      // [18] lblinfo falhou
		"<html><center>Falhou!<br>Requer Email e "                      // [19] lblInfo Falha ao setar
		+"Usuário</center></html>",
		"<html><center>Abrirá o terminal para Authenticar no "          // [20] JOptionPane info Auth
		+"GitHub<br>Siga o passo a passo!</center></html>",
		"Parado!",                                                      // [21] lblInfo parado
		"<html><center>Ative para desligar todas as conexões com a rede"
                + "<br>no período de espera.</center></html>",                  // [22] TootlTip botão save_battery
                "<html><center>Adicione o nome de usuario do GitHub para uma "
                + "<br>configuração global.</center></html>",                   // [23] ToolTip FieldText user
                "<html><center>Adicione o email da sua conta do GitHub para uma"
                + "<br>configuração global.</center></html>",                   // [24] ToolTip FielText email
                "<html><center>Adicione um tempo de espera entre um comando "
                + "<br>e outro (30s, 3m, 1h, 1d, ...).</center></html>",        // [25] ToolTip FieldText Wait Time
                "<html><center>Clique aqui para iniciar a espera pelo comando."
                + "</center></html>",                                           // [26] ToolTip Botão Iniciar
                "<html><center>Clique aqui para configurar globalmente o seu "
                + "<br>GitHub.</center></html>",                                // [27] ToolTip Botão configurar
                "<html><center>Clique aqui para resetar todas as configurações"
                + "<br>da aplicação (comandos, repositório remoto e etc)."
                + "</center></html>",                                           // [28] ToolTip Botão Resetar
                "<html><center>Clique aqui para parar a execução do atual "
                + "<br>comando, dará um exit no repositório remoto, limpará os "
                + "<br>logs e limpará os comandos atuais no arquivo comando."
                + "</center></html>",                                           // [29] ToolTip Botão Parar
                "<html><center>Clique aqui para sair da aplicação. Isso matará"
                + "<br> o atual comando, se em execução.</center></html>",      // [30] Tooltip Botão Sair
		//"<html><center></center></html>",
	};

	private String[] enTxts = {
		                  // [0] texto Banner   
		"<html><center><h3>Run shell commands "
		+"remotely via GitHub</h3></center><p>1 - Add GitHub username and email to authenticate and click set."
		+"<br>2 - Reopen the application, add the wait time (30s/2h/1d...)<br>for the command and start."
		+"<br>3 - Open your github from another device, anywhere else, <br>add the desired "
		+"command in the comando file <br>of the .cmd repository to run remotely.</p></html>",     
		"Wait time",                                                   // [1] tempo de espera label
		"GitHub User",                                                 // [2] user label
		"GitHub Email",                                                // [3] email label
		"start",                                                       // [4] botão iniciar
		"Reset",                                                       // [5] botão resetar
		"Stop",                                                        // [6] botão parar
		"Exit",                                                        // [7] botão sair
		"<html><center>Battery<br>Save Mode</center></html>",          // [8] botão save mode
		"<html><center>Running...</center></html>",                    // [9] lblInfo rodando
		"<html><center>Stopped!</center></html>",                      // [10] lblInfo parado
		"<html><center>Do you really want to remove all<br>"           // [11] JOptionPane Reset confirm
		+"application settings?</center></html>",
		"Set",                                                         // [12] botão configurar
		"<html><center>Successfully configured!<br>The application "   // [13] JOptionPane informação de config com sucesso
		+"will close.<br>Open it again!</center></html>",
		"Exitting...",                                                 // [14] lblInfo saindo
		"<html><center>Successfully reset<br>The application will "    // [15] JOtionPane reset com sucesso
		+"close.<br>Open it again!</center></html>",
		"<html><center>Failed!<br>Requires Wait Time</center></html>", // [16] lblinfo falha ao executar
		"Resetting...",                                                // [17] lblinfo Resetando
		"Failed!",                                                     // [18] lblinfo falhou
		"<html><center>Failed!<br>Requires Email and "                 // [19] lblInfo Falha ao setar
		+"User</center></html>",
		"<html><center>Will open the terminal to authenticate in "     // [20] JOptionPane info Auth
		+"GitHub<br>Follow the step by step!</center></html>",
		"Stopped!",                                                    // [21] lblInfo parado
                "<html><center>Enable to turn off all connections to the network"
                + "<br>in waiting period.</center></html>",                    // [22] TootlTip save_battery button
                "<html><center>Add your GitHub username to a "
                + "<br>global configuration.</center></html>",                 // [23] ToolTip FieldText user
                "<html><center>Add your GitHub account email to a"
                + "<br>global configuration.</center></html>",                 // [24] ToolTip FielText email
                "<html><center>Add a timeout between a command "
                + "<br>and another (30s, 3m, 1h, 1d, ...).</center></html>",   // [25] ToolTip FieldText Wait Time
                "<html><center>Click here to start waiting for the command."
                + "</center></html>",                                          // [26] ToolTip Start Button
                "<html><center>Click here to globally configure your "
                + "<br>GitHub.</center></html>",                               // [27] ToolTip Configure button
                "<html><center>Click here to reset all settings"
                + "<br>of the application (commands, remote repository, etc.)."
                + "</center></html>",                                          // [28] ToolTip Reset Button
                "<html><center>Click here to stop running the current "
                + "<br>command, exit remote repository, clear "
                + "<br>logs and will clear the current commands in the command file."
                + "</center></html>",                                          // [29] ToolTip Stop Button
                "<html><center>Click here to exit the application. This will kill"
                + "<br> the current command, if running.</center></html>",     // [30] Tooltip Exit button
	};

	
	public RcmdText(String idioma) {
		this.idioma = idioma;
	}
	
	
	/**
	 * Retorna o texto de acordo com o 'indice'.
	 *  
	 * @param indice (int) - [0] texto Banner, [1] tempo de espera label, [2] user label, [3] email label,
	 * [4] botão iniciar, [5] botão resetar, [6] botão parar, [7] botão sair, [8] botão save mode, 
	 * [9] lblInfo rodando, [10] lblInfo parado, [11] JOptionPane Reset confirm, [12] botão configurar, 
	 * [13] JOptionPane informação de config, [14] lblInfo saindo, [15] JOtionPane reset com sucesso, 
	 * [16] lblinfo falha ao executar, [17] lblinfo Resetando, [18] lblinfo falhou, [19] lblInfo Falha ao setar,
	 *  [20] JOptionPane info Auth, [21] lblInfo parado, [22] TootlTip save_battery button, [23] ToolTip FieldText user,
         *  [24] ToolTip FielText email, [25] ToolTip FieldText Wait Time, [26] ToolTip Start Button, [27] ToolTip Configure button,
         *  [28] ToolTip Reset Button, [29] ToolTip Stop Button, [30] Tooltip Exit button
	 * @return String - Texto
	 */
	public String pegarTexto(int indice) {
		if (idioma.contains("português")) return txts[indice];
		else return enTxts[indice];
	}
}
