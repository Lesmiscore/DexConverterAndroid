package com.nao20010128nao.DexConverterAndroid.App;
import android.app.*;
import java.util.*;

public class ConvertQueueActivity extends ListActivity implements List<ConvertQueueActivity.ConvertData>
{
	ArrayList<ConvertData> q=new ArrayList<>();
	public static class ConvertData{
		java.lang.Process process;
		String[] args;
		String tag;
	}

	@Override
	public int indexOf(Object p1)
	{
		// TODO: Implement this method
		return q.indexOf(p1);
	}

	@Override
	public void add(int p1, ConvertQueueActivity.ConvertData p2)
	{
		// TODO: Implement this method
	}

	@Override
	public boolean add(ConvertQueueActivity.ConvertData p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public int size()
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public Object[] toArray()
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public <T extends Object> T[] toArray(T[] p1)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public Iterator<ConvertQueueActivity.ConvertData> iterator()
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public void clear()
	{
		// TODO: Implement this method
	}

	@Override
	public boolean contains(Object p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public int lastIndexOf(Object p1)
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public ConvertQueueActivity.ConvertData remove(int p1)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public ConvertQueueActivity.ConvertData set(int p1, ConvertQueueActivity.ConvertData p2)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public List<ConvertQueueActivity.ConvertData> subList(int p1, int p2)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public boolean remove(Object p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends ConvertQueueActivity.ConvertData> p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean addAll(int p1, Collection<? extends ConvertQueueActivity.ConvertData> p2)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> p1)
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public ListIterator<ConvertQueueActivity.ConvertData> listIterator(int p1)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public ListIterator<ConvertQueueActivity.ConvertData> listIterator()
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public ConvertQueueActivity.ConvertData get(int p1)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO: Implement this method
		return false;
	}



















	
}
