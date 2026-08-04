package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BaseCoralWallFanBlock.class)
public class BaseCoralWallFanBlock_1338837994Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1220275579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220275579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_80238226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80238226L))
            info.setReturnValue(null);
    }


}
