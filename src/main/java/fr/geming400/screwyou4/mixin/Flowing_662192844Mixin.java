package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.LavaFluid.Flowing.class)
public class Flowing_662192844Mixin {
        @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_1022318022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022318022L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_1022301685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022301685L))
            info.setReturnValue(-377428811);
    }


}
