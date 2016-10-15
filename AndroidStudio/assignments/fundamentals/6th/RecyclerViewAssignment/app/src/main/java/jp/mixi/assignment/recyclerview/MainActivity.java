
package jp.mixi.assignment.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // データの作成
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Book("タイトル" + i, "出版社" + i, i * 10));
        }

        // TODO:RecyclerView.Adapterを継承したBookAdapterを作成してください

        // TODO:RecyclerViewにBookAdapterをセットしてください

        // TODO:RecyclerViewのアイテムをタップしたとき、BookActivityに遷移するようにしてください。遷移するときにBookクラスのtitleを渡してください。
    }
}
