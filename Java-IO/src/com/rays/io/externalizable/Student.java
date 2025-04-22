package com.rays.io.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

	public String name;
	public transient int id;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
	}

	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}

}
