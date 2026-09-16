package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.NarratorStatus.class)
public class NarratorStatus_217415457Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__290647692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290647692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void values_1079661434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079661434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void valueOf_1838317651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838317651L))
            info.setReturnValue(net.minecraft.client.NarratorStatus.OFF);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1440908139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440908139L))
            info.setReturnValue(-1907318519);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void byId_352193212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352193212L))
            info.setReturnValue(net.minecraft.client.NarratorStatus.CHAT);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateSystem()Z", cancellable = true)
    private void shouldNarrateSystem_742438684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742438684L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateChat()Z", cancellable = true)
    private void shouldNarrateChat__1601004397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601004397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateSystemOrChat()Z", cancellable = true)
    private void shouldNarrateSystemOrChat__2117690303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117690303L))
            info.setReturnValue(true);
    }


}
