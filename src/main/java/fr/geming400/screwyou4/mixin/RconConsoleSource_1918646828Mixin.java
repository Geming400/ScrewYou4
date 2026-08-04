package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.RconConsoleSource.class)
public class RconConsoleSource_1918646828Mixin {
        @Inject(at = @At("HEAD"), method = "createCommandSourceStack()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void createCommandSourceStack__366797478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366797478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage_17467890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(17467890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldInformAdmins()Z", cancellable = true)
    private void shouldInformAdmins_1956925410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956925410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptsSuccess()Z", cancellable = true)
    private void acceptsSuccess_1956925410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956925410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptsFailure()Z", cancellable = true)
    private void acceptsFailure_1956925410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956925410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareForCommand()V", cancellable = true)
    private void prepareForCommand_1956921566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1956921566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommandResponse()Ljava/lang/String;", cancellable = true)
    private void getCommandResponse_783186356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783186356L))
            info.setReturnValue(null);
    }


}
