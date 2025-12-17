package com.rays.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public transient int id;
	public String name;

	public Employee() {
		
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		id = in.readInt();

	}

	public String toString() {
		return "id: " + id + " name: " + name;
	}

}