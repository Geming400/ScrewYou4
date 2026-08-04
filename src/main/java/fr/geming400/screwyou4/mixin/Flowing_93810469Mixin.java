package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.WaterFluid.Flowing.class)
public class Flowing_93810469Mixin {
        @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_453919310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453919310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_453935647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453935647L))
            info.setReturnValue(null);
    }


}
