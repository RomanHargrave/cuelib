/*
 * Cuelib library for manipulating cue sheets.
 * Copyright (C) 2007-2009 Jan-Willem van den Broek
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package jwbroek.id3.v2;

import jwbroek.id3.CanonicalFrameType;
import jwbroek.id3.URLFrame;
import jwbroek.id3.util.FieldReader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class URLFrameReader implements FrameReader {

    private final CanonicalFrameType canonicalFrameType;
    private final int headerSize;

    public URLFrameReader(final CanonicalFrameType canonicalFrameType, final int headerSize) {
        this.canonicalFrameType = canonicalFrameType;
        this.headerSize = headerSize;
    }

    public URLFrame readFrameBody(final int size, final InputStream input) throws IOException, UnsupportedEncodingException {
        return this.readFrameBody(null, size, input);
    }

    public URLFrame readFrameBody(final String additionalTypeInfo, final int size, final InputStream input) throws IOException, UnsupportedEncodingException {
        final URLFrame result = new URLFrame(this.canonicalFrameType);
        result.setTotalFrameSize(size + this.headerSize);
        // Read encoding. Should not be there officially.
        input.read();
        result.setUrl(FieldReader.readField(input, size, Charset.forName("ISO-8859-1")));

        if (additionalTypeInfo != null) {
            result.setAdditionalTypeInfo(additionalTypeInfo);
        }
        return result;
    }
}