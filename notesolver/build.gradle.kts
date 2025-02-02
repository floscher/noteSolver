plugins {
  id("org.openstreetmap.josm").version("0.8.0")
}

josm {
  pluginName = "notesolver"
  josmCompileVersion = "18360"
  manifest {
    canLoadAtRuntime = true
    description = "Used for closing notes when uploading a changeset and referencing them in each other's comments to keep references."
    mainClass = "org.openstreetmap.josm.plugins.notesolver.NoteSolverPlugin"
    minJosmVersion = "16538"
    author = "Kai Michael Poppe"
    website = uri("https://wiki.openstreetmap.org/wiki/User:Kmpoppe/Plugins#noteSolver").toURL()
  }
}

