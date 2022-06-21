package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import screen.RemoteShellScreen;

public class RcmdCommand extends RemoteShellScreen {
	private final Runtime RUN = Runtime.getRuntime();
	private Process pro;
	private BufferedReader read, read2;
	private String saida, line;

	/**
	 * Executa e retorna a saida do comando.
	 * 
	 * @param executavel (String) - String de um executavel
	 * @return (String) saida do comando
	 * @throws IOException
	 */

	public String comando(String command) {
		saida = "";
		line = null;

		try {
			pro = RUN.exec(command);
			read = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			read2 = new BufferedReader(new InputStreamReader(pro.getErrorStream()));

			while ((line = read.readLine()) != null) {
				saida += line + "\n";
			}
			if (line == null || saida == "") {
				while ((line = read2.readLine()) != null) {
					saida += line + "\n";
				}
			}

			read.close();
			read2.close();

			return saida;
		} catch (IOException e) {
			return TEXT.pegarTexto(10);
		}
	}

	/**
	 * Pausa
	 * 
	 * @param segundos (long) - tempo que ficará pausado em segundos
	 */
	public void sleep(long segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void destruir() {
		if (pro.isAlive()) pro.destroy();
		RUN.exit(0);
	}
}
