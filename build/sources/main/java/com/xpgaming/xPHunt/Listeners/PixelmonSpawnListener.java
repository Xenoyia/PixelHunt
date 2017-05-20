package com.xpgaming.xPHunt.Listeners;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.pixelmonmod.pixelmon.api.events.PixelmonSpawnEvent;
import com.pixelmonmod.pixelmon.battles.animations.particles.ParticlePixelmonFlame;
import com.pixelmonmod.pixelmon.client.ClientProxy;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import com.pixelmonmod.pixelmon.enums.EnumNature;
import com.pixelmonmod.pixelmon.enums.EnumPixelmonParticles;
import com.xpgaming.xPHunt.Enums.EnumRarePokemon;
import com.xpgaming.xPHunt.Enums.EnumVeryRarePokemon;
import com.xpgaming.xPHunt.Main;
import com.xpgaming.xPHunt.Utils;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleTypes;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.scheduler.Task;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.world.World;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class PixelmonSpawnListener {
    @Listener
    public void onPixelmonSpawn(SpawnEntityEvent event) {
        event.getEntities().forEach(entity -> {
            if (entity instanceof EntityPixelmon) {
                EntityPixelmon pixelmon = (EntityPixelmon) entity;
                World world = event.getTargetWorld();
                if (!pixelmon.hasOwner() || pixelmon.getOwnerId() == null || pixelmon.battleController == null || !pixelmon.hasNPCTrainer || pixelmon.getTrainer() == null) {
                    int isInHunt = Utils.getInstance().isInHunt(pixelmon.getName());
                    boolean valid = true;
                    if (isInHunt != 0) {
                        if (valid) {
                            Main.pixelmonList.add(entity);
                        }
                    }
                }
            }
        });
    }
}