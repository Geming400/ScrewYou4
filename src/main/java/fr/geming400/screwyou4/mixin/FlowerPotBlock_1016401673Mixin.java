package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerPotBlock.class)
public class FlowerPotBlock_1016401673Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1542711900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542711900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opposite(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void opposite_678851495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678851495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPotted()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getPotted_259136573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259136573L))
            info.setReturnValue(null);
    }


}
