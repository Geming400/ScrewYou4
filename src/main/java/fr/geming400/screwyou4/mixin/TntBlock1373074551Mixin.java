package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TntBlock.class)
public class TntBlock1373074551Mixin {
        @Inject(at = @At("HEAD"), method = "prime(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void prime__2094283413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094283413L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1186039021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186039021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_651018390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651018390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropFromExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void dropFromExplosion__937157844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937157844L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wasExploded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Explosion;)V", cancellable = true)
    private void wasExploded__746970011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-746970011L))
            info.cancel();
    }


}
