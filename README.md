# Poo20201
Repositório direcionado para os códigos da disciplina Programação Orientada a Objetos (POO), ministrada pelo professor Marcelo Vidigal

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
