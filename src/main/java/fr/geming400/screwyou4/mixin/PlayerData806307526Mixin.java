package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerSocialManager.PlayerData.class)
public class PlayerData806307526Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__329152945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329152945L))
            info.setReturnValue("\u5A93\"\uB0B1P0\u61BAWp5\u00C5aVq#1!Uj4r3c\uC999\u7BE4{f;|Fc({(\u9107\u21D1\u9A27q!g.(t/gK\uB50Coi5q\u5518)\u93F4c6QxVT&,\u29C4^MpT:%O=\uD3B7O#%=u/J@9]&FTkH\u5729W$\u9EA1]A");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2103147511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103147511L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__329152449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329152449L))
            info.setReturnValue("u=S[s^-&\u763D5%H>@l\uC9CB8 Xa\u46A0'd6Y}h&ZxB?f!#Khe7V-du");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_844570268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844570268L))
            info.setReturnValue(2088548217);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1217442009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217442009L))
            info.setReturnValue(null);
    }


}
