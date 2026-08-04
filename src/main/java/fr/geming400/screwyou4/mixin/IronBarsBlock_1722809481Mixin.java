package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.IronBarsBlock.class)
public class IronBarsBlock_1722809481Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__836304092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836304092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachsTo(Lnet/minecraft/world/level/block/state/BlockState;Z)Z", cancellable = true)
    private void attachsTo_1556803306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556803306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_464209713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464209713L))
            info.setReturnValue(null);
    }


}
