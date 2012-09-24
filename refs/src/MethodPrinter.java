import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.*;
import japa.parser.ast.visitor.*;

public class MethodPrinter {

    public static void main(String[] args) throws Exception {
    	if (args.length == 0) {
    		System.out.print("file error\tYou need to specify a file!");
    		System.exit(2);
    	}
    	String inputFilePath= args[0];
	    // creates an input stream for the file to be parsed
		FileInputStream in = new FileInputStream(inputFilePath);
		// Compilation Unit's represent the top of the AST
		CompilationUnit cu = null;
	    try {
	        // parse the file
	        cu = JavaParser.parse(in);
	        // visit all the Classes, including inner ones
	        new InnerClassVisitor().visit(cu, inputFilePath);
	    } catch (Throwable e) {
	    	// Brute force catch
	    	System.out.print("parser error\t");
	    	System.out.println(e);
	    	System.exit(1);
	    } finally {
	        in.close();
	    }        
    }

    private static class InnerClassVisitor extends VoidVisitorAdapter<Object> {
    	public void visit(ClassOrInterfaceDeclaration aClass, Object arg) {
    		// Looks through all the members of the class
    		for (BodyDeclaration member : aClass.getMembers()) {
    			// Check if it's a class (as opposed to, e.g., a field)
            	if (member instanceof ClassOrInterfaceDeclaration) {
            		ClassOrInterfaceDeclaration classMember= (ClassOrInterfaceDeclaration) member;
            		this.visit(classMember,arg);
            	} else if (member instanceof MethodDeclaration) {
            		MethodDeclaration methodMember= (MethodDeclaration) member;
            		printMethod(methodMember, aClass, (String)arg);
            	}
    		}
    	}
    }

    public static void printMethod(MethodDeclaration aMethod, ClassOrInterfaceDeclaration inClass, String fileName) {
    	//Put method declaration into a tab-separated string.
    	String output= "";
    	output= aMethod.getName();
    	List<Parameter> parameters= aMethod.getParameters();
        if (parameters == null) {
        	output+= "\t0";            	
        } else {
        	String parameterString= "";
        	Iterator<Parameter> paramIter= parameters.iterator();
        	while (paramIter.hasNext()) {
        		Parameter aParam= (Parameter)paramIter.next();
        		parameterString+= aParam.getType();
        		parameterString+= "|";
        		parameterString+= aParam.getId();
        		if (paramIter.hasNext()) {
        			parameterString+= "#";
        		}
        	}
        	output+= "\t"+parameterString;
        }
        output+= "\t"+aMethod.getType();
        output+= "\t"+modifierToString(aMethod.getModifiers());
        output+= "\t"+inClass.getName();
        output+= "\t"+aMethod.getBeginLine();
        output+= "\t"+aMethod.getEndLine();
        //output+= "\t"+fileName;
        System.out.println(output);
    }
    
    public static String modifierToString(int modifiers) {
        String modifiersString= "";
        if (ModifierSet.isAbstract(modifiers))
        	modifiersString+= "Abstract#";
        if (ModifierSet.isFinal(modifiers))
        	modifiersString+= "Final#";
        if (ModifierSet.isNative(modifiers))
        	modifiersString+= "Native#";
        if (ModifierSet.isPrivate(modifiers))
        	modifiersString+= "Private#";
        if (ModifierSet.isProtected(modifiers))
        	modifiersString+= "Protected#";
        if (ModifierSet.isPublic(modifiers))
        	modifiersString+= "Public#";
        if (ModifierSet.isStatic(modifiers))
        	modifiersString+= "Static#";
        if (ModifierSet.isStrictfp(modifiers))
        	modifiersString+= "Strictfp#";
        if (ModifierSet.isSynchronized(modifiers))
        	modifiersString+= "Synchronized#";
        if (ModifierSet.isTransient(modifiers))
        	modifiersString+= "Transient#";
        if (ModifierSet.isVolatile(modifiers))
        	modifiersString+= "Volatile#";
        //get rid of extra ", " if it's there
        if (modifiersString.length() > 0) {
        	modifiersString= modifiersString.substring(0, modifiersString.length()-1);
        } else {
        	modifiersString= "0";
        }
        return modifiersString;
    }
}