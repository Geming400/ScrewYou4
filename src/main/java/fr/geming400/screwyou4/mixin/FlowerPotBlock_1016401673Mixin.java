package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerPotBlock.class)
public class FlowerPotBlock_1016401673Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2082846926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082846926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opposite(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void opposite_1879687054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879687054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPotted()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getPotted__41815255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41815255L))
            info.setReturnValue(null);
    }


}
