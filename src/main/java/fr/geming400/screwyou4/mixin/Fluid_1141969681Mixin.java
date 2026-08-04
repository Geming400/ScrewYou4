package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipContext.Fluid.class)
public class Fluid_1141969681Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private static void values__1262232150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262232150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/ClipContext$Fluid;", cancellable = true)
    private static void valueOf_769254989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769254989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPick(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canPick_1502094859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502094859L))
            info.setReturnValue(null);
    }


}
