package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Reference.class)
public class Reference1630213575Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__805561502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805561502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_494753104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494753104L))
            info.setReturnValue("\u43FBy\u7ED2r8crp]NDSw\uAD2BM\"]kAh;=b`<f[!-O?*\u4E15)\u7A6F&b#77i ,L\u67D99]\u84BCjCNJD'p\u2479FMXBb6");
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private void kind_1425546949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425546949L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.REFERENCE);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is_1817886722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817886722L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is__1118274739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118274739L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is__990008914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990008914L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is_135776262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135776262L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is_1700573965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700573965L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__1856262408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856262408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap__1841478434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841478434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/stream/Stream;", cancellable = true)
    private void tags_1419507260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419507260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_1668492158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668492158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components__1460948780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460948780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntrusive(Lnet/minecraft/core/HolderOwner;Ljava/lang/Object;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void createIntrusive_1151801044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151801044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStandAlone(Lnet/minecraft/core/HolderOwner;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void createStandAlone__1886759692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886759692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "areComponentsBound()Z", cancellable = true)
    private void areComponentsBound_1668492158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668492158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn_317939618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317939618L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1875674997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875674997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindComponents(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void bindComponents_2055985306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2055985306L))
            info.cancel();
    }


}
