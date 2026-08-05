package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.Advancement.class)
public class Advancement_313474142Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name_558935563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558935563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void name_1161681981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161681981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parent()Ljava/util/Optional;", cancellable = true)
    private void parent_558935563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558935563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1698986400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698986400L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__821985834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821985834L))
            info.setReturnValue("-Ꜫt.6L,䕃d+-`n9챗5`T;.ChẄUudH$a}膜A4X`U퍦v2lndᄪev;8;4x*8y㐵<_b}:*Y2砮qPVFhOe7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_351736883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351736883L))
            info.setReturnValue(-1526763422);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderGetter$Provider;)V", cancellable = true)
    private void validate__1357530427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1357530427L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_558935563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558935563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRoot()Z", cancellable = true)
    private void isRoot_351752724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351752724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rewards()Lnet/minecraft/advancements/AdvancementRewards;", cancellable = true)
    private void rewards__1734058923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734058923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criteria()Ljava/util/Map;", cancellable = true)
    private void criteria__1691149499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691149499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendsTelemetryEvent()Z", cancellable = true)
    private void sendsTelemetryEvent_351752724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351752724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Lnet/minecraft/advancements/AdvancementRequirements;", cancellable = true)
    private void requirements__1270563325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270563325L))
            info.setReturnValue(null);
    }


}
