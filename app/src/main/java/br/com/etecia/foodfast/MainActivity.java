package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Inserindo o menu na barra de aplicativo
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Criando metodos para clicar nos itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(), "Clique no favorito", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesq:
                Toast.makeText(getApplicationContext(), "Clique na pesquisa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(), "Clique na configuração", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHist:
                Toast.makeText(getApplicationContext(), "Clique no historico", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Clique no sobre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mComp:
                Toast.makeText(getApplicationContext(), "Clique no compartilhar", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}