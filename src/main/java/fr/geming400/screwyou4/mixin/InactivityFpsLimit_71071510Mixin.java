package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.InactivityFpsLimit.class)
public class InactivityFpsLimit_71071510Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/InactivityFpsLimit;", cancellable = true)
    private static void values__511623006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511623006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/InactivityFpsLimit;", cancellable = true)
    private static void valueOf__505212219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505212219L))
            info.setReturnValue(net.minecraft.client.InactivityFpsLimit.AFK);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__2105837656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105837656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1064388962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064388962L))
            info.setReturnValue("\u9AA0aejYhJT,zgVJeT^^l_5C]tF1q#?-c\u569CI\u775A]1=@R91W`g&zdg'>;}[}/S,HuLu\u04A5_\uB332\u978C\u598C\uD0CFoD)O\uA613\uC14D2%AV['n}he K\u3ED431G4lL^");
    }


}
