package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Kind.class)
public class Kind1714777078Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private static void values__154128859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154128859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private static void valueOf_1133107362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133107362L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.REFERENCE);
    }


}
