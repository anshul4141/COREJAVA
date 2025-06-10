package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

	public transient int id;
	public String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
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
		return "id: " + id + " name " + name;
	}

}
