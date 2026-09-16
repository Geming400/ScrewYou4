package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Version.class)
public class Version_1917629373Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1568070768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568070768L))
            info.setReturnValue("m\u777BCh?Z\u2D20h\u6E48$9e9p66$47XrB\"\u0DF4`\uC958k");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1009003104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009003104L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1606914399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606914399L))
            info.setReturnValue("\u2856Ql.^\u2C3C\"aGx%4I-y)KKrLJ\uC80F0tct");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1819985833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819985833L))
            info.setReturnValue(2061853455);
    }

    @Inject(at = @At("HEAD"), method = "current()Lnet/minecraft/network/protocol/status/ServerStatus$Version;", cancellable = true)
    private static void current_1218877879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218877879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "protocol()I", cancellable = true)
    private void protocol__1722590710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722590710L))
            info.setReturnValue(176223927);
    }


}
