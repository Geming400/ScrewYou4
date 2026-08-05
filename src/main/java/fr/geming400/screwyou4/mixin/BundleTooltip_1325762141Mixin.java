package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.tooltip.BundleTooltip.class)
public class BundleTooltip_1325762141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1583692897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583692897L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_190302165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190302165L))
            info.setReturnValue("q찎풖1024E0Fkzᗟnq瑕7u<틁j*Z@)^鄶`c_4;O:V.X疘oMsG/|r.$ይ]EiG⭋2bc㟹USwg/L;Rn磽[hSU(f䃮mx%TX3o◅춋3)O(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364024882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364024882L))
            info.setReturnValue(1933205916);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/component/BundleContents;", cancellable = true)
    private void contents_218253063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218253063L))
            info.setReturnValue(null);
    }


}
