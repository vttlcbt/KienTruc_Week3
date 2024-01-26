package test;

import java.io.File;
import java.util.Iterator;
import java.util.Optional;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class CommonOperations {

	public static void checkClsnameBeginUppercase(File projectDir) {
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println("================================================");
			System.out.println(path);

			try {
				new VoidVisitorAdapter<Object>() {
					@Override
					public void visit(ClassOrInterfaceDeclaration n, Object arg) {
						super.visit(n, arg);

						// Cau2 - [Check] tên class bắt đầu bằng chữ hoa
						String clsNameString = n.getNameAsString();
						char c = clsNameString.charAt(0);
						if (c > 'a' && c < 'z') {
							System.out.println("-------------------Invalid class name: " + clsNameString
									+ " - Posistion [" + n.getBegin() + ",]" + n.getEnd());
						}
					}
				}.visit(StaticJavaParser.parse(file), null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).explore(projectDir);
	}
	public static void checkHasCmtAuthorCreatedate(File projectDir) {
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println("================================================");
			System.out.println(path);

			try {
				new VoidVisitorAdapter<Object>() {

					@Override
					public void visit(ClassOrInterfaceDeclaration n, Object arg) {
						super.visit(n, arg);
						String clsNameString = n.getNameAsString();
						Optional<Comment> oCmt = n.getComment();

						// Cau 3 - [Check] có comment đầy đủ @Author và @Create-Date
						if (oCmt.isEmpty()) {
							System.out.println("--------Class " + clsNameString + " has no comment");
						} else {
							Comment cmt = oCmt.get();
							String content = cmt.getContent();
							System.out.println("Comment is: \n"+content);
							// nếu có author thì in ra author
							if (!content.contains("@Author")) {
								System.out.println("--------Class " + clsNameString + " has comment without @Author");
							}
							if (!content.contains("@CreateDate")) {
								System.out
										.println("--------Class " + clsNameString + " has comment without @CreateDate");
							}
						}
					}

				}.visit(StaticJavaParser.parse(file), null);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}).explore(projectDir);
	}

	public static void checkFieldnameBeginLowercase(File projectDir) {
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println("================================================");
			System.out.println(path);

			try {
				new VoidVisitorAdapter<Object>() {

					// Cau 4 - [Check] tên biến bắt đầu bằng chữ thường
					@Override
					public void visit(FieldDeclaration n, Object arg) {
						super.visit(n, arg);
						for (VariableDeclarator variable: n.getVariables()) {
							System.out.println(variable);
							String fieldName = variable.getNameAsString();
							char c = fieldName.charAt(0);
							if (c > 'A' && c < 'Z') {
								System.out.println("-------------------Invalid field name: " + fieldName
										+ " - Posistion [" + n.getBegin() + ",]" + n.getEnd());
							}
						}
					}


				}.visit(StaticJavaParser.parse(file), null);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}).explore(projectDir);
	}

}
