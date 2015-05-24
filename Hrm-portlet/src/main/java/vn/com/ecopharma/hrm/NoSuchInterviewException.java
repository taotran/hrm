/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.com.ecopharma.hrm;

import com.liferay.portal.NoSuchModelException;

/**
 * @author tvt
 */
public class NoSuchInterviewException extends NoSuchModelException {

	public NoSuchInterviewException() {
		super();
	}

	public NoSuchInterviewException(String msg) {
		super(msg);
	}

	public NoSuchInterviewException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchInterviewException(Throwable cause) {
		super(cause);
	}

}