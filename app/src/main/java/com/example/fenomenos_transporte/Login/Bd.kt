package com.example.fenomenos_transporte

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class bd (context: Context): SQLiteOpenHelper(context, "registro_alumnos", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE alumnos (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, numControl VARCHAR, contraseña VARCHAR)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS alumnos")
        onCreate(db)
    }

    fun insertarUsuario(nombre: String, numControl: String, contraseña: String){
        val datos = ContentValues()
        datos.put("nombre", nombre)
        datos.put("numControl", numControl)
        datos.put("contraseña", contraseña)

        val db = this.writableDatabase
        db.insert("alumnos", null, datos)
        db.close()
    }
    fun iniciarSesion(numControl: String, contraseña: String): Boolean{
        val db = this.readableDatabase
        val query = "SELECT * FROM alumnos WHERE numControl = '$numControl' AND contraseña = '$contraseña'"
        val cursor = db.rawQuery(query, null)
        if (cursor.count <= 0){
            cursor.close()
            return false
        }
        cursor.close()
        return true
    }
    fun recuperarContra(numControl: String): String{
        val db = this.readableDatabase
        val query = "SELECT contraseña FROM alumnos WHERE numControl = '$numControl'"
        val cursor = db.rawQuery(query, null)
        var contraseña = ""
        if (cursor.moveToFirst()){
            contraseña = cursor.getString(0)
        }
        cursor.close()
        return contraseña
    }
}