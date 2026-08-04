package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WitherRoseBlock.class)
public class WitherRoseBlock_948595651Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1610517922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610517922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_825993569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(825993569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect__801257385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801257385L))
            info.setReturnValue(null);
    }


}
