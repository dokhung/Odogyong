package com.ohgiraffers;

import java.util.Scanner;

public class Main {
    static boolean checkNotice = false;
    static String inNotice;





    public static void main(String[] args) {
        while(true){
            System.out.println("0. 목록보기");
            // 2. 공지사항 등록 기능
            System.out.println("1. 등록하기");
            // 3. 공지사항 수정 기능
            System.out.println("2. 수정하기");
            // 4. 공지사항 삭제 기능
            System.out.println("3. 삭제하기");
            // 선택하기
            System.out.println("번호를 입력하여 주십시오");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    NoticeList();
                    break;
                case 1:
                    NoticeInsert();
                    break;
                case 2:
                    NoticeUpdate();
                    break;
                case 3:
                    NoticeDelete();
                    break;
                default:break;
            }
        }
    }

    // 메뉴 리스트 표현
    public static void NoticeList(){
        System.out.println("Notice List");
        if (checkNotice == false){
            System.out.println();
            System.out.println("------------------");
            System.out.println("현재 아무것도 없습니다.");
            System.out.println("------------------");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("------------------");
            System.out.println(inNotice);
            System.out.println("------------------");
        }
    }

    public static void NoticeInsert(){

        System.out.println("Notice Insert");
        if (checkNotice == false){
            inNotice = "내용이 없습니다.";
        }
        else {
            inNotice = "내용이 있습니다.";
        }

        System.out.println("------------------");
        System.out.println("작성 하시겠습니까?");
        if (checkNotice == false){
            System.out.println("입력할 공지사항을 입력하시오");
            System.out.println("------------------");
            Scanner stringScanner = new Scanner(System.in);
            String inputNotice = stringScanner.nextLine();
            if (inputNotice != null) {
                checkNotice = true;
            }
            System.out.println("입력한 내용은 다음과 같습니다.");
            System.out.println("--------------");
            System.out.println(inputNotice);
            System.out.println("--------------");

        }
        System.out.println();
        System.out.println();
    }

    public static void NoticeUpdate(){
        System.out.println("Notice Update");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void NoticeDelete(){
        System.out.println("Notice Delete");
        System.out.println();
        System.out.println();
        System.out.println();
    }


}