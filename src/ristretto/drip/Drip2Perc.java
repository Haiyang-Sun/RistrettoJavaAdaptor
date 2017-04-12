package ristretto.drip;

import ristretto.drip.DripSyntax;
import ristretto.perc.PercSyntax;

public class Drip2Perc {
	public static scala.collection.immutable.List<PercSyntax.Stm> cjmp(DripSyntax.Exp exp, String label){
		return null;
	}

	public static scala.collection.immutable.List<PercSyntax.Stm> jmp(String label){
		return null;
	}
	
	public static scala.collection.immutable.List<PercSyntax.Stm> store(int offset, DripSyntax.Exp address, DripSyntax.Exp value){
		return null;
	}
	
	public static scala.collection.immutable.List<PercSyntax.Stm> call(DripSyntax.Exp address, scala.collection.immutable.List<DripSyntax.Exp> optExps, String t){
		return null;
	}
	
	public static scala.collection.immutable.List<PercSyntax.Stm> load(int offset, DripSyntax.Exp address, String t){
		return null;
	}
	
	public static scala.collection.immutable.List<PercSyntax.Stm> bin(DripSyntax.Operator operator, DripSyntax.Exp exp11, DripSyntax.Exp exp12, String t){
		return null;
	}
}