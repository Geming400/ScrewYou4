package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.MappedRegistry.class)
public class MappedRegistry_422383844Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_866115432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866115432L))
            info.setReturnValue(1472387689);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/tags/TagKey;)Ljava/util/Optional;", cancellable = true)
    private void get__885169333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885169333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void get__1411692553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411692553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get__34389153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34389153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Ljava/util/Optional;", cancellable = true)
    private void get__1558367518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558367518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1192806872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192806872L))
            info.setReturnValue("zd\u0E0C.^-1 &8%>UO$qZdH>+\uC328\u4F8D^\uA8F8\u2243p2v6%uBj \uAC55%/_");
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/Identifier;)Ljava/lang/Object;", cancellable = true)
    private void getValue_1001988849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001988849L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/Object;", cancellable = true)
    private void getValue__1512664609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512664609L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1481500215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481500215L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator_2056462641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056462641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__812320139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812320139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKey(Ljava/lang/Object;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getKey_681788151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681788151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/lang/Object;Lnet/minecraft/core/RegistrationInfo;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register__1519669335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519669335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__1277918571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277918571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId__441250252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441250252L))
            info.setReturnValue(1404727305);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__177164126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177164126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containsKey(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void containsKey__1362136222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362136222L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "containsKey(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void containsKey_207426270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(207426270L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "freeze()Lnet/minecraft/core/Registry;", cancellable = true)
    private void freeze_649327927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649327927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom_602271576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602271576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceKey(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void getResourceKey__1598788624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598788624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId_1780322067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780322067L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bindAllTagsToEmpty()V", cancellable = true)
    private void bindAllTagsToEmpty_511698497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(511698497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wrapAsHolder(Ljava/lang/Object;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void wrapAsHolder__1815589485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815589485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistrationLookup()Lnet/minecraft/core/HolderGetter;", cancellable = true)
    private void createRegistrationLookup__252043963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252043963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentLookup()Lnet/minecraft/core/component/DataComponentLookup;", cancellable = true)
    private void componentLookup__86087991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86087991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryLifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void registryLifecycle__1462751614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462751614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryKeySet()Ljava/util/Set;", cancellable = true)
    private void registryKeySet__127291675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127291675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntrusiveHolder(Ljava/lang/Object;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void createIntrusiveHolder_404636301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404636301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registrationInfo(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void registrationInfo_50685926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50685926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listElements()Ljava/util/stream/Stream;", cancellable = true)
    private void listElements_1663848899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663848899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTagReload(Lnet/minecraft/tags/TagLoader$LoadResult;)Lnet/minecraft/core/Registry$PendingTags;", cancellable = true)
    private void prepareTagReload_635911721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635911721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindTags(Ljava/util/Map;)V", cancellable = true)
    private void bindTags_1700954055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1700954055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listTags()Ljava/util/stream/Stream;", cancellable = true)
    private void listTags__2023236895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023236895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTags()Ljava/util/stream/Stream;", cancellable = true)
    private void getTags__1270762711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270762711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAny()Ljava/util/Optional;", cancellable = true)
    private void getAny__1404081337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404081337L))
            info.setReturnValue(null);
    }


}
