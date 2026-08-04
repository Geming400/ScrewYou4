package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementProgress.class)
public class AdvancementProgress2026333087Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_890872616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890872616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/advancements/AdvancementProgress;)I", cancellable = true)
    private void compareTo__820616913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820616913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__883009823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883009823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/advancements/AdvancementRequirements;)V", cancellable = true)
    private void update__557679751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-557679751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_2064611670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064611670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPercent()F", cancellable = true)
    private void getPercent_2064592450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064592450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFirstProgressDate()Ljava/time/Instant;", cancellable = true)
    private void getFirstProgressDate__1171400009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171400009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgressText()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getProgressText__150576078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150576078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompletedCriteria()Ljava/lang/Iterable;", cancellable = true)
    private void getCompletedCriteria_16583399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16583399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/advancements/AdvancementProgress;", cancellable = true)
    private static void fromNetwork__645096524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645096524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1672839966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672839966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRemainingCriteria()Ljava/lang/Iterable;", cancellable = true)
    private void getRemainingCriteria_16583399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16583399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProgress()Z", cancellable = true)
    private void hasProgress_2064611670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064611670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grantProgress(Ljava/lang/String;)Z", cancellable = true)
    private void grantProgress__1116269216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116269216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "revokeProgress(Ljava/lang/String;)Z", cancellable = true)
    private void revokeProgress__1116269216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116269216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCriterion(Ljava/lang/String;)Lnet/minecraft/advancements/CriterionProgress;", cancellable = true)
    private void getCriterion_1072568349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072568349L))
            info.setReturnValue(null);
    }


}
