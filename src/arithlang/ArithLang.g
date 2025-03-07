grammar ArithLang;

program returns [Program ast]
         e=exp ( $ast = new Program($e.ast); }
        ;

exp returns [Exp ast]: 
	n=numexp { $ast = $n.ast; }
        | a=addexp { $ast = $a.ast; }
        | s=subexp { $ast = $s.ast; }
        | m=multexp { $ast = $m.ast; }
        | d=divexp { $ast = $d.ast; }
	| p=powexp { $ast = $p.ast; }
	| neg=negexp { $ast = $neg.ast; }
	| v=varexp { $ast = $v.ast; }
	| a=asgexp { $ast = $a.ast; }
        ;

asgexp  returns [AsgExp ast] :
	l=Identifier '=' r=numexp {
							$ast = new AsgExp($l.text, $r.ast);
						}
	| e=exp {$ast = $e.ast;}
 		;

numexp returns [NumExp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| '-' n0=Number { $ast = new NumExp(-Integer.parseInt($n0.text)); }
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		| '-' n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble("-" + $n0.text+"."+$n1.text)); }
  		;		


addexp returns [AddExp ast]
        locals [ArrayList<Exp> list]:
	l=addexp '+' r=exp { 
                            $list = new ArrayList<Exp>();
							$list.add($l.ast);
							$list.add($r.ast);
							$ast = new AddExp($list);		 
	                     }
	| n=numexp {$ast = $n.ast;}
 		;

subexp returns [SubExp ast]  
        locals [ArrayList<Exp> list]:
	l=subexp '-' r=exp { 
                            $list = new ArrayList<Exp>();
							$list.add($l.ast);
							$list.add($r.ast);
							$ast = new SubExp($list);		 
	                     }
	| n=numexp {$ast = $n.ast;}
 		;

multexp returns [MultExp ast] 
         locals [ArrayList<Exp> list]:
	l=multexp '*' r=exp { 
                            $list = new ArrayList<Exp>();
							$list.add($l.ast);
							$list.add($r.ast);
							$ast = new MultExp($list);		 
	                     }
	| n=numexp {$ast = $n.ast;}
 		;
 
divexp returns [DivExp ast] 
        locals [ArrayList<Exp> list]:
	l=divexp '/' r=exp { 
                            $list = new ArrayList<Exp>();
							$list.add($l.ast);
							$list.add($r.ast);
							$ast = new DivExp($list);		 
	                     }
	| n=numexp {$ast = $n.ast;}
 		;

powexp returns [PowExp ast]
		locals [ArrayList<Exp> list]:
	l=powexp '^' r=exp { 
                            $list = new ArrayList<Exp>();
							$list.add($l.ast);
							$list.add($r.ast);
							$ast = new PowExp($list);		 
	                     }
	| n=numexp {$ast = $n.ast;}
		;

negexp returns [NegExp ast]:
		'(' '-' e=exp ')' { $ast=new NegExp($e.ast); }
		;

varexp returns [VarExp ast]: 
 		id=Identifier { $ast = new VarExp($id.text); }
 		;
Dot : '.' ;

Number : DIGIT+ ;

Identifier :   Letter LetterOrDigit*;

Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

fragment DIGIT: ('0'..'9');

AT : '@';
ELLIPSIS : '...';
WS  :  [ \t\r\n\u000C]+ -> skip;
Comment :   '/*' .*? '*/' -> skip;
Line_Comment :   '//' ~[\r\n]* -> skip;
