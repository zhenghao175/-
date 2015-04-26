package com.example.classmanagersystem;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.classmanagersystem.R;
import com.example.classmanagersystem.StudentInformationManagerActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class StudentInformationManagerActivity extends Activity {

	private int op_imageid[] = { R.drawable.addstudent_image,
			R.drawable.deletestudent_image, R.drawable.refreshstudent_image,
			R.drawable.user_image, R.drawable.sms_all };
	private String str[] = { "新增", "删除", "刷新", "管理用户", "短信群发" };
	private ListView listView;
	private View visView;
	private boolean flag = true;

	
	private ListView stu_listview;
	private CheckBox checkboxsum;
	private boolean chboxall = false;
	private ArrayList<CheckBox> cbs = new ArrayList<CheckBox>();
	private String updateName;
	private AutoCompleteTextView serach_edit;
	private List<String> lists = new ArrayList<String>();
	private ActionBar actionBar;
	private JSONArray jsonArray;
	private ImageView stu_headimage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.studentinfomationmaneger);
		}
	public boolean onCreateOptionsMenu(Menu menu) {
			// TODO Auto-generated method stub
			MenuInflater inflater = new MenuInflater(
					StudentInformationManagerActivity.this);
			inflater.inflate(R.menu.contextmenu, menu);
			return super.onCreateOptionsMenu(menu);
			
	}
}

