package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagKey.class)
public class TagKey_1342463155Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_433836886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433836886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2112886183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112886183L))
            info.setReturnValue(",D/=Hm\uCFF6D*\u503Ae\u4A85\u9C79R\u991B99t;?^Ke8==CCO\u6318pX89Pc:)?\u52CCD\u21D8M#eD\u3DB74m#kq$C*\u9890zyx. \u1345");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1899815245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899815245L))
            info.setReturnValue(-194653299);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void cast_1330716797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330716797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location_1554589358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554589358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/tags/TagKey;", cancellable = true)
    private static void create__430504625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430504625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registry__840143290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840143290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1680778646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680778646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFor(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isFor__1097037972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097037972L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashedCodec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void hashedCodec__2119337693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119337693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__151891232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151891232L))
            info.setReturnValue(null);
    }


}
