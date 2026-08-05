package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.class)
public class BannerPatternLayers_185090296Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__723535973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723535973L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_955513820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955513820L))
            info.setReturnValue("uJ\u9954\u12BEWC\u9638\u0DEA-S\u7D43NC2YcFWnFr6\u46FFZ&\u72C21h\u7C066,'EeB`#=L_\uAE99[;JrqTrqnuj\u70E7\u37C1\uBE9B^UJ76{+68\u031A\uA8ED");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_742442386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742442386L))
            info.setReturnValue(593488934);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/List;", cancellable = true)
    private void layers_1015402345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1015402345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeLast()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void removeLast__324170265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324170265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_2104837544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2104837544L))
            info.cancel();
    }


}
