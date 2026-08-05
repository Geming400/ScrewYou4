package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.FurnaceRecipeDisplay.class)
public class FurnaceRecipeDisplay_1942632364Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type__2126516512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126516512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__966822674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966822674L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_807172388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807172388L))
            info.setReturnValue("&ApI.[7[:7?Ly");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1980895105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980895105L))
            info.setReturnValue(-1704551621);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result__1615381286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615381286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_512862983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512862983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_1980894609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980894609L))
            info.setReturnValue(-1501404202);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation__1615381286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615381286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fuel()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void fuel__1615381286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615381286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ingredient()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void ingredient__1615381286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615381286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "experience()F", cancellable = true)
    private void experience_1980891726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980891726L))
            info.setReturnValue(3.807854E8F);
    }


}
