package com.ohgiraffers.view;

import com.ohgiraffers.controller.Controller;

public class View {

    public void menu(){
        Controller cr = new Controller();
        if (cr.isNotice){
            System.out.println("현재 공지사항 내용");
            System.out.println(cr.noticeText);
            System.out.println("0. 목록보기");
            // 2. 공지사항 등록 기능
            System.out.println("1. 등록하기");
            // 3. 공지사항 수정 기능
            System.out.println("2. 수정하기");
            // 4. 공지사항 삭제 기능
            System.out.println("3. 삭제하기");
            // 선택하기
            cr.GetNumber();
        }
        else {
            while(true){
                System.out.println("0. 목록보기");
                // 2. 공지사항 등록 기능
                System.out.println("1. 등록하기");
                // 3. 공지사항 수정 기능
                System.out.println("2. 수정하기");
                // 4. 공지사항 삭제 기능
                System.out.println("3. 삭제하기");
                // 선택하기
                cr.GetNumber();
            }
        }
    }
}
