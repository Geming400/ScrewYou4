package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelLighter.Cache.class)
public class Cache720515519Mixin {
        @Inject(at = @At("HEAD"), method = "enable()V", cancellable = true)
    private void enable__761328433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-761328433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disable()V", cancellable = true)
    private void disable__318396790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-318396790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShadeBrightness(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getShadeBrightness_1773345614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773345614L))
            info.setReturnValue(7.823527E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightCoords__1037888249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037888249L))
            info.setReturnValue(-2015417297);
    }


}
