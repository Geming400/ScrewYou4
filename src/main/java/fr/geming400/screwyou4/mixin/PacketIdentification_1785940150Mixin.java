package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.PacketIdentification.class)
public class PacketIdentification_1785940150Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1123514888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123514888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_650480174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650480174L))
            info.setReturnValue("\u23716C\u536DgGmN3=HPbH?+1j@GYI\uABF0>K@i`)o\uB4C7\u1B39@j+%b3\uFE70m<6ln;*Q|2lbR^`H\u45DBf@^b<:kP\u14B3T*K+%! Tp8m\u856B.qr\u47B4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1824202891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824202891L))
            info.setReturnValue(-1828976886);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/PacketIdentification;", cancellable = true)
    private static void from__1378637897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378637897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Ljava/lang/String;", cancellable = true)
    private void direction_650479678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650479678L))
            info.setReturnValue("\u8346zrap-\u773Dd>\u279DY}NS7=\u0B9E\uD066}{\u4F24rUB!*fd?xM\u4BF1*I_mYJ3\u792F\u749949;)\uBD54a;/_Vj!\u8B0E#v\u596C}u]gES6CI\u97E3mW4t#\u057F;.< bON+#J#");
    }

    @Inject(at = @At("HEAD"), method = "protocolId()Ljava/lang/String;", cancellable = true)
    private void protocolId_650479678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650479678L))
            info.setReturnValue("\u8346zrap-\u773Dd>\u279DY}NS7=\u0B9E\uD066}{\u4F24rUB!*fd?xM\u4BF1*I_mYJ3\u792F\u749949;)\uBD54a;/_Vj!\u8B0E#v\u596C}u]gES6CI\u97E3mW4t#\u057F;.< bON+#J#");
    }

    @Inject(at = @At("HEAD"), method = "packetId()Ljava/lang/String;", cancellable = true)
    private void packetId_650479678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650479678L))
            info.setReturnValue("\u8346zrap-\u773Dd>\u279DY}NS7=\u0B9E\uD066}{\u4F24rUB!*fd?xM\u4BF1*I_mYJ3\u792F\u749949;)\uBD54a;/_Vj!\u8B0E#v\u596C}u]gES6CI\u97E3mW4t#\u057F;.< bON+#J#");
    }


}
