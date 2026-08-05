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
            info.setReturnValue(-154629482);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1420322681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420322681L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1100649553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100649553L))
            info.setReturnValue("dw>⚏wDeh'MxVXB,JLnSrjᦁ潟)x$슫/D립Q!轵>㹘syr!ꮖ]a:]V2e(痉?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_73073164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73073164L))
            info.setReturnValue(-357776901);
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
