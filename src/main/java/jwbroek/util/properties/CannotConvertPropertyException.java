/*
 * Cuelib library for manipulating cue sheets.
 * Copyright (C) 2007-2008 Jan-Willem van den Broek
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
package jwbroek.util.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Method intended to be thrown when a {@link PropertyHandler} cannot convert to or from a
 * property.
 *
 * @author jwbroek
 */
public class CannotConvertPropertyException extends RuntimeException {

    /**
     * Generated UID to comply with the contract of {@linkplain java.io.Serializable}.
     */
    private static final long serialVersionUID = -8158507550259008115L;
    /**
     * The logger for this class.
     */
    private final static Logger logger = LoggerFactory.getLogger(CannotConvertPropertyException.class);

    /**
     * Create a new CannotConvertPropertyException.
     */
    public CannotConvertPropertyException() {
        super();
    }

    /**
     * Create a new CannotConvertPropertyException.
     *
     * @param message exception message
     */
    public CannotConvertPropertyException(final String message) {
        super(message);
    }

    /**
     * Create a new CannotConvertPropertyException.
     *
     * @param message exception message
     * @param cause   exception cause
     */
    public CannotConvertPropertyException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new CannotConvertPropertyException.
     *
     * @param cause exception cause
     */
    public CannotConvertPropertyException(final Throwable cause) {
        super(cause);
    }
}
