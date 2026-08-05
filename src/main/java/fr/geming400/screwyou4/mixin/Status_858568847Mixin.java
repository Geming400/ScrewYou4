package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Status.class)
public class Status_858568847Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private static void values__1628262921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628262921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private static void valueOf_666666714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666666714L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Status.UPGRADING);
    }


}
