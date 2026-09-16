package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.SuggestCommand.class)
public class SuggestCommand_872653917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__35972352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35972352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1643077441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643077441L))
            info.setReturnValue("0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1430006007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430006007L))
            info.setReturnValue(487271758);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__532518672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532518672L))
            info.setReturnValue("OwiqbPeT^v\u351Dt=^7_Pe\u2564vy7!$Z31\u1CA2+NP7\u2651)s)\u599B\u2C93/ZzxS28r ]8 'l\u832C#j#,\uB2A0Wy;<?\u82B4xt\u08F9B;K]\u0655\u7506");
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_958783098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958783098L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.SHOW_DIALOG);
    }


}
