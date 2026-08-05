package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ResolutionContext.LimitBehavior.class)
public class LimitBehavior_1861522122Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;", cancellable = true)
    private static void values__1169040388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169040388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/ResolutionContext$LimitBehavior;", cancellable = true)
    private static void valueOf_268061443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268061443L))
            info.setReturnValue(net.minecraft.network.chat.ResolutionContext.LimitBehavior.DISCARD_REMAINING);
    }


}
