package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.RecipeCraftedTrigger.TriggerInstance.class)
public class TriggerInstance1599532366Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_690906098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690906098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1925011405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925011405L))
            info.setReturnValue("[!0{q91Zq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2138082839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138082839L))
            info.setReturnValue(2100464200);
    }

    @Inject(at = @At("HEAD"), method = "ingredients()Ljava/util/List;", cancellable = true)
    private void ingredients__216486080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216486080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipeId_2027018582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027018582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crafterCraftedItem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void crafterCraftedItem__43538274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43538274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftedItem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void craftedItem_1265285803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265285803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftedItem(Lnet/minecraft/resources/ResourceKey;Ljava/util/List;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void craftedItem__1745548388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745548388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_368879325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368879325L))
            info.setReturnValue(null);
    }


}
