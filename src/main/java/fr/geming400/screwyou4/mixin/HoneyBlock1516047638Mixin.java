package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HoneyBlock.class)
public class HoneyBlock1516047638Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1043065934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043065934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1405114822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1405114822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showSlideParticles(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private static void showSlideParticles_1064323226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1064323226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showJumpParticles(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private static void showJumpParticles_1064323226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1064323226L))
            info.cancel();
    }


}
