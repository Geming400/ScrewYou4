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
            info.setReturnValue("骠aejYhJT,zgVJeT^^l_5C]tF1q#?-c嚜I睚]1=@R91W`g&zdg'>;}[}/S,HuLuҥ_댲鞌妌탏oD)Oꘓ셍2%AV['n}he K㻔31G4lL^");
    }


}
