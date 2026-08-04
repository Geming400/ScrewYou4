package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.RunCommand.class)
public class RunCommand1752862588Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1156592449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156592449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_617402613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617402613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1791125330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791125330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command_617402117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617402117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1412465892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412465892L))
            info.setReturnValue(null);
    }


}
