package arithlang;

import java.util.ArrayList;
import java.util.List;

import arithlang.AST.ASTNode;
import arithlang.AST.CompoundArithExp;
import arithlang.AST.Exp;

/**
 * This class hierarchy represents expressions in the abstract syntax tree
 * manipulated by this interpreter.
 * 
 * @author hridesh
 * 
 */
public interface AST {
	public static abstract class ASTNode {
		public abstract <T> T accept(Visitor<T> visitor, Env env);
	}
	public static class Program extends ASTNode {
		Exp _e;

		public Program(Exp e) {
			_e = e;
		}

		public Exp e() {
			return _e;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}
	public static abstract class Exp extends ASTNode {

	}

	public static class VarExp extends Exp {
		String _name;

		public VarExp(String name) {
			_name = name;
		}

		public String name() {
			return _name;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class NumExp extends Exp {
		double _val;

		public NumExp(double v) {
			_val = v;
		}

		public double v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static abstract class CompoundArithExp extends Exp {
		List<Exp> _rep;
		public CompoundArithExp(List<Exp> args) {
			_rep = new ArrayList<Exp>();
			_rep.addAll(args);
		}
		public List<Exp> all() {
			return _rep;
		}
	}

	public static class AddExp extends CompoundArithExp {
		public AddExp(List<Exp> args) {
			super(args);
		}
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class SubExp extends CompoundArithExp {
		public SubExp(List<Exp> args) {
			super(args);
		}
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class DivExp extends CompoundArithExp {
		public DivExp(List<Exp> args) {
			super(args);
		}
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class MultExp extends CompoundArithExp {
		public MultExp(List<Exp> args) {
			super(args);
		}
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class PowExp extends CompoundArithExp {
		public PowExp(List<Exp> args) {
			super(args);
		}
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class NegExp extends Exp {
		private Exp e;

		public NegExp(Exp e) {
			this.e = e;
		}

		public Exp getExp() {
			return e;
		}

		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
	}

	public static class AsgExp extends Exp {
		List<String> _names;
		List<Exp> _value_exps; 
		Exp _body;
		
		public AsgExp(List<String> names, List<Exp> value_exps, Exp body) {
			_names = names;
			_value_exps = value_exps;
			_body = body;
		}
		
		public <T> T accept(Visitor<T> visitor, Env env) {
			return visitor.visit(this, env);
		}
		
		public List<String> names() { return _names; }
		
		public List<Exp> value_exps() { return _value_exps; }

		public Exp body() { return _body; }

	}
		
	public interface Visitor <T> {
		// This interface should contain a signature for each concrete AST node.
		public T visit(AST.NumExp e, Env env);
		public T visit(AST.AddExp e, Env env);
		public T visit(AST.SubExp e, Env env);
		public T visit(AST.MultExp e, Env env);
		public T visit(AST.DivExp e, Env env);
		public T visit(AST.PowExp e, Env env);
		public T visit(AST.NegExp e, Env env);
		public T visit(AST.Program p, Env env);
		public T visit(AST.VarExp e, Env env);
		public T visit(AST.AsgExp e, Env env);
	}	
}
