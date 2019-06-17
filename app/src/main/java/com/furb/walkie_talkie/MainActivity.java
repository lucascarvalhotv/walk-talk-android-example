package com.furb.walkie_talkie;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Item;
import com.xwray.groupie.OnItemClickListener;
import com.xwray.groupie.ViewHolder;

public class MainActivity extends AppCompatActivity {

    private GroupAdapter groupAdapter;
    private Contato contato;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupAdapter = new GroupAdapter();

        RecyclerView recyclerView = findViewById(R.id.recycler);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(groupAdapter);

        fetchUsers();
    }

    private class ContatoItem extends Item<ViewHolder> {

        private final Contato contato;
        private ContatoItem(Contato contato) {
            this.contato= contato;
        }

        @Override
        public void bind(@NonNull ViewHolder viewHolder, int position) {
            TextView textViewNomeUsuario = viewHolder.itemView.findViewById(R.id.textViewNomeUsuario);
            ImageView imageViewFoto = viewHolder.itemView.findViewById(R.id.imageViewFoto);

            textViewNomeUsuario.setText(contato.getNome());
            /*Picasso.get()
                    .load(contato.getFotoUrl())
                    .into(imageViewFoto);*/
        }

        @Override
        public int getLayout() {
            return R.layout.user;
        }
    }

    public void fetchUsers() {
        groupAdapter.add(new ContatoItem(new Contato("Lucas", "")));
        groupAdapter.add(new ContatoItem(new Contato("Pedro", "")));
        groupAdapter.add(new ContatoItem(new Contato("Yuri", "")));
        groupAdapter.add(new ContatoItem(new Contato("Rafael", "")));
        groupAdapter.add(new ContatoItem(new Contato("Amanda", "")));
        groupAdapter.add(new ContatoItem(new Contato("Paulo", "")));
        groupAdapter.add(new ContatoItem(new Contato("Andressa", "")));
    }
}
