package com.example.myfriendapp

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface MyFriendDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman(friend: MyFriend)

    @Update
    fun editTeman(friend: MyFriend)

    @Delete
    fun deleteTeman(friend: MyFriend)

    @Query("SELECT * FROM MyFriend")
    fun ambilSemuaTeman(): LiveData<List<MyFriend>>

}