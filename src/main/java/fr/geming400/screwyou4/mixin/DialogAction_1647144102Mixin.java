package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.DialogAction.class)
public class DialogAction_1647144102Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private static void values__1176984939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176984939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/dialog/DialogAction;", cancellable = true)
    private static void valueOf__1759013540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759013540L))
            info.setReturnValue(net.minecraft.server.dialog.DialogAction.CLOSE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1735352723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735352723L))
            info.setReturnValue("Kjc\u8D2CHe\u704ANe\u2343Y$A$>zg2UT9n\u76EC\u3822c?!@\uC8D7wxCX9+\u393E5QiDy{TX|bvyUFRN(&aBh\u865BPZ\u87FBG\u693B70o@\"");
    }

    @Inject(at = @At("HEAD"), method = "willUnpause()Z", cancellable = true)
    private void willUnpause__2095455631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095455631L))
            info.setReturnValue(false);
    }


}
