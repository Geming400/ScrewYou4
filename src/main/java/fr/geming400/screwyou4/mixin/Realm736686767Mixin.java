package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.Server.Realm.class)
public class Realm736686767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2122199026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122199026L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__398773208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398773208L))
            info.setReturnValue("(oFzv#tn4 (㈈픡ӺgUlGNAVP駜#i.3sW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_774949509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774949509L))
            info.setReturnValue(1687083491);
    }

    @Inject(at = @At("HEAD"), method = "realmId()J", cancellable = true)
    private void realmId_774949974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774949974L))
            info.setReturnValue(2569994157756592173L);
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId_774949013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774949013L))
            info.setReturnValue(1890230910);
    }


}
