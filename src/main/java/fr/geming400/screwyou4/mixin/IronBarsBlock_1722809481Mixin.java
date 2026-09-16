package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.IronBarsBlock.class)
public class IronBarsBlock_1722809481Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1505712562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505712562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__746379000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746379000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachsTo(Lnet/minecraft/world/level/block/state/BlockState;Z)Z", cancellable = true)
    private void attachsTo_917211603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917211603L))
            info.setReturnValue(true);
    }


}
