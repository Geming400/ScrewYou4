package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.ElementReferencePathElement.class)
public class ElementReferencePathElement392903470Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__742557001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742557001L))
            info.setReturnValue("\u9E06 Hb+rb{_\"+*\u039EfR\u532E5 Oe\u04FER\uFC04K%a%*\u7F76Fx`&\u8E04WJN/.kO)qG ,q&;g");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1778415729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778415729L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__742556505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742556505L))
            info.setReturnValue("3:\u381AT#H1\u87CFT&_uR[_@B9\u4F4Ez\uB804K3!c!k$\uBE95\u3EFAnY(e;Y.x'D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_431166212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431166212L))
            info.setReturnValue(369519831);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_1201394783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201394783L))
            info.setReturnValue(null);
    }


}
