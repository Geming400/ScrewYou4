package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SulfurCubeContent.class)
public class SulfurCubeContent_1649963411Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1259491627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259491627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_514503435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514503435L))
            info.setReturnValue("边TH/4홰O;\"BJAgO]wu<K.<Z<bD'㴰n8騆(h.-/c2b雪'LPRjho2Rx.蛾 p-GSK/:xTq䴥BR:pxxD춊zXa{CHT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1688226152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688226152L))
            info.setReturnValue(-186501751);
    }

    @Inject(at = @At("HEAD"), method = "absorbedBlockItemStack()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void absorbedBlockItemStack__891116580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891116580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__892754980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892754980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ofNonEmpty(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/component/SulfurCubeContent;", cancellable = true)
    private static void ofNonEmpty__803639003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803639003L))
            info.setReturnValue(null);
    }


}
