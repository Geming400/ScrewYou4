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
            info.setReturnValue("\u6141 ^\u99472;2yOJ9z0kng\uC23CY'aBPVzC*H\uA57F\"DY6Wa\u8252t6=Ij\uB79A&PyK-qQ\u99F0u=nk?nFqC,\u8D44/\uAE89{etrF<U)zrnqZ;|\u07C1J\u6ECC+8}Qps9g?>\u31B7w0-<");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1888637379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888637379L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__632334855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632334855L))
            info.setReturnValue("^*C6z+z)LD.}%\u9F49s{\u9FC7@[X!o\u5D4CRYWj ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_541387862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541387862L))
            info.setReturnValue(419578089);
    }

    @Inject(at = @At("HEAD"), method = "region()Ljava/lang/String;", cancellable = true)
    private void region__632335351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632335351L))
            info.setReturnValue("\u6141 ^\u99472;2yOJ9z0kng\uC23CY'aBPVzC*H\uA57F\"DY6Wa\u8252t6=Ij\uB79A&PyK-qQ\u99F0u=nk?nFqC,\u8D44/\uAE89{etrF<U)zrnqZ;|\u07C1J\u6ECC+8}Qps9g?>\u31B7w0-<");
    }

    @Inject(at = @At("HEAD"), method = "bidirectional()Z", cancellable = true)
    private void bidirectional_541403703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541403703L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent__1673784045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673784045L))
            info.setReturnValue(null);
    }


}
