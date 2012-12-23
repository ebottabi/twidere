/*
 * Copyright (C) 2012 The Android Open Source Project
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

package org.mariotaku.gallery3d.common;

import android.os.Build;

public class ApiHelper {
	public static final boolean USE_888_PIXEL_FORMAT = Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN;

	public static final boolean HAS_REUSING_BITMAP_IN_BITMAP_REGION_DECODER = Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN;

	public static final boolean HAS_REUSING_BITMAP_IN_BITMAP_FACTORY = Build.VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB;

	public static final boolean HAS_MOTION_EVENT_TRANSFORM = Build.VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB;

	public static final boolean HAS_OPTIONS_IN_MUTABLE = Build.VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB;

	public static interface VERSION_CODES {
		// These value are copied from Build.VERSION_CODES
		public static final int HONEYCOMB = 11;

		public static final int ICE_CREAM_SANDWICH = 14;
		public static final int JELLY_BEAN = 16;

	}
}
