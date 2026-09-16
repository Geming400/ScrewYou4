package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.Server.Realm.class)
public class Realm736686767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__171939501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171939501L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1507110292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507110292L))
            info.setReturnValue("\u48C4u(zqR^:}:p\uCCE58aq'I]5VYsr{0?Il[k_\u6EAFG\u6037|b\uC7B2,5\u7728`f\uCE33T@Z\u26BE0Ue[P[(ctvGg>#y1q^_B\uAE99=4@,C)/A%8T<Q\u0208");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1294038858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294038858L))
            info.setReturnValue(-1789848805);
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId_1005111420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005111420L))
            info.setReturnValue(694701070);
    }

    @Inject(at = @At("HEAD"), method = "realmId()J", cancellable = true)
    private void realmId_1902462604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902462604L))
            info.setReturnValue(7992149428008734337L);
    }


}
