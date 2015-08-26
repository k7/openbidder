/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.openbidder.api.platform;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Allows tagging a class with a list of compatible exchanges. When objects of that class
 * (for example interceptors) are processed by the framework in the context of some
 * exchange-specific request, objects tagged with incompatible exchanges will be skipped.
 */
@BindingAnnotation
@Target({ TYPE })
@Retention(RUNTIME)
public @interface CompatibleExchanges {

  /**
   * The list of compatible exchanges.
   */
  String[] value();
}
