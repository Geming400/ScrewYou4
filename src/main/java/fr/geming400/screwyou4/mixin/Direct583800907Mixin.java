package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Holder.Direct.class)
public class Direct583800907Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1851974170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851974170L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1969313166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969313166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__551659564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551659564L))
            info.setReturnValue(":ZPlGo\uCB29$dsC4\u95DEdj8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_622063649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622063649L))
            info.setReturnValue(-2092239224);
    }

    @Inject(at = @At("HEAD"), method = "kind()Lnet/minecraft/core/Holder$Kind;", cancellable = true)
    private void kind_379134281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379134281L))
            info.setReturnValue(net.minecraft.core.Holder.Kind.REFERENCE);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is_654161297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654161297L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is__910636406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910636406L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is_771474054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771474054L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is__2036421582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036421582L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void is_2130279889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130279889L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_1407076194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407076194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Ljava/util/stream/Stream;", cancellable = true)
    private void tags_373094592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373094592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound_622079490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622079490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components_1787605848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787605848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_829262329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829262329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "areComponentsBound()Z", cancellable = true)
    private void areComponentsBound_622079490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(622079490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn__728473050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728473050L))
            info.setReturnValue(false);
    }


}
