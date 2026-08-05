package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SingleRecipeInput.class)
public class SingleRecipeInput34810422Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_73072668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73072668L))
            info.setReturnValue(-18849482);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1420322681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420322681L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1100649553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100649553L))
            info.setReturnValue("dw>\u268FwDeh'MxVXB,JLnSrj\u1981\u6F5F)x$\uC2AB/D\uB9BDQ!\u8F75>\u3E58syr!\uAB96]a:]V2e(\u75C9?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_73073164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73073164L))
            info.setReturnValue(-221996901);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void item_558229082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558229082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1428728641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428728641L))
            info.setReturnValue(null);
    }


}
