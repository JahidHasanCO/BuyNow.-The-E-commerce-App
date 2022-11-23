package com.example.buynow.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.buynow.db.Card.CardDao;
import com.example.buynow.db.Card.CardDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ProductDao _productDao;

  private volatile CardDao _cardDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cart_items` (`Product_Name` TEXT NOT NULL, `Product_Quantity` INTEGER NOT NULL, `Product_Price` INTEGER NOT NULL, `Product_ID` TEXT NOT NULL, `Product_Image` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Card_List` (`CardHolder_Name` TEXT NOT NULL, `Card_Number` TEXT NOT NULL, `Card_Exp` TEXT NOT NULL, `Card_cvv` TEXT NOT NULL, `Card_Brand` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '375a29a32163f7363699f6fe877ecd82')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `cart_items`");
        _db.execSQL("DROP TABLE IF EXISTS `Card_List`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCartItems = new HashMap<String, TableInfo.Column>(6);
        _columnsCartItems.put("Product_Name", new TableInfo.Column("Product_Name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("Product_Quantity", new TableInfo.Column("Product_Quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("Product_Price", new TableInfo.Column("Product_Price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("Product_ID", new TableInfo.Column("Product_ID", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("Product_Image", new TableInfo.Column("Product_Image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItems = new TableInfo("cart_items", _columnsCartItems, _foreignKeysCartItems, _indicesCartItems);
        final TableInfo _existingCartItems = TableInfo.read(_db, "cart_items");
        if (! _infoCartItems.equals(_existingCartItems)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_items(com.example.buynow.db.ProductEntity).\n"
                  + " Expected:\n" + _infoCartItems + "\n"
                  + " Found:\n" + _existingCartItems);
        }
        final HashMap<String, TableInfo.Column> _columnsCardList = new HashMap<String, TableInfo.Column>(6);
        _columnsCardList.put("CardHolder_Name", new TableInfo.Column("CardHolder_Name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCardList.put("Card_Number", new TableInfo.Column("Card_Number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCardList.put("Card_Exp", new TableInfo.Column("Card_Exp", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCardList.put("Card_cvv", new TableInfo.Column("Card_cvv", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCardList.put("Card_Brand", new TableInfo.Column("Card_Brand", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCardList.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCardList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCardList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCardList = new TableInfo("Card_List", _columnsCardList, _foreignKeysCardList, _indicesCardList);
        final TableInfo _existingCardList = TableInfo.read(_db, "Card_List");
        if (! _infoCardList.equals(_existingCardList)) {
          return new RoomOpenHelper.ValidationResult(false, "Card_List(com.example.buynow.db.Card.CardEntity).\n"
                  + " Expected:\n" + _infoCardList + "\n"
                  + " Found:\n" + _existingCardList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "375a29a32163f7363699f6fe877ecd82", "1b2b7ffd197bf79d809e5201b7b8fb28");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "cart_items","Card_List");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cart_items`");
      _db.execSQL("DELETE FROM `Card_List`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ProductDao.class, ProductDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CardDao.class, CardDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }

  @Override
  public CardDao cardDao() {
    if (_cardDao != null) {
      return _cardDao;
    } else {
      synchronized(this) {
        if(_cardDao == null) {
          _cardDao = new CardDao_Impl(this);
        }
        return _cardDao;
      }
    }
  }
}
