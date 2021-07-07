package com.example.buynow.db;

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
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __deletionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __updateAdapterOfProductEntity;

  public ProductDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cart_items` (`Product_Name`,`Product_Quantity`,`Product_Price`,`Product_ID`,`Product_Image`,`id`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getQua());
        stmt.bindLong(3, value.getPrice());
        if (value.getPId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPId());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__deletionAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cart_items` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `cart_items` SET `Product_Name` = ?,`Product_Quantity` = ?,`Product_Price` = ?,`Product_ID` = ?,`Product_Image` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        stmt.bindLong(2, value.getQua());
        stmt.bindLong(3, value.getPrice());
        if (value.getPId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPId());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        stmt.bindLong(6, value.getId());
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insert(final ProductEntity[] product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final ProductEntity product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductEntity.handle(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final ProductEntity[] product, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProductEntity.handleMultiple(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<ProductEntity>> getAll() {
    final String _sql = "SELECT * FROM cart_items order by id desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"cart_items"}, false, new Callable<List<ProductEntity>>() {
      @Override
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "Product_Name");
          final int _cursorIndexOfQua = CursorUtil.getColumnIndexOrThrow(_cursor, "Product_Quantity");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "Product_Price");
          final int _cursorIndexOfPId = CursorUtil.getColumnIndexOrThrow(_cursor, "Product_ID");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "Product_Image");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpQua;
            _tmpQua = _cursor.getInt(_cursorIndexOfQua);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpPId;
            if (_cursor.isNull(_cursorIndexOfPId)) {
              _tmpPId = null;
            } else {
              _tmpPId = _cursor.getString(_cursorIndexOfPId);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new ProductEntity(_tmpName,_tmpQua,_tmpPrice,_tmpPId,_tmpImage);
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
