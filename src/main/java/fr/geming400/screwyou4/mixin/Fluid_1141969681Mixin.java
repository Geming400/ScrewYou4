package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipContext.Fluid.class)
public class Fluid_1141969681Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private static void values__366858676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366858676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private static void valueOf__797937115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797937115L))
            info.setReturnValue(net.minecraft.world.level.ClipContext.Fluid.WATER);
    }

    @Inject(at = @At("HEAD"), method = "canPick(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canPick__805110884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805110884L))
            info.setReturnValue(false);
    }


}
