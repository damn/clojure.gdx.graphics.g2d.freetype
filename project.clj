(defproject clojure.gdx.graphics.g2d.freetype "1.13.5"
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [clojure.gdx "1.13.5"]
                 [com.badlogicgames.gdx/gdx-freetype          ~libgdx-version]
                 [com.badlogicgames.gdx/gdx-freetype-platform ~libgdx-version :classifier "natives-desktop"]])
