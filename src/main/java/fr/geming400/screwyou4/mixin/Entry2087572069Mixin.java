package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.SingleOptionInput.Entry.class)
public class Entry2087572069Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1178945801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178945801L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1436971702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436971702L))
            info.setReturnValue("\u1D6D52O7DUf2g5?lc`\uC6EEx \uD53D\u1A75\u620F\u91EEU\u2850\u44DC{/P(pq=PPJZ9J#7v7?utB*:76nN_bY8Vs\u40DEY\"DNDk\uA2B73Gu=G0{]Ty");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1650043136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650043136L))
            info.setReturnValue(681276125);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__1866233655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866233655L))
            info.setReturnValue("|t\uB77AjJS'\u8ED1\u360Fa\u236B\u1FF4US}VpL?^U;?O9W7wY6OUZ5Nw /T");
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_1132902101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132902101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Z", cancellable = true)
    private void initial_1625062232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625062232L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "displayOrDefault()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayOrDefault_1146229812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1146229812L))
            info.setReturnValue(null);
    }


}
