package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.SelectorContents.class)
public class SelectorContents1093463899Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1815991138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815991138L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__41996572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41996572L))
            info.setReturnValue("}gAQM? =Z'7ANl+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1131726641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131726641L))
            info.setReturnValue(484240802);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_905454129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905454129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/util/Optional;", cancellable = true)
    private void separator_1338925321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338925321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit_1243347276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243347276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__811640871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811640871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void selector_928007561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928007561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1465649673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1465649673L))
            info.setReturnValue(null);
    }


}
