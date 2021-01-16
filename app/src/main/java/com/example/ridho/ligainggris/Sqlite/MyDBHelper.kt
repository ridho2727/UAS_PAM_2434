package com.example.ridho.ligainggris.Sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.ridho.ligainggris.model.Favorite
import org.jetbrains.anko.db.*

class MyDBHelper(context: Context) : ManagedSQLiteOpenHelper(context, "db_favorit.db", null, 1) {

    companion object{
        private  var instance : MyDBHelper?= null

        fun getIntance(context: Context): MyDBHelper{
            if(instance == null){
                instance = MyDBHelper(context)
            }
            return instance as MyDBHelper
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //Buat tabel
        db?.createTable(
                Favorite.TABLE_FAVORIT,
                true,
                Favorite.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
                Favorite.NAMAHOME to TEXT,
                Favorite.NAMAAWAY to TEXT,
                Favorite.SCOREHOME to INTEGER,
                Favorite.SCOREAWAY to INTEGER,
                Favorite.DATEEVENT to TEXT

        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.dropTable(Favorite.TABLE_FAVORIT, true)
    }
}

val Context.database: MyDBHelper
get()= MyDBHelper(applicationContext)