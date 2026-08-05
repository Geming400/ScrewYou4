package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SingleRecipeInput.class)
public class SingleRecipeInput34810422Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_478542011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478542011L))
            info.setReturnValue(769915666);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__873815846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873815846L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_805233947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805233947L))
            info.setReturnValue("\u81471TUi\uF9EE(\u165FejG|^i7Tvz(y,+w9\u42FBS\"Py:rVL,a]Go`Z[9I4leBF25Xua##WASOCkK\u70B6a'0\uA47Al\u4D06");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_592162513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592162513L))
            info.setReturnValue(-1168563658);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void item__1056730515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056730515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__51604008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51604008L))
            info.setReturnValue(null);
    }


}
