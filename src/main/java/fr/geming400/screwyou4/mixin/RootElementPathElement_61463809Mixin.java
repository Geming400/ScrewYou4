package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.RootElementPathElement.class)
public class RootElementPathElement_61463809Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__1073996663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073996663L))
            info.setReturnValue("-MĿ/j?y2=/_Ye+E]q>.aSYw礁浜R");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1446976067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446976067L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1073996167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073996167L))
            info.setReturnValue("xKW.n)l㵶0uXsyq&c7xM`Whk㍜䄷HeT#_OvcuC5z3䥵&'K,%5PI+j閨뺰7❝lS'|{쭌pe`K4@^[Rꊺv^Tt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_99726550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99726550L))
            info.setReturnValue(1879933324);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_869955121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869955121L))
            info.setReturnValue(null);
    }


}
