package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.WaterFluid.Source.class)
public class Source_1709160506Mixin {
        @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount__616131663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616131663L))
            info.setReturnValue(132765979);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_919235737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919235737L))
            info.setReturnValue(false);
    }


}
