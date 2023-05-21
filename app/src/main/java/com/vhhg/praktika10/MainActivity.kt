package com.vhhg.praktika10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // menuInflater.inflate(R.menu.menu, menu)
        menu?.add(0, 0, 0, "Открыть")
        menu?.add(0, 1, 1, "Сохранить")
        val sm = menu?.addSubMenu(1, 2, 2, "Подменю")
        sm?.add(1, 4, 4, "Подпункт 1")
        sm?.add(1, 5, 5, "Подпункт 2")
        sm?.setGroupCheckable(1, true, true)
        menu?.add(0, 3, 3, "Выйти")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == 4 || item.itemId == 5){
            item.isChecked = !item.isChecked
            return true
        }
        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        return true
    }
}