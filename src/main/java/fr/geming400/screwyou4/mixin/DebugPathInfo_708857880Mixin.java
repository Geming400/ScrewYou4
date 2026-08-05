package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugPathInfo.class)
public class DebugPathInfo_708857880Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2094370138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094370138L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__426602096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426602096L))
            info.setReturnValue("r7Z邁hܐ))F)o_J$YZ)䠖z}QqdCss숹EDL:㒀壏;>:bvY.ſz*䑓\")'^E!1;ᝩVᐘ]*+FDx}:\"u22B:U5qh柘7)Fsj9#ZB$H{G0W8}컼t䚕9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_747120621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747120621L))
            info.setReturnValue(-129588765);
    }

    @Inject(at = @At("HEAD"), method = "path()Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void path_604705326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604705326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxNodeDistance()F", cancellable = true)
    private void maxNodeDistance_747117242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747117242L))
            info.setReturnValue(2.99185E7F);
    }


}
