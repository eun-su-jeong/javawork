package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		boolean check = false;
		ArrayList<Grade> glist = new ArrayList<Grade>();
		int gListIndex;
		Grade grade = new Grade();
		while(true) {
			
			System.out.println("====================");
			System.out.println("1.학생 정보 및 입력");
			System.out.println("2.login(출력 login이 되어야만 출력가능)");
			System.out.println("3.학생 정보 출력");
			System.out.println("4.합계와 평균 출력");
			System.out.println("5.logout");
			System.out.println("6.프로그램 종료");
			System.out.println("----------------------------");
			
			System.out.print("번호를 입력하세요 : ");
			select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1:
				System.out.print("id 입력 : ");
				grade.setId(sc.nextLine());
				System.out.print("이름 입력 : ");
				grade.setName(sc.nextLine());
				System.out.print("비밀번호 입력 : ");
				grade.setPassword(sc.nextLine());
				System.out.print("나이 입력 : ");
				grade.setAge(sc.nextInt());
				sc.nextLine();
				System.out.print("국어점수 입력 : ");
				grade.setKor(sc.nextInt());
				sc.nextLine();
				System.out.print("영어 입력 : ");
				grade.setEng(sc.nextInt());
				sc.nextLine();
				System.out.print("컴퓨터 입력 : ");
				grade.setCom(sc.nextInt());
				sc.nextLine();
				System.out.print("수학 입력 : ");
				grade.setMath(sc.nextInt());
				sc.nextLine();
				glist.add(grade);
				break;
			case 2:
				int count = 0;
				for(int i=0; i<3; i++) {
					System.out.print("id를 입력하세요 : ");
					String inId = sc.next();
					System.out.print("password를 입력하세요 : ");
					String inPwd = sc.next();
					
					
					if(grade.getId().equals(inId)&&grade.getPassword().equals(inPwd)){
						check = true;
						System.out.println("로그인 성공");
						break;
					}else if(grade.getId()!=inId || grade.getPassword()!=inPwd) {
						count+=1;
						System.out.println("ID 혹은 PASSWORD가 틀렸습니다. 다시 입력하세요");
					}
					if(count>2) {
						System.out.println("3번의 로그인에 실패하였습니다. 본인확인이 필요합니다");
					}
					
					
				}
				break;
			case 3:
				if(check == false) {
					System.out.println("로그인 후에만 출력가능합니다");
				}else {
					System.out.println(grade.toString());
				}
				break;
			case 4:
				System.out.println("합계" + grade.getTotalScore());
				System.out.println("평균" +grade.getAvg());
				break;
			case 5:
				check = false;
				System.out.println("로그아웃 되었습니다");
				break;
			case 6:
				return;
			}
		}
		
		

	}

}
