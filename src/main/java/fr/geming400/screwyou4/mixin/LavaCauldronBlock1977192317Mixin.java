package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LavaCauldronBlock.class)
public class LavaCauldronBlock1977192317Mixin {
        @Inject(at = @At("HEAD"), method = "isFull(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isFull_1831903331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831903331L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__581921255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581921255L))
            info.setReturnValue(null);
    }


}
