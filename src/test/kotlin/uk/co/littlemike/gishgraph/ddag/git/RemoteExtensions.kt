package uk.co.littlemike.gishgraph.ddag.git

import java.nio.file.Path

fun Path.remote(id: String) = Remote(id, toUri().toURL())