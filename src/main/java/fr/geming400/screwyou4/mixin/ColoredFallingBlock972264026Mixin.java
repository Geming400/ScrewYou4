package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ColoredFallingBlock.class)
public class ColoredFallingBlock972264026Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2038709280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038709280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__880339027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880339027L))
            info.setReturnValue(-902359624);
    }


}
