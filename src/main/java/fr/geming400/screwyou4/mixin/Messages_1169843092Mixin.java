package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeStatusTranslator.Messages.class)
public class Messages_1169843092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1739611946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739611946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_34383116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34383116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1208105833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208105833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeStatusTranslator$Messages;", cancellable = true)
    private static void create_778817028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778817028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finished()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void finished__1007066074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007066074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrading()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void upgrading__1007066074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007066074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void forStatus__2088560471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088560471L))
            info.setReturnValue(null);
    }


}
