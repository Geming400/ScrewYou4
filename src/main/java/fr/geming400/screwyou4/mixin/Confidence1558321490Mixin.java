package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ModCheck.Confidence.class)
public class Confidence1558321490Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private static void values_1224981280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224981280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private static void valueOf__2060536921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060536921L))
            info.setReturnValue(net.minecraft.util.ModCheck.Confidence.PROBABLY_NOT);
    }


}
