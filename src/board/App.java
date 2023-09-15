package board;

import board.Model.Memo;
import board.Model.MemoRepository;
import board.View.memoview;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    ArrayList<Memo> memos = new ArrayList<>();
    memoview testview = new memoview();
    MemoRepository repomemo = new MemoRepository();

    public void start() {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        while (true) {
            System.out.print("명령어 : ");
            String answer = sc.nextLine().trim();
            if (answer.equals("exit")) {
                System.out.print("프로그램을 종료합니다.");
                break;
            } else if (answer.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String adtitle = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String adcontent = sc.nextLine();

                Memo memo2 = new Memo(num, adtitle, adcontent);
//                memos.add(memo2);
                repomemo.insert(memo2);
                num++;
                System.out.print("게시물이 등록되었습니다.\n");

            } else if (answer.equals("list")) {

                ArrayList<Memo> list = repomemo.findAllArticles();
                testview.findcontent(list);

//                System.out.println("==================");
//                for (int i = 0; i < memos.size(); i++) {
//                    Memo memo = memos.get(i);
//                    System.out.printf("번호 : %s\n", memo.getIndex());
//                    System.out.printf("제목 : %s\n", memo.getTitle());
//                    System.out.println("==================");
//                }
            } else if (answer.equals("update")) {
                System.out.print("수정할 게시물 번호 :");
                int renum = Integer.parseInt(sc.nextLine());

                Memo memo = repomemo.findbyid(renum);

                if (memo == null) {
                    System.out.print("없는 게시물 번호입니다.\n");
                } else {
                    System.out.print("제목 : ");
                    String ntitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String ncontent = sc.nextLine();

                    memo.setTitle(ntitle);
                    memo.setContent(ncontent);

//                    Memo memo2 = new Memo(renum, ntitle, ncontent);
//                    memos.set(renum-1, memo2);

                    System.out.printf("%d번 게시물이 수정되었습니다.\n", renum);

                }

            } else if (answer.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int denum = Integer.parseInt(sc.nextLine());
//                if (denum < 0 || denum > memos.size()) {
//                    System.out.print("없는 게시물 번호입니다.\n");
//                } else {
                    Memo memo5 = repomemo.findbyid(denum);
                    if(memo5 == null){
                        System.out.print("없는 게시물 번호입니다.\n");
                    }
                    else {
                        repomemo.delete(memo5);
//                    if (denum == memo5.getIndex()) {
//                        memos.remove(memo5);
                        System.out.printf("%d번 게시물이 삭제되었습니다.\n", denum);
//
                    }

            } else if (answer.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int detnum = Integer.parseInt(sc.nextLine());

                    Memo memo6 = repomemo.findbyid(detnum);
                    if(memo6 == null){
                        System.out.println("존재하지 않는 게시물 번호입니다.");
                    }
                    else{
                    testview.outcontent(memo6);
                    }
            }

        }

    }


}