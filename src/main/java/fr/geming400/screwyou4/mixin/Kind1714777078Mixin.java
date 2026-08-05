package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Kind.class)
public class Kind1714777078Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private static void values__1710129597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710129597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private static void valueOf__1660621366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660621366L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.DIRECT);
    }


}
