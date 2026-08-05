package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.ObjectContents.class)
public class ObjectContents879907515Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2029547522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029547522L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__255552460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255552460L))
            info.setReturnValue("dwV<bv+CfNV/X5{l1:᳡獕?ZSx>6kGH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_918170257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918170257L))
            info.setReturnValue(-844518401);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_691897745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691897745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_1125368937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125368937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/contents/objects/ObjectInfo;", cancellable = true)
    private void contents__1144223026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144223026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__1025197255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025197255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit_1029790892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029790892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1679206057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679206057L))
            info.setReturnValue(null);
    }


}
