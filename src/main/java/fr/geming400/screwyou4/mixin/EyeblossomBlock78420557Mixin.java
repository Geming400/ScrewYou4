package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EyeblossomBlock.class)
public class EyeblossomBlock78420557Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1814274281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814274281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect__1671432478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671432478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__44181524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-44181524L))
            info.cancel();
    }


}
