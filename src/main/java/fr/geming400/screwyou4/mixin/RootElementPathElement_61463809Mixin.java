package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.RootElementPathElement.class)
public class RootElementPathElement_61463809Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__92149921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92149921L))
            info.setReturnValue(";n@*tjoH|0");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__847162460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847162460L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_831887333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831887333L))
            info.setReturnValue("\u789Fa3\"VU:%0<,nDY8\"\u0538]\uD3B7.sY<\u5BD4\uC7FA:!j4:.\u6FCC\u35792uW1Hh/T2)ME\u57E1x:h\u0700");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_618815899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618815899L))
            info.setReturnValue(1313594758);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_523871094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523871094L))
            info.setReturnValue(null);
    }


}
