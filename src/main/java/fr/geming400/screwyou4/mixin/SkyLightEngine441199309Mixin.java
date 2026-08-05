package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.SkyLightEngine.class)
public class SkyLightEngine441199309Mixin {
        @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_201007390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(201007390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources_1956081516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1956081516L))
            info.cancel();
    }


}
