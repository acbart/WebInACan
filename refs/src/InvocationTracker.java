import java.io.FileInputStream;
import java.io.FileNotFoundException;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.visitor.*;


public class InvocationTracker {
	// Open paths file, use all classes matching args[0]
	// Seek for all invocations of args[1]
	// Return file path and line number

	public static void main(String[] args) {
		if (args.length == 0) {
    		System.out.print("file error\tYou need to specify a file!");
    		System.exit(2);
    	}
    	String inputFilePath= args[0];
		String methodName= args[1];
	    // creates an input stream for the file to be parsed
		FileInputStream in = null;
		try {
			in = new FileInputStream(inputFilePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		// Compilation Unit's represent the top of the AST
		CompilationUnit cu = null;
	    try {
	        // parse the file
	        cu = JavaParser.parse(in);
	        // visit all the Classes, including inner ones
	        new InvocationVisitor().visit(cu, methodName);
	        //System.out.println();
	        in.close();
	    } catch (Throwable e) {
	    	// Brute force catch
	    	System.out.print("parser error\t");
	    	System.out.println(e);
	    	System.exit(1);
	    }
	}
	
	private static class InvocationVisitor extends VoidVisitorAdapter<Object> {
    	public void visit(MethodCallExpr aCall, Object arg) {
    		super.visit(aCall, arg);
    		String name= (String)arg;
    		if (aCall.getName().equals(name)) {
	    		String output= "";
	    		output+= aCall.getBeginLine()+"\t";
	    		System.out.print(output);
    		}
    	}
	}

}
