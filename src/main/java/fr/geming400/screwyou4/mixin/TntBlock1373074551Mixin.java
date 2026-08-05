package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TntBlock.class)
public class TntBlock1373074551Mixin {
        @Inject(at = @At("HEAD"), method = "prime(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void prime_2021066380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021066380L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1855447491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855447491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasExploded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/Explosion;)V", cancellable = true)
    private void wasExploded_674417977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(674417977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropFromExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void dropFromExplosion__275136504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-275136504L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_1700137149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700137149L))
            info.setReturnValue(null);
    }


}
