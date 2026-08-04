package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket.Entry.class)
public class Entry1794827607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1114627430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114627430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_659367632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659367632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1833090349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833090349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_659367136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659367136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Ljava/util/Optional;", cancellable = true)
    private void tooltip_2040289029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040289029L))
            info.setReturnValue(null);
    }


}
