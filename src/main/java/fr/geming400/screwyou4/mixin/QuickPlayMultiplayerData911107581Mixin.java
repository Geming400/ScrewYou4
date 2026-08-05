package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayMultiplayerData.class)
public class QuickPlayMultiplayerData911107581Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998347456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998347456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224352394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224352394L))
            info.setReturnValue("\uC89CUc,A7Tmc-m<{Cy.Z\uC4D6H/I\u0447\u8876 jL\uCE1Bo\u2008\u0812nV]l@nr?\u40EA.g}0\uFE30=3\uFEC1\u8762e.w%)'bTH@:u\u1C27:eCO:5}W=HYtp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_949370323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949370323L))
            info.setReturnValue(-1518725724);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_949386164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949386164L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "serverAddress()Ljava/lang/String;", cancellable = true)
    private void serverAddress__224352890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224352890L))
            info.setReturnValue("zXt->4alpr]a*Z\uB3CEiUk\uAC50 w|fz{,2s[]U;");
    }


}
