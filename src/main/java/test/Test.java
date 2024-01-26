package test;

import java.io.File;

public class Test {
	public static void main(String[] args) {
//		File projectDir = new File("D:\\KTPM16A\\KIEN_TRUC_PHAN_MEM\\NopBai\\Week3\\src\\main\\java\\entities");
		File projectDir = new File("D:\\KTPM16A\\KIEN_TRUC_PHAN_MEM\\NopBai\\Week3");
//		new CommonOperations().checkClsnameBeginUppercase(projectDir);
//		new CommonOperations().checkHasCmtAuthorCreatedate(projectDir);
//		new CommonOperations().checkFieldnameBeginLowercase(projectDir);
		new CommonOperations().checkPackage(projectDir);

	}
}
