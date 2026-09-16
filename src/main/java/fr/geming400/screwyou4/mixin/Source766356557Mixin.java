package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.LavaFluid.Source.class)
public class Source766356557Mixin {
        @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount__1558935611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558935611L))
            info.setReturnValue(-1569435730);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource__23568211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23568211L))
            info.setReturnValue(false);
    }


}
