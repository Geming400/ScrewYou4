package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.ArmorTrim.class)
public class ArmorTrim1274903683Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1634551354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634551354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_139443708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139443708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1313166425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313166425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern__1471187841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471187841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/core/Holder;", cancellable = true)
    private void material__1471187841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471187841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1267814707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1267814707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "layerAssetId(Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void layerAssetId_1206574800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206574800L))
            info.setReturnValue(null);
    }


}
