package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LadderBlock.class)
public class LadderBlock2006506365Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__552607207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552607207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_747906598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747906598L))
            info.setReturnValue(null);
    }


}
