package com.company.project.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.company.project.database.converter.DateConverter
import com.company.project.database.dao.UserDao
import com.company.project.database.entity.User

/**
 * Created by tim.wienrich on 27.03.18.
 */

@Database(entities = [User::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class MyDatabase : RoomDatabase() {

    // --- DAO ---
    abstract fun userDao(): UserDao
}