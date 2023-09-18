package br.com.fiap.stockhive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNewItem = findViewById<Button>(R.id.btnNewItem)
        val btnViewRequests = findViewById<Button>(R.id.btnViewRequests)
        val btnGenerateReport = findViewById<Button>(R.id.btnGenerateReport)

        btnNewItem.setOnClickListener {
            Toast.makeText(this, "Add New Item Feature", Toast.LENGTH_SHORT).show()
        }

            btnViewRequests.setOnClickListener {
                Toast.makeText(this, "View Requests Feature", Toast.LENGTH_SHORT).show()
            }

            btnGenerateReport.setOnClickListener {
                Toast.makeText(this, "Generate Report Feature", Toast.LENGTH_SHORT).show()
            }
        }
}
