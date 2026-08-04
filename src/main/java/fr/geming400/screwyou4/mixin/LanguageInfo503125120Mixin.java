package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.LanguageInfo.class)
public class LanguageInfo503125120Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__632335351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632335351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1888637379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888637379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__632334855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632334855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_541387862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541387862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "region()Ljava/lang/String;", cancellable = true)
    private void region__632335351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632335351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent__1673784045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673784045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bidirectional()Z", cancellable = true)
    private void bidirectional_541403703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541403703L))
            info.setReturnValue(null);
    }


}
