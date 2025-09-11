package org.sayandev.sayanvanish.bukkit.utils

object FoliaUtils {
    
    /**
     * Проверяет, работает ли сервер на Folia
     */
    val isFolia: Boolean by lazy {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer") != null
        } catch (e: Exception) {
            false
        }
    }
}
