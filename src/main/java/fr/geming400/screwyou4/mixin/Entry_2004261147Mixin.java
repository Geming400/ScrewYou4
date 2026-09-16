package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetGameRulePacket.Entry.class)
public class Entry_2004261147Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__1993912492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993912492L))
            info.setReturnValue("/WU=s&vx\u7201,Fads");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1095634878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095634878L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1520282625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520282625L))
            info.setReturnValue("Z\uD315lNAnfO@`\u28A7-a4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1733354059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733354059L))
            info.setReturnValue(-1472325362);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void gameRuleKey__393572358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393572358L))
            info.setReturnValue(null);
    }


}
