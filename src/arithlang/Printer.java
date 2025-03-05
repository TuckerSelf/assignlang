package arithlang;

import java.util.List;

import static arithlang.AST.*;

import arithlang.AST.AddExp;
import arithlang.AST.DivExp;
import arithlang.AST.MultExp;
import arithlang.AST.NegExp;
import arithlang.AST.NumExp;
import arithlang.AST.PowExp;
import arithlang.AST.Program;
import arithlang.AST.SubExp;
import arithlang.AST.VarExp;
import arithlang.AST.AsgExp;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}

	public void print(Exception e) {
		System.out.println(e.getMessage());
	}
	
	public static class Formatter implements AST.Visitor<String> {
		
		public String visit(Program p, Env env) {
			return (String) p.e().accept(this, env);
		}
		
		public String visit(NumExp e, Env env) {
			return "" + e.v();
		}
		
		public String visit(AddExp e, Env env) {
			String result = "(+";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}		
		
		public String visit(SubExp e, Env env) {
			String result = "(-";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}
		
		public String visit(MultExp e, Env env) {
			String result = "(*";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}

		public String visit(DivExp e, Env env) {
			String result = "(/";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}
		
		public String visit(PowExp e, Env env) {
			String result = "(^";
			for(AST.Exp exp : e.all()) 
				result += " " + exp.accept(this, env);
			return result + ")";
		}

		public String visit(NegExp e, Env env) {
			String result = "(-";
			result += " " + e.getExp().accept(this, env);
			return result + ")";
		}

		public String visit(AST.VarExp e, Env env) {
			return "" + e.name();
		}

		public String visit(AST.AsgExp e, Env env) {
			String result = "(let (";
			List<String> names = e.names();
			List<AST.Exp> value_exps = e.value_exps();
			int num_decls = names.size();
			for (int i = 0; i < num_decls ; i++) {
				result += " (";
				result += names.get(i) + " ";
				result += value_exps.get(i).accept(this, env) + ")";
			}
			result += ") ";
			result += e.body().accept(this, env) + " ";
			return result + ")";
		}
	}
}
