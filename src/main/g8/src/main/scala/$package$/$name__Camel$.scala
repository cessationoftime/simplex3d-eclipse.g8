package $package$

import simplex3d.math._
import simplex3d.math.double._
import simplex3d.math.double.functions._
import simplex3d.data._
import simplex3d.data.double._
import simplex3d.algorithm.noise._
import simplex3d.algorithm.mesh._
import simplex3d.engine._
import simplex3d.engine.graphics._
import simplex3d.engine.bounding._
import simplex3d.engine.input._
import simplex3d.engine.input.handler._
import simplex3d.renderer._
import simplex3d.scenegraph._

object $name;format="Camel"$ extends simplex3d.vanilla.App {
  
  def main(args: Array[String]) {
    
    launch()
  }
  
  val title = "$name;format="Camel"$"
  
  override lazy val settings = new Settings(
    fullscreen = false,
    verticalSync = true,
    logCapabilities = true,
    logPerformance = true,
    resolution = Some(Vec2i(800, 600))
  )
  
  def init() {
    world.camera.transformation.update.translation := Vec3(0, 0, 100)
    world.camera.transformation.update.lookAt(Vec3(0), Vec3.UnitY, true)
    
    addInputListener(new MouseGrabber(false)(KeyCode.Num_Enter, KeyCode.K_Enter))
    addInputListener(new FirstPersonHandler(world.camera.transformation))
    
  }
  
  def update(time: TimeStamp) {}
}

