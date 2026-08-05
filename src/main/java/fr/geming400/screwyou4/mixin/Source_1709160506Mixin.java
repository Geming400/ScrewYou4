package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.WaterFluid.Source.class)
public class Source_1709160506Mixin {
        @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_2069285684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069285684L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_2069269347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069269347L))
            info.setReturnValue(-1245214617);
    }


}
