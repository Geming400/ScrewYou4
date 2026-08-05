package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesTracker.Update.class)
public class Update_1919538108Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__989916930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989916930L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_784078132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784078132L))
            info.setReturnValue("pq=8(伊");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1957800849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957800849L))
            info.setReturnValue(-1732425918);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void update_418967387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418967387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void lastSeen_1204244832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204244832L))
            info.setReturnValue(null);
    }


}
