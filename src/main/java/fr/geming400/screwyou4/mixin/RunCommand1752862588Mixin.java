package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.RunCommand.class)
public class RunCommand1752862588Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_844236320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844236320L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1771681183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771681183L))
            info.setReturnValue("oRGvk;`CY8\u07CAw\u2CE68s<1\uD2F2B$uo0(A-IYQ\u8679LQmxx^@\u9FC7`LE}-y+X.M\u23D6cl{3Db^v\u21D1thu-S#f8\uC754GZ7f}h}vQLI]oNEEBtx%\u5C3FNC\uF959\uFA15V `7\u45EA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1984752617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984752617L))
            info.setReturnValue(1863702687);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command_347690000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347690000L))
            info.setReturnValue("\u353As5\u692BCdGLY 4iET8W9tp4Xh\u6D6BZD*");
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1838991770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838991770L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.COPY_TO_CLIPBOARD);
    }


}
