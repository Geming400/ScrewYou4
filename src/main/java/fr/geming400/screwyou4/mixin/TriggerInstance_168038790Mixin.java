package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeUnlockedTrigger.TriggerInstance.class)
public class TriggerInstance_168038790Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1553551048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553551048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__967421186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-967421186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_206301531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206301531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/crafting/RecipeHolder;)Z", cancellable = true)
    private void matches__1588293361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588293361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipe_976530102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976530102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_413500211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413500211L))
            info.setReturnValue(null);
    }


}
