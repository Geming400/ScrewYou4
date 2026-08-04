package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.StonecutterRecipeDisplay.class)
public class StonecutterRecipeDisplay1358457704Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_1584276125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584276125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1550997333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550997333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_222997729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222997729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1396720446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396720446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_2095411351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095411351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void input_2095411351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095411351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation_2095411351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095411351L))
            info.setReturnValue(null);
    }


}
