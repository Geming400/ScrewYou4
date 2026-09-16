package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.StonecutterRecipeDisplay.class)
public class StonecutterRecipeDisplay1358457704Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_1461386071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461386071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_449831436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449831436L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2128881229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128881229L))
            info.setReturnValue("S1v!?O\u2F71[Y-df}7sKQGTL70/ a;'BIhKA3^x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1915809795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915809795L))
            info.setReturnValue(-808363512);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result__2050444710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050444710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void input__953798003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953798003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation__1039588283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039588283L))
            info.setReturnValue(null);
    }


}
