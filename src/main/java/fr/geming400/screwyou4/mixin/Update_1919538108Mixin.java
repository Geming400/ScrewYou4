package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LastSeenMessagesTracker.Update.class)
public class Update_1919538108Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1010911839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010911839L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1605005664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605005664L))
            info.setReturnValue("6dw^d[!J?Nwr+R\uB249X$]x;0K/\u5349,G]Vz\u6BF6l0Cm7CK\u75C6n\uFFB1 -IR<\uB2B4a/.fgb&9l*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1818077098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818077098L))
            info.setReturnValue(1054233020);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void update__903071452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903071452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeen()Lnet/minecraft/network/chat/LastSeenMessages;", cancellable = true)
    private void lastSeen_1517077327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517077327L))
            info.setReturnValue(null);
    }


}
