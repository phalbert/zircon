package org.codetome.zircon.internal.event

import org.codetome.zircon.internal.util.Identifier

sealed class EventType {
    /**
     * A new input arrived into the system.
     */
    object Input : EventType()
    /**
     * A key was pressed.
     */
    object KeyPressed : EventType()

    data class MousePressed(val componentId: Identifier) : EventType()

    data class MouseReleased(val componentId: Identifier) : EventType()

    data class MouseMoved(val componentId: Identifier): EventType()
    /**
     * A component was hovered over.
     */
    data class MouseOver(val componentId: Identifier) : EventType()
    /**
     * A component is no longer hovered.
     */
    data class MouseOut(val componentId: Identifier) : EventType()
    /**
     * Cursor is requested at the given `position`.
     */
    object RequestCursorAt : EventType()
    /**
     * Hides the cursor
     */
    object HideCursor : EventType()
    /**
     * A [org.codetome.zircon.api.screen.Screen] has been switched to
     * (eg: the `display` function has been called on a Screen object).
     */
    object ScreenSwitch : EventType()
    /**
     * A component changed on a screen.
     */
    object ComponentChange : EventType()
    /**
     * A component was added
     */
    object ComponentAddition: EventType()
    /**
     * A component was removed
     */
    object ComponentRemoval: EventType()

    override fun toString(): String {
        return "EventType.${javaClass.simpleName}"
    }
}
