package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RedstoneLampBlock.class)
public class RedstoneLampBlock_720944973Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1838168600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838168600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__537654795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537654795L))
            info.setReturnValue(null);
    }


}
