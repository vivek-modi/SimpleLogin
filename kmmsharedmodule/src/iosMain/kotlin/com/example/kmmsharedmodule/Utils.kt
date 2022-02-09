package com.example.kmmsharedmodule

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()