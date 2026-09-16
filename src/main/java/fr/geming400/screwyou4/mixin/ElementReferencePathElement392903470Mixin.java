package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.ElementReferencePathElement.class)
public class ElementReferencePathElement392903470Mixin {
        @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_239289741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239289741L))
            info.setReturnValue("LW25K]L]\uB724YEi:si\u9EF5/F,jN\"");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__515722798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515722798L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1163326995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163326995L))
            info.setReturnValue("To\uD710-_?b*\u0F9Ac:e!R\u30AE!:\"\u230B|3X\u03F4L\u01BDhXzN3Zg33bUYq:R>_^?ZW/E\u3336");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_950255561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950255561L))
            info.setReturnValue(1543737854);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void id_855310756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855310756L))
            info.setReturnValue(null);
    }


}
