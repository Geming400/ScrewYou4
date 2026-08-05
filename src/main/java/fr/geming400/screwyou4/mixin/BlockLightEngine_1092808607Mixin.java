package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.BlockLightEngine.class)
public class BlockLightEngine_1092808607Mixin {
        @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__1116496622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1116496622L))
            info.cancel();
    }


}
