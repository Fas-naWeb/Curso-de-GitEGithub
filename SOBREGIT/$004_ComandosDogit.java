package SOBREGIT;

public class $004_ComandosDogit {
	
	/*
	 * git init -> inicia o repositório
	 * 
	 * git config --global user.email digite seu email
	 * git config --global user.name digite seu nome
	 * 
	 * git status - Mostra como esta seu versionamento
	 * git add . - Marca os arquivos alterado para ser comitado
	 * git rm + nome do arquivo ,retorna o arquivo ao estado anterior ,quando foi adicionado.
	 * git rm -f + nome do arquivo força a remoção do arquivo.
	 * git commit -m "" - Descrição do seu commit
	 * git branch - Mostra em que branch você esta no momwento
	 * git remote -v Verifica  se tem conexão com repositório remoto
	 * git push origin nome da branch - Envia suas alterações para o gitHub
	 * git clone - Clona um repositório para sua máquina local.
	 * git pull origin master pucha o repositório atualizando o seu repositório com o do sistema do github.Ou quando tiver um conflito.
	 * git fetch olha pra o repositório do github e verifica se o mesmo esta igual ao repositório local opós executar o git 
	 * fetch,execute o git status,ele indica que seu repositório local esta atrás do repositório do github.
	 */
	
	/*
	 * OBS -1 : Se você fez mudanças em um arquivo,mais ainda não o adicionou (git add .),você pode usar o 
	 * git checkout --nome do arquivo para desfazer o que você adicionou antes.
	 */
	
	/*
	 * OBS -2 :Como conectar um repositório local a um repositório remoto.
	 * 
	 * git remote add origin mais a url-copiada do gitHub
	 * 	 Ex: git remote add origin git@github.com:Fas-naWeb/Curso-de-Git-e-GitHub.git
	 * 
	 * Para testar se a conexão deu certo use:
	 *   Ex: git remote -v
	 *   
	 * Para atualizar o repositório local com o repositório remoto,utilize
	 *   Ex: git push --set-upstream origin master
	 */
	
	/*
	 * git log te da um histórico do seu versionamento de todos os commits feitos num período de tempo
	 * 
	 * 
	 */
}
