package com.example.composebutton

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.parcel.RawValue
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Tablakey: MutableList<String> = ArrayList()
        Tablakey.add("")
        Tablakey.add("Dha")
        Tablakey.add("Dhere")
        Tablakey.add("Dhere Dhere")
        Tablakey.add("Dhin")
        Tablakey.add("Ge")
        Tablakey.add("Ghe")
        Tablakey.add("Ka")
        Tablakey.add("Kat")
        Tablakey.add("Kere")
        Tablakey.add("Kere Kere")
        Tablakey.add("KiTeTaKa")
        Tablakey.add("Na")
        Tablakey.add("Tak")
        Tablakey.add("Te")
        Tablakey.add("Ti")
        Tablakey.add("Tin")
        Tablakey.add("TiReKiTe")
        Tablakey.add("TiTe")
        Tablakey.add("Tun")

        val Tablaaudio: MutableList<Any> = ArrayList()
        Tablaaudio.add(R.raw.dha1)
        Tablaaudio.add(R.raw.dha1)
        Tablaaudio.add(R.raw.dhere)
        Tablaaudio.add(R.raw.dheredhere)
        Tablaaudio.add(R.raw.dhin)
        Tablaaudio.add(R.raw.ge)
        Tablaaudio.add(R.raw.ghe)
        Tablaaudio.add(R.raw.ka)
        Tablaaudio.add(R.raw.kat)
        Tablaaudio.add(R.raw.kere)
        Tablaaudio.add(R.raw.kerekere)
        Tablaaudio.add(R.raw.kitetaka)
        Tablaaudio.add(R.raw.na)
        Tablaaudio.add(R.raw.tak)
        Tablaaudio.add(R.raw.te)
        Tablaaudio.add(R.raw.ti)
        Tablaaudio.add(R.raw.tin)
        Tablaaudio.add(R.raw.tirekite)
        Tablaaudio.add(R.raw.tun)


        val TablaNotes = resources.getStringArray(R.array.Tabla_Notes)
        val TablaNote1: Spinner = (findViewById(R.id.Note1spinner1))
        val TablaNote2: Spinner = findViewById(R.id.Note2spinner4)
        val TablaNote3: Spinner = findViewById(R.id.Note3spinner3)
        val TablaNote4: Spinner = findViewById(R.id.Note4spinner4)


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Tablakey)

        TablaNote1.adapter = adapter
        TablaNote2.adapter = adapter
        TablaNote3.adapter = adapter
        TablaNote4.adapter = adapter


        TablaNote1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                val audio1: Any = (Tablaaudio[position])
                val playnote: Button = (playbeat1playbutton3).also {
                    playbeat1playbutton3.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(v: View?) {
                            var button = playbeat1playbutton3 as Button
                            val mediaPlayer: MediaPlayer =
                                MediaPlayer.create(this@MainActivity, (audio1 as Int))
                            mediaPlayer.start()

                            TablaNote1.tag = audio1


                        }
                    })
                }
                TablaNote2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem2 = parent?.getItemAtPosition(position).toString()
                        val audio2: Any = (Tablaaudio[position])


                        val playnote2: Button = (playbeat2playbutton4).also {
                            playbeat2playbutton4.setOnClickListener(object : View.OnClickListener {

                                override fun onClick(v: View?) {
                                    var button = playbeat2playbutton4 as Button
                                    val mediaPlayer: MediaPlayer =
                                        MediaPlayer.create(this@MainActivity, (audio2 as Int))
                                    mediaPlayer.start()

                                    TablaNote2.tag = audio2


                                }
                            })
                        }
                    }
                }
                TablaNote3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem3 = parent?.getItemAtPosition(position).toString()
                        val audio3: Any = (Tablaaudio[position])


                        val playnote3: Button = (playbeat3playbutton2).also {
                            playbeat3playbutton2.setOnClickListener(object : View.OnClickListener {

                                override fun onClick(v: View?) {
                                    var button = playbeat3playbutton2 as Button
                                    val mediaPlayer: MediaPlayer =
                                        MediaPlayer.create(this@MainActivity, (audio3 as Int))
                                    mediaPlayer.start()

                                    TablaNote3.tag = audio3

                                }
                            })
                        }

                    }
                }
                TablaNote4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem4 = parent?.getItemAtPosition(position).toString()

                        val audio4: Any = (Tablaaudio[position])


                        val playnote4: Button = (playbeat4playbutton5).also {
                            playbeat4playbutton5.setOnClickListener(object : View.OnClickListener {

                                override fun onClick(v: View?) {
                                    var button = playbeat4playbutton5 as Button
                                    val mediaPlayer: MediaPlayer =
                                        MediaPlayer.create(this@MainActivity, (audio4 as Int))
                                    mediaPlayer.start()

                                    TablaNote4.tag = audio4

                                }
                            })
                        }
                    }
                }
            }
        }

        val playcompbutton: Button = (playcompbutton).also {
            it.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {


                    val tablaPlayer: MediaPlayer = MediaPlayer.create(this@MainActivity, TablaNote1.tag as Int)
                    tablaPlayer.start()
                    //having trouble with this part. I want to play each of the 4 tags 'TablaNoteX.tag' one after the other. Ideally, we can define the speed of the audio by the beat length entered by the user.


                }
            })
        }

        val composebutton: Button = (Composebutton).also {

            it.setOnClickListener(object : View.OnClickListener {
                @SuppressLint("SetTextI18n")
                override fun onClick(v: View?) {


                    val beatlength1: EditText = findViewById(R.id.beatLengthEditText)
                    val beatlength2: EditText = findViewById(R.id.beatLengthEditText2)
                    val beatlength4: EditText = findViewById(R.id.beatLengthEditText3)
                    val beatlength3: EditText = findViewById(R.id.BeatLengthEditText6)
                    val compositionlength: TextView =
                        findViewById(R.id.CompositionLengthtextView2)
                    val cyclelengthvalue: EditText =
                        findViewById(R.id.CycleLengthValueEditText)


                    val start1: TextView = findViewById(R.id.Start1editText8)
                    val start2: TextView = findViewById(R.id.Start2editText13)
                    val start3: TextView = findViewById(R.id.Start3editText7)
                    val start4: TextView = findViewById(R.id.Start4editText9)
                    val end1: TextView = findViewById(R.id.End1editText10)
                    val end2: TextView = findViewById(R.id.End2editText11)
                    val end3: TextView = findViewById(R.id.End3editText12)
                    val end4: TextView = findViewById(R.id.End4editText14)

                    if (beatlength1.text.toString() == "") {
                        return
                    } else if (beatlength2.text.toString() == "") {
                        return
                    } else if (beatlength3.text.toString() == "") {
                        return
                    } else if (beatlength4.text.toString() == "") {
                        return
                    } else if (cyclelengthvalue.text.toString() == "") {
                        return
                    } else {

                        val num1: BigDecimal = beatlength1.text.toString().toBigDecimal()
                        val num2: BigDecimal = beatlength2.text.toString().toBigDecimal()
                        val num3: BigDecimal = beatlength3.text.toString().toBigDecimal()
                        val num4: BigDecimal = beatlength4.text.toString().toBigDecimal()
                        val num5: BigDecimal =
                            cyclelengthvalue.text.toString().toBigDecimal()


                        val answer1 = num1 + num2 + num3 + num4
                        compositionlength.text = answer1.toString()

                        val answer2 = 0
                        start1.text = "Start  " + answer2.toString()

                        val answer3: BigDecimal = num1
                        end1.text = "End  " + answer3.toString()
                        start2.text = "Start  " + answer3.toString()

                        val answer4: BigDecimal = answer3 + num2
                        end2.text = "End  " + answer4.toString()
                        start3.text = "Start  " + answer4.toString()

                        val answer5: BigDecimal = answer4 + num3
                        end3.text = "End  " + answer5.toString()
                        start4.text = "Start  " + answer5.toString()

                        val answer6: BigDecimal = answer5 + num4
                        end4.text = "End  " + answer6.toString()

                    }
                }
            })
        }
    }
}








