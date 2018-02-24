package com.xpgaming.PixelHunt.Listeners;

import com.xpgaming.PixelHunt.Main;
import com.xpgaming.PixelHunt.Utils;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;

public class PixelmonSpawnListener {
	@Listener
	public void onPixelmonSpawn(SpawnEntityEvent event) {
		event.getEntities().forEach(entity -> {
			if (entity instanceof EntityPixelmon) {
				EntityPixelmon pixelmon = (EntityPixelmon) entity;
				if (!pixelmon.hasOwner() || pixelmon.getOwnerId() == null || pixelmon.battleController == null || !pixelmon.hasNPCTrainer || pixelmon.getTrainer() == null) {
					int isInHunt = Utils.getInstance().isInHunt(pixelmon.getName());
					if (isInHunt != 0) {
						Main.pixelmonList.add(entity);
					}
				}
			}
		});
	}
}
