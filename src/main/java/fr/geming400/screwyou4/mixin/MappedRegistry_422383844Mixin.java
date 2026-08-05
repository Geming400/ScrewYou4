package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.MappedRegistry.class)
public class MappedRegistry_422383844Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_460646089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460646089L))
            info.setReturnValue(1329382359);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/tags/TagKey;)Ljava/util/Optional;", cancellable = true)
    private void get__874547615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874547615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/util/Optional;", cancellable = true)
    private void get_1267594616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267594616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__1897334899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897334899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get_88492297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88492297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__713076628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713076628L))
            info.setReturnValue("R\uD773P_]^%\u647DbD");
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/Object;", cancellable = true)
    private void getValue_1005165178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005165178L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/Identifier;)Ljava/lang/Object;", cancellable = true)
    private void getValue__1826284810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826284810L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_460662426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460662426L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1729232189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729232189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__1406651643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406651643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey(Ljava/lang/Object;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getKey_634251534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634251534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/lang/Object;Lnet/minecraft/core/RegistrationInfo;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register_1613103212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613103212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key_1230875156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230875156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId_1807879269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807879269L))
            info.setReturnValue(-1930478344);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__1406651643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406651643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containsKey(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void containsKey__1072053470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072053470L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "containsKey(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void containsKey_610056990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610056990L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "freeze()Lnet/minecraft/core/Registry;", cancellable = true)
    private void freeze__91471634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91471634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__1831313167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831313167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceKey(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void getResourceKey__587473035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587473035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId_1996166949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996166949L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAny()Ljava/util/Optional;", cancellable = true)
    private void getAny_667845265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667845265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindTags(Ljava/util/Map;)V", cancellable = true)
    private void bindTags__1358188335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1358188335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTags()Ljava/util/stream/Stream;", cancellable = true)
    private void getTags_211677528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211677528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listTags()Ljava/util/stream/Stream;", cancellable = true)
    private void listTags_211677528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211677528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registrationInfo(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void registrationInfo__1897334899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897334899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindAllTagsToEmpty()V", cancellable = true)
    private void bindAllTagsToEmpty_460658582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(460658582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registryKeySet()Ljava/util/Set;", cancellable = true)
    private void registryKeySet__1406651643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406651643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistrationLookup()Lnet/minecraft/core/HolderGetter;", cancellable = true)
    private void createRegistrationLookup__1049177708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049177708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTagReload(Lnet/minecraft/tags/TagLoader$LoadResult;)Lnet/minecraft/core/Registry$PendingTags;", cancellable = true)
    private void prepareTagReload__205229411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205229411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapAsHolder(Ljava/lang/Object;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void wrapAsHolder_1952326523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952326523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentLookup()Lnet/minecraft/core/component/DataComponentLookup;", cancellable = true)
    private void componentLookup_145198386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145198386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void registryLifecycle__609004587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609004587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntrusiveHolder(Ljava/lang/Object;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void createIntrusiveHolder__67379244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67379244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listElements()Ljava/util/stream/Stream;", cancellable = true)
    private void listElements_211677528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211677528L))
            info.setReturnValue(null);
    }


}
