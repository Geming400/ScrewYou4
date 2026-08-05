package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlaySinglePlayerData.class)
public class QuickPlaySinglePlayerData_824091018Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2085364020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085364020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__311368958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311368958L))
            info.setReturnValue("BJ!HFh[lrd$Z U+뼬");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_862353759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862353759L))
            info.setReturnValue(-859849588);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_862369600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862369600L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "worldId()Ljava/lang/String;", cancellable = true)
    private void worldId__311369454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311369454L))
            info.setReturnValue("u0-T䛝.] f덆$w㍼e1M Ss;@Y'UI`2");
    }


}
