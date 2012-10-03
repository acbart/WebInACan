/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

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
    	String inputDirPath= args[0];
    	//String inputDirPath= "C:\\Users\\acbart\\Projects\\SE-Research\\grammarBook\\exampleClasses\\";
    	
    	File dir = new File(inputDirPath);
    	FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        };
    	String[] children= dir.list(filter);
    	if (children == null) {
    		System.out.print("file error\tNot a valid directory (or does not exist)!");
    		System.exit(2);
    	} else {
    		for (int i=0; i< children.length; i++) {
    			String inputFilePath=inputDirPath + children[i];
    	        // creates an input stream for the file to be parsed
    			FileInputStream in = new FileInputStream(inputFilePath);    			
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
    	        } finally {
    	            in.close();
    	        }
    		}
    	}        
    }

    private static class InnerClassVisitor extends VoidVisitorAdapter<Object> {
    	public void visit(ClassOrInterfaceDeclaration n, Object arg) {
    		// Looks through all the members of the class
    		for (BodyDeclaration member : n.getMembers()) {
    			// Check if it's a class (as opposed to, e.g., a field)
            	if (member instanceof ClassOrInterfaceDeclaration) {
            		ClassOrInterfaceDeclaration classMember= (ClassOrInterfaceDeclaration) member;
            		this.visit(classMember,arg);
            	} else if (member instanceof MethodDeclaration) {
            		MethodDeclaration methodMember= (MethodDeclaration) member;
            		printMethod(methodMember, n, (String)arg);
            	}
    		}
    	}
    }

    public static void printMethod(MethodDeclaration n, ClassOrInterfaceDeclaration inClass, String fileName) {
    	//Put method declaration into a tab-separated string.
    	String output= "";
    	output= n.getName();
    	List<Parameter> parameters= n.getParameters();
        if (parameters == null) {
        	output+= "\t0";            	
        } else {
        	output+= "\t"+parameters;
        }
        output+= "\t"+n.getType();
        output+= "\t"+inClass.getName();
        output+= "\t"+inClass.getBeginLine();
        output+= "\t"+fileName;
        System.out.println(output);
    }
}*/