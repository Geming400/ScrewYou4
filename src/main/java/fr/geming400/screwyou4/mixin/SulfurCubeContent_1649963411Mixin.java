package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SulfurCubeContent.class)
public class SulfurCubeContent_1649963411Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_741337142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741337142L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1874580361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874580361L))
            info.setReturnValue("LcC\uC38C+\u2AC9[u,O9P:\uADEFY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2087651795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087651795L))
            info.setReturnValue(311036224);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__725256637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-725256637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absorbedBlockItemStack()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void absorbedBlockItemStack_1238337200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238337200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNonEmpty(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/component/SulfurCubeContent;", cancellable = true)
    private static void ofNonEmpty_1330961500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330961500L))
            info.setReturnValue(null);
    }


}
