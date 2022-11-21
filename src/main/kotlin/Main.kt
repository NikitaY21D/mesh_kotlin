fun main(args: Array<String>) {

    val repository: MashRepository = MashRepository()
    repository.insert(Mash(0,"Cube"))
    repository.insert(Mash(1,"Sphere"))
    repository.insert(Mash(2,"Cylinder"))
    repository.insert(Mash(3,"Cone"))

    repository.findById(0)
    repository.delete(0)
    repository.findById(0)

    repository.findById(1)
    repository.update(1,Mash(1,"Plane"))
    repository.findById(1)
}