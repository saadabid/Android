package assignment04.net.assignment04_v1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Saad on 5/17/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "userdatabasenew";
    private static final String TABLE_USER = "user";

    // Contacts Table Columns names
    private static final String CNIC = "cnic";
    private static final String PASSWORD = "password";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String EMAIL = "mail";
    private static final String PH_NO = "phone_number";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_USER_TABLE = "CREATE TABLE "+ TABLE_USER + "("
                +CNIC + " INTEGER PRIMARY KEY," + PASSWORD + " TEXT,"
                +NAME + " TEXT," +PH_NO + " INTEGER," +ADDRESS + " TEXT,"
                +EMAIL + " TEXT" +")";
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_USER);
        onCreate(sqLiteDatabase);
    }

    public void adduser(User user)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CNIC , user.getCnic());
        values.put(PASSWORD , user.getPassword());
        values.put(NAME , user.getName());
        values.put(ADDRESS , user.getAdd());
        values.put(PH_NO , user.getNo());
        values.put(EMAIL , user.getEmail());

        db.insert(TABLE_USER,null,values);
        db.close();
    }

    public List<User> getAllusers()
    {
        List<User> userList = new ArrayList<User>();
        String selectquery ="SELECT * FROM "+TABLE_USER;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectquery,null);

        if(c.moveToFirst())
        {
            do{
                User user = new User();
                user.setCnic(Integer.parseInt(c.getString(0)));
                user.setPassword(c.getString(1));
                user.setName(c.getString(2));
                user.setAdd(c.getString(3));
                user.setNo(Integer.parseInt(c.getString(0)));
                user.setEmail(c.getString(5));
                userList.add(user);
            }while (c.moveToNext());
        }
        return userList;
    }
}
