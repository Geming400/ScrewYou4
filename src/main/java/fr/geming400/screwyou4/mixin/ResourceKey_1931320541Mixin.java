package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.ResourceKey.class)
public class ResourceKey_1931320541Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1593223727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593223727L))
            info.setReturnValue("+L\u9375c-1'%v l7K]\u8A86\u8D85\u7B505NZfzh7(\uBA50\u9477\u62D650g{+mH\uC908x\u988CX9liX{1C\"AS[6\u19DAtD\u04B0\u0625EX ");
    }

    @Inject(at = @At("HEAD"), method = "cast(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void cast_1919574183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919574183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void create__235607539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235607539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dependent(Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dependent__42338918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42338918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dependent(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/UnaryOperator;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dependent__1891118749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891118749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "identifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void identifier__878153780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878153780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void registry_915787616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915787616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__2025331264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025331264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFor(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isFor__508180586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508180586L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "registryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registryKey__1445303445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445303445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryKey(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createRegistryKey_2126200583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126200583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_436966154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436966154L))
            info.setReturnValue(null);
    }


}
