package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.ObjectContents.class)
public class ObjectContents879907515Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__28718753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28718753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1650331040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650331040L))
            info.setReturnValue("-PU'[=ECy&843v%SI>}9\u0350ZK  \u5B1F>^}7c7\uA1A1u0y5k=meHy\uA0F0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1437259606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437259606L))
            info.setReturnValue(1178341117);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve__658638979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-658638979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_134571339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134571339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/contents/objects/ObjectInfo;", cancellable = true)
    private void contents__780422424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780422424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__878973756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878973756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit__908511945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908511945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1946352769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946352769L))
            info.setReturnValue(null);
    }


}
