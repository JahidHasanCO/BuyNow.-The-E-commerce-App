package com.example.buynow.db.Card;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CardDao_Impl implements CardDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CardEntity> __insertionAdapterOfCardEntity;

  private final EntityDeletionOrUpdateAdapter<CardEntity> __deletionAdapterOfCardEntity;

  private final EntityDeletionOrUpdateAdapter<CardEntity> __updateAdapterOfCardEntity;

  public CardDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCardEntity = new EntityInsertionAdapter<CardEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Card_List` (`CardHolder_Name`,`Card_Number`,`Card_Exp`,`Card_cvv`,`Card_Brand`,`id`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CardEntity value) {
        if (value.getNameCH() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getNameCH());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumber());
        }
        if (value.getExp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExp());
        }
        if (value.getCvv() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCvv());
        }
        if (value.getBrandC() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBrandC());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__deletionAdapterOfCardEntity = new EntityDeletionOrUpdateAdapter<CardEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Card_List` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CardEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCardEntity = new EntityDeletionOrUpdateAdapter<CardEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Card_List` SET `CardHolder_Name` = ?,`Card_Number` = ?,`Card_Exp` = ?,`Card_cvv` = ?,`Card_Brand` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CardEntity value) {
        if (value.getNameCH() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getNameCH());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNumber());
        }
        if (value.getExp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExp());
        }
        if (value.getCvv() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCvv());
        }
        if (value.getBrandC() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBrandC());
        }
        stmt.bindLong(6, value.getId());
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insert(final CardEntity[] card, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCardEntity.insert(card);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final CardEntity card, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCardEntity.handle(card);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final CardEntity[] card, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCardEntity.handleMultiple(card);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<CardEntity>> getAll() {
    final String _sql = "SELECT * FROM card_list order by id asc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"card_list"}, false, new Callable<List<CardEntity>>() {
      @Override
      public List<CardEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNameCH = CursorUtil.getColumnIndexOrThrow(_cursor, "CardHolder_Name");
          final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "Card_Number");
          final int _cursorIndexOfExp = CursorUtil.getColumnIndexOrThrow(_cursor, "Card_Exp");
          final int _cursorIndexOfCvv = CursorUtil.getColumnIndexOrThrow(_cursor, "Card_cvv");
          final int _cursorIndexOfBrandC = CursorUtil.getColumnIndexOrThrow(_cursor, "Card_Brand");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CardEntity> _result = new ArrayList<CardEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CardEntity _item;
            final String _tmpNameCH;
            if (_cursor.isNull(_cursorIndexOfNameCH)) {
              _tmpNameCH = null;
            } else {
              _tmpNameCH = _cursor.getString(_cursorIndexOfNameCH);
            }
            final String _tmpNumber;
            if (_cursor.isNull(_cursorIndexOfNumber)) {
              _tmpNumber = null;
            } else {
              _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
            }
            final String _tmpExp;
            if (_cursor.isNull(_cursorIndexOfExp)) {
              _tmpExp = null;
            } else {
              _tmpExp = _cursor.getString(_cursorIndexOfExp);
            }
            final String _tmpCvv;
            if (_cursor.isNull(_cursorIndexOfCvv)) {
              _tmpCvv = null;
            } else {
              _tmpCvv = _cursor.getString(_cursorIndexOfCvv);
            }
            final String _tmpBrandC;
            if (_cursor.isNull(_cursorIndexOfBrandC)) {
              _tmpBrandC = null;
            } else {
              _tmpBrandC = _cursor.getString(_cursorIndexOfBrandC);
            }
            _item = new CardEntity(_tmpNameCH,_tmpNumber,_tmpExp,_tmpCvv,_tmpBrandC);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
