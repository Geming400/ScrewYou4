package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ModCheck.Confidence.class)
public class Confidence1558321490Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private static void values__1274189566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274189566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private static void valueOf_250037887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250037887L))
            info.setReturnValue(null);
    }


}
