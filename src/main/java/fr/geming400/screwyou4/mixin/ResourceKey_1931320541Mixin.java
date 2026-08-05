package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.ResourceKey.class)
public class ResourceKey_1931320541Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_795860069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795860069L))
            info.setReturnValue("j7_E3`H띳ోgr*_荕[&V0R2E赗7hTnuj3 &*2ox#A庣;6썺j4@Xo't&뢈Or䱉utMT.W)|2GVaPSr黲o五y");
    }

    @Inject(at = @At("HEAD"), method = "cast(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void cast__388398202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388398202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void create_2039734289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039734289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dependent(Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dependent_236101275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236101275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dependent(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/UnaryOperator;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dependent__468166556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468166556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "identifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void identifier__511746013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511746013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void registry__511746013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511746013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_331844886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331844886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createRegistryKey_2080190349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080190349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFor(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isFor_2118993687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118993687L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1348422636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348422636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registryKey__1555155443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555155443L))
            info.setReturnValue(null);
    }


}
