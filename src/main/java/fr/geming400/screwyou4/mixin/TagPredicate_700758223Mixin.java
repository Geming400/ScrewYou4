package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.TagPredicate.class)
public class TagPredicate_700758223Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__207868046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207868046L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1471181747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471181747L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1258110313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258110313L))
            info.setReturnValue(-2132241193);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches_1168579463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168579463L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/TagPredicate;", cancellable = true)
    private static void is__1201973678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201973678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expected()Z", cancellable = true)
    private void expected_1476721357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476721357L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void tag__1999449967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999449967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1039073714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039073714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNot(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/TagPredicate;", cancellable = true)
    private static void isNot__2062502957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062502957L))
            info.setReturnValue(null);
    }


}
