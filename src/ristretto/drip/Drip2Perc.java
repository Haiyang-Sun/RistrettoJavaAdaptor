package ristretto.drip;

import ristretto.drip.DripSyntax;
import ristretto.drip.DripSyntax.Exp;
import ristretto.perc.PercSyntax;

public class Drip2Perc {
	public static PercSyntax.CJmp translate(DripSyntax.Exp exp, String label){
		return null;
	}

	public static PercSyntax.Jmp translate(String label){
		return null;
	}
	
	public static PercSyntax.Store translate(int offset, DripSyntax.Exp address, DripSyntax.Exp value){
		return null;
	}
	
	public static PercSyntax.Call translate(DripSyntax.Exp address, scala.collection.immutable.List<DripSyntax.Exp> optExps, String t){
		
		return null;
	}
	
	public static PercSyntax.Load translate(int offset, DripSyntax.Exp address, String t){
		return null;
	}
	
	public static PercSyntax.Bin translate(DripSyntax.Operator operator, DripSyntax.Exp exp11, DripSyntax.Exp exp12, String t){
		return null;
	}
	
	private void scalaCollectionExample(scala.collection.immutable.List<DripSyntax.Exp> optExps){
		scala.collection.Iterator<Exp> iter = optExps.iterator();
		while(iter.hasNext()){
			Exp e = iter.next();
		}
	}
}