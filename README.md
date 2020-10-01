<h1>Tutorial Git</h1>
<h2>Introdução</h2>
  O Git é um sistema open-source de controle de versão de código.
  Com ele podemos criar todo um histórico de alterações, o que possibilita a verificação do desenvolvimento de um projeto.
  Além disso, é possivel retomar uma funcionalidade já alterada, facilitar o trabalho colaborativo de desenvolvedores e um sistema de backup.
  
<h2>Comandos:</h2> 
<h3>Git clone</h3>
    O git clone é usado sobretudo para apontar para um repositório existente e fazer um clone ou cópia deste repositório no novo diretório, em outro local.
  <ul>   
   <li>crie uma cópia de trabalho em um repositório local executando o comando:</li>
     
     <git clone /caminho/para/o/repositório>
    
  <li>quando usar um servidor remoto, seu comando será:</li>
  
      <git clone usuário@servidor:/caminho/para/o/repositório>
  </ul>
 
<h3>Git fetch</h3>
    <p1>  O comando git fetch traz do repositório remoto todas informações sobre ele que ainda não estão no seu repositório local.
    Importante resltar, que o comando fetch não incorpora mudanças. </p1>
    
      <git fetch>
     
<h3>Git pull</h3>
    <p1> O comando git pull incorpora mudanças de um repositório remoto no branch atual. No modo atual, o git pull é uma abreviação do git fetch e seguido por git merge FETCH_HEAD.</p1>
    
     <git pull [<options>] [<repository> [<refspec>…]]>
     
   <p1> [repository] -> deve ser o nome de um repositório remoto conforme passado para git-fetch. 
    
      Algumas opções de option:-q, --quieto, -v, --verbose, --commit, --no-commit, --editar, -e, --no-edit, --cleanup...

<h3>Git push</h3>
  
<p1> O comando git push atualiza as referências remotas usando refêrencias locais, enquanto envia os objetos necessários para completar as referências fornecidas</p1>
        
        git push [--todos | --mirror | --tags] [--follow-tags] [--atomic] [-n | --dry-run] [--receive-          pack = <git-receive-pack>]
	   [--repo = <repositório>] [-f | --force] [-d | --delete] [--prune] [-v | --verbose]
	   [-u | --set-upstream] [-o <string> | --push-option = <string>]
	   [- [sem-] assinado | --signed = (verdadeiro | falso | se solicitado)]
	   [--force-with-lease [= <refname> [: <expect>]]]
	   [--não verificar] [<repositório> [<refspec>…]]

<p1> Quando a linha de comando não especifica onde enviar com o <repository>argumento, a branch.*.remoteconfiguração do branch atual é consultada para determinar onde enviar. Se a configuração estiver ausente, o padrão é a origem.
  
  Quando a linha de comando não especifica o que empurrar com <refspec>... argumentos ou --all, --mirror, --tagsopções, o comando encontra o padrão <refspec>através da consulta remote.*.pushde configuração, e se ele não for encontrado, honras push.defaultde configuração para decidir o que push.

Quando nem a linha de comando nem a configuração especificam o que enviar, o comportamento padrão é usado, que corresponde ao simple valor para push.default: o branch atual é enviado para o branch upstream correspondente, mas como medida de segurança, o push é abortado se o o branch upstream não tem o mesmo nome que o local.

### Git branch
O comando git branch lista todas as branches locais.
> A branch **master** é a padrão e principal de todo repositório
```sh    
git branch
```

Caso queira a lista de branches remoto:
```sh 
git branch -a
```

Outros comandos em relação a branch são:

* Deletar:

  ```sh
  git branch -d nome-branch
  ```
  
* Renomear:
  ```sh
  git branch -m novo-nome
  ```
  ```sh
  git branch -m nome-branch-atual novo-nome-branch
  ```

### Git checkout

Para navegar entre as branches, basta usar git checkout referenciando a branch desejada.
```sh 
git checkout nome-branch
```

Para criar uma nova ramificação e automaticamente ir para ela, utiliza-se o complemento `-b`:

```sh 
git checkout -b nome-nova-branch
```

### Git diff
O comando git diff mostra todas as alterações feitas nos arquivos da branch atual

```sh 
git diff
```

Outras variações do comando git diff são:

* Mostrar somente o nome dos arquivos alterados:
  ```sh 
  git diff --name-only
  ```
  
* Mostrar o que foi alterado somente em _arquivo.extensão_:
  ```sh
  git diff arquivo.extensão
  ```
  
* Mostrar as alterações entre dois branches:
  ```sh 
  git diff nome-branch-1 nome-branch-2
  ```
<h3>Git merge</h3>
  
<p1> O comando git merge Incorpora mudanças dos commits nomeados (desde o momento em que seus históricos divergiram do branch atual) no branch atual. Este comando é usado por git pull para incorporar alterações de outro repositório e pode ser usado manualmente para mesclar alterações de um branch em outro.</p1>
        
git merge [-n] [--stat] [--no-commit] [--squash] [- [no-] editar]
	[--não-verificar] [-s <estratégia>] [-X <opção da estratégia>] [-S [<keyid>]]
	[- [no-] permitir-não-relacionados-históricos]
	[- [no-] reajuste-atualização automática] [-m <msg>] [-F <arquivo>] [<commit>…]
git merge (--continue | --abort | --quit)

<p1> Incorpora mudanças dos commits nomeados (desde o momento em que seus históricos divergiram do branch atual) no branch atual. Este comando é usado por git pull para incorporar alterações de outro repositório e pode ser usado manualmente para mesclar alterações de um branch em outro.

Suponha que o seguinte histórico exista e o branch atual seja " master":
Então " git merge topic" irá repetir as mudanças feitas no topicbranch desde que divergiu de master(ie, E) até seu commit atual ( C) no topo master, e gravará o resultado em um novo commit junto com os nomes dos dois commits pais e uma mensagem de log do usuário descrevendo as mudanças.

A segunda sintaxe (" git merge --abort") só pode ser executada após a fusão resultar em conflitos. git merge --abort abortará o processo de mesclagem e tentará reconstruir o estado de pré-mesclagem. No entanto, se houver mudanças não confirmadas quando a mesclagem começou (e especialmente se essas mudanças foram modificadas depois que a mesclagem foi iniciada), git merge --abort em alguns casos será incapaz de reconstruir as mudanças originais (pré-mesclagem).
