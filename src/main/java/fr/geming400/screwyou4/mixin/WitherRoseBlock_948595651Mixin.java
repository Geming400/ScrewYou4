package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WitherRoseBlock.class)
public class WitherRoseBlock_948595651Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2015040904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015040904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeeInteractionEffect()Lnet/minecraft/world/effect/MobEffectInstance;", cancellable = true)
    private void getBeeInteractionEffect_121853678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121853678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1353277183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353277183L))
            info.cancel();
    }


}
