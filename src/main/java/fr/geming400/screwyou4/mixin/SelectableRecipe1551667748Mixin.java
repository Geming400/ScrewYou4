package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.class)
public class SelectableRecipe1551667748Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_643041480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643041480L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1972876023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972876023L))
            info.setReturnValue("4X1'\u4B6CQNXc]P7AfIhTL \uD723X\u37D2MMS5YbC\u7017PmPxM/2NuT+'%CXs)J7a8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2109019839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109019839L))
            info.setReturnValue(1885076236);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Ljava/util/Optional;", cancellable = true)
    private void recipe__1648357536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648357536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionDisplay()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void optionDisplay__535121754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535121754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec__1637789295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637789295L))
            info.setReturnValue(null);
    }


}
