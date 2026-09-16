package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemInput.class)
public class ItemInput_976315527Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_67689258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67689258L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1746739051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746739051L))
            info.setReturnValue("*^;xr!HWJFjq\u6D3D wG\u3392cyW qt2(\u6BC6\u24E9&O2-q2[i\u899B^W, k#C(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1533667617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533667617L))
            info.setReturnValue(-897631111);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_444022543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444022543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void components__357462063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357462063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void createItemStack__59891688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59891688L))
            info.setReturnValue(null);
    }


}
