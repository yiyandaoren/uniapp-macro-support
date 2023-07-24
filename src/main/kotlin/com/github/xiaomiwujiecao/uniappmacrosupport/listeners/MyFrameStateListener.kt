package com.github.xiaomiwujiecao.uniappmacrosupport.listeners

import com.intellij.ide.FrameStateListener
import com.intellij.openapi.diagnostic.thisLogger

internal class MyFrameStateListener : FrameStateListener {

    @Deprecated("Deprecated in Java", ReplaceWith(
        "thisLogger().warn(\"Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.\")",
        "com.intellij.openapi.diagnostic.thisLogger"
    )
    )
    override fun onFrameActivated() {
        thisLogger().warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
