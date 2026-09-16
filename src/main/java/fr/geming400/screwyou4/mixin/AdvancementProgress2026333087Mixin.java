package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.AdvancementProgress.class)
public class AdvancementProgress2026333087Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1498211180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498211180L))
            info.setReturnValue("_S5eDuq]bF?\u9E6D4Xl\u7715!\u9707!CbX\u95A0\uFAB0LHjC%w_\uA4937}JM)jbwKZ'\uFC76uRB'ga(Z\u68C4E'k=tYPUx'{\uA06Fb\\");
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_134229153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134229153L))
            info.setReturnValue(-405820359);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/advancements/AdvancementProgress;)I", cancellable = true)
    private void compareTo_1496033007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496033007L))
            info.setReturnValue(1754830535);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/advancements/AdvancementRequirements;)V", cancellable = true)
    private void update_1408789200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1408789200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_502364426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502364426L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPercent()F", cancellable = true)
    private void getPercent__1814675565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814675565L))
            info.setReturnValue(9.074481E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCriterion(Ljava/lang/String;)Lnet/minecraft/advancements/CriterionProgress;", cancellable = true)
    private void getCriterion__1697852792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697852792L))
            info.setReturnValue(new net.minecraft.advancements.CriterionProgress());
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__948606255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-948606255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCompletedCriteria()Ljava/lang/Iterable;", cancellable = true)
    private void getCompletedCriteria_1414616315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414616315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/advancements/AdvancementProgress;", cancellable = true)
    private static void fromNetwork_1733467664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733467664L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementProgress());
    }

    @Inject(at = @At("HEAD"), method = "getProgressText()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getProgressText__1397471326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397471326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFirstProgressDate()Ljava/time/Instant;", cancellable = true)
    private void getFirstProgressDate__30083710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30083710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasProgress()Z", cancellable = true)
    private void hasProgress__103533873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103533873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "grantProgress(Ljava/lang/String;)Z", cancellable = true)
    private void grantProgress__1146928169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146928169L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "revokeProgress(Ljava/lang/String;)Z", cancellable = true)
    private void revokeProgress_312854829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312854829L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRemainingCriteria()Ljava/lang/Iterable;", cancellable = true)
    private void getRemainingCriteria__2042126170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042126170L))
            info.setReturnValue(null);
    }


}
