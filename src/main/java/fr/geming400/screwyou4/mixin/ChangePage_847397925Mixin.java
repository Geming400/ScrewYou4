package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.ChangePage.class)
public class ChangePage_847397925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__61228344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61228344L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1617821449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617821449L))
            info.setReturnValue("J\u5BF2`GKw@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1404750015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404750015L))
            info.setReturnValue(478357622);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_933527106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933527106L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.RUN_COMMAND);
    }

    @Inject(at = @At("HEAD"), method = "page()I", cancellable = true)
    private void page_1678244059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678244059L))
            info.setReturnValue(575880855);
    }


}
