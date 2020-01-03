# Veille java et r�visions 2020 #

Deux branches: master et dev
D�veloppeur: Marc Harnist

Petits exercices de rappel simple.
Objectif: finir sur un framework comme Maven.

### Ennonc�
�crire � l'�cran le premier argument de la ligne de commande

Dans l'en-t�te d'une m�thode main apparait ce qui s'appelle un param�tre ou un argument qui est ci-dessous nomm� arg :
    public static void main(String[] arg)
On peut nommer cet argument selon son propre choix. L'en-t�te pourrait aussi �tre :
    public static void main(String[] listeArguments)
ou tout autre identificateur � la place de listeArguments, ou de arg plus haut. Le reste de l'en-t�te de la m�thode main est obligatoire. Cet argument est de type tableau de String ou encore tableau de cha�nes de caract�res, mais pour l'instant il suffit de savoir que si son nom est arg, le premier d'entre eux est accessible dans le programme par arg[0], le deuxi�me par arg[1] et ainsi de suite.
Gr�ce � ce param�tre, on peut "passer des arguments � la m�thode main", ce qu'on fait quelquefois, cela d�pend du choix du programmeur.


On souhaite dans cet exercice passer un argument � la m�thode main, qui sera un mot. Supposons que la m�thode main soit �crite dans une classe qui s'appelle EcrireArgument qu'on veuille passer le mot "bonjour".
Si on ex�cute le programme directement sur une ligne de commande, dans une fen�tre d'ex�cution, on tapera la commande :
    java EcrireArgument bonjour
Si on travaille avec Eclipse, il faut donner les arguments avant d'ex�cuter le programme (en utilisant, si votre version d'Eclipse est en anglais, "Run Configurations", puis en choisissant l'onglet Arguments pour pr�ciser les arguments dans "Program arg", avec notre exemple, bonjour).
Cette premi�re partie de l'exercice consiste � faire en sorte que, � l'ex�cution, l'argument pass� par la ligne de commande soit �crit en sortie du programme (par System.out.println(...). Si l'argument est "bonjour", le programme doit �crire :
bonjour