package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextMap.Builder.class)
public class Builder_795481648Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/context/ContextKeySet;)Lnet/minecraft/util/context/ContextMap;", cancellable = true)
    private void create__535393337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535393337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getParameter_1627730089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627730089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/util/context/ContextMap$Builder;", cancellable = true)
    private void withParameter__28335229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28335229L))
            info.setReturnValue(new net.minecraft.util.context.ContextMap.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withOptionalParameter(Lnet/minecraft/util/context/ContextKey;Ljava/lang/Object;)Lnet/minecraft/util/context/ContextMap$Builder;", cancellable = true)
    private void withOptionalParameter_1950091779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950091779L))
            info.setReturnValue(new net.minecraft.util.context.ContextMap.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getOptionalParameter(Lnet/minecraft/util/context/ContextKey;)Ljava/lang/Object;", cancellable = true)
    private void getOptionalParameter_2111506985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111506985L))
            info.setReturnValue(new java.lang.Object());
    }


}
