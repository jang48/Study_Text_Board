package View;

import main.App;

public class Preview {


    public static void main(String[] args) {
        App apps = new App();
        apps.start();
    }
}
//        Scanner sc = new Scanner(System.in);
//
//        int num = 1;
//        while (true) {
//            System.out.print("명령어 : ");
//            String answer = sc.nextLine().trim();
//            if (answer.equals("exit")) {
//                System.out.print("프로그램을 종료합니다.");
//                break;
//            } else if (answer.equals("add")) {
//                System.out.print("게시물 제목을 입력해주세요 : ");
//                String adtitle = sc.nextLine();
//                System.out.print("게시물 내용을 입력해주세요 : ");
//                String adcontent = sc.nextLine();
//
//                Memo memo2 = new Memo(num, adtitle, adcontent);
//                memos.add(memo2);
//                num++;
//                System.out.print("게시물이 등록되었습니다.\n");
//
//            } else if (answer.equals("list")) {
//                System.out.println("==================");
//                for (int i = 0; i < memos.size(); i++) {
//                    Memo memo = memos.get(i);
//                    System.out.printf("번호 : %s\n", memo.getIndex());
//                    System.out.printf("제목 : %s\n", memo.getTitle());
//                    System.out.println("==================");
//                }
//            } else if (answer.equals("update")) {
//                System.out.print("수정할 게시물 번호 :");
//                int renum = Integer.parseInt(sc.nextLine());
////                if (renum < 0 || renum > memos.size()) {
////                    System.out.print("없는 게시물 번호입니다.\n");
////                } else {
//                Memo memo = findbyid(renum);
//                if(memo == null) {
//                    System.out.print("없는 게시물 번호입니다.\n");
//                }else{
////                    for (int i = 0; i < memos.size(); i++) { // 반복문을 통해 ArrayList에서 객체를 뽑아낸것
////                        Memo memo = memos.get(i);            // 3번 반복문이잇어(detail/update/detail)
//
////                        if (renum == memo.getIndex()) {
//                        System.out.print("제목 : ");
//                        String ntitle = sc.nextLine();
//                        System.out.print("내용 : ");
//                        String ncontent = sc.nextLine();
//
//                        Memo memo2 = new Memo(renum, ntitle, ncontent);
//                        memos.set(renum - 1, memo2);
//
//                        System.out.printf("%d번 게시물이 수정되었습니다.\n", renum);
//
////                        }
////                    }
//                }
//
//            } else if (answer.equals("delete")){
//                System.out.print("삭제할 게시물 번호 : ");
//                int denum = Integer.parseInt(sc.nextLine());
//                if(denum < 0 || denum > memos.size()){
//                    System.out.print("없는 게시물 번호입니다.\n");
//                } else{
//                    Memo memo5 = findbyid(denum);
//                    if(denum == memo5.getIndex()){
//                        memos.remove(memo5);
//                        System.out.printf("%d번 게시물이 삭제되었습니다.\n",denum);
//                    }
//                }
//
//            } else if(answer.equals("detail")){
//                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
//                int detnum = Integer.parseInt(sc.nextLine());
//                if(detnum <0 || detnum > memos.size()){
//                    System.out.println("존재하지 않는 게시물 번호입니다.");
//                }
//                else {
//                    Memo memo6 = findbyid(detnum);
//                    testview.outcontent(memo6);
////                    if (detnum == memo6.getIndex()) {
////                        System.out.println("===================");
////                        System.out.printf("번호 : %d\n", memo6.getIndex());
////                        System.out.printf("제목 : %s\n", memo6.getTitle());
////                        System.out.printf("내용 : %s\n", memo6.getContent());
////                        System.out.println("===================");
////                    }
//                }
//            }
//
//        }
//
//    }
//    public static Memo findbyid(int id){
//
//        Memo target = null;
//
//        for(int i = 0; i < memos.size(); i ++){
//            Memo memo6 = memos.get(i);
//            if(id == memo6.getIndex()) {
//                target = memo6;
//            }
//        }
//        return target;
//    }
//}





