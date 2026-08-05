package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextMap.Builder.class)
public class Builder_795481648Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/util/context/ContextMap;", cancellable = true)
    private void create__1845848253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845848253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter__1904549700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904549700L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "withOptionalParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/util/context/ContextMap$Builder;", cancellable = true)
    private void withOptionalParameter_1846973056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846973056L))
            info.setReturnValue(new net.minecraft.util.context.ContextMap$Builder());
    }

    @Inject(at = @At("HEAD"), method = "withParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/util/context/ContextMap$Builder;", cancellable = true)
    private void withParameter_1846973056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846973056L))
            info.setReturnValue(new net.minecraft.util.context.ContextMap$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter__1904549700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904549700L))
            info.setReturnValue(new java.lang.Object());
    }


}
