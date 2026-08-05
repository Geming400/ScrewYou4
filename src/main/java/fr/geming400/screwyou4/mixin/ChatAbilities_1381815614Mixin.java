package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatAbilities.class)
public class ChatAbilities_1381815614Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions_309256059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309256059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReceivePlayerMessages()Z", cancellable = true)
    private void canReceivePlayerMessages_1420094196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420094196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "visibleMessagesFilter()Ljava/util/function/Predicate;", cancellable = true)
    private void visibleMessagesFilter_731930635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731930635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReceiveSystemMessages()Z", cancellable = true)
    private void canReceiveSystemMessages_1420094196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420094196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "restrictions()Ljava/util/stream/Stream;", cancellable = true)
    private void restrictions_1171109298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171109298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyRestrictions()Z", cancellable = true)
    private void hasAnyRestrictions_1420094196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420094196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSendMessages()Z", cancellable = true)
    private void canSendMessages_1420094196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420094196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSendCommands()Z", cancellable = true)
    private void canSendCommands_1420094196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420094196L))
            info.setReturnValue(false);
    }


}
