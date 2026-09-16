package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.PacketIdentification.class)
public class PacketIdentification_1785940150Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_877313881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877313881L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1738603622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738603622L))
            info.setReturnValue("\u4DBAy\u4158N9Om\u5831XJ\u7BFAnu\u70CEg=z.qWcLL8*BxOJAF}9\"j9/\uD578%uj\u0818Vh\uBC8CG\"cd#Y4Ovx<kP\u9F90/\u03E2ZtV\u9631|\u80E3O3_SNw\u3355J2$3$[g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1951675056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951675056L))
            info.setReturnValue(423355822);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/PacketIdentification;", cancellable = true)
    private static void from_2028141901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028141901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Ljava/lang/String;", cancellable = true)
    private void direction_1597068925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597068925L))
            info.setReturnValue("6WO09m2U+w\uAB16zW8'W1+_=6");
    }

    @Inject(at = @At("HEAD"), method = "packetId()Ljava/lang/String;", cancellable = true)
    private void packetId__1480566847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480566847L))
            info.setReturnValue("s::\u89B0JZ9bU0cbS\u6C0AxsOE'F;C+d[OB\u0278wDq IE\u5563]%M?w-Ww8E\u2A1EcL!_\u384CG_,hACR)");
    }

    @Inject(at = @At("HEAD"), method = "protocolId()Ljava/lang/String;", cancellable = true)
    private void protocolId_218458577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218458577L))
            info.setReturnValue("r\uAA90\u72DDzw\u73F9X?Wr3t4uwHM*O8 Wf>>(S,'H7?6C$\u4312_ 'C(N\":eEuqEU9?X\"BoxXv\"2p;E^7R\uA568\u398Aq\uBE97\uAD98");
    }


}
