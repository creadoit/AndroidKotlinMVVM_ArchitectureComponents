package com.company.project.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.company.project.database.entity.User
import java.util.*

/**
 * Created by tim.wienrich on 27.03.18.
 */
@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun save(user: User)

    @Query("SELECT * FROM user WHERE login = :userLogin")
    fun load(userLogin: String): LiveData<User>

    @Query("SELECT * FROM user WHERE login = :userLogin AND lastRefresh > :lastRefreshMax LIMIT 1")
    fun hasUser(userLogin: String, lastRefreshMax: Date): User
}