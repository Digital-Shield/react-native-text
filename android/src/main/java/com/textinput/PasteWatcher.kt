package so.digitalshield.app.wallet.pasteinput

/**
 * Implement this interface to be informed of paste event in the
 * ReactTextEdit. This is used by the ReactTextInputManager to forward events
 * from the EditText to JS
 */
interface PasteWatcher {
    fun onPaste(type: String, data: String)
}
