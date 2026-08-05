package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeProgress.Status.class)
public class Status_858568847Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private static void values__412738535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412738535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;", cancellable = true)
    private static void valueOf__724032334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724032334L))
            info.setReturnValue(net.minecraft.util.worldupdate.UpgradeProgress.Status.FINISHED);
    }


}
