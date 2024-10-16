/**
 * Copyright © 2024 spring-data-dynamodb (https://github.com/svzdvd/spring-data-dynamodb)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socialsignin.spring.data.dynamodb.domain.sample;

import org.socialsignin.spring.data.dynamodb.marshaller.DateDynamoDBMarshaller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DynamoDBYearMarshaller extends DateDynamoDBMarshaller {

	private static final String PATTERN = "yyyy";

	@Override
	public DateFormat getDateFormat() {
		return new SimpleDateFormat(PATTERN);
	}
}
