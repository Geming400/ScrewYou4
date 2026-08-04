package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.TagPredicate.class)
public class TagPredicate_700758223Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2086270481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086270481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__434701753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434701753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_739020964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739020964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void matches__2047730092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047730092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/TagPredicate;", cancellable = true)
    private static void is__257226820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257226820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expected()Z", cancellable = true)
    private void expected_739036805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739036805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void tag_1548092267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548092267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNot(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/advancements/predicates/TagPredicate;", cancellable = true)
    private static void isNot__257226820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257226820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__898717432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898717432L))
            info.setReturnValue(null);
    }


}
