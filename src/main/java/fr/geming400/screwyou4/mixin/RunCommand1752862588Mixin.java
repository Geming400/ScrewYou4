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
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_617402613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617402613L))
            info.setReturnValue(".'l}\uD625c=wr`{oQ\u6CE1]S3$=:L#/vz4\u3D27=O8\u1967t3'DmR1u\"tL%\u7C4B(m}\uA35F4,H$\u16E8qF3$R!}wYZ\u7641&i\u60729$)RjFm:nm]tc.)ie\u3832U,9b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1791125330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791125330L))
            info.setReturnValue(1065785635);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command_617402117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617402117L))
            info.setReturnValue("UFW_\u94BE9&>!Z[RXb4zS8!]dR3_cZ(gZz-F{?0Npo1as\u5774Qu\uFB92y&d");
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1412465892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412465892L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_URL);
    }


}
