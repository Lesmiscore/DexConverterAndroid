package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import java.util.*;
import android.os.*;
import java.lang.ref.*;
import android.widget.*;
import android.view.*;

public class ConvertQueueActivity extends ListActivity implements List<ConvertQueueActivity.ConvertData> {
	InternalA la;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setListAdapter(la=new InternalA());
		activity=new WeakReference<>(this);
	}

	class InternalA extends ArrayAdapter<ConvertData>{
		public InternalA(){
			super(ConvertQueueActivity.this,0,ConvertQueueActivity.this);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO: Implement this method
			return super.getView(position, convertView, parent);
		}
	}
	
	public static WeakReference<ConvertQueueActivity> activity=new WeakReference(null);
	public static ArrayList<ConvertData> q=new ArrayList<>();
	public static List<ConvertData> list(){
		return (ConvertQueueActivity.activity.get()==null?ConvertQueueActivity.q:ConvertQueueActivity.activity.get());
	}
	public static class ConvertData {
		public java.lang.Process process;
		public String[] args;
		public String tag;
		public AsyncTask<ConvertData,Void,Boolean> worker;
	}

	@Override
	public int indexOf(Object p1) {
		// TODO: Implement this method
		return q.indexOf(p1);
	}

	@Override
	public void add(int p1, ConvertQueueActivity.ConvertData p2) {
		// TODO: Implement this method
		q.add(p1, p2);
		la.notifyDataSetChanged();
	}

	@Override
	public boolean add(ConvertQueueActivity.ConvertData p1) {
		// TODO: Implement this method
		try{
			return q.add(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public int size() {
		// TODO: Implement this method
		return q.size();
	}

	@Override
	public Object[] toArray() {
		// TODO: Implement this method
		return q.toArray();
	}

	@Override
	public <T extends Object> T[] toArray(T[] p1) {
		// TODO: Implement this method
		return q.toArray(p1);
	}

	@Override
	public boolean removeAll(Collection<?> p1) {
		// TODO: Implement this method
		try{
			return q.removeAll(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public boolean retainAll(Collection<?> p1) {
		// TODO: Implement this method
		try{
			return q.retainAll(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public Iterator<ConvertQueueActivity.ConvertData> iterator() {
		// TODO: Implement this method
		return q.iterator();
	}

	@Override
	public void clear() {
		// TODO: Implement this method
		q.clear();
	}

	@Override
	public boolean contains(Object p1) {
		// TODO: Implement this method
		return q.contains(p1);
	}

	@Override
	public int lastIndexOf(Object p1) {
		// TODO: Implement this method
		return q.lastIndexOf(p1);
	}

	@Override
	public ConvertQueueActivity.ConvertData remove(int p1) {
		// TODO: Implement this method
		try{
			return q.remove(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public ConvertQueueActivity.ConvertData set(int p1, ConvertQueueActivity.ConvertData p2) {
		// TODO: Implement this method
		try{
			return q.set(p1,p2);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public List<ConvertQueueActivity.ConvertData> subList(int p1, int p2) {
		// TODO: Implement this method
		return q.subList(p1, p2);
	}

	@Override
	public boolean remove(Object p1) {
		// TODO: Implement this method
		try{
			return q.remove(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public boolean addAll(Collection<? extends ConvertQueueActivity.ConvertData> p1) {
		// TODO: Implement this method
		try{
			return q.addAll(p1);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public boolean addAll(int p1, Collection<? extends ConvertQueueActivity.ConvertData> p2) {
		// TODO: Implement this method
		try{
			return q.addAll(p1,p2);
		}finally{
			la.notifyDataSetChanged();
		}
	}

	@Override
	public boolean containsAll(Collection<?> p1) {
		// TODO: Implement this method
		return q.containsAll(p1);
	}

	@Override
	public ListIterator<ConvertQueueActivity.ConvertData> listIterator(int p1) {
		// TODO: Implement this method
		return q.listIterator(p1);
	}

	@Override
	public ListIterator<ConvertQueueActivity.ConvertData> listIterator() {
		// TODO: Implement this method
		return q.listIterator();
	}

	@Override
	public ConvertQueueActivity.ConvertData get(int p1) {
		// TODO: Implement this method
		return q.get(p1);
	}

	@Override
	public boolean isEmpty() {
		// TODO: Implement this method
		return q.isEmpty();
	}	
}
