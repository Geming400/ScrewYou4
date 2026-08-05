package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.ItemDisplay.ItemRenderState.class)
public class ItemRenderState1541260283Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1368194754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368194754L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_405800308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405800308L))
            info.setReturnValue("2;S%OC\uF95Dwr3C^>5G1\"6l_bGyBw:Xdw?*fO\u9D31\u8C06XTUW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1579523025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579523025L))
            info.setReturnValue(129974437);
    }

    @Inject(at = @At("HEAD"), method = "itemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void itemStack_2064678943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064678943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemTransform()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void itemTransform_1400920052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400920052L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.HEAD);
    }


}
