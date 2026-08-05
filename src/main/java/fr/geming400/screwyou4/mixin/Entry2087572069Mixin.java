package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.SingleOptionInput.Entry.class)
public class Entry2087572069Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__821882968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821882968L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_952112094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952112094L))
            info.setReturnValue("S.B ^0%n=ufs-X1cqbNMzJ\uB133\u4E15\u99BE*\u669D(*X5c2$9U$Zu\"s`7:5\uA93F4*(3rhHhHbPG%\uCAB4a,Q'\u157Bw1M+S,9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2125834811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125834811L))
            info.setReturnValue(5214046);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_952111598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952111598L))
            info.setReturnValue("qz6]KsdtG?T\uA575\"uh'0OsEUQq");
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display__1961933805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961933805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Z", cancellable = true)
    private void initial_2125850652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125850652L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "displayOrDefault()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayOrDefault__89337096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89337096L))
            info.setReturnValue(null);
    }


}
