package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GameLoadCookie.class)
public class GameLoadCookie_787349312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__121276957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121276957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1557772836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557772836L))
            info.setReturnValue("W7[u?r\u7BE4h@Bq\uB6E0<tY\u1026TQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1344701402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344701402L))
            info.setReturnValue(928938779);
    }

    @Inject(at = @At("HEAD"), method = "quickPlayData()Lnet/minecraft/client/main/GameConfig$QuickPlayData;", cancellable = true)
    private void quickPlayData__1829744969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829744969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmsClient()Lcom/mojang/realmsclient/client/RealmsClient;", cancellable = true)
    private void realmsClient__483167182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483167182L))
            info.setReturnValue(null);
    }


}
