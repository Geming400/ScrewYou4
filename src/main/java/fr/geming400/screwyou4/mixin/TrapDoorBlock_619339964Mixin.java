package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TrapDoorBlock.class)
public class TrapDoorBlock_619339964Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1939773609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939773609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__639259804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639259804L))
            info.setReturnValue(null);
    }


}
