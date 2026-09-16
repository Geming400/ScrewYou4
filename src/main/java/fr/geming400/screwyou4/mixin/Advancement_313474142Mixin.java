package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.Advancement.class)
public class Advancement_313474142Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_1131411350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131411350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void name__1081389624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081389624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parent()Ljava/util/Optional;", cancellable = true)
    private void parent__1619601227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619601227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__595152127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595152127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1083897666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083897666L))
            info.setReturnValue("Y`.: @?H)9a|(+ScL` /j]{c%'\uCEC1\uAB85ae_wQq\"\uAB6A*.h\uAED0u");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_870826232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870826232L))
            info.setReturnValue(1478788369);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderGetter$Provider;)V", cancellable = true)
    private void validate_760618479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(760618479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display__641195827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641195827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRoot()Z", cancellable = true)
    private void isRoot_571887720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(571887720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Ljava/util/Map;", cancellable = true)
    private void criteria_486893958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486893958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rewards()Lnet/minecraft/advancements/AdvancementRewards;", cancellable = true)
    private void rewards__900851023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900851023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendsTelemetryEvent()Z", cancellable = true)
    private void sendsTelemetryEvent_1365159016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365159016L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private void requirements__284657005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284657005L))
            info.setReturnValue(null);
    }


}
