package com.example.create_roomwords;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface WordDao {



        @Insert
        void insert(Word word);

        @Query("DELETE FROM word_table")
        void deleteAll();

        @Query("SELECT * from word_table ORDER BY word ASC")
        List<Word> getAllWords();

        @Query("SELECT * from word_table LIMIT 1")
        Word[] getAnyWord();


}
