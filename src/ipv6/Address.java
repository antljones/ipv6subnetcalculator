/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package ipv6;

public class Address {
	
    private static final String IPV4_BASIC_PATTERN_STRING =
            "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}" + // initial 3 fields, 0-255 followed by .
             "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])"; // final field, 0-255
	
	private static final String IPV4_MAPPED_IPV6_PATTERN = // TODO does not allow for redundant leading zeros
	        "^::[fF]{4}:" + IPV4_BASIC_PATTERN_STRING + "$";

	private static final String IPV6_STD_PATTERN ="^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$";

	private static final String IPV6_HEX_COMPRESSED_PATTERN = "^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)" + // 0-6 hex fields
	             "::" +
	             "(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$"; // 0-6 hex fields 
	
	private Address() {}
	
	public static boolean isValid(String dottedDecimalAddress ) {
		return dottedDecimalAddress.matches(IPV4_MAPPED_IPV6_PATTERN) |
				dottedDecimalAddress.matches(IPV6_STD_PATTERN) | 
				dottedDecimalAddress.matches(IPV6_HEX_COMPRESSED_PATTERN);
	}
}