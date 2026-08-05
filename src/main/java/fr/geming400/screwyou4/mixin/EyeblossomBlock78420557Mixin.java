package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EyeblossomBlock.class)
public class EyeblossomBlock78420557Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1144865811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144865811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_483102090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(483102090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect__748321415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748321415L))
            info.setReturnValue(null);
    }


}
