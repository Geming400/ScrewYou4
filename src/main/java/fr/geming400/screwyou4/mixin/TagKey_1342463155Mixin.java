package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagKey.class)
public class TagKey_1342463155Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1566991883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566991883L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_207002683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(207002683L))
            info.setReturnValue("0[娓");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1380725896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380725896L))
            info.setReturnValue(1222734619);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void cast__977255588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977255588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__1100603399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100603399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagKey;", cancellable = true)
    private static void create__1467158445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467158445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registry__2144012829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144012829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__257012500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257012500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1937280022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937280022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFor(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isFor_1530136301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530136301L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashedCodec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void hashedCodec__257012500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257012500L))
            info.setReturnValue(null);
    }


}
