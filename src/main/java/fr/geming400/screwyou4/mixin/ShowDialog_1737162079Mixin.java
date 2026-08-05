package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.ShowDialog.class)
public class ShowDialog_1737162079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1172292959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172292959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_601702103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601702103L))
            info.setReturnValue("Qcq#ooZ⸭@Lq[kzo:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1775424820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775424820L))
            info.setReturnValue(957350101);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1396765382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396765382L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_FILE);
    }

    @Inject(at = @At("HEAD"), method = "dialog()Lnet/minecraft/core/Holder;", cancellable = true)
    private void dialog__1008929446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008929446L))
            info.setReturnValue(null);
    }


}
