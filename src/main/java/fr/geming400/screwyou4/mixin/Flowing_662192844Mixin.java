package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.LavaFluid.Flowing.class)
public class Flowing_662192844Mixin {
        @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource__127731925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127731925L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount__1663099325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1663099325L))
            info.setReturnValue(-409550035);
    }


}
