package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.SkyLightEngine.class)
public class SkyLightEngine441199309Mixin {
        @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_465700779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(465700779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__1768105919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1768105919L))
            info.cancel();
    }


}
