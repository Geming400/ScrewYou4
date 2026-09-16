package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket.Entry.class)
public class Entry1794827607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_886201339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886201339L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1729716164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729716164L))
            info.setReturnValue("qBh:QRm|@]#MSJZ-@j8 'ZR\u0E07\uB2FA?,%!9_A=\uBC739K");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1942787598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942787598L))
            info.setReturnValue(664243829);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__469132723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469132723L))
            info.setReturnValue("=5(PX\uBC1E\u86C9B5eNl@S\u3F18h4iHjQDhd\uFF8ACqGH2f\uB5FDub7x;L\")-&zN\u4D49[%o(':\u99A5%:3cvLdXf]\uAD43tZSF\uB004\u32A1\u4A63>3 1_p\u8872wu\uBE13Y;j?p\u2B09");
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Ljava/util/Optional;", cancellable = true)
    private void tooltip_1338576392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338576392L))
            info.setReturnValue(null);
    }


}
