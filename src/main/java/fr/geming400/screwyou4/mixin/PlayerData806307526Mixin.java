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
            info.setReturnValue("媓\"낱P0憺Wp5ÅaVq#1!Uj4r3c즙篤{f;|Fc({(鄇⇑騧q!g.(t/gK딌oi5q唘)鏴c6QxVT&,⧄^MpT:%O=펷O#%=u/J@9]&FTkH圩W$麡]A");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2103147511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103147511L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__329152449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329152449L))
            info.setReturnValue("u=S[s^-&瘽5%H>@l짋8 Xa䚠'd6Y}h&ZxB?f!#Khe7V-du");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_844570268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844570268L))
            info.setReturnValue(-1567091479);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_1217442009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217442009L))
            info.setReturnValue(null);
    }


}
