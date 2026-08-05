package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.SuggestCommand.class)
public class SuggestCommand_872653917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2036801121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036801121L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__262806059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262806059L))
            info.setReturnValue("?P=dLFu+WঝrP擄轚?PfEX|3\"Km{D6WF/G.ᱳ%M뿖@]6eF}3 H蒙퇾%-Y#[B`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_910916658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910916658L))
            info.setReturnValue(1079095374);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__262806555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262806555L))
            info.setReturnValue("C>.!xZ1");
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_532257220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532257220L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_URL);
    }


}
