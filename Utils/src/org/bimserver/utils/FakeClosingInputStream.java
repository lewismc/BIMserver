package org.bimserver.utils;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.IOException;
import java.io.InputStream;

public class FakeClosingInputStream extends InputStream {

	private final InputStream delegateStream;

	public FakeClosingInputStream(InputStream delegateStream) {
		this.delegateStream = delegateStream;
	}

	@Override
	public int read() throws IOException {
		return delegateStream.read();
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		return delegateStream.read(b, off, len);
	}
	
	@Override
	public void close() throws IOException {
		// Do nothing
	}
}