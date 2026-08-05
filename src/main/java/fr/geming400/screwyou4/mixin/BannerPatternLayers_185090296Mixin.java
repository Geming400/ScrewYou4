package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.class)
public class BannerPatternLayers_185090296Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1570602554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570602554L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__950369680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950369680L))
            info.setReturnValue("K*%!ui끘|H91k!3>o?Gl+!lZnPq૭.mY웡&M!K-≥0࿁tzA&yz揼xsb皊]'\"O쳘6|ZI=>F}[QA2[F0[c-2pWR屖gn,;>\"XiYI");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_223353037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223353037L))
            info.setReturnValue(1468288716);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/List;", cancellable = true)
    private void layers_1811427111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811427111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeLast()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void removeLast__1791147859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791147859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_1937339201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1937339201L))
            info.cancel();
    }


}
