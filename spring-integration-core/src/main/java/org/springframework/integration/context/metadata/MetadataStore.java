/*
 * Copyright 2002-2010 the original author or authors.
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

package org.springframework.integration.context.metadata;

/**
 * Strategy interface for storing metadata from certain adapters
 * to avoid duplicate delivery of messages, for example.
 * 
 * @author Josh Long
 * @author Oleg Zhurakousky
 * @author Mark Fisher
 * @since 2.0
 */
public interface MetadataStore {

	/**
	 * Writes a key value pair to this MetadataStore.
	 */
	void put(String key, String value);

	/**
	 * Reads a value for the given key from this MetadataStore.
	 */
	String get(String key);

}
