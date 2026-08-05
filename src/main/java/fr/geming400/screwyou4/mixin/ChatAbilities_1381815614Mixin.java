package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatAbilities.class)
public class ChatAbilities_1381815614Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__730637825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730637825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyRestrictions()Z", cancellable = true)
    private void hasAnyRestrictions__1153362341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153362341L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSendMessages()Z", cancellable = true)
    private void canSendMessages_1272320144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1272320144L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSendCommands()Z", cancellable = true)
    private void canSendCommands__1294635820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294635820L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canReceiveSystemMessages()Z", cancellable = true)
    private void canReceiveSystemMessages__1324744890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324744890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "visibleMessagesFilter()Ljava/util/function/Predicate;", cancellable = true)
    private void visibleMessagesFilter_1659060097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659060097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReceivePlayerMessages()Z", cancellable = true)
    private void canReceivePlayerMessages_1910441940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910441940L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "restrictions()Ljava/util/stream/Stream;", cancellable = true)
    private void restrictions__2085669653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085669653L))
            info.setReturnValue(null);
    }


}
