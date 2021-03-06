/*
 * Generated file
 * DO NOT EDIT
 * 
 * See libraries/tools/idl2k for details
 */

package org.w3c.notifications

import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

public external open class Notification(title: String, options: NotificationOptions = definedExternally) : EventTarget {
    var onclick: ((Event) -> dynamic)?
    var onerror: ((Event) -> dynamic)?
    open val title: String
    open val dir: NotificationDirection
    open val lang: String
    open val body: String
    open val tag: String
    open val image: String
    open val icon: String
    open val badge: String
    open val sound: String
    open val vibrate: Array<out Int>
    open val timestamp: Number
    open val renotify: Boolean
    open val silent: Boolean
    open val noscreen: Boolean
    open val requireInteraction: Boolean
    open val sticky: Boolean
    open val data: Any?
    open val actions: Array<out NotificationAction>
    fun close(): Unit

    companion object {
        var permission: NotificationPermission
        var maxActions: Int
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit = definedExternally): Promise<NotificationPermission>
    }
}

public external interface NotificationOptions {
    var dir: NotificationDirection? /* = NotificationDirection.AUTO */
        get() = definedExternally
        set(value) = definedExternally
    var lang: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var body: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var image: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var badge: String?
        get() = definedExternally
        set(value) = definedExternally
    var sound: String?
        get() = definedExternally
        set(value) = definedExternally
    var vibrate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var timestamp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renotify: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var noscreen: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var requireInteraction: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var sticky: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var actions: Array<NotificationAction>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

public inline fun NotificationOptions(dir: NotificationDirection? = NotificationDirection.AUTO, lang: String? = "", body: String? = "", tag: String? = "", image: String? = null, icon: String? = null, badge: String? = null, sound: String? = null, vibrate: dynamic = null, timestamp: Number? = null, renotify: Boolean? = false, silent: Boolean? = false, noscreen: Boolean? = false, requireInteraction: Boolean? = false, sticky: Boolean? = false, data: Any? = null, actions: Array<NotificationAction>? = arrayOf()): NotificationOptions {
    val o = js("({})")

    o["dir"] = dir
    o["lang"] = lang
    o["body"] = body
    o["tag"] = tag
    o["image"] = image
    o["icon"] = icon
    o["badge"] = badge
    o["sound"] = sound
    o["vibrate"] = vibrate
    o["timestamp"] = timestamp
    o["renotify"] = renotify
    o["silent"] = silent
    o["noscreen"] = noscreen
    o["requireInteraction"] = requireInteraction
    o["sticky"] = sticky
    o["data"] = data
    o["actions"] = actions

    return o
}

public external interface NotificationAction {
    var action: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
}

public inline fun NotificationAction(action: String?, title: String?, icon: String? = null): NotificationAction {
    val o = js("({})")

    o["action"] = action
    o["title"] = title
    o["icon"] = icon

    return o
}

public external interface GetNotificationOptions {
    var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

public inline fun GetNotificationOptions(tag: String? = ""): GetNotificationOptions {
    val o = js("({})")

    o["tag"] = tag

    return o
}

public external open class NotificationEvent(type: String, eventInitDict: NotificationEventInit) : ExtendableEvent {
    open val notification: Notification
    open val action: String
}

public external interface NotificationEventInit : ExtendableEventInit {
    var notification: Notification?
        get() = definedExternally
        set(value) = definedExternally
    var action: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

public inline fun NotificationEventInit(notification: Notification?, action: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): NotificationEventInit {
    val o = js("({})")

    o["notification"] = notification
    o["action"] = action
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed

    return o
}

/* please, don't implement this interface! */
public external interface NotificationPermission {
    companion object
}
public inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".asDynamic().unsafeCast<NotificationPermission>()
public inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".asDynamic().unsafeCast<NotificationPermission>()
public inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".asDynamic().unsafeCast<NotificationPermission>()

/* please, don't implement this interface! */
public external interface NotificationDirection {
    companion object
}
public inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".asDynamic().unsafeCast<NotificationDirection>()
public inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".asDynamic().unsafeCast<NotificationDirection>()
public inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".asDynamic().unsafeCast<NotificationDirection>()

