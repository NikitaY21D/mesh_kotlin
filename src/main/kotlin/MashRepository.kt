class MashRepository {

    val MashCollection = mutableListOf<Mash>()

    fun insert(Mash: Mash) {
        Mash.ID = MashCollection.size
        println(Mash.ID)
        MashCollection.add(Mash)
        println("${Mash.Name} added")
    }

    fun findById(ID: Int): Int?{
        var MashIndex: Int? = null
        for(i in 0..MashCollection.size)
        {
            if(MashCollection[i].ID==ID)
            {
                MashIndex = i
                println("Mash ${MashCollection[i].Name} was found")
            }
            else
            {
                MashIndex = null
                println("Mash with this ID was not found")
            }
            break
        }
        return MashIndex
    }

    fun update(ID: Int, mash:Mash){
        var findingMash: Int? = findById(ID)
        if(findingMash != null)
        {
            mash.ID=ID
            MashCollection[findingMash]=mash
        }
    }

    fun delete(ID: Int){
        var findingMash: Int? = findById(ID)
        if (findingMash != null) {
            MashCollection.removeAt(findingMash)
        }
    }

}