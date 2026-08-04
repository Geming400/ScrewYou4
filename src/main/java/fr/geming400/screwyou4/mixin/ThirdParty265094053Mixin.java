package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.Server.ThirdParty.class)
public class ThirdParty265094053Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1650606312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650606312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__870365922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870365922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_303356795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303356795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/lang/String;", cancellable = true)
    private void ip__870366418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870366418L))
            info.setReturnValue(null);
    }


}
