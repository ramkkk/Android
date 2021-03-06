/*
 * Copyright (C) 2015 The Android Open Source Project
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

package androidx.test.espresso.intent;

import android.content.Intent;

/**
 * An {@link Intent} that has been processed to determine the set of packages to which it resolves.
 */
public interface ResolvedIntent {
  /**
   * Returns {@code true} if this recorded intent can be handled by an activity in the given
   * package.
   */
  boolean canBeHandledBy(String appPackage);

  /** Returns the underlying {@link Intent}. */
  Intent getIntent();
}
