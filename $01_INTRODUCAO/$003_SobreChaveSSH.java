package $01_INTRODUCAO;

public class $003_SobreChaveSSH {
	/*
	 * PORQUE USAR CHAVE SSH Para subir código para o github? O GitHub exige que você
	 * se identifique e nesse caso é necessário que você digite seu email e senha quando vai subir código para o mesmo toda vez que altera um arquivo.
	 * 
	 * Chaves SSH é sua identificação automática,permite que seu código suba para o
	 * GitHub sem te que ficar digitando senha a todo momento.
	 * 
	 * COMO CONFIGURAR
	 * 	1° Primeiro é necessario ter uma conta no GitHub
	 *  2° No menu que tem sua foto de logado,clique na seta para baixo e va até Seting ou Definições
	 *  3° No menu a esquerda va até Chave SSH e GPG
	 *  4° A direita a um botão nova chave SSH
	 *  5° Para gerar a chave é necessário usar o terminal do Git Bash,abra o terminal.
	 *  6° Digite o seguinte comando: ssh-keygen -t 25519 -c seu email de enter se não de certo digite somente ssh-keygen e de enter
	 *  7° Vai gerar o caminho aonde vai ficar esse arquivo ssh-guarde esse caminho
	 *  8° Vai te pedir uma senha:Coloque uma senha que você preferir.Vai pedir para confirmar dependendo do caso.
	 *  9° Navegue até a pasta onde você gerou o ssh
	 * 10° Agora copie publica (.pub) a chave gerada e volte a pagina do GitHub e cole no local onde pede a chave ssh e de um titulo para sua chave
	 * 11° Volte ao terminal e vá até a pasta onde esta os arquivos ssh, no bash digite eval $(ssh-agent -s) de enter ele vai gerar o pid (Ele esta startando o projeto)
	 * 12° Digite ls para listar sua pasta
	 * 13° Digite o commando ssh-add id_rsa e tecle enter -Lembrando que aqui você digita a chave privada não a publica
	 * 14° Vai te pedir uma senha digite a senha que você cadastrou anteriormente
	 * 15° Ai ele va mostrar uma mensagem de identidade adicionada.
	 *     
	 *     fim... só que não - tem que testa né...
	 * 
	 *  Agora clone um repositório "porém com a chave ssh não como https".Faça alteração em 
	 *  seus arquivos e verifique se deu certo.Caso peça senha significa que algo de errado não esta certo
	 *  e preciso rever o passo a passo ok!!!!!!
	 *  
	 */
}
