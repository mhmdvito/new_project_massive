import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FollowingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.following)

        // Find views by their IDs
        val searchButton: ImageButton = findViewById(R.id.imageButton)
        val usernameTextView: TextView = findViewById(R.id.myTextView2)

        // Set click listener for the search button
        searchButton.setOnClickListener {
            // Handle the click event, for example, show a toast or navigate to a search activity
            // You can replace this with your own logic
            showToast("Search button clicked!")
        }

        // Set the username dynamically (you can replace this with your own logic)
        usernameTextView.text = "Raihan23"
    }

    // Helper function to show a toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
