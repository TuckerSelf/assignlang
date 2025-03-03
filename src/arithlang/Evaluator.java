package arithlang;
import static arithlang.AST.*;
import static arithlang.Value.*;

import java.util.List;

import arithlang.AST.AddExp;
import arithlang.AST.DivExp;
import arithlang.AST.Exp;
import arithlang.AST.MultExp;
import arithlang.AST.NegExp;
import arithlang.AST.NumExp;
import arithlang.AST.PowExp;
import arithlang.AST.Program;
import arithlang.AST.SubExp;
import arithlang.AST.Visitor;
import arithlang.Value.NumVal;

public class Evaluator implements Visitor<Value> {
	
	Printer.Formatter ts = new Printer.Formatter();
	
	Value valueOf(Program p) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this);
	}
	
	@Override
	public Value visit(AddExp e) {
		List<Exp> operands = e.all();
		double result = 0;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this); // Dynamic type-checking
			result += intermediate.v(); //Semantics of AddExp in terms of the target language.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(DivExp e) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this);
		double result = lVal.v(); 
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this);
			result = result / rVal.v();
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(MultExp e) {
		List<Exp> operands = e.all();
		double result = 1;
		for(Exp exp: operands) {
			NumVal intermediate = (NumVal) exp.accept(this); // Dynamic type-checking
			result *= intermediate.v(); //Semantics of MultExp.
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(PowExp e) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this);
			result = Math.pow(result, rVal.v());
		}
		return new NumVal(result);
	}

	@Override
	public Value visit(NegExp e) {
		NumVal rVal = (NumVal) e.getExp().accept(this);
		return new NumVal(-rVal.v());
	}

	@Override
	public Value visit(Program p) {
		return (Value) p.e().accept(this);
	}

	@Override
	public Value visit(SubExp e) {
		List<Exp> operands = e.all();
		NumVal lVal = (NumVal) operands.get(0).accept(this);
		double result = lVal.v();
		for(int i=1; i<operands.size(); i++) {
			NumVal rVal = (NumVal) operands.get(i).accept(this);
			result = result - rVal.v();
		}
		return new NumVal(result);
	}

}
