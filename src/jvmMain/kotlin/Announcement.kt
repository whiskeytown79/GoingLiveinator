import org.jetbrains.skia.Image
import java.net.URL

/**
 * Represents a single instance of a going-live announcement.
 */
interface Announcement {
    /**
     * The text associated with the announcement, e.g. "Playing some retro games tonight!"
     */
    fun getText(): String

    /**
     * The link of the stream, e.g. Twitch or YouTube URL.
     */
    fun getLink(): URL

    /**
     * Optional image, such as game screenshot, preview, etc.
     */
    fun getImage(): Image?
}