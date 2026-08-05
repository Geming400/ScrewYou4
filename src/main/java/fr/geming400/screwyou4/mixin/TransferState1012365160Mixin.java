package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.TransferState.class)
public class TransferState1012365160Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1897089877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897089877L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__123094815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123094815L))
            info.setReturnValue("㣺씦chS뿼^g3 }^1Z窓jsH*7Y*++孉﵎N'(癊$PH|䫠ﱕGDTP/\"(J,6{7!籞o镫}FRV>v:CO9Ffk!<0 N4(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1050627902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050627902L))
            info.setReturnValue(33303351);
    }

    @Inject(at = @At("HEAD"), method = "cookies()Ljava/util/Map;", cancellable = true)
    private void cookies__992258480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992258480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenPlayers()Ljava/util/Map;", cancellable = true)
    private void seenPlayers__992258480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992258480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenInsecureChatWarning()Z", cancellable = true)
    private void seenInsecureChatWarning_1050643743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050643743L))
            info.setReturnValue(false);
    }


}
