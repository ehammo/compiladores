grammar gramatica;
@header {
  import ast.*;
}
goal returns [Program p]: mainClass classDeclarationList EOF {$p = new Program($mainClass.m, $classDeclarationList.cdl );};

mainClass returns [MainClass m]: 'class' i1=identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' i2=identifier ')' '{' s=statement '}' '}'
								{$m = new MainClass($i1.id,$i2.id,$s.s);};

classDeclarationList returns [ClassDeclList cdl]: cd=classDeclaration c=classDeclarationList {$c.cdl.addElement($cd.cd);$cdl=$c.cdl;} |
												{$cdl = new ClassDeclList();};

classDeclaration returns [ClassDecl cd]: 'class' i1=identifier '{' v=varDeclarationList md=methodDeclarationList '}' 
					{$cd = new ClassDeclSimple($i1.id,$v.varl,$md.mdl);}
										| 'class' i1=identifier 'extends' i2=identifier '{' v=varDeclarationList md=methodDeclarationList '}'
					{$cd = new ClassDeclExtends($i1.id,$i2.id,$v.varl,$md.mdl);};

varDeclaration returns [VarDecl var]: t1=type i=identifier ';' {$var = new VarDecl($t1.t,$i.id);}; 

varDeclarationList returns [VarDeclList varl]: vl=varDeclarationList v=varDeclaration {$vl.varl.addElement($v.var);$varl=$vl.varl;}|
												{$varl = new VarDeclList();} ;

methodDeclarationList returns [MethodDeclList mdl]: md=methodDeclaration m=methodDeclarationList {$m.mdl.addElement($md.md);$mdl=$m.mdl;}|
													{$mdl = new MethodDeclList();};

methodDeclaration returns [MethodDecl md]: 'public' t1=type i=identifier '(' f=formalList ')' '{' v=varDeclarationList s=statementList 'return' e=expression ';' '}'
										{$md = new MethodDecl($t1.t,$i.id,$f.fl,$v.varl,$s.stm,$e.expr);};
										
										
formalList returns [FormalList fl] : f=formal ',' ft=formalList {$ft.fl.addElement($f.f); $fl=$ft.fl;}
									| f=formal {$fl=new FormalList();$fl.addElement($f.f);}
									| {$fl=new FormalList();};

formal returns [Formal f]: t1=type i=identifier {$f = new Formal($t1.t,$i.id);};

statement returns [Statement s] : '{' stm = statementList '}'			{$s = new Block($stm.stm);}							|
			'if' '(' e=expression ')' st1=statement 'else' st2=statement	{$s = new If($e.expr,$st1.s,$st2.s);}	|
			'while' '(' e=expression ')' st1=statement		{$s = new While($e.expr,$st1.s);}							|
			'System.out.println' '(' e=expression ')' ';'		{$s = new Print($e.expr);}										|
			i=identifier '=' e=expression ';'						{$s = new Assign($i.id,$e.expr);}								|
			i=identifier '[' e1=expression ']' '=' e2=expression ';'   {$s = new ArrayAssign($i.id, $e1.expr, $e2.expr);};

statementList returns [StatementList stm] : s=statement sl=statementList {$sl.stm.addElement($s.s); $stm=$sl.stm;}|
										{$stm = new StatementList();};
					
expression returns [Exp expr]: 
				e1=expression '&&' e2=expression	{$expr = new And($e1.expr,$e2.expr);}|
				e1=expression '*'  e2=expression	{$expr = new Times($e1.expr,$e2.expr);}|
				e1=expression '+'  e2=expression	{$expr = new Plus($e1.expr,$e2.expr);}|
				e1=expression '-'  e2=expression	{$expr = new Minus($e1.expr,$e2.expr);}|
				e1=expression '<'  e2=expression	{$expr = new LessThan($e1.expr,$e2.expr);}|
				e1=expression '[' e2=expression ']'	{$expr = new ArrayLookup($e1.expr,$e2.expr);}|
				e1=expression '.' 'length' 			{$expr = new ArrayLength($e1.expr);}|
				e=expression '.' i=identifier '(' el=expressionList ')' {$expr = new Call($e.expr,$i.id,$el.el);}| 
				i1=IntegerLiteral				{$expr = new IntegerLiteral(Integer.parseInt($i1.text));}|
				'True'				{$expr = new True();}|
				'False' 			{$expr = new False();}	|
				i=identifier			{$expr = new IdentifierExp($i.id.s);}|
				'this'				{$expr = new This();}|
				'new' 'int' '[' e=expression	']'     {$expr = new NewArray($e.expr);}|
				'new' i=identifier '(' ')'		{$expr = new NewObject($i.id);}|
				'!' e=expression				{$expr = new Not($e.expr);}|
				'(' e=expression ')'			{$expr = $e.expr;};


expressionList returns [ExpList el]: e=expression ',' expl=expressionList	{$expl.el.addElement($e.expr);$el=$expl.el;}|
		 e=expression {$el = new ExpList(); $el.addElement($e.expr);}			| 
		 {$el = new ExpList();};


identifier returns [Identifier id] : ID {$id=new Identifier($ID.text);};


type returns [Type t]: 	'int' '[' ']' {$t = new IntArrayType();}|
		'boolean'   {$t = new BooleanType();}|
		'int'		{$t = new IntegerType();}|
		ID          {$t = new IdentifierType($ID.text);};			
			
IntegerLiteral : [0-9]+;
ID				: ([A-Za-z]|[_])([0-9]|[A-Za-z]|[_])*;
Espacos : [ \t\r\n] -> skip;