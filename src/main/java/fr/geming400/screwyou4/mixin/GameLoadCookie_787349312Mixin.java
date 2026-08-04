package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GameLoadCookie.class)
public class GameLoadCookie_787349312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2122105726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122105726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__348110664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348110664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_825612053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825612053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmsClient()Lcom/mojang/realmsclient/client/RealmsClient;", cancellable = true)
    private void realmsClient__937305855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937305855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickPlayData()Lnet/minecraft/client/main/GameConfig$QuickPlayData;", cancellable = true)
    private void quickPlayData_1264478636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264478636L))
            info.setReturnValue(null);
    }


}
