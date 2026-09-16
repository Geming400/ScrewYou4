package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.SelectorContents.class)
public class SelectorContents1093463899Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_184837631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184837631L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1863886928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863886928L))
            info.setReturnValue("q3PUKu\uB0E5hy1;i_|xN64o\u0942Maw>G]Tn)J]yR9CHD\uC0E0h\u633B.f1\uD326|7tXw;3\u9B49>+'D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1650815990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650815990L))
            info.setReturnValue(1502779997);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve__445082595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445082595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/util/Optional;", cancellable = true)
    private void separator_1111893230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111893230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit__694955561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694955561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__665417372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665417372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void selector_1551956106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551956106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2135058143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135058143L))
            info.setReturnValue(null);
    }


}
