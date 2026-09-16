package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Direct.class)
public class Direct583800907Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__419720041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419720041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__324825361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324825361L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1354223936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354223936L))
            info.setReturnValue("PaU$V9kz\u0569Llw v\u7043\u8173Jq^&]p+J\uBD48]K\uAFE3uxvU1V5X[CD[o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1141152998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141152998L))
            info.setReturnValue(-414112703);
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private void kind_1888494301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888494301L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.REFERENCE);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is_1866057767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866057767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is_604378272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604378272L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is_492288816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492288816L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is_546279772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546279772L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is_418013947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418013947L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_53625759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53625759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/stream/Stream;", cancellable = true)
    private void tags_1837107015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837107015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_1405366286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405366286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components__732654462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732654462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn__1938476783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938476783L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "areComponentsBound()Z", cancellable = true)
    private void areComponentsBound_1897229166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897229166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1105613557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105613557L))
            info.setReturnValue(null);
    }


}
