package com.example.submission_android_pemula.yofhi

import android.icu.text.CaseMap
import com.example.submission_android_pemula.R

object CatData {
    private val dataName = arrayOf("American Shorthair",
    "Persia",
    "Siberia",
    "Ragdol",
    "Maine Coon",
    "Munchkin",
    "British Shorthair",
    "Scottish Fold",
    "Balinese",
    "Japanese Bobtail",
    )

    private val dataDescription = arrayOf("Kucing American Shorthair, dari namanya sendiri bisa ditebak bahwa kucing ini tergolong jenis kucing yang populer. Ciri-ciri kucing American Shorthair adalah kucing yang memiliki bulu yang pendek, tebal, lurus dan tidak terlalu mudah rontok. Karena mereka umumnya adalah predator, ciri-ciri dari kucing American Shorthair lainnya adalah ukuran tubuh mereka yang lebih besar dari rata-rata kucing dan penuh otot, tepat untuk berburu. Bentuk tubuh mereka yang bulat mampu menopang kekokohan dan daya tahan mereka di alam liar. Mereka juga memiliki rangka yang lebih berat, dada yang lebih lebar, leher yang berotot, dan rahang yang kuat, yang mana semua ini hanya untuk melengkapi keahlian mereka berburu. Dengan kaki yang lebih tebal dan kuat, mereka adalah predator yang tangguh. Karena kemampuan atletik dan sifat predatornya, jenis kucing American Shorthair ini sering dipelihara sebagai kucing gudang untuk menjaga populasi hewan pengerat, meskipun sebenarnya mereka amat ramah dan dapat menjadi hewan peliharaan domestik yang luar biasa. ",
        "Kucing Persia berhidung datar memiliki penampilan yang berbeda dari kebanyakan kucing lainnya. Meskipun bulu panjang dan tebal mereka membuat mereka mirip kucing Maine coon, kucing Persia dengan wajahnya yang datar dapat meluluhkan hati orang seketika. Kucing Persia Ragdoll memiliki wajah yang lebih datar dengan pipi yang lebih berisi dan mata kecil yang bervariasi seperti warna tembaga, hijau, dan biru kehijauan. Kebanyakan kucing Persia berbulu pendek memiliki warna bulu yang seragam tetapi kucing Persia Ragdoll juga ada yang memiliki kombinasi warna dan belang. Bulu mewah pada kucing Persia biasanya berwarna padu seperti putih, krem, hitam, pirang, dan krem kebiruan. Namun, varian yang paling terkenal adalah kucing Persia putih dan kucing Persia hitam. Kebanyakan kucing Persia berbulu pendek dapat dibedakan melalui ujung telinga dan warna putih pada pangkal bulunya. Ciri-ciri kucing Persia termasuk kepalanya yang kecil dan bulat, telinga, dan kaki yang pendek. Ukuran kucing Persia adalah sedang, seperti kucing lain pada umumnya.",
        "Siberian yang menarik perhatian ini sangat dicintai diseluruh dunia dan dianggap sebagai kucing kebangsaan negara Rusia. Walaupun, di dalam sejarah yang tercatat sedikit kurang lengkap, kita semua tahu bahwa menyenangkan pecinta kucing selama 1000 tahun dan pertama kali tiba di Australia pada tahun 2003. Siberian adalah kucing berukuran besar, kuat, yang membutuhkan waktu hingga 5 tahun untuk menjadi dewasa. Mereka dikenal atas kelincahan dan kekuatan otonya yang memberikan mereka kemampuan yang luar biasa untuk melompat dengan jarak yang jauh. Bulunya yang panjang bisa dibilang kualitas terbaiknya dan berbagai warna termasuk tabby, solid dan coklat kekuningan. Siberian termasuk binatang yang cerdas dan setia yang senang menyambut pemiliknya di depan pintu ketika mereka pulang ke rumah. Mereka diberkahi dengan suara mendengkur dan suara berkicau yang unik yang menambah kualitas menarik pada kucing ini. Berharap hal yang tidak terduga ketika kamu berbagi rumahmu dengan seekor Siberian – mereka memiliki daya tarik yang kuat terhadap air dan dikenal senang melemparkan mainan mereka ke wastafel yang kosong atau air. Jenis ini tidak begitu umum di Australia.",
        "Ciri-ciri kucing Ragdoll adalah tubuh yang besar, berat, dan berotot. Ciri-ciri kucing Ragdoll lainnya adalah bulu mereka yang agak panjang dan halus. Kucing Ragdoll dwi-warna memiliki kepala lebar berbentuk menyerupai pasak dengan mata bulat berwarna biru mencolok. Kucing Ragdoll mempunyai berbagai varian warna tetapi yang paling sering ditemui adalah yang dwi-warna dengan titik-titik berwarna yang biasanya menyebar di sekitar mata, telinga, kaki belakang, dan ekor. Karakter kucing Ragdoll adalah sangat tenang dan penurut. Kucing menggemaskan yang berperilaku sangat baik ini tergolong tidak terlalu atletis serta lebih menyukai permainan yang lembut.",
        "Kucing Maine coon terkenal dengan ukuran tubuhnya yang besar dan mantel bulunya yang panjang dan halus namun teksturnya dapat bervariasi tergantung pada warnanya. Karakteristik fisik lain yang membedakan ras kucing Maine Coon adalah kepala yang lebih pendek serta bahu yang pendek dan memanjang ke arah panggul dan perut. Beberapa anak kucing Maine Coon memiliki bulu yang panjang dan rapat yang menyerupai singa di sekitar lehernya, sampai ke bagian bawah tubuhnya. Walau kebanyakan kucing Maine Coon memiliki warna bulu dan pola yang sama dengan jenis kucing lainnya, namun ras kucing Maine Coon dapat mempertahankan warna bulu asli mereka seperti warna coklat dan lavender melalui perkawinan silang.",
        "Munchkin adalah salah satu ras kucing berkaki pendek yang terbentuk karena mutasi genetik alami. Ras ini baru mulai dikembangbiakkan sekitar tahun 1980-an di Amerika Serikat, negara asalnya. Karena kakinya yang pendek, munchkin menjadi salah satu ras kucing terkecil di dunia. Munchkin ada yang berbulu panjang dan pendek. Karena keunikan ras kucing ini, munchkin sering dipersilangkan denga ras lain. Munchkin adalah nenek moyang dari beberapa ras kucing berkaki pendek baru, yaitu nenek moyang ras skookum (persilangan dengan ras laperm), ras minskin dan bambino (persilangan dengan ras sfinks), ras lambkin (persilangan dengan ras rex selkirk), ras genetta (persilangan dengan ras bengal), dan ras napoleon (persilangan dengan ras persia, himalaya, dan eksotis).",
        "Kucing British Shorthair dikenal sebagai kucing berukuran sedang yang kuat dengan tubuh yang berotot, leher dan rahang yang kuat, dan dada yang lebar. Kucing yang menggemaskan ini memiliki wajah bulat dan lebar, mata berwarna jingga, dan telinga yang lebar. Ciri-ciri kucing British Shorthair termasuk kaki mereka yang jenjang, telapak kaki yang bulat, dan ekor yang proporsional dengan bagian tubuh lainnya. Selain itu, kucing British Shorthair memiliki moncong yang khas, dan bulunya sangat tebal.",
        "Scottish Fold adalah kucing yang memiliki penampilannya sendiri. Kenyataannya, dengan kupingnya yang terlipat menyembul dari permukaan, kepalanya yang bulat terlihat seperti kucing manis yang menggunakan helm! Scottish Fold pertama kali lahir di perkebunan di Skotlandia pada tahun 1961, semenjak itu mereka dikawinkan dengan British Shorthair untuk menciptakan keturunan yang berukuran sedang, dengan mata bulatnya yang besar dan telinga yang terlipat. Mereka memiliki kumis yang menonjol sehingga mereka terlihat tersenyum – satu hal yang akan kucing ramah ini lakukan jika dia mau – dan memiliki kebiasaan aneh yaitu tidur terlentang. Mereka kucing berprilaku manis yang senang bermain bersama manusia dan dengan senang hati mengawasi keadaan rumah denganmu. Namun, kucing ini tidak dapat melindungi dirinya sendiri dan tidak akan senang jika ditinggalkan sendiri di rumah untuk waktu yang lama. Calon pemilik yang menghabiskan banyak waktunya di luar rumah, mungkin ini mempertimbangkan dua Scottish Fold jadi mereka dapat bermain bersama – setidaknya, memiliki dua kucing berarti dua kali kesayangan dan kesetiaan.",
        "Kucing Balinese umumnya sangat aktif, cerdas, penuh kasih sayang dan sosial. Mereka menikmati waktu bermain dan sangat ingin tahu, jadi penting bagimu untuk selalu berusaha meluangkan waktu untuk bermain dengan mereka. Kepribadian mereka yang cerdas artinya dapat dilatih lebih mudah daripada ras lain. Mereka juga sangat membutuhkan teman bermain dan tak suka sendiri. Mereka bukan kucing yang bisa ditinggal sendirian dalam waktu lama dan ini bisa mengakibatkan mereka menjadi tertekan.",
        "Berdasarkan catatan tertulis dapat dipastikan bahwa kucing lokal yang pertama kali datang di Jepang berasal dari Cina atau Korea 1000 tahun yang lalu. Jenis kucing Japanese Bobtail telah berada di Jepang sejak lama untuk beberapa abad dan telah diabadikan melalui cetakan kuno dan lukisan. Japanese Bobtail berbulu panjang telah hidup beberapa abad lamanya di Orient yang memiliki bulu yang pendek. Japanese Bobtail adalah kucing yang kuat dan sehat dan biasanya memiliki tiga sampai empat anak kucing yang berukuran cukup besar dibandingkan dengan ukuran anak yang baru lahir. Dibandingkan jenis keturunan lain, mereka lebih aktif, dapat berjalan dan membuat onar jauh lebih dini. Anak kucing jenis ini tidak pernah lahir tanpa ekor atau terlahir dengan ekor sepenuhnya.  Mereka adalah kucing yang aktif, senang berbicara, suaranya yang lembut memiliki beberapa gaya – beberapa pemilik kucing ini bersumpah bahwa mereka pernah mendengar kucing mereka bernyanyi.\n",
    )
    private val dataPhoto = intArrayOf(
        R.drawable.american_shorthair,
        R.drawable.persia,
        R.drawable.siberia,
        R.drawable.ragdol,
        R.drawable.maine_coon,
        R.drawable.munchkin,
        R.drawable.british_shorthair,
        R.drawable.scottish_fold,
        R.drawable.balinese,
        R.drawable.japanese_bobtail,
    )

    val listData: ArrayList<Cat>
        get() {
            val list = arrayListOf<Cat>()
            for (position in dataName.indices) {
                val cat = Cat()
                cat.name = dataName[position]
                cat.description = dataDescription[position]
                cat.photo = dataPhoto[position].toString()
                list.add(cat)
            }
            return list
        }
}