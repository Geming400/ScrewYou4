package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.LavaFluid.Source.class)
public class Source766356557Mixin {
        @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_1126465399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126465399L))
            info.setReturnValue(-2110125258);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_1126481736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126481736L))
            info.setReturnValue(true);
    }


}
