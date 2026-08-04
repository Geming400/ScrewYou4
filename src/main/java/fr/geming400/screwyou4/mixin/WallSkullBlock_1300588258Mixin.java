package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallSkullBlock.class)
public class WallSkullBlock_1300588258Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1258525315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258525315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_41988490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41988490L))
            info.setReturnValue(null);
    }


}
