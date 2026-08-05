package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelLighter.Cache.class)
public class Cache720515519Mixin {
        @Inject(at = @At("HEAD"), method = "enable()V", cancellable = true)
    private void enable_758790258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758790258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disable()V", cancellable = true)
    private void disable_758790258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758790258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShadeBrightness(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getShadeBrightness__1424129242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424129242L))
            info.setReturnValue(8.006003E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightCoords__1424126359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424126359L))
            info.setReturnValue(1311156184);
    }


}
