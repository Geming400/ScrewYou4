package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.RconConsoleSource.class)
public class RconConsoleSource_1918646828Mixin {
        @Inject(at = @At("HEAD"), method = "createCommandSourceStack()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void createCommandSourceStack__1946254180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946254180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__1463858238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1463858238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareForCommand()V", cancellable = true)
    private void prepareForCommand__560574507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-560574507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommandResponse()Ljava/lang/String;", cancellable = true)
    private void getCommandResponse_931875754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931875754L))
            info.setReturnValue("/XaqYk{^/K5}R\u5945\u6190t=vY\u7A7B4\u2FC9eRE}[%GhJ\uFE9935\u16DC\u9EB3\uCDB3BbY");
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins__326979902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326979902L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "acceptsFailure()Z", cancellable = true)
    private void acceptsFailure_1563917475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563917475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptsSuccess()Z", cancellable = true)
    private void acceptsSuccess_1102156234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102156234L))
            info.setReturnValue(false);
    }


}
