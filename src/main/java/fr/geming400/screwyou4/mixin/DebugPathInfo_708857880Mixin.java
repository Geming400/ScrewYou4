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
            info.setReturnValue("r7Z\u9081h\u0710))F)o_J$YZ)\u4816z}QqdCss\uC239EDL:\u3480\u58CF;>:bvY.\u017Fz*\u4453\")'^E!1;\u1769V\u1418]*+FDx}:\"u22B:U5qh\u67D87)Fsj9#ZB$H{G0W8}\uCEFCt\u46959");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_747120621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747120621L))
            info.setReturnValue(530392735);
    }

    @Inject(at = @At("HEAD"), method = "path()Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void path_604705326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604705326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxNodeDistance()F", cancellable = true)
    private void maxNodeDistance_747117242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747117242L))
            info.setReturnValue(6.899E8F);
    }


}
