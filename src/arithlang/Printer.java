package arithlang;

import static arithlang.AST.*;

import arithlang.AST.AddExp;
import arithlang.AST.DivExp;
import arithlang.AST.MultExp;
import arithlang.AST.NegExp;
import arithlang.AST.NumExp;
import arithlang.AST.PowExp;
import arithlang.AST.Program;
import arithlang.AST.SubExp;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		
		public String visit(Program p) {
			return (String) p.e().accept(this);
		}
		
		public String visit(NumExp e) {
			return "" + e.v();
		}
		
		public String visit(AddExp e) {
			String result = "(+";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this);
			return result + ")";
		}		
		
		public String visit(SubExp e) {
			String result = "(-";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this);
			return result + ")";
		}
		
		public String visit(MultExp e) {
			String result = "(*";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this);
			return result + ")";
		}

		public String visit(DivExp e) {
			String result = "(/";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this);
			return result + ")";
		}
		
		public String visit(PowExp e) {
			String result = "(^";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this);
			return result + ")";
		}

		public String visit(NegExp e) {
			String result = "(-";
			result += " " + e.getExp().accept(this);
			return result + ")";
		}
	}
}
