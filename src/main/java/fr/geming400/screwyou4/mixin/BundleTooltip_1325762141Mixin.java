package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.tooltip.BundleTooltip.class)
public class BundleTooltip_1325762141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_417135872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417135872L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2096185665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096185665L))
            info.setReturnValue("\u22DDP\u7F735B6<\uC514G+h\u2820W$:`U*\u7C64L\u41A7G\u117BWOO8\u8B6AJt+rXL[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1883114231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883114231L))
            info.setReturnValue(-620557175);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/component/BundleContents;", cancellable = true)
    private void contents_351073965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351073965L))
            info.setReturnValue(null);
    }


}
