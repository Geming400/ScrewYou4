package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.NarratorStatus.class)
public class NarratorStatus_217415457Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__1959493709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959493709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void values_1276657880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276657880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void valueOf__131687301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131687301L))
            info.setReturnValue(net.minecraft.client.NarratorStatus.ALL);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_255677702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255677702L))
            info.setReturnValue(389674559);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateSystem()Z", cancellable = true)
    private void shouldNarrateSystem_255694039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255694039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateChat()Z", cancellable = true)
    private void shouldNarrateChat_255694039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255694039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldNarrateSystemOrChat()Z", cancellable = true)
    private void shouldNarrateSystemOrChat_255694039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255694039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/client/NarratorStatus;", cancellable = true)
    private static void byId__599485078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599485078L))
            info.setReturnValue(net.minecraft.client.NarratorStatus.ALL);
    }


}
