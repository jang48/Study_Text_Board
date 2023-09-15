package board.Model;
import board.Model.Memo;

import java.util.ArrayList;

public class MemoRepository {
    ArrayList<Memo> memos = new ArrayList<>();

    public void delete(Memo memo){
        memos.remove(memo);
    }
    public void insert(Memo memo){
        memos.add(memo);
    }

    public Memo findbyid(int id) {

        Memo target = null;

        for (int i = 0; i < memos.size(); i++) {
            Memo memo6 = memos.get(i);
            if (id == memo6.getIndex()) {
                target = memo6;
            }
        }
        return target;
    }

    public ArrayList<Memo> findAllArticles() {
        return memos;
    }

}
