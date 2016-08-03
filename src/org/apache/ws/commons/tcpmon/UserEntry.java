/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ws.commons.tcpmon;

import java.io.Serializable;

public class UserEntry implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -45108115612908925L;
	/**
	 * 
	 */
	private int listenPort;
	private String targetHost;
	private int targetPort;



	public String toString()
	{
		return "Entry:listenPort=" + getListenPort() +" targetHost:"+getTargetHost() +" targetPort:"+getTargetPort();
	}



	public int getListenPort() {
		return listenPort;
	}



	public void setListenPort(int listenPort) {
		this.listenPort = listenPort;
	}



	public String getTargetHost() {
		return targetHost;
	}



	public void setTargetHost(String targetHost) {
		this.targetHost = targetHost;
	}



	public int getTargetPort() {
		return targetPort;
	}



	public void setTargetPort(int targetPort) {
		this.targetPort = targetPort;
	}
}
