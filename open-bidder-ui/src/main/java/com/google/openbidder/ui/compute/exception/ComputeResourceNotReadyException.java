/*
 * Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.openbidder.ui.compute.exception;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.openbidder.ui.compute.ResourceName;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Indicates a given resource was not ready in Google Compute Engine.
 */
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ComputeResourceNotReadyException extends ComputeResourceException {

  private static final String MESSAGE = "%s %s was not ready";

  public ComputeResourceNotReadyException(ResourceName resourceName) {
    super(String.format(MESSAGE,
        checkNotNull(resourceName).getResourceType().getTitle(),
        resourceName.getResourceName()),
        resourceName);
  }
}
