package board.View;

import board.Model.Memo;

import java.util.ArrayList;

public class memoview {
    public void outcontent(Memo memo){
        Memo memo5 =  memo;

        System.out.println("===================");
        System.out.printf("번호 : %d\n", memo5.getIndex());
        System.out.printf("제목 : %s\n", memo5.getTitle());
        System.out.printf("내용 : %s\n", memo5.getContent());
        System.out.println("===================");
    }

    public void findcontent(ArrayList<Memo> memos){
        System.out.println("==================");
        for (int i = 0; i < memos.size(); i++) {
            Memo memo = memos.get(i);
            System.out.printf("번호 : %s\n", memo.getIndex());
            System.out.printf("제목 : %s\n", memo.getTitle());
            System.out.println("==================");
        }
    }

}
