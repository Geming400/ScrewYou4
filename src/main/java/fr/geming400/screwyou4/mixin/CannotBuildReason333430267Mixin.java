package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.Report.CannotBuildReason.class)
public class CannotBuildReason333430267Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__575196001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575196001L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1103853792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103853792L))
            info.setReturnValue("}N4i]J3C<h([,W)%>DQw\u4333LP9)\"yr\uF9A8<5QEF,/W(iV\u0C4AT|/WCK`YC|$\u4708R5ma<JB$\u5675z4\u11DBO\u790EgJG\"E>\u63FBr4\uC9A9Zv?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_890782358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890782358L))
            info.setReturnValue(1784218495);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1173109291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173109291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Lnet/minecraft/client/gui/components/Tooltip;", cancellable = true)
    private void tooltip__1349608178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349608178L))
            info.setReturnValue(null);
    }


}
