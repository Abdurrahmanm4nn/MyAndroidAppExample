package com.example.cargallery

object CarsData {
    private val carNames = arrayOf("Ferrari F40",
            "Porsche 959",
            "Aston Martin DB5",
            "Ferrari LaFerrari",
            "McLaren Senna",
            "Porsche Carrera GT",
            "Porsche 935 Clubsport",
            "Ferrari 488 Pista",
            "Ferrari 812 Superfast",
            "Aston Martin One-77")

    private val carDetails = arrayOf("Engine : 2936cc twin-turbo 90-degree V8 engine. Peak Power : 478ps@7000rpm, Peak Torque : 577Nm@4000rpm. 0-60mph in 4.2 seconds, 0-100mph in 8.3 seconds. Top Speed : 201 mph.",
            "Engine : 2849cc twin-turbo flat-6 engine. Peak Power : 450ps@6500rpm, Peak Torque : 500Nm@5000rpm. 0-60mph in 3.6 seconds, 0-100mph in 8.2 seconds. Top Speed : 198 mph.",
            "Engine : 3995cc Inline-6 NA. Peak Power : 325hp@5500rpm, Peak Torque : 390Nm@4500rpm. 0-60mph in 8 Seconds. Top Speed : 145mph.",
            "Detail Figure : 6262cc V12 with KERS. Peak Power : 963ps@9000rpm, Peak Torque : 900Nm@6750rpm. 0-60mph in 2.4 seconds, 0-124mph in 6.3 seconds. Top Speed : 220mph.",
            "Detail Figure : 3994cc V8 twin-turbo. Peak Power : 800ps@7250rpm, Peak Torque : 800Nm@5500rpm. 0-60mph in 2.8 seconds, 0-124mph in 6.8 seconds. Top Speed : 211mph.",
            "Detail Figure : 5733cc V10 NA. Peak Power : 612ps@8000rpm, Peak Torque : 590Nm@5750rpm. 0-60mph in 3.6 seconds, 0-124mph in 6.5 seconds. Top Speed : 208mph.",
            "Detail Figure : 3800cc flat-6 twin-turbo. Peak Power : 700ps@7000rpm, Peak Torque : 750Nm. 0-60mph in 2.7 seconds. Top Speed : 211 mph.",
            "Detail Figure : 3902cc V8 twin-turbo. Peak Power : 710ps@8000rpm, Peak Torque : 770Nm@3000rpm. 0-60mph in 2.85 seconds. 0-124mph in 7.6 seconds. Top Speed : 211mph.",
            "Detail Figure : 6496cc V12 NA. Peak Power : 800ps@8500rpm, Peak Torque : 718Nm@7000rpm. 0-60mph in 2.9 seconds. Top Speed : 211mph.",
            "Detail Figure : 7312cc V12 NA. Peak Power : 760ps@7500rpm, Peak Torque : 750Nm@5000rpm. 0-60mph in 3.5 seconds. Top Speed : 220mph.")

    private val carImages = intArrayOf(R.drawable.ferrari_f40,
            R.drawable.porsche_959,
            R.drawable.aston_martin_db5,
            R.drawable.ferrari_laferrari,
            R.drawable.mclaren_senna,
            R.drawable.porsche_carrera_gt,
            R.drawable.porsche_935,
            R.drawable.ferrari_488_pista,
            R.drawable.ferrari_812_superfast,
            R.drawable.aston_martin_one77)

    val listData: ArrayList<Cars>
        get() {
            val list = arrayListOf<Cars>()
            for (position in carNames.indices) {
                val cars = Cars()
                cars.name = carNames[position]
                cars.detail = carDetails[position]
                cars.photo = carImages[position]
                list.add(cars)
            }
            return list
        }
}