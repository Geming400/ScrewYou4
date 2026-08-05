package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetGameRulePacket.Entry.class)
public class Entry_2004261147Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_868800675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868800675L))
            info.setReturnValue("\u92A6fv\uD507");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__905193891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905193891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868801171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868801171L))
            info.setReturnValue("]Qu[3N#;qs(N,iM,\u535B=qI6K0S*5\uFDC0B\u24044z>*;sRG2nF\uB6E2XqW/$4_2u:\u14FCl*HxVDvZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2042523888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042523888L))
            info.setReturnValue(331842951);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void gameRuleKey__1482214837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482214837L))
            info.setReturnValue(null);
    }


}
